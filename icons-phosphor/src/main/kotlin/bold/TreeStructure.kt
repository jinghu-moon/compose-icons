package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorBoldIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 116.000 L 208.000 116.000 C 219.046 116.000 228.000 107.046 228.000 96.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 L 160.000 28.000 C 148.954 28.000 140.000 36.954 140.000 48.000 L 140.000 60.000 L 128.000 60.000 C 112.536 60.000 100.000 72.536 100.000 88.000 L 100.000 116.000 L 76.000 116.000 L 76.000 112.000 C 76.000 100.954 67.046 92.000 56.000 92.000 L 24.000 92.000 C 12.954 92.000 4.000 100.954 4.000 112.000 L 4.000 144.000 C 4.000 155.046 12.954 164.000 24.000 164.000 L 56.000 164.000 C 67.046 164.000 76.000 155.046 76.000 144.000 L 76.000 140.000 L 100.000 140.000 L 100.000 168.000 C 100.000 183.464 112.536 196.000 128.000 196.000 L 140.000 196.000 L 140.000 208.000 C 140.000 219.046 148.954 228.000 160.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 160.000 C 228.000 148.954 219.046 140.000 208.000 140.000 L 160.000 140.000 C 148.954 140.000 140.000 148.954 140.000 160.000 L 140.000 172.000 L 128.000 172.000 C 125.791 172.000 124.000 170.209 124.000 168.000 L 124.000 88.000 C 124.000 85.791 125.791 84.000 128.000 84.000 L 140.000 84.000 L 140.000 96.000 C 140.000 107.046 148.954 116.000 160.000 116.000 ZM 52.000 140.000 L 28.000 140.000 L 28.000 116.000 L 52.000 116.000 ZM 164.000 164.000 L 204.000 164.000 L 204.000 204.000 L 164.000 204.000 ZM 164.000 52.000 L 204.000 52.000 L 204.000 92.000 L 164.000 92.000 Z"),
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
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
