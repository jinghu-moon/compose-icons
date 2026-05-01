package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorBoldIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 182.62741f, 150.62741f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(137.37259f, 188.0f, 132.0f, 182.62741f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 182.62741f, 46.62742f, 188.0f, 40.0f, 188.0f),
                    PathNode.CurveTo(33.37258f, 188.0f, 28.0f, 182.62741f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(46.62742f, 44.0f, 52.0f, 49.37258f, 52.0f, 56.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(132.0f, 104.0f),
                    PathNode.LineTo(132.0f, 56.0f),
                    PathNode.CurveTo(132.0f, 49.37258f, 137.37259f, 44.0f, 144.0f, 44.0f),
                    PathNode.CurveTo(150.62741f, 44.0f, 156.0f, 49.37258f, 156.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 184.0f),
                    PathNode.CurveTo(256.0f, 190.62741f, 250.62741f, 196.0f, 244.0f, 196.0f),
                    PathNode.LineTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 214.62741f, 238.62741f, 220.0f, 232.0f, 220.0f),
                    PathNode.CurveTo(225.37259f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.CurveTo(175.50241f, 195.99371f, 171.38594f, 193.47296f, 169.33588f, 189.46976f),
                    PathNode.CurveTo(167.28581f, 185.46655f, 167.6464f, 180.65309f, 170.27f, 177.0f),
                    PathNode.LineTo(222.27f, 105.0f),
                    PathNode.CurveTo(225.31418f, 100.78262f, 230.7287f, 99.00649f, 235.67944f, 100.6013f),
                    PathNode.CurveTo(240.63019f, 102.19611f, 243.9899f, 106.79873f, 244.0f, 112.0f),
                    PathNode.LineTo(244.0f, 172.0f),
                    PathNode.CurveTo(250.62741f, 172.0f, 256.0f, 177.37259f, 256.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 149.11f),
                    PathNode.LineTo(203.47f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
