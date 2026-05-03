package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorFillIcon(
            name = "DiceFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(46.32689f, 32.0f, 32.0f, 46.32689f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 209.67311f, 46.32689f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(209.67311f, 224.0f, 224.0f, 209.67311f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 46.32689f, 209.67311f, 32.0f, 192.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 168.0f),
                    PathNode.CurveTo(93.37258f, 168.0f, 88.0f, 162.62741f, 88.0f, 156.0f),
                    PathNode.CurveTo(88.0f, 149.37259f, 93.37258f, 144.0f, 100.0f, 144.0f),
                    PathNode.CurveTo(106.62742f, 144.0f, 112.0f, 149.37259f, 112.0f, 156.0f),
                    PathNode.CurveTo(112.0f, 162.62741f, 106.62742f, 168.0f, 100.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 112.0f),
                    PathNode.CurveTo(93.37258f, 112.0f, 88.0f, 106.62742f, 88.0f, 100.0f),
                    PathNode.CurveTo(88.0f, 93.37258f, 93.37258f, 88.0f, 100.0f, 88.0f),
                    PathNode.CurveTo(106.62742f, 88.0f, 112.0f, 93.37258f, 112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 106.62742f, 106.62742f, 112.0f, 100.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 168.0f),
                    PathNode.CurveTo(149.37259f, 168.0f, 144.0f, 162.62741f, 144.0f, 156.0f),
                    PathNode.CurveTo(144.0f, 149.37259f, 149.37259f, 144.0f, 156.0f, 144.0f),
                    PathNode.CurveTo(162.62741f, 144.0f, 168.0f, 149.37259f, 168.0f, 156.0f),
                    PathNode.CurveTo(168.0f, 162.62741f, 162.62741f, 168.0f, 156.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 112.0f),
                    PathNode.CurveTo(149.37259f, 112.0f, 144.0f, 106.62742f, 144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 93.37258f, 149.37259f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(162.62741f, 88.0f, 168.0f, 93.37258f, 168.0f, 100.0f),
                    PathNode.CurveTo(168.0f, 106.62742f, 162.62741f, 112.0f, 156.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
