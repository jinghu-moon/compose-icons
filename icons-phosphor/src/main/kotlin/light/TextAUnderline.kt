package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorLightIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(61.45f, 173.43f),
                    PathNode.CurveTo(62.892292f, 174.11234f, 64.54696f, 174.1921f, 66.048195f, 173.65164f),
                    PathNode.CurveTo(67.54942f, 173.1112f, 68.773575f, 171.99507f, 69.45f, 170.55f),
                    PathNode.LineTo(86.63f, 134.0f),
                    PathNode.LineTo(169.37f, 134.0f),
                    PathNode.LineTo(186.57f, 170.55f),
                    PathNode.CurveTo(187.55841f, 172.65518f, 189.67433f, 173.99956f, 192.0f, 174.0f),
                    PathNode.CurveTo(192.88185f, 174.00229f, 193.75307f, 173.80756f, 194.55f, 173.43f),
                    PathNode.CurveTo(195.99507f, 172.75357f, 197.1112f, 171.52942f, 197.65164f, 170.0282f),
                    PathNode.CurveTo(198.1921f, 168.52696f, 198.11234f, 166.87228f, 197.43f, 165.43f),
                    PathNode.LineTo(133.43f, 29.43f),
                    PathNode.CurveTo(132.44087f, 27.325788f, 130.3251f, 25.98247f, 128.0f, 25.98247f),
                    PathNode.CurveTo(125.674904f, 25.98247f, 123.55912f, 27.325788f, 122.57f, 29.43f),
                    PathNode.LineTo(58.57f, 165.43f),
                    PathNode.CurveTo(57.88767f, 166.87228f, 57.80791f, 168.52696f, 58.348354f, 170.0282f),
                    PathNode.CurveTo(58.888798f, 171.52942f, 60.004932f, 172.75357f, 61.45f, 173.43f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 46.09f),
                    PathNode.LineTo(163.72f, 122.0f),
                    PathNode.LineTo(92.28f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 219.3137f, 219.3137f, 222.0f, 216.0f, 222.0f),
                    PathNode.LineTo(40.0f, 222.0f),
                    PathNode.CurveTo(36.68629f, 222.0f, 34.0f, 219.3137f, 34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 212.6863f, 36.68629f, 210.0f, 40.0f, 210.0f),
                    PathNode.LineTo(216.0f, 210.0f),
                    PathNode.CurveTo(219.3137f, 210.0f, 222.0f, 212.6863f, 222.0f, 216.0f),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
