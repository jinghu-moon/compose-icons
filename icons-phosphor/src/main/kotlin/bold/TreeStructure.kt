package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorBoldIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(219.0457f, 116.0f, 228.0f, 107.04569f, 228.0f, 96.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(148.9543f, 28.0f, 140.0f, 36.954304f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.LineTo(128.0f, 60.0f),
                    PathNode.CurveTo(112.536026f, 60.0f, 100.0f, 72.536026f, 100.0f, 88.0f),
                    PathNode.LineTo(100.0f, 116.0f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.LineTo(76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 100.95431f, 67.04569f, 92.0f, 56.0f, 92.0f),
                    PathNode.LineTo(24.0f, 92.0f),
                    PathNode.CurveTo(12.954305f, 92.0f, 4.0f, 100.95431f, 4.0f, 112.0f),
                    PathNode.LineTo(4.0f, 144.0f),
                    PathNode.CurveTo(4.0f, 155.0457f, 12.954305f, 164.0f, 24.0f, 164.0f),
                    PathNode.LineTo(56.0f, 164.0f),
                    PathNode.CurveTo(67.04569f, 164.0f, 76.0f, 155.0457f, 76.0f, 144.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.LineTo(100.0f, 140.0f),
                    PathNode.LineTo(100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 183.46397f, 112.536026f, 196.0f, 128.0f, 196.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 219.0457f, 148.9543f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 148.9543f, 219.0457f, 140.0f, 208.0f, 140.0f),
                    PathNode.LineTo(160.0f, 140.0f),
                    PathNode.CurveTo(148.9543f, 140.0f, 140.0f, 148.9543f, 140.0f, 160.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(128.0f, 172.0f),
                    PathNode.CurveTo(125.79086f, 172.0f, 124.0f, 170.20914f, 124.0f, 168.0f),
                    PathNode.LineTo(124.0f, 88.0f),
                    PathNode.CurveTo(124.0f, 85.79086f, 125.79086f, 84.0f, 128.0f, 84.0f),
                    PathNode.LineTo(140.0f, 84.0f),
                    PathNode.LineTo(140.0f, 96.0f),
                    PathNode.CurveTo(140.0f, 107.04569f, 148.9543f, 116.0f, 160.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 140.0f),
                    PathNode.LineTo(28.0f, 140.0f),
                    PathNode.LineTo(28.0f, 116.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 164.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
