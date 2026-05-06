package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorRegularIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.54 142.23c-2.091-2.096-5.169-2.865-8-2-31.081 9.396-64.811 .93-87.771-22.029C114.81 95.241 106.344 61.511 115.74 30.43c.872-2.833 .107-5.915-1.989-8.011-2.096-2.096-5.178-2.861-8.011-1.989-21.09 6.46-39.605 19.408-52.91 37C29.097 88.94 25.234 131.166 42.856 166.459 60.478 201.752 96.552 224.037 136 224c22.563 .07 44.527-7.266 62.52-20.88 17.592-13.305 30.54-31.82 37-52.91 .862-2.822 .101-5.889-1.98-7.98ZM188.9 190.34c-35.034 26.388-84.152 22.949-115.167-8.064C42.718 151.263 39.275 102.146 65.66 67.11c8.314-10.979 19.063-19.88 31.4-26C96.357 46.042 96.003 51.018 96 56c.061 57.412 46.588 103.939 104 104 4.992-.002 9.978-.356 14.92-1.06-6.126 12.339-15.033 23.088-26.02 31.4Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
