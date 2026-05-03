package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorLightIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.07f, 176.94f),
                    PathNode.CurveTo(214.41f, 167.2f, 206.0f, 139.73f, 206.0f, 104.0f),
                    PathNode.CurveTo(206.0f, 60.92179f, 171.07822f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(84.92179f, 26.0f, 50.0f, 60.92179f, 50.0f, 104.0f),
                    PathNode.CurveTo(50.0f, 139.74f, 41.58f, 167.2f, 35.92f, 176.94f),
                    PathNode.CurveTo(33.39231f, 181.2684f, 33.371517f, 186.61789f, 35.865482f, 190.9658f),
                    PathNode.CurveTo(38.359447f, 195.31372f, 42.987587f, 197.9966f, 48.0f, 198.0f),
                    PathNode.LineTo(90.48f, 198.0f),
                    PathNode.CurveTo(93.489876f, 216.37045f, 109.3646f, 229.85588f, 127.98f, 229.85588f),
                    PathNode.CurveTo(146.5954f, 229.85588f, 162.47014f, 216.37045f, 165.48f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(213.00883f, 197.98944f, 217.63043f, 195.30377f, 220.1195f, 190.95715f),
                    PathNode.CurveTo(222.6086f, 186.61055f, 222.5859f, 181.2653f, 220.06f, 176.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(115.955f, 217.99619f, 105.48962f, 209.7199f, 102.71f, 198.0f),
                    PathNode.LineTo(153.29f, 198.0f),
                    PathNode.CurveTo(150.51039f, 209.7199f, 140.045f, 217.99619f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.71f, 185.0f),
                    PathNode.CurveTo(209.37427f, 185.62437f, 208.71886f, 186.00992f, 208.01f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(47.29115f, 186.00992f, 46.635735f, 185.62437f, 46.3f, 185.0f),
                    PathNode.CurveTo(45.942734f, 184.3812f, 45.942734f, 183.6188f, 46.3f, 183.0f),
                    PathNode.CurveTo(53.87f, 170.0f, 62.0f, 139.69f, 62.0f, 104.0f),
                    PathNode.CurveTo(62.0f, 67.54921f, 91.54921f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(164.45079f, 38.0f, 194.0f, 67.54921f, 194.0f, 104.0f),
                    PathNode.CurveTo(194.0f, 139.68f, 202.14f, 169.95f, 209.71f, 183.0f),
                    PathNode.CurveTo(210.06726f, 183.6188f, 210.06726f, 184.3812f, 209.71f, 185.0f),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
