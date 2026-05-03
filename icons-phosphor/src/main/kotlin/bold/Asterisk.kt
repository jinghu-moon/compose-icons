package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorBoldIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.290 182.170 C 216.653 184.901 213.998 186.870 210.909 187.643 C 207.820 188.416 204.550 187.929 201.820 186.290 L 140.000 149.190 L 140.000 216.000 C 140.000 222.627 134.627 228.000 128.000 228.000 C 121.373 228.000 116.000 222.627 116.000 216.000 L 116.000 149.190 L 54.180 186.290 C 48.497 189.700 41.125 187.858 37.715 182.175 C 34.305 176.492 36.147 169.120 41.830 165.710 L 104.680 128.000 L 41.830 90.290 C 36.147 86.880 34.305 79.508 37.715 73.825 C 41.125 68.142 48.497 66.300 54.180 69.710 L 116.000 106.810 L 116.000 40.000 C 116.000 33.373 121.373 28.000 128.000 28.000 C 134.627 28.000 140.000 33.373 140.000 40.000 L 140.000 106.810 L 201.820 69.710 C 207.503 66.300 214.875 68.142 218.285 73.825 C 221.695 79.508 219.853 86.880 214.170 90.290 L 151.320 128.000 L 214.170 165.710 C 219.852 169.118 221.696 176.487 218.290 182.170 Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
