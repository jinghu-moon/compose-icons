package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorBoldIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 40.0f),
                    PathNode.CurveTo(100.0f, 33.37258f, 105.37258f, 28.0f, 112.0f, 28.0f),
                    PathNode.LineTo(144.0f, 28.0f),
                    PathNode.CurveTo(150.62741f, 28.0f, 156.0f, 33.37258f, 156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 46.62742f, 150.62741f, 52.0f, 144.0f, 52.0f),
                    PathNode.LineTo(112.0f, 52.0f),
                    PathNode.CurveTo(105.37258f, 52.0f, 100.0f, 46.62742f, 100.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 204.0f),
                    PathNode.LineTo(112.0f, 204.0f),
                    PathNode.CurveTo(105.37258f, 204.0f, 100.0f, 209.37259f, 100.0f, 216.0f),
                    PathNode.CurveTo(100.0f, 222.62741f, 105.37258f, 228.0f, 112.0f, 228.0f),
                    PathNode.LineTo(144.0f, 228.0f),
                    PathNode.CurveTo(150.62741f, 228.0f, 156.0f, 222.62741f, 156.0f, 216.0f),
                    PathNode.CurveTo(156.0f, 209.37259f, 150.62741f, 204.0f, 144.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(184.0f, 28.0f),
                    PathNode.CurveTo(177.37259f, 28.0f, 172.0f, 33.37258f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 46.62742f, 177.37259f, 52.0f, 184.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 72.0f),
                    PathNode.CurveTo(204.0f, 78.62742f, 209.37259f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(222.62741f, 84.0f, 228.0f, 78.62742f, 228.0f, 72.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 100.0f),
                    PathNode.CurveTo(209.37259f, 100.0f, 204.0f, 105.37258f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 150.62741f, 209.37259f, 156.0f, 216.0f, 156.0f),
                    PathNode.CurveTo(222.62741f, 156.0f, 228.0f, 150.62741f, 228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 105.37258f, 222.62741f, 100.0f, 216.0f, 100.0f),
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
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
