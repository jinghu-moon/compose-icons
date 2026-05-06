package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorThinIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 76.2 179.8 31.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L39.51 154.83c-2.247 2.25-3.51 5.3-3.51 8.48v44.69c0 6.627 5.373 12 12 12h44.69c3.182 .008 6.234-1.256 8.48-3.51l88.67-88.67 5.73 23-38.39 38.4c-1.055 1-1.484 2.494-1.121 3.901 .363 1.407 1.461 2.507 2.868 2.873 1.407 .365 2.901-.061 3.903-1.114l40-40c.997-.992 1.399-2.435 1.06-3.8l-7.46-29.8L224.49 93.22c2.266-2.252 3.54-5.315 3.54-8.51 0-3.195-1.274-6.258-3.54-8.51ZM44 208v-38.34L86.35 212h-38.35c-2.209 0-4-1.791-4-4ZM96 210.34 45.66 160 136 69.66 186.35 120ZM218.83 87.51 192 114.34 141.66 64 168.49 37.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l44.68 44.69c1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
