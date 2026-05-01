package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorBoldIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 112.0f),
                    PathNode.LineTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.CurveTo(217.37259f, 220.0f, 212.0f, 214.62741f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 134.42f),
                    PathNode.LineTo(206.66f, 138.0f),
                    PathNode.CurveTo(201.13715f, 141.67822f, 193.67822f, 140.18285f, 190.0f, 134.66f),
                    PathNode.CurveTo(186.32178f, 129.13715f, 187.81715f, 121.678215f, 193.34f, 118.0f),
                    PathNode.LineTo(217.34f, 102.0f),
                    PathNode.CurveTo(221.02469f, 99.54161f, 225.76402f, 99.31299f, 229.66824f, 101.40528f),
                    PathNode.CurveTo(233.57246f, 103.497574f, 236.00658f, 107.57049f, 236.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 44.0f),
                    PathNode.CurveTo(137.37259f, 44.0f, 132.0f, 49.37258f, 132.0f, 56.0f),
                    PathNode.LineTo(132.0f, 104.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 49.37258f, 46.62742f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.CurveTo(46.62742f, 188.0f, 52.0f, 182.62741f, 52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 182.62741f, 137.37259f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(150.62741f, 188.0f, 156.0f, 182.62741f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 49.37258f, 150.62741f, 44.0f, 144.0f, 44.0f),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
