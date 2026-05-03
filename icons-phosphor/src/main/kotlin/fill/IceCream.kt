package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorFillIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 97.370 L 208.000 96.000 C 208.000 51.817 172.183 16.000 128.000 16.000 C 83.817 16.000 48.000 51.817 48.000 96.000 L 48.000 97.370 C 36.976 101.264 30.361 112.535 32.338 124.058 C 34.315 135.582 44.308 144.004 56.000 144.000 L 59.290 144.000 L 114.110 239.940 C 116.959 244.923 122.260 247.998 128.000 247.998 C 133.740 247.998 139.041 244.923 141.890 239.940 L 196.710 144.000 L 200.000 144.000 C 211.692 144.004 221.685 135.582 223.662 124.058 C 225.639 112.535 219.024 101.264 208.000 97.370 ZM 146.890 198.940 L 115.500 144.000 L 134.790 144.000 L 156.540 182.060 ZM 77.710 144.000 L 97.070 144.000 L 137.680 215.060 L 128.000 232.000 ZM 165.710 165.940 L 153.210 144.000 L 178.290 144.000 Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
