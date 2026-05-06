package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorFillIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM211.44 100C196.38 95.135 180.787 92.113 165 91 163.887 75.213 160.865 59.62 156 44.56c26.11 8.83 46.61 29.33 55.44 55.44ZM85 51.24c24.921 8.236 47.845 21.592 67.3 39.21C112.297 90.103 73.142 101.986 40.08 124.51 41.311 93.943 58.317 66.204 85 51.24ZM131.48 215.92c22.526-33.065 34.41-72.223 34.06-112.23 17.623 19.457 30.982 42.384 39.22 67.31-14.964 26.683-42.703 43.689-73.27 44.92Z"),
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
