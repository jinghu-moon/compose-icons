package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorDuotoneIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 256.000 72.000 L 256.000 184.000 C 256.000 192.837 248.837 200.000 240.000 200.000 L 16.000 200.000 C 7.163 200.000 0.000 192.837 0.000 184.000 L 0.000 72.000 C 0.000 63.163 7.163 56.000 16.000 56.000 L 240.000 56.000 C 248.837 56.000 256.000 63.163 256.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 48.000 56.000 L 48.000 200.000 C 48.000 204.418 44.418 208.000 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 C 44.418 48.000 48.000 51.582 48.000 56.000 ZM 140.000 110.500 L 120.000 117.000 L 120.000 96.000 C 120.000 91.582 116.418 88.000 112.000 88.000 C 107.582 88.000 104.000 91.582 104.000 96.000 L 104.000 117.000 L 84.000 110.500 C 79.797 109.119 75.271 111.407 73.890 115.610 C 72.509 119.813 74.797 124.339 79.000 125.720 L 99.000 132.210 L 86.660 149.210 C 84.885 151.517 84.502 154.606 85.662 157.276 C 86.821 159.946 89.340 161.776 92.238 162.053 C 95.135 162.330 97.955 161.012 99.600 158.610 L 111.940 141.610 L 124.280 158.610 C 125.925 161.012 128.745 162.330 131.642 162.053 C 134.540 161.776 137.059 159.946 138.218 157.276 C 139.378 154.606 138.995 151.517 137.220 149.210 L 124.880 132.210 L 144.880 125.720 C 148.888 124.229 151.015 119.851 149.709 115.779 C 148.404 111.708 144.127 109.382 140.000 110.500 ZM 246.000 115.640 C 244.636 111.478 240.178 109.187 236.000 110.500 L 216.000 117.000 L 216.000 96.000 C 216.000 91.582 212.418 88.000 208.000 88.000 C 203.582 88.000 200.000 91.582 200.000 96.000 L 200.000 117.000 L 180.000 110.510 C 175.797 109.143 171.282 111.442 169.915 115.645 C 168.548 119.848 170.847 124.363 175.050 125.730 L 195.050 132.220 L 182.710 149.220 C 180.935 151.527 180.552 154.616 181.712 157.286 C 182.871 159.956 185.390 161.786 188.288 162.063 C 191.185 162.340 194.005 161.022 195.650 158.620 L 207.990 141.620 L 220.330 158.620 C 221.975 161.022 224.795 162.340 227.692 162.063 C 230.590 161.786 233.109 159.956 234.268 157.286 C 235.428 154.616 235.045 151.527 233.270 149.220 L 220.930 132.220 L 240.930 125.730 C 245.110 124.337 247.377 119.826 246.000 115.640 Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
