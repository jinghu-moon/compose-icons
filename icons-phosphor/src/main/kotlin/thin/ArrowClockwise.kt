package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorThinIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 56.000 L 236.000 104.000 C 236.000 106.209 234.209 108.000 232.000 108.000 L 184.000 108.000 C 181.791 108.000 180.000 106.209 180.000 104.000 C 180.000 101.791 181.791 100.000 184.000 100.000 L 221.700 100.000 L 187.530 68.690 L 187.400 68.570 C 154.818 35.997 102.079 35.747 69.189 68.009 C 36.299 100.271 35.534 153.005 67.473 186.208 C 99.412 219.412 152.136 220.693 185.650 189.080 C 187.257 187.561 189.791 187.633 191.310 189.240 C 192.829 190.847 192.757 193.381 191.150 194.900 C 174.107 211.069 151.493 220.057 128.000 220.000 L 126.740 220.000 C 85.289 219.404 49.356 191.159 38.986 151.021 C 28.617 110.883 46.373 68.768 82.349 48.170 C 118.326 27.572 163.634 33.579 193.000 62.840 L 228.000 94.890 L 228.000 56.000 C 228.000 53.791 229.791 52.000 232.000 52.000 C 234.209 52.000 236.000 53.791 236.000 56.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
