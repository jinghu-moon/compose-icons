package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorBoldIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(44.954304f, 36.0f, 36.0f, 44.954304f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.CurveTo(36.0f, 111.04569f, 44.954304f, 120.0f, 56.0f, 120.0f),
                    PathNode.LineTo(100.0f, 120.0f),
                    PathNode.CurveTo(111.04569f, 120.0f, 120.0f, 111.04569f, 120.0f, 100.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.0f, 44.954304f, 111.04569f, 36.0f, 100.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 96.0f),
                    PathNode.LineTo(60.0f, 96.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(156.0f, 36.0f),
                    PathNode.CurveTo(144.9543f, 36.0f, 136.0f, 44.954304f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 100.0f),
                    PathNode.CurveTo(136.0f, 111.04569f, 144.9543f, 120.0f, 156.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(211.0457f, 120.0f, 220.0f, 111.04569f, 220.0f, 100.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 44.954304f, 211.0457f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(44.954304f, 136.0f, 36.0f, 144.9543f, 36.0f, 156.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 211.0457f, 44.954304f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(100.0f, 220.0f),
                    PathNode.CurveTo(111.04569f, 220.0f, 120.0f, 211.0457f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 156.0f),
                    PathNode.CurveTo(120.0f, 144.9543f, 111.04569f, 136.0f, 100.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(60.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 136.0f),
                    PathNode.LineTo(156.0f, 136.0f),
                    PathNode.CurveTo(144.9543f, 136.0f, 136.0f, 144.9543f, 136.0f, 156.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 211.0457f, 144.9543f, 220.0f, 156.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(211.0457f, 220.0f, 220.0f, 211.0457f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 156.0f),
                    PathNode.CurveTo(220.0f, 144.9543f, 211.0457f, 136.0f, 200.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(196.0f, 160.0f),
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
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
