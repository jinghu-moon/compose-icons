package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) return _bellSimpleZ!!
        _bellSimpleZ = phosphorRegularIcon(
            name = "BellSimpleZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 144.000 136.000 L 127.000 136.000 L 150.700 100.440 C 152.342 97.979 152.492 94.812 151.089 92.206 C 149.686 89.601 146.959 87.983 144.000 88.000 L 112.000 88.000 C 107.582 88.000 104.000 91.582 104.000 96.000 C 104.000 100.418 107.582 104.000 112.000 104.000 L 129.050 104.000 L 105.350 139.560 C 103.713 142.014 103.559 145.170 104.950 147.771 C 106.340 150.373 109.050 151.998 112.000 152.000 L 144.000 152.000 C 148.418 152.000 152.000 148.418 152.000 144.000 C 152.000 139.582 148.418 136.000 144.000 136.000 ZM 221.840 192.000 C 219.015 196.976 213.722 200.036 208.000 200.000 L 48.000 200.000 C 42.275 199.992 36.991 196.927 34.142 191.961 C 31.294 186.995 31.316 180.885 34.200 175.940 C 39.750 166.380 48.000 139.340 48.000 104.000 C 48.000 59.817 83.817 24.000 128.000 24.000 C 172.183 24.000 208.000 59.817 208.000 104.000 C 208.000 139.330 216.260 166.380 221.810 175.940 C 224.724 180.894 224.735 187.035 221.840 192.000 ZM 208.000 184.000 C 200.270 170.730 192.000 140.050 192.000 104.000 C 192.000 68.654 163.346 40.000 128.000 40.000 C 92.654 40.000 64.000 68.654 64.000 104.000 C 64.000 140.060 55.720 170.740 48.000 184.000 Z"),
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
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
