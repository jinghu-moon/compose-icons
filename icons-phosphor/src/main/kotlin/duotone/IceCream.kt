package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorDuotoneIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 120.000 C 216.000 128.837 208.837 136.000 200.000 136.000 L 56.000 136.000 C 47.163 136.000 40.000 128.837 40.000 120.000 C 40.000 111.163 47.163 104.000 56.000 104.000 L 56.000 96.000 C 56.000 56.235 88.235 24.000 128.000 24.000 C 167.764 24.000 200.000 56.235 200.000 96.000 L 200.000 104.000 C 208.837 104.000 216.000 111.163 216.000 120.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 97.370 L 208.000 96.000 C 208.000 51.817 172.183 16.000 128.000 16.000 C 83.817 16.000 48.000 51.817 48.000 96.000 L 48.000 97.370 C 36.976 101.264 30.361 112.535 32.338 124.058 C 34.315 135.582 44.308 144.004 56.000 144.000 L 59.290 144.000 L 114.110 239.940 C 116.959 244.923 122.260 247.998 128.000 247.998 C 133.740 247.998 139.041 244.923 141.890 239.940 L 196.710 144.000 L 200.000 144.000 C 211.692 144.004 221.685 135.582 223.662 124.058 C 225.639 112.535 219.024 101.264 208.000 97.370 ZM 77.710 144.000 L 97.070 144.000 L 137.680 215.060 L 128.000 232.000 ZM 134.790 144.000 L 156.540 182.060 L 146.890 198.940 L 115.500 144.000 ZM 165.790 165.940 L 153.210 144.000 L 178.290 144.000 ZM 200.000 128.000 L 56.000 128.000 C 51.582 128.000 48.000 124.418 48.000 120.000 C 48.000 115.582 51.582 112.000 56.000 112.000 C 60.418 112.000 64.000 108.418 64.000 104.000 L 64.000 96.000 C 64.000 60.654 92.654 32.000 128.000 32.000 C 163.346 32.000 192.000 60.654 192.000 96.000 L 192.000 104.000 C 192.000 108.418 195.582 112.000 200.000 112.000 C 204.418 112.000 208.000 115.582 208.000 120.000 C 208.000 124.418 204.418 128.000 200.000 128.000 Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
