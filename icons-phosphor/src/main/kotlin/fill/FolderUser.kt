package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorFillIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.730 221.940 C 232.370 224.341 231.858 226.904 230.343 228.874 C 228.829 230.845 226.485 232.000 224.000 232.000 L 160.000 232.000 C 157.529 231.995 155.198 230.848 153.687 228.893 C 152.175 226.937 151.652 224.393 152.270 222.000 C 154.863 212.361 160.966 204.039 169.380 198.670 C 160.224 189.520 157.482 175.754 162.434 163.794 C 167.386 151.834 179.055 144.035 192.000 144.035 C 204.945 144.035 216.614 151.834 221.566 163.794 C 226.518 175.754 223.776 189.520 214.620 198.670 C 223.022 204.025 229.124 212.323 231.730 221.940 ZM 232.000 88.000 L 232.000 120.000 C 232.000 124.418 228.418 128.000 224.000 128.000 C 219.582 128.000 216.000 124.418 216.000 120.000 L 216.000 88.000 L 40.000 88.000 L 40.000 200.000 L 120.560 200.000 C 124.978 200.000 128.560 203.582 128.560 208.000 C 128.560 212.418 124.978 216.000 120.560 216.000 L 39.380 216.000 C 30.890 215.989 24.011 209.110 24.000 200.620 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 92.690 40.000 C 96.936 39.986 101.010 41.676 104.000 44.690 L 131.310 72.000 L 216.000 72.000 C 224.837 72.000 232.000 79.163 232.000 88.000 ZM 108.690 72.000 L 92.690 56.000 L 40.000 56.000 L 40.000 72.000 Z"),
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
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
