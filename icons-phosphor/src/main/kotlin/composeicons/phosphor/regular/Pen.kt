package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorRegularIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.32 73.37 182.63 28.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L36.69 152c-3.014 2.99-4.704 7.064-4.69 11.31v44.69c0 8.837 7.163 16 16 16h44.69c4.246 .014 8.32-1.676 11.31-4.69l83.67-83.66 3.48 13.9-36.8 36.79c-3.126 3.123-3.128 8.189-.005 11.315 3.123 3.126 8.189 3.128 11.315 .005l40-40c1.99-1.986 2.791-4.872 2.11-7.6l-6.9-27.61L227.32 96c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM48 179.31 76.69 208h-28.69ZM96 204.69 51.31 160 136 75.31 180.69 120ZM192 108.69 147.32 64l24-24L216 84.69Z"),
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
