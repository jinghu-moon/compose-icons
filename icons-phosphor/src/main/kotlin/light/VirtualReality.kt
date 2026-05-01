package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorLightIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(121.62f, 98.11f),
                    PathNode.LineTo(97.62f, 162.11f),
                    PathNode.CurveTo(96.743324f, 164.45465f, 94.50318f, 166.00867f, 92.0f, 166.00867f),
                    PathNode.CurveTo(89.49682f, 166.00867f, 87.256676f, 164.45465f, 86.38f, 162.11f),
                    PathNode.LineTo(62.38f, 98.11f),
                    PathNode.CurveTo(61.21468f, 95.00616f, 62.78616f, 91.54532f, 65.89f, 90.38f),
                    PathNode.CurveTo(68.99384f, 89.21467f, 72.45468f, 90.78616f, 73.62f, 93.89f),
                    PathNode.LineTo(92.0f, 142.89f),
                    PathNode.LineTo(110.38f, 93.89f),
                    PathNode.CurveTo(111.54532f, 90.78616f, 115.00616f, 89.21467f, 118.11f, 90.38f),
                    PathNode.CurveTo(121.21384f, 91.54532f, 122.78533f, 95.00616f, 121.62f, 98.11f),
                    PathNode.Close,
                    PathNode.MoveTo(254.0f, 128.0f),
                    PathNode.CurveTo(253.95041f, 171.05765f, 219.05765f, 205.95041f, 176.0f, 206.0f),
                    PathNode.LineTo(80.0f, 206.0f),
                    PathNode.CurveTo(36.92179f, 206.0f, 2.0f, 171.07822f, 2.0f, 128.0f),
                    PathNode.CurveTo(2.0f, 84.92179f, 36.92179f, 50.0f, 80.0f, 50.0f),
                    PathNode.LineTo(176.0f, 50.0f),
                    PathNode.CurveTo(219.05765f, 50.049595f, 253.95041f, 84.94235f, 254.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.0f, 128.0f),
                    PathNode.CurveTo(241.95592f, 91.56748f, 212.43253f, 62.04408f, 176.0f, 62.0f),
                    PathNode.LineTo(80.0f, 62.0f),
                    PathNode.CurveTo(43.549206f, 62.0f, 14.0f, 91.54921f, 14.0f, 128.0f),
                    PathNode.CurveTo(14.0f, 164.45079f, 43.549206f, 194.0f, 80.0f, 194.0f),
                    PathNode.LineTo(176.0f, 194.0f),
                    PathNode.CurveTo(212.43253f, 193.95592f, 241.95592f, 164.43253f, 242.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.2f, 137.76f),
                    PathNode.LineTo(189.2f, 157.02f),
                    PathNode.CurveTo(190.85686f, 159.89738f, 189.8674f, 163.57315f, 186.99f, 165.23f),
                    PathNode.CurveTo(184.1126f, 166.88687f, 180.43686f, 165.89738f, 178.78f, 163.02f),
                    PathNode.LineTo(166.71f, 141.9f),
                    PathNode.CurveTo(165.8089f, 141.9786f, 164.90443f, 142.01198f, 164.0f, 142.0f),
                    PathNode.LineTo(150.0f, 142.0f),
                    PathNode.LineTo(150.0f, 160.0f),
                    PathNode.CurveTo(150.0f, 163.3137f, 147.3137f, 166.0f, 144.0f, 166.0f),
                    PathNode.CurveTo(140.6863f, 166.0f, 138.0f, 163.3137f, 138.0f, 160.0f),
                    PathNode.LineTo(138.0f, 96.0f),
                    PathNode.CurveTo(138.0f, 92.686295f, 140.6863f, 90.0f, 144.0f, 90.0f),
                    PathNode.LineTo(164.0f, 90.0f),
                    PathNode.CurveTo(175.49426f, 90.0134f, 185.61574f, 97.57263f, 188.89148f, 108.59024f),
                    PathNode.CurveTo(192.16724f, 119.60784f, 187.81982f, 131.46896f, 178.2f, 137.76f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 130.0f),
                    PathNode.CurveTo(171.73198f, 130.0f, 178.0f, 123.73199f, 178.0f, 116.0f),
                    PathNode.CurveTo(178.0f, 108.26801f, 171.73198f, 102.0f, 164.0f, 102.0f),
                    PathNode.LineTo(150.0f, 102.0f),
                    PathNode.LineTo(150.0f, 130.0f),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
