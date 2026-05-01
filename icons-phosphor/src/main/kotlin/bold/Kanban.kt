package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorBoldIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(88.0f, 228.0f),
                    PathNode.CurveTo(99.04569f, 228.0f, 108.0f, 219.0457f, 108.0f, 208.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 187.0457f, 156.9543f, 196.0f, 168.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(219.0457f, 196.0f, 228.0f, 187.0457f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(204.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 68.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(84.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 140.0f),
                    PathNode.LineTo(108.0f, 68.0f),
                    PathNode.LineTo(148.0f, 68.0f),
                    PathNode.LineTo(148.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 172.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.LineTo(204.0f, 132.0f),
                    PathNode.LineTo(204.0f, 172.0f),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
