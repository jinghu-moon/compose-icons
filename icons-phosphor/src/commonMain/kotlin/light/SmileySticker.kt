package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorLightIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(87.93297f, 26.040401f, 51.600605f, 49.53483f, 35.125134f, 86.0578f),
                    PathNode.CurveTo(18.64966f, 122.580765f, 25.083f, 165.36678f, 51.5704f, 195.4298f),
                    PathNode.CurveTo(78.0578f, 225.49283f, 119.69274f, 237.26402f, 158.0f, 225.52f),
                    PathNode.CurveTo(158.93584f, 225.23306f, 159.78725f, 224.72153f, 160.48f, 224.03f),
                    PathNode.LineTo(224.0f, 160.46f),
                    PathNode.CurveTo(224.69292f, 159.7644f, 225.20454f, 158.90941f, 225.49f, 157.97f),
                    PathNode.CurveTo(234.9716f, 127.0371f, 229.22496f, 93.44061f, 210.00113f, 67.41775f),
                    PathNode.CurveTo(190.7773f, 41.39489f, 160.35342f, 26.028168f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.47f, 153.0f),
                    PathNode.LineTo(153.05f, 214.43f),
                    PathNode.CurveTo(113.643616f, 225.81725f, 71.52595f, 209.09015f, 50.66967f, 173.7695f),
                    PathNode.CurveTo(29.81339f, 138.44885f, 35.506607f, 93.4902f, 64.508835f, 64.483246f),
                    PathNode.CurveTo(93.51106f, 35.4763f, 138.4688f, 29.775763f, 173.79283f, 50.62629f),
                    PathNode.CurveTo(209.11688f, 71.476814f, 225.85083f, 113.59177f, 214.47f, 153.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 108.0f),
                    PathNode.CurveTo(82.0f, 102.47715f, 86.47715f, 98.0f, 92.0f, 98.0f),
                    PathNode.CurveTo(97.52285f, 98.0f, 102.0f, 102.47715f, 102.0f, 108.0f),
                    PathNode.CurveTo(102.0f, 113.52285f, 97.52285f, 118.0f, 92.0f, 118.0f),
                    PathNode.CurveTo(86.47715f, 118.0f, 82.0f, 113.52285f, 82.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 108.0f),
                    PathNode.CurveTo(174.0f, 113.52285f, 169.52284f, 118.0f, 164.0f, 118.0f),
                    PathNode.CurveTo(158.47716f, 118.0f, 154.0f, 113.52285f, 154.0f, 108.0f),
                    PathNode.CurveTo(154.0f, 102.47715f, 158.47716f, 98.0f, 164.0f, 98.0f),
                    PathNode.CurveTo(169.52284f, 98.0f, 174.0f, 102.47715f, 174.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.19f, 155.0f),
                    PathNode.CurveTo(163.27f, 172.16f, 146.8f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(109.2f, 182.0f, 92.73f, 172.16f, 82.81f, 155.0f),
                    PathNode.CurveTo(81.31959f, 152.1509f, 82.34006f, 148.63336f, 85.12384f, 147.02425f),
                    PathNode.CurveTo(87.907616f, 145.41512f, 91.46503f, 146.28648f, 93.19f, 149.0f),
                    PathNode.CurveTo(101.03f, 162.54f, 113.39f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(142.61f, 170.0f, 155.0f, 162.54f, 162.81f, 149.0f),
                    PathNode.CurveTo(163.83157f, 147.04713f, 165.84157f, 145.81152f, 168.0453f, 145.7817f),
                    PathNode.CurveTo(170.24904f, 145.75186f, 172.29173f, 146.93262f, 173.36577f, 148.85712f),
                    PathNode.CurveTo(174.43985f, 150.78163f, 174.37238f, 153.14006f, 173.19f, 155.0f),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
