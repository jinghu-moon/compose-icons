package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorLightIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.24f, 107.76f),
                    PathNode.CurveTo(249.89746f, 105.42038f, 246.10254f, 105.42038f, 243.76f, 107.76f),
                    PathNode.LineTo(193.41f, 158.1f),
                    PathNode.CurveTo(192.62993f, 158.87544f, 191.37007f, 158.87544f, 190.59f, 158.1f),
                    PathNode.LineTo(105.9f, 73.41f),
                    PathNode.CurveTo(105.12455f, 72.62993f, 105.12455f, 71.37007f, 105.9f, 70.59f),
                    PathNode.LineTo(156.24f, 20.24f),
                    PathNode.CurveTo(158.44287f, 17.875921f, 158.37787f, 14.191922f, 156.09297f, 11.907025f),
                    PathNode.CurveTo(153.80807f, 9.622129f, 150.12408f, 9.557129f, 147.76f, 11.76f),
                    PathNode.LineTo(97.41f, 62.1f),
                    PathNode.CurveTo(92.67976f, 66.83555f, 91.96318f, 74.256905f, 95.7f, 79.81f),
                    PathNode.LineTo(73.41f, 102.1f),
                    PathNode.CurveTo(70.78418f, 104.72555f, 69.30899f, 108.28672f, 69.30899f, 112.0f),
                    PathNode.CurveTo(69.30899f, 115.71328f, 70.78418f, 119.27445f, 73.41f, 121.9f),
                    PathNode.LineTo(79.51f, 128.0f),
                    PathNode.LineTo(19.76f, 187.76f),
                    PathNode.CurveTo(18.291761f, 189.22978f, 17.688324f, 191.3545f, 18.164833f, 193.37662f),
                    PathNode.CurveTo(18.641342f, 195.39873f, 20.129982f, 197.03044f, 22.1f, 197.69f),
                    PathNode.LineTo(94.1f, 221.69f),
                    PathNode.CurveTo(96.25611f, 222.40852f, 98.633125f, 221.84718f, 100.24f, 220.24f),
                    PathNode.LineTo(136.0f, 184.49f),
                    PathNode.LineTo(142.1f, 190.59f),
                    PathNode.CurveTo(144.72556f, 193.21582f, 148.28671f, 194.69101f, 152.0f, 194.69101f),
                    PathNode.CurveTo(155.71329f, 194.69101f, 159.27444f, 193.21582f, 161.9f, 190.59f),
                    PathNode.LineTo(184.18f, 168.3f),
                    PathNode.CurveTo(189.7352f, 172.04239f, 197.16295f, 171.3256f, 201.9f, 166.59f),
                    PathNode.LineTo(252.24f, 116.24f),
                    PathNode.CurveTo(254.57962f, 113.89746f, 254.57962f, 110.10254f, 252.24f, 107.76f),
                    PathNode.Close,
                    PathNode.MoveTo(94.38f, 209.14f),
                    PathNode.LineTo(35.11f, 189.38f),
                    PathNode.LineTo(88.0f, 136.49f),
                    PathNode.LineTo(127.51f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.38f, 182.14f),
                    PathNode.CurveTo(152.59993f, 182.91545f, 151.34007f, 182.91545f, 150.56f, 182.14f),
                    PathNode.LineTo(140.21f, 171.8f),
                    PathNode.LineTo(140.21f, 171.8f),
                    PathNode.LineTo(92.21f, 123.8f),
                    PathNode.LineTo(92.21f, 123.8f),
                    PathNode.LineTo(81.9f, 113.41f),
                    PathNode.CurveTo(81.12455f, 112.62993f, 81.12455f, 111.37007f, 81.9f, 110.59f),
                    PathNode.LineTo(104.0f, 88.49f),
                    PathNode.LineTo(175.51f, 160.0f),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
