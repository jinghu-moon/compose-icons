package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.OpenAiLogo: ImageVector
    get() {
        if (_openAiLogo != null) return _openAiLogo!!
        _openAiLogo = phosphorThinIcon(
            name = "OpenAiLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.68 114.91c8.229-17.738 5.812-38.592-6.256-53.978C201.356 45.547 181.677 38.232 162.49 42 151.222 26.046 131.965 17.751 112.631 20.525 93.297 23.298 77.148 36.672 70.82 55.15 51.369 56.919 34.551 69.439 27.274 87.564c-7.276 18.125-3.782 38.799 9.046 53.526-6.447 13.919-6.419 29.973 .075 43.87 6.494 13.896 18.792 24.217 33.605 28.2 4.43 1.207 8.999 1.825 13.59 1.84 3.335-.012 6.66-.347 9.93-1 11.266 15.949 30.517 24.243 49.846 21.474 19.329-2.769 35.478-16.133 41.814-34.604 19.451-1.769 36.269-14.289 43.546-32.414 7.276-18.125 3.782-38.799-9.046-53.526ZM183.88 50.57c12.063 3.231 22.184 11.435 27.842 22.567 5.658 11.132 6.319 24.145 1.818 35.793-2.195-1.82-4.536-3.455-7-4.89L162 78.35c-1.238-.715-2.762-.715-4 0l-50 28.87v-27.72L150.5 55c10.088-5.877 22.108-7.473 33.38-4.43ZM148 139.57l-20 11.54L108 139.57v-23.1l20-11.54 20 11.54ZM76 72C76.001 53.346 87.764 36.719 105.355 30.51c17.591-6.209 37.185-.651 48.895 13.87-2.678 .992-5.27 2.203-7.75 3.62L102 73.73c-1.236 .714-1.999 2.032-2 3.46v57.74L76 121.07ZM37.4 84.93C44.023 73.379 55.548 65.476 68.71 63.46 68.24 66.282 68.002 69.139 68 72v51.38c.001 1.428 .764 2.746 2 3.46l50 28.87L96 169.57 53.5 145C32.478 132.849 25.273 105.966 37.4 84.93ZM72.12 205.43C60.057 202.199 49.936 193.995 44.278 182.863 38.62 171.731 37.959 158.718 42.46 147.07c2.195 1.82 4.536 3.455 7 4.89L94 177.65c1.238 .715 2.762 .715 4 0l50-28.87v27.72L105.5 201c-10.088 5.877-22.108 7.473-33.38 4.43ZM180 184c0 18.658-11.766 35.287-29.361 41.495-17.595 6.207-37.192 .643-48.899-13.885 2.682-.987 5.278-2.194 7.76-3.61L154 182.27c1.236-.714 1.999-2.032 2-3.46v-57.74l24 13.86ZM218.6 171.07c-6.623 11.551-18.148 19.454-31.31 21.47 .47-2.822 .708-5.679 .71-8.54v-51.38c-.001-1.428-.764-2.746-2-3.46L136 100.29 160 86.43 202.5 111c21.022 12.151 28.227 39.034 16.1 60.07Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _openAiLogo!!
    }

private var _openAiLogo: ImageVector? = null
