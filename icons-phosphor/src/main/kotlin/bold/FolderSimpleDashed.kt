package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorBoldIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 80.000 L 20.000 64.000 C 20.000 52.954 28.954 44.000 40.000 44.000 L 93.330 44.000 C 97.656 44.009 101.864 45.411 105.330 48.000 L 135.200 70.400 C 140.502 74.376 141.576 81.898 137.600 87.200 C 133.624 92.502 126.102 93.576 120.800 89.600 L 92.000 68.000 L 44.000 68.000 L 44.000 80.000 C 44.000 86.627 38.627 92.000 32.000 92.000 C 25.373 92.000 20.000 86.627 20.000 80.000 ZM 88.000 196.000 L 44.000 196.000 L 44.000 192.000 C 44.000 185.373 38.627 180.000 32.000 180.000 C 25.373 180.000 20.000 185.373 20.000 192.000 L 20.000 200.620 C 20.017 211.316 28.684 219.983 39.380 220.000 L 88.000 220.000 C 94.627 220.000 100.000 214.627 100.000 208.000 C 100.000 201.373 94.627 196.000 88.000 196.000 ZM 160.000 196.000 L 128.000 196.000 C 121.373 196.000 116.000 201.373 116.000 208.000 C 116.000 214.627 121.373 220.000 128.000 220.000 L 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 C 172.000 201.373 166.627 196.000 160.000 196.000 ZM 224.000 140.000 C 217.373 140.000 212.000 145.373 212.000 152.000 L 212.000 196.000 L 200.000 196.000 C 193.373 196.000 188.000 201.373 188.000 208.000 C 188.000 214.627 193.373 220.000 200.000 220.000 L 216.890 220.000 C 227.440 219.989 235.989 211.440 236.000 200.890 L 236.000 152.000 C 236.000 145.373 230.627 140.000 224.000 140.000 ZM 216.000 68.000 L 168.000 68.000 C 161.373 68.000 156.000 73.373 156.000 80.000 C 156.000 86.627 161.373 92.000 168.000 92.000 L 212.000 92.000 L 212.000 112.000 C 212.000 118.627 217.373 124.000 224.000 124.000 C 230.627 124.000 236.000 118.627 236.000 112.000 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 ZM 32.000 164.000 C 38.627 164.000 44.000 158.627 44.000 152.000 L 44.000 120.000 C 44.000 113.373 38.627 108.000 32.000 108.000 C 25.373 108.000 20.000 113.373 20.000 120.000 L 20.000 152.000 C 20.000 158.627 25.373 164.000 32.000 164.000 Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
