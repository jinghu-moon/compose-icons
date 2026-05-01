package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorBoldIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 156.0f),
                    PathNode.LineTo(208.0f, 156.0f),
                    PathNode.CurveTo(219.0457f, 156.0f, 228.0f, 147.0457f, 228.0f, 136.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 92.95431f, 219.0457f, 84.0f, 208.0f, 84.0f),
                    PathNode.LineTo(176.0f, 84.0f),
                    PathNode.CurveTo(164.9543f, 84.0f, 156.0f, 92.95431f, 156.0f, 104.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(107.04569f, 84.0f, 116.0f, 75.04569f, 116.0f, 64.0f),
                    PathNode.LineTo(116.0f, 32.0f),
                    PathNode.CurveTo(116.0f, 20.954306f, 107.04569f, 12.0f, 96.0f, 12.0f),
                    PathNode.LineTo(64.0f, 12.0f),
                    PathNode.CurveTo(52.954304f, 12.0f, 44.0f, 20.954306f, 44.0f, 32.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 75.04569f, 52.954304f, 84.0f, 64.0f, 84.0f),
                    PathNode.LineTo(68.0f, 84.0f),
                    PathNode.LineTo(68.0f, 192.0f),
                    PathNode.CurveTo(68.0f, 207.46397f, 80.536026f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(156.0f, 220.0f),
                    PathNode.LineTo(156.0f, 224.0f),
                    PathNode.CurveTo(156.0f, 235.0457f, 164.9543f, 244.0f, 176.0f, 244.0f),
                    PathNode.LineTo(208.0f, 244.0f),
                    PathNode.CurveTo(219.0457f, 244.0f, 228.0f, 235.0457f, 228.0f, 224.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 180.9543f, 219.0457f, 172.0f, 208.0f, 172.0f),
                    PathNode.LineTo(176.0f, 172.0f),
                    PathNode.CurveTo(164.9543f, 172.0f, 156.0f, 180.9543f, 156.0f, 192.0f),
                    PathNode.LineTo(156.0f, 196.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.CurveTo(93.79086f, 196.0f, 92.0f, 194.20914f, 92.0f, 192.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 147.0457f, 164.9543f, 156.0f, 176.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 36.0f),
                    PathNode.LineTo(92.0f, 36.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(68.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 220.0f),
                    PathNode.LineTo(180.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(204.0f, 132.0f),
                    PathNode.LineTo(180.0f, 132.0f),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
