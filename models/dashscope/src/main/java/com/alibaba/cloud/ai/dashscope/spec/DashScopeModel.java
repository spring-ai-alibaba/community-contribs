/*
 * Copyright 2024-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.ai.dashscope.spec;

import org.springframework.ai.model.ChatModelDescription;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public class DashScopeModel {

    /**
     * Spring AI Alibaba Dashscope implements all models that support the dashscope
     * platform, and only the Qwen series models are listed here. For more model options,
     * refer to: <a href="https://help.aliyun.com/zh/model-studio/models">Model List</a>
     */
    public enum ChatModel implements ChatModelDescription {

        /**
         * The model supports an 8k tokens context, and to ensure normal use and output,
         * the API limits user input to 6k tokens.
         */
        QWEN_PLUS("qwen-plus"),

        /**
         * The model supports a context of 32k tokens. To ensure normal use and output,
         * the API limits user input to 30k tokens.
         */
        QWEN_TURBO("qwen-turbo"),

        /**
         * The model supports an 8k tokens context, and to ensure normal use and output,
         * the API limits user input to 6k tokens.
         */
        QWEN_MAX("qwen-max"),

        /**
         * The model supports a context of 30k tokens. To ensure normal use and output,
         * the API limits user input to 28k tokens.
         */
        QWEN_MAX_LONGCONTEXT("qwen-max-longcontext"),

        /**
         * The Qwen3, QwQ (based on Qwen2.5) and DeepSeek-R1 models have powerful
         * inference capabilities. The model outputs the thought process first, and then
         * the response.
         * <a href="https://help.aliyun.com/zh/model-studio/deep-thinking">qwen3</a>
         */
        QWQ_PLUS("qwq-plus"),

        /**
         * The QwQ inference model trained based on the Qwen2.5-32B model greatly improves
         * the model inference ability through reinforcement learning. The core indicators
         * such as the mathematical code of the model (AIME 24/25, LiveCodeBench) and some
         * general indicators (IFEval, LiveBench, etc.) have reached the level of
         * DeepSeek-R1 full blood version, and all indicators significantly exceed the
         * DeepSeek-R1-Distill-Qwen-32B, which is also based on Qwen2.5-32B.
         * <a href="https://help.aliyun.com/zh/model-studio/deep-thinking">qwen3</a>
         */
        QWEN_3_32B("qwq-32b"),

        /**
         * The QWEN-OMNI series models support the input of multiple modalities of data,
         * including video, audio, image, text, and output audio and text
         * <a href="https://help.aliyun.com/zh/model-studio/qwen-omni">qwen-omni</a>
         */
        QWEN_OMNI_TURBO("qwen-omni-turbo"),

        /**
         * The qwen-vl model can answer based on the pictures you pass in.
         * <a href="https://help.aliyun.com/zh/model-studio/vision">qwen-vl</a>
         */
        QWEN_VL_MAX("qwen-vl-max"),

        // =================== DeepSeek Model =====================
        // The third-party models of the Dashscope platform are currently only listed on
        // Deepseek, refer: https://help.aliyun.com/zh/model-studio/models for
        // more models

        DEEPSEEK_R1("deepseek-r1"),

        DEEPSEEK_V3("deepseek-v3");

        public final String value;

        ChatModel(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String getName() {
            return this.value;
        }

    }

    /**
     * <a href="https://help.aliyun.com/zh/model-studio/embedding">Embedding Models</a>
     */
    public enum EmbeddingModel {

        /**
         * DIMENSION: 1536
         */
        EMBEDDING_V1("text-embedding-v1"),

        /**
         * DIMENSION: 1536
         */
        EMBEDDING_V2("text-embedding-v2"),

        /**
         * 1,024(Default)、768、512、256、128 or 64
         */
        EMBEDDING_V3("text-embedding-v3"),

        /**
         * 2,048、1,536、1,024(Default)、768、512、256、128 or 64
         */
        EMBEDDING_V4("text-embedding-v4");

        public final String value;

        EmbeddingModel(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public enum EmbeddingTextType {

        QUERY("query"),

        DOCUMENT("document");

        public final String value;

        EmbeddingTextType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

}
