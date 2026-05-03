package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorLightIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(102.0f, 152.0f),
                    PathNode.CurveTo(102.0f, 155.3137f, 99.313705f, 158.0f, 96.0f, 158.0f),
                    PathNode.LineTo(56.0f, 158.0f),
                    PathNode.CurveTo(52.68629f, 158.0f, 50.0f, 155.3137f, 50.0f, 152.0f),
                    PathNode.CurveTo(50.0f, 148.6863f, 52.68629f, 146.0f, 56.0f, 146.0f),
                    PathNode.LineTo(96.0f, 146.0f),
                    PathNode.CurveTo(99.313705f, 146.0f, 102.0f, 148.6863f, 102.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 116.0f),
                    PathNode.LineTo(238.0f, 176.0f),
                    PathNode.CurveTo(238.0f, 183.73198f, 231.73198f, 190.0f, 224.0f, 190.0f),
                    PathNode.LineTo(134.0f, 190.0f),
                    PathNode.LineTo(134.0f, 224.0f),
                    PathNode.CurveTo(134.0f, 227.3137f, 131.3137f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(124.686295f, 230.0f, 122.0f, 227.3137f, 122.0f, 224.0f),
                    PathNode.LineTo(122.0f, 190.0f),
                    PathNode.LineTo(32.0f, 190.0f),
                    PathNode.CurveTo(24.268015f, 190.0f, 18.0f, 183.73198f, 18.0f, 176.0f),
                    PathNode.LineTo(18.0f, 116.0f),
                    PathNode.CurveTo(18.03857f, 83.983475f, 43.983475f, 58.03857f, 76.0f, 58.0f),
                    PathNode.LineTo(154.0f, 58.0f),
                    PathNode.LineTo(154.0f, 24.0f),
                    PathNode.CurveTo(154.0f, 20.68629f, 156.6863f, 18.0f, 160.0f, 18.0f),
                    PathNode.LineTo(192.0f, 18.0f),
                    PathNode.CurveTo(195.3137f, 18.0f, 198.0f, 20.68629f, 198.0f, 24.0f),
                    PathNode.CurveTo(198.0f, 27.31371f, 195.3137f, 30.0f, 192.0f, 30.0f),
                    PathNode.LineTo(166.0f, 30.0f),
                    PathNode.LineTo(166.0f, 58.0f),
                    PathNode.LineTo(180.0f, 58.0f),
                    PathNode.CurveTo(212.01653f, 58.03857f, 237.96143f, 83.983475f, 238.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 178.0f),
                    PathNode.LineTo(122.0f, 116.0f),
                    PathNode.CurveTo(122.0f, 90.5949f, 101.4051f, 70.0f, 76.0f, 70.0f),
                    PathNode.CurveTo(50.594906f, 70.0f, 30.0f, 90.5949f, 30.0f, 116.0f),
                    PathNode.LineTo(30.0f, 176.0f),
                    PathNode.CurveTo(30.0f, 177.10457f, 30.89543f, 178.0f, 32.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 116.0f),
                    PathNode.CurveTo(225.96695f, 90.608604f, 205.39139f, 70.03306f, 180.0f, 70.0f),
                    PathNode.LineTo(166.0f, 70.0f),
                    PathNode.LineTo(166.0f, 144.0f),
                    PathNode.CurveTo(166.0f, 147.3137f, 163.3137f, 150.0f, 160.0f, 150.0f),
                    PathNode.CurveTo(156.6863f, 150.0f, 154.0f, 147.3137f, 154.0f, 144.0f),
                    PathNode.LineTo(154.0f, 70.0f),
                    PathNode.LineTo(111.29f, 70.0f),
                    PathNode.CurveTo(125.60675f, 80.96311f, 134.0019f, 97.967834f, 134.0f, 116.0f),
                    PathNode.LineTo(134.0f, 178.0f),
                    PathNode.LineTo(224.0f, 178.0f),
                    PathNode.CurveTo(225.10457f, 178.0f, 226.0f, 177.10457f, 226.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
