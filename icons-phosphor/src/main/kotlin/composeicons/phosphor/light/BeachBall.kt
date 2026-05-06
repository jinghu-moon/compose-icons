package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorLightIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM213 98.45C198.064 93.506 182.591 90.36 166.91 89.08 165.632 73.403 162.49 57.933 157.55 43c25.95 9.096 46.354 29.5 55.45 55.45ZM143.52 39.34c4.768 12.597 8.158 25.673 10.11 39C136.236 63.697 116.455 52.153 95.15 44.21c15.373-6.021 32.105-7.706 48.37-4.87ZM80.15 51.81c24.575 7.475 47.336 19.957 66.85 36.66-38.957 .714-76.84 12.887-108.92 35C39.585 94.154 55.285 67.412 80.15 51.81ZM38.55 138C72.188 112.634 113.435 99.428 155.55 100.54c1.112 42.115-12.094 83.362-37.46 117C76.263 212.837 43.253 179.827 38.55 138ZM132.55 217.94c22.114-32.083 34.288-69.97 35-108.93 16.705 19.528 29.187 42.303 36.66 66.89-15.62 24.834-42.359 40.502-71.66 41.99ZM211.79 160.94c-7.936-21.303-19.474-41.084-34.11-58.48 13.327 1.952 26.403 5.342 39 10.11 2.836 16.265 1.151 32.997-4.87 48.37Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
