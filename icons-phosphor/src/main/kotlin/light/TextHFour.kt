package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorLightIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(150.0f, 56.0f),
                    PathNode.LineTo(150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 179.3137f, 147.3137f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(140.6863f, 182.0f, 138.0f, 179.3137f, 138.0f, 176.0f),
                    PathNode.LineTo(138.0f, 122.0f),
                    PathNode.LineTo(46.0f, 122.0f),
                    PathNode.LineTo(46.0f, 176.0f),
                    PathNode.CurveTo(46.0f, 179.3137f, 43.31371f, 182.0f, 40.0f, 182.0f),
                    PathNode.CurveTo(36.68629f, 182.0f, 34.0f, 179.3137f, 34.0f, 176.0f),
                    PathNode.LineTo(34.0f, 56.0f),
                    PathNode.CurveTo(34.0f, 52.68629f, 36.68629f, 50.0f, 40.0f, 50.0f),
                    PathNode.CurveTo(43.31371f, 50.0f, 46.0f, 52.68629f, 46.0f, 56.0f),
                    PathNode.LineTo(46.0f, 110.0f),
                    PathNode.LineTo(138.0f, 110.0f),
                    PathNode.LineTo(138.0f, 56.0f),
                    PathNode.CurveTo(138.0f, 52.68629f, 140.6863f, 50.0f, 144.0f, 50.0f),
                    PathNode.CurveTo(147.3137f, 50.0f, 150.0f, 52.68629f, 150.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.0f, 184.0f),
                    PathNode.CurveTo(254.0f, 187.3137f, 251.3137f, 190.0f, 248.0f, 190.0f),
                    PathNode.LineTo(238.0f, 190.0f),
                    PathNode.LineTo(238.0f, 208.0f),
                    PathNode.CurveTo(238.0f, 211.3137f, 235.3137f, 214.0f, 232.0f, 214.0f),
                    PathNode.CurveTo(228.6863f, 214.0f, 226.0f, 211.3137f, 226.0f, 208.0f),
                    PathNode.LineTo(226.0f, 190.0f),
                    PathNode.LineTo(176.0f, 190.0f),
                    PathNode.CurveTo(173.70905f, 190.0004f, 171.61781f, 188.69618f, 170.6103f, 186.63866f),
                    PathNode.CurveTo(169.60278f, 184.58113f, 169.85487f, 182.12946f, 171.26f, 180.32f),
                    PathNode.LineTo(227.26f, 108.32f),
                    PathNode.CurveTo(228.8324f, 106.29394f, 231.51869f, 105.49128f, 233.94487f, 106.32259f),
                    PathNode.CurveTo(236.37103f, 107.15391f, 238.00058f, 109.43536f, 238.0f, 112.0f),
                    PathNode.LineTo(238.0f, 178.0f),
                    PathNode.LineTo(248.0f, 178.0f),
                    PathNode.CurveTo(251.3137f, 178.0f, 254.0f, 180.6863f, 254.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 129.49f),
                    PathNode.LineTo(188.27f, 178.0f),
                    PathNode.LineTo(226.0f, 178.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
