package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorFillIcon(
            name = "DiceTwo",
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
                    PathNode.MoveTo(108.0f, 120.0f),
                    PathNode.CurveTo(101.37258f, 120.0f, 96.0f, 114.62742f, 96.0f, 108.0f),
                    PathNode.CurveTo(96.0f, 101.37258f, 101.37258f, 96.0f, 108.0f, 96.0f),
                    PathNode.CurveTo(114.62742f, 96.0f, 120.0f, 101.37258f, 120.0f, 108.0f),
                    PathNode.CurveTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 160.0f),
                    PathNode.CurveTo(141.37259f, 160.0f, 136.0f, 154.62741f, 136.0f, 148.0f),
                    PathNode.CurveTo(136.0f, 141.37259f, 141.37259f, 136.0f, 148.0f, 136.0f),
                    PathNode.CurveTo(154.62741f, 136.0f, 160.0f, 141.37259f, 160.0f, 148.0f),
                    PathNode.CurveTo(160.0f, 154.62741f, 154.62741f, 160.0f, 148.0f, 160.0f),
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
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
