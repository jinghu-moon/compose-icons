package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorDuotoneIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.020 142.111 220.915 156.051 214.910 168.820 C 211.243 157.132 199.362 150.082 187.346 152.463 C 175.330 154.844 167.036 165.892 168.102 178.095 C 169.168 190.298 179.253 199.739 191.500 200.000 L 191.500 200.000 C 179.336 200.102 168.205 206.857 162.500 217.600 C 123.248 232.716 78.728 220.520 52.660 187.510 C 26.592 154.500 25.048 108.365 48.851 73.687 C 72.654 39.008 116.259 23.863 156.434 36.321 C 196.608 48.779 223.994 85.938 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 136.000 72.000 L 136.000 115.050 L 172.420 96.840 C 176.372 94.863 181.178 96.463 183.155 100.415 C 185.132 104.367 183.532 109.173 179.580 111.150 L 131.580 135.150 C 129.101 136.391 126.156 136.259 123.797 134.803 C 121.438 133.346 120.001 130.772 120.000 128.000 L 120.000 72.000 C 120.000 67.582 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 216.000 132.418 219.582 136.000 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 70.562 185.438 24.000 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 C 136.000 219.582 132.418 216.000 128.000 216.000 ZM 231.730 221.940 C 232.528 224.723 231.760 227.720 229.722 229.776 C 227.684 231.833 224.694 232.627 221.904 231.855 C 219.114 231.082 216.959 228.862 216.270 226.050 C 213.440 215.420 203.460 208.000 192.000 208.000 C 180.540 208.000 170.560 215.420 167.730 226.050 C 166.800 229.557 163.628 231.999 160.000 232.000 C 159.305 231.998 158.612 231.908 157.940 231.730 C 153.671 230.592 151.132 226.209 152.270 221.940 C 154.865 212.305 160.968 203.987 169.380 198.620 C 160.221 189.471 157.477 175.704 162.427 163.742 C 167.378 151.781 179.049 143.980 191.995 143.980 C 204.941 143.980 216.612 151.781 221.562 163.742 C 226.513 175.704 223.769 189.471 214.610 198.620 C 223.026 203.985 229.133 212.303 231.730 221.940 ZM 176.000 176.000 C 176.000 184.837 183.163 192.000 192.000 192.000 C 200.837 192.000 208.000 184.837 208.000 176.000 C 208.000 167.163 200.837 160.000 192.000 160.000 C 183.163 160.000 176.000 167.163 176.000 176.000 Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
