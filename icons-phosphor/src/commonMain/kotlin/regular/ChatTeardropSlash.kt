package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorRegularIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(55.26f, 59.88f),
                    PathNode.CurveTo(40.18584f, 77.840454f, 31.947035f, 100.55208f, 32.0f, 124.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(132.0f, 224.0f),
                    PathNode.CurveTo(152.17738f, 223.97398f, 171.8781f, 217.86478f, 188.53f, 206.47f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.CurveTo(47.957672f, 105.060844f, 54.35816f, 86.670456f, 66.15f, 71.85f),
                    PathNode.LineTo(177.66f, 194.51f),
                    PathNode.CurveTo(164.08397f, 203.36916f, 148.2108f, 208.0588f, 132.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 124.0f),
                    PathNode.CurveTo(232.013f, 142.2027f, 227.05092f, 160.06279f, 217.65f, 175.65f),
                    PathNode.CurveTo(215.36354f, 179.43315f, 210.44315f, 180.64645f, 206.66f, 178.36f),
                    PathNode.CurveTo(202.87685f, 176.07355f, 201.66353f, 171.15315f, 203.95f, 167.37f),
                    PathNode.CurveTo(223.14064f, 135.57147f, 219.1707f, 94.94473f, 194.18732f, 67.46278f),
                    PathNode.CurveTo(169.20393f, 39.98083f, 129.13832f, 32.168056f, 95.66f, 48.25f),
                    PathNode.CurveTo(91.678024f, 50.166428f, 86.89643f, 48.491974f, 84.98f, 44.51f),
                    PathNode.CurveTo(83.06357f, 40.528027f, 84.73803f, 35.74643f, 88.72f, 33.83f),
                    PathNode.CurveTo(119.70966f, 18.952045f, 156.16888f, 21.03446f, 185.263f, 39.344173f),
                    PathNode.CurveTo(214.3571f, 57.653885f, 232.00722f, 89.623955f, 232.0f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
