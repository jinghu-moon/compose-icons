package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorLightIcon(
            name = "TextHTwo",
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
                    PathNode.MoveTo(240.0f, 202.0f),
                    PathNode.LineTo(204.0f, 202.0f),
                    PathNode.LineTo(240.0f, 154.05f),
                    PathNode.CurveTo(247.04886f, 144.6025f, 247.91202f, 131.90262f, 242.20625f, 121.58824f),
                    PathNode.CurveTo(236.5005f, 111.27387f, 225.28334f, 105.25663f, 213.53441f, 106.20777f),
                    PathNode.CurveTo(201.78549f, 107.158905f, 191.68233f, 114.90214f, 187.71f, 126.0f),
                    PathNode.CurveTo(186.83801f, 128.0536f, 187.17752f, 130.42146f, 188.59138f, 132.14734f),
                    PathNode.CurveTo(190.00526f, 133.8732f, 192.26001f, 134.67204f, 194.44505f, 134.22127f),
                    PathNode.CurveTo(196.63011f, 133.77048f, 198.3846f, 132.14452f, 199.0f, 130.0f),
                    PathNode.CurveTo(201.24069f, 123.669174f, 206.81935f, 119.11218f, 213.47f, 118.18f),
                    PathNode.CurveTo(220.67851f, 117.170906f, 227.78528f, 120.602554f, 231.4776f, 126.87533f),
                    PathNode.CurveTo(235.1699f, 133.1481f, 234.72095f, 141.02724f, 230.34f, 146.84f),
                    PathNode.LineTo(187.2f, 204.4f),
                    PathNode.CurveTo(185.83643f, 206.21811f, 185.61708f, 208.65057f, 186.63344f, 210.68329f),
                    PathNode.CurveTo(187.6498f, 212.71599f, 189.72737f, 214.0f, 192.0f, 214.0f),
                    PathNode.LineTo(240.0f, 214.0f),
                    PathNode.CurveTo(243.3137f, 214.0f, 246.0f, 211.3137f, 246.0f, 208.0f),
                    PathNode.CurveTo(246.0f, 204.6863f, 243.3137f, 202.0f, 240.0f, 202.0f),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
