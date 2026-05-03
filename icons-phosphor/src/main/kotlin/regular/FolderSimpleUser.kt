package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorRegularIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.610 198.620 C 223.769 189.471 226.513 175.704 221.562 163.742 C 216.612 151.781 204.941 143.980 191.995 143.980 C 179.049 143.980 167.378 151.781 162.427 163.742 C 157.477 175.704 160.221 189.471 169.380 198.620 C 160.968 203.987 154.865 212.305 152.270 221.940 C 151.132 226.209 153.671 230.592 157.940 231.730 C 158.612 231.908 159.305 231.998 160.000 232.000 C 163.628 231.999 166.800 229.557 167.730 226.050 C 170.560 215.420 180.540 208.000 192.000 208.000 C 203.460 208.000 213.440 215.420 216.270 226.050 C 216.959 228.862 219.114 231.082 221.904 231.855 C 224.694 232.627 227.684 231.833 229.722 229.776 C 231.760 227.720 232.528 224.723 231.730 221.940 C 229.133 212.303 223.026 203.985 214.610 198.620 ZM 192.000 160.000 C 200.837 160.000 208.000 167.163 208.000 176.000 C 208.000 184.837 200.837 192.000 192.000 192.000 C 183.163 192.000 176.000 184.837 176.000 176.000 C 176.000 167.163 183.163 160.000 192.000 160.000 ZM 232.000 88.000 L 232.000 120.000 C 232.000 124.418 228.418 128.000 224.000 128.000 C 219.582 128.000 216.000 124.418 216.000 120.000 L 216.000 88.000 L 130.670 88.000 C 127.209 87.991 123.844 86.869 121.070 84.800 L 93.330 64.000 L 40.000 64.000 L 40.000 200.000 L 120.000 200.000 C 124.418 200.000 128.000 203.582 128.000 208.000 C 128.000 212.418 124.418 216.000 120.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 93.330 48.000 C 96.791 48.009 100.156 49.131 102.930 51.200 L 130.670 72.000 L 216.000 72.000 C 224.837 72.000 232.000 79.163 232.000 88.000 Z"),
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
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
