package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorBoldIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 92.68c.014-5.307-2.096-10.399-5.86-14.14L177.46 9.85C173.709 6.098 168.621 3.989 163.315 3.989c-5.306 0-10.394 2.108-14.145 5.861L121.35 37.67 64.11 59.14C57.42 61.647 52.575 67.533 51.4 74.58L28.16 214c-.589 3.484 .388 7.051 2.67 9.749 2.282 2.698 5.637 4.253 9.17 4.251 .67 .003 1.339-.05 2-.16L181.45 204.59c7.039-1.186 12.918-6.022 15.44-12.7l21.46-57.25 27.82-27.82c3.754-3.745 5.853-8.837 5.83-14.14ZM175.2 181.3 75 198l33-33c14.967 6.756 32.624 1.85 41.959-11.659 9.336-13.509 7.683-31.76-3.929-43.372C134.419 98.358 116.168 96.705 102.659 106.041 89.15 115.376 84.244 133.033 91 148L58 181 74.7 80.8 125 61.94 194.05 131ZM112 134c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM208 111 145 48 163.34 29.66l63 63Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
