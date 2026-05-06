package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorThinIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 69.17l-48-48c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L202.34 48 168 82.34 130.83 45.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L134.34 60 47.51 146.83c-2.247 2.25-3.51 5.3-3.51 8.48v51L21.17 229.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L49.66 212h51c3.182 .008 6.234-1.256 8.48-3.51L196 121.66l9.17 9.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L173.66 88 208 53.66l21.17 21.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM103.51 202.83c-.748 .748-1.762 1.168-2.82 1.17h-48.69v-48.69c.002-1.058 .422-2.072 1.17-2.82L74 131.66l23.17 23.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L79.66 126 98 107.66l23.17 23.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L103.66 102 140 65.66l25.17 25.17h0L190.34 116Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
