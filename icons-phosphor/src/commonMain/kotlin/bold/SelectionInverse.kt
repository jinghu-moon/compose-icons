package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorBoldIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 216.0f),
                    PathNode.CurveTo(156.0f, 222.62741f, 150.62741f, 228.0f, 144.0f, 228.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(105.37258f, 228.0f, 100.0f, 222.62741f, 100.0f, 216.0f),
                    PathNode.CurveTo(100.0f, 209.37259f, 105.37258f, 204.0f, 112.0f, 204.0f),
                    PathNode.LineTo(144.0f, 204.0f),
                    PathNode.CurveTo(150.62741f, 204.0f, 156.0f, 209.37259f, 156.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 156.0f),
                    PathNode.CurveTo(46.62742f, 156.0f, 52.0f, 150.62741f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 105.37258f, 46.62742f, 100.0f, 40.0f, 100.0f),
                    PathNode.CurveTo(33.37258f, 100.0f, 28.0f, 105.37258f, 28.0f, 112.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 150.62741f, 33.37258f, 156.0f, 40.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 184.0f),
                    PathNode.CurveTo(52.0f, 177.37259f, 46.62742f, 172.0f, 40.0f, 172.0f),
                    PathNode.CurveTo(33.37258f, 172.0f, 28.0f, 177.37259f, 28.0f, 184.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(72.0f, 228.0f),
                    PathNode.CurveTo(78.62742f, 228.0f, 84.0f, 222.62741f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 209.37259f, 78.62742f, 204.0f, 72.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 219.0457f, 219.0457f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(177.37259f, 228.0f, 172.0f, 222.62741f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 209.37259f, 177.37259f, 204.0f, 184.0f, 204.0f),
                    PathNode.LineTo(187.0f, 204.0f),
                    PathNode.LineTo(52.0f, 69.0f),
                    PathNode.LineTo(52.0f, 72.0f),
                    PathNode.CurveTo(52.0f, 78.62742f, 46.62742f, 84.0f, 40.0f, 84.0f),
                    PathNode.CurveTo(33.37258f, 84.0f, 28.0f, 78.62742f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 36.954304f, 36.954304f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(208.0f, 28.0f),
                    PathNode.CurveTo(219.0457f, 28.0f, 228.0f, 36.954304f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 52.0f),
                    PathNode.LineTo(69.0f, 52.0f),
                    PathNode.LineTo(204.0f, 187.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
