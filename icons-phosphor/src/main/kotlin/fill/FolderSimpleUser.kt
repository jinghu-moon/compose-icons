package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorFillIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.730 221.940 C 232.370 224.341 231.858 226.904 230.343 228.874 C 228.829 230.845 226.485 232.000 224.000 232.000 L 160.000 232.000 C 157.529 231.995 155.198 230.848 153.687 228.893 C 152.175 226.937 151.652 224.393 152.270 222.000 C 154.863 212.361 160.966 204.039 169.380 198.670 C 160.224 189.520 157.482 175.754 162.434 163.794 C 167.386 151.834 179.055 144.035 192.000 144.035 C 204.945 144.035 216.614 151.834 221.566 163.794 C 226.518 175.754 223.776 189.520 214.620 198.670 C 223.022 204.025 229.124 212.323 231.730 221.940 ZM 216.000 72.000 L 130.670 72.000 L 102.930 51.200 C 100.156 49.131 96.791 48.009 93.330 48.000 L 40.000 48.000 C 31.163 48.000 24.000 55.163 24.000 64.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 120.000 216.000 C 124.418 216.000 128.000 212.418 128.000 208.000 C 128.000 203.582 124.418 200.000 120.000 200.000 L 40.000 200.000 L 40.000 64.000 L 93.330 64.000 L 121.070 84.800 C 123.844 86.869 127.209 87.991 130.670 88.000 L 216.000 88.000 L 216.000 120.000 C 216.000 124.418 219.582 128.000 224.000 128.000 C 228.418 128.000 232.000 124.418 232.000 120.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 Z"),
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
