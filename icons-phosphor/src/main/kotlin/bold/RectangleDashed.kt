package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorBoldIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 54.62742f, 78.62742f, 60.0f, 72.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 78.62742f, 38.62742f, 84.0f, 32.0f, 84.0f),
                    PathNode.CurveTo(25.372583f, 84.0f, 20.0f, 78.62742f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(78.62742f, 36.0f, 84.0f, 41.37258f, 84.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 156.0f),
                    PathNode.CurveTo(38.62742f, 156.0f, 44.0f, 150.62741f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 105.37258f, 38.62742f, 100.0f, 32.0f, 100.0f),
                    PathNode.CurveTo(25.372583f, 100.0f, 20.0f, 105.37258f, 20.0f, 112.0f),
                    PathNode.LineTo(20.0f, 144.0f),
                    PathNode.CurveTo(20.0f, 150.62741f, 25.372583f, 156.0f, 32.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 177.37259f, 38.62742f, 172.0f, 32.0f, 172.0f),
                    PathNode.CurveTo(25.372583f, 172.0f, 20.0f, 177.37259f, 20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(78.62742f, 220.0f, 84.0f, 214.62741f, 84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 201.37259f, 78.62742f, 196.0f, 72.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 196.0f),
                    PathNode.LineTo(112.0f, 196.0f),
                    PathNode.CurveTo(105.37258f, 196.0f, 100.0f, 201.37259f, 100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 214.62741f, 105.37258f, 220.0f, 112.0f, 220.0f),
                    PathNode.LineTo(144.0f, 220.0f),
                    PathNode.CurveTo(150.62741f, 220.0f, 156.0f, 214.62741f, 156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 201.37259f, 150.62741f, 196.0f, 144.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 172.0f),
                    PathNode.CurveTo(217.37259f, 172.0f, 212.0f, 177.37259f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 196.0f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.CurveTo(177.37259f, 196.0f, 172.0f, 201.37259f, 172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 214.62741f, 177.37259f, 220.0f, 184.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 177.37259f, 230.62741f, 172.0f, 224.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 100.0f),
                    PathNode.CurveTo(217.37259f, 100.0f, 212.0f, 105.37258f, 212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 150.62741f, 217.37259f, 156.0f, 224.0f, 156.0f),
                    PathNode.CurveTo(230.62741f, 156.0f, 236.0f, 150.62741f, 236.0f, 144.0f),
                    PathNode.LineTo(236.0f, 112.0f),
                    PathNode.CurveTo(236.0f, 105.37258f, 230.62741f, 100.0f, 224.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(177.37259f, 36.0f, 172.0f, 41.37258f, 172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 54.62742f, 177.37259f, 60.0f, 184.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.CurveTo(212.0f, 78.62742f, 217.37259f, 84.0f, 224.0f, 84.0f),
                    PathNode.CurveTo(230.62741f, 84.0f, 236.0f, 78.62742f, 236.0f, 72.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 36.0f),
                    PathNode.LineTo(112.0f, 36.0f),
                    PathNode.CurveTo(105.37258f, 36.0f, 100.0f, 41.37258f, 100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 54.62742f, 105.37258f, 60.0f, 112.0f, 60.0f),
                    PathNode.LineTo(144.0f, 60.0f),
                    PathNode.CurveTo(150.62741f, 60.0f, 156.0f, 54.62742f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 41.37258f, 150.62741f, 36.0f, 144.0f, 36.0f),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
