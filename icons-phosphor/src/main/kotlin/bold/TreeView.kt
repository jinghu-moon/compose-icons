package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorBoldIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 156.000 L 208.000 156.000 C 219.046 156.000 228.000 147.046 228.000 136.000 L 228.000 104.000 C 228.000 92.954 219.046 84.000 208.000 84.000 L 176.000 84.000 C 164.954 84.000 156.000 92.954 156.000 104.000 L 156.000 108.000 L 92.000 108.000 L 92.000 84.000 L 96.000 84.000 C 107.046 84.000 116.000 75.046 116.000 64.000 L 116.000 32.000 C 116.000 20.954 107.046 12.000 96.000 12.000 L 64.000 12.000 C 52.954 12.000 44.000 20.954 44.000 32.000 L 44.000 64.000 C 44.000 75.046 52.954 84.000 64.000 84.000 L 68.000 84.000 L 68.000 192.000 C 68.000 207.464 80.536 220.000 96.000 220.000 L 156.000 220.000 L 156.000 224.000 C 156.000 235.046 164.954 244.000 176.000 244.000 L 208.000 244.000 C 219.046 244.000 228.000 235.046 228.000 224.000 L 228.000 192.000 C 228.000 180.954 219.046 172.000 208.000 172.000 L 176.000 172.000 C 164.954 172.000 156.000 180.954 156.000 192.000 L 156.000 196.000 L 96.000 196.000 C 93.791 196.000 92.000 194.209 92.000 192.000 L 92.000 132.000 L 156.000 132.000 L 156.000 136.000 C 156.000 147.046 164.954 156.000 176.000 156.000 ZM 68.000 36.000 L 92.000 36.000 L 92.000 60.000 L 68.000 60.000 ZM 180.000 196.000 L 204.000 196.000 L 204.000 220.000 L 180.000 220.000 ZM 180.000 108.000 L 204.000 108.000 L 204.000 132.000 L 180.000 132.000 Z"),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
