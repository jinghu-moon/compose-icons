package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorFillIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 208.000 C 96.000 212.418 92.418 216.000 88.000 216.000 L 39.380 216.000 C 30.890 215.989 24.011 209.110 24.000 200.620 L 24.000 192.000 C 24.000 187.582 27.582 184.000 32.000 184.000 C 36.418 184.000 40.000 187.582 40.000 192.000 L 40.000 200.000 L 88.000 200.000 C 92.418 200.000 96.000 203.582 96.000 208.000 ZM 160.000 200.000 L 128.000 200.000 C 123.582 200.000 120.000 203.582 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 212.418 168.000 208.000 C 168.000 203.582 164.418 200.000 160.000 200.000 ZM 224.000 144.000 C 219.582 144.000 216.000 147.582 216.000 152.000 L 216.000 200.000 L 200.000 200.000 C 195.582 200.000 192.000 203.582 192.000 208.000 C 192.000 212.418 195.582 216.000 200.000 216.000 L 216.890 216.000 C 225.230 215.989 231.989 209.230 232.000 200.890 L 232.000 152.000 C 232.000 147.582 228.418 144.000 224.000 144.000 ZM 216.000 72.000 L 168.000 72.000 C 163.582 72.000 160.000 75.582 160.000 80.000 C 160.000 84.418 163.582 88.000 168.000 88.000 L 216.000 88.000 L 216.000 112.000 C 216.000 116.418 219.582 120.000 224.000 120.000 C 228.418 120.000 232.000 116.418 232.000 112.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 32.000 88.000 L 128.000 88.000 C 131.238 88.003 134.158 86.053 135.397 83.062 C 136.636 80.071 135.951 76.628 133.660 74.340 L 104.000 44.690 C 101.010 41.676 96.936 39.986 92.690 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 80.000 C 24.000 84.418 27.582 88.000 32.000 88.000 ZM 32.000 160.000 C 36.418 160.000 40.000 156.418 40.000 152.000 L 40.000 120.000 C 40.000 115.582 36.418 112.000 32.000 112.000 C 27.582 112.000 24.000 115.582 24.000 120.000 L 24.000 152.000 C 24.000 156.418 27.582 160.000 32.000 160.000 Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
