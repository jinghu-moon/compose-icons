package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorFillIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 64h-112C32.254 64.044 .044 96.254 0 136c0 10.568 6.897 19.899 17 23 6.06 20.37 37.63 33 55 33 19.001-.023 35.373-13.388 39.2-32h33.6c3.827 18.612 20.199 31.977 39.2 32 17.33 0 48.9-12.66 55-33 10.103-3.101 17-12.432 17-23C255.956 96.254 223.746 64.044 184 64ZM89 169c-3.124 3.122-8.186 3.122-11.31 0L53.14 144.45c-2.988-3.145-2.925-8.099 .143-11.167 3.068-3.068 8.022-3.131 11.167-.143L89 157.65c1.511 1.502 2.361 3.544 2.361 5.675 0 2.131-.85 4.173-2.361 5.675ZM208.52 168.51c-3.124 3.122-8.186 3.122-11.31 0L171.8 143.11c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l25.4 25.41c3.091 3.131 3.073 8.171-.04 11.28ZM237.72 141.65C229.34 123.25 200.34 112 184 112c-19.001 .023-35.373 13.388-39.2 32h-33.6C107.373 125.388 91.001 112.023 72 112c-16.34 0-45.34 11.25-53.68 29.62C16.837 140.125 16.004 138.106 16 136 16.033 105.086 41.086 80.033 72 80h112c30.914 .033 55.967 25.086 56 56-.004 2.106-.837 4.125-2.32 5.62Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
