package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorBoldIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 48.000 56.000 L 48.000 200.000 C 48.000 206.627 42.627 212.000 36.000 212.000 C 29.373 212.000 24.000 206.627 24.000 200.000 L 24.000 56.000 C 24.000 49.373 29.373 44.000 36.000 44.000 C 42.627 44.000 48.000 49.373 48.000 56.000 ZM 134.730 106.700 L 120.000 111.480 L 120.000 96.000 C 120.000 89.373 114.627 84.000 108.000 84.000 C 101.373 84.000 96.000 89.373 96.000 96.000 L 96.000 111.480 L 81.270 106.700 C 77.160 105.254 72.590 106.150 69.329 109.039 C 66.069 111.929 64.630 116.358 65.571 120.612 C 66.512 124.866 69.685 128.275 73.860 129.520 L 88.580 134.310 L 79.480 146.830 C 75.584 152.193 76.772 159.699 82.135 163.595 C 87.498 167.491 95.004 166.303 98.900 160.940 L 108.000 148.420 L 117.100 160.940 C 120.996 166.303 128.502 167.491 133.865 163.595 C 139.228 159.699 140.416 152.193 136.520 146.830 L 127.420 134.310 L 142.140 129.520 C 146.315 128.275 149.488 124.866 150.429 120.612 C 151.370 116.358 149.931 111.929 146.671 109.039 C 143.410 106.150 138.840 105.254 134.730 106.700 ZM 249.850 114.400 C 247.800 108.099 241.031 104.652 234.730 106.700 L 220.000 111.480 L 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 C 201.373 84.000 196.000 89.373 196.000 96.000 L 196.000 111.480 L 181.270 106.700 C 177.160 105.254 172.590 106.150 169.329 109.039 C 166.069 111.929 164.630 116.358 165.571 120.612 C 166.512 124.866 169.685 128.275 173.860 129.520 L 188.580 134.310 L 179.480 146.830 C 175.584 152.193 176.772 159.699 182.135 163.595 C 187.498 167.491 195.004 166.303 198.900 160.940 L 208.000 148.420 L 217.100 160.940 C 220.996 166.303 228.502 167.491 233.865 163.595 C 239.228 159.699 240.416 152.193 236.520 146.830 L 227.420 134.310 L 242.140 129.520 C 245.168 128.538 247.681 126.393 249.127 123.557 C 250.573 120.721 250.833 117.427 249.850 114.400 Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
