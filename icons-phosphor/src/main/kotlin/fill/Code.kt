package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorFillIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.8f, 145.6f),
                    PathNode.CurveTo(96.334625f, 148.25096f, 97.050964f, 153.26538f, 94.4f, 156.8f),
                    PathNode.CurveTo(91.74903f, 160.33463f, 86.73462f, 161.05096f, 83.2f, 158.4f),
                    PathNode.LineTo(51.2f, 134.4f),
                    PathNode.CurveTo(49.185555f, 132.88916f, 48.0f, 130.51805f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 125.48194f, 49.185555f, 123.11083f, 51.2f, 121.6f),
                    PathNode.LineTo(83.2f, 97.6f),
                    PathNode.CurveTo(86.73462f, 94.949036f, 91.74903f, 95.665375f, 94.4f, 99.2f),
                    PathNode.CurveTo(97.050964f, 102.73462f, 96.334625f, 107.74903f, 92.8f, 110.4f),
                    PathNode.LineTo(69.33f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.69f, 74.2f),
                    PathNode.LineTo(119.69f, 186.2f),
                    PathNode.CurveTo(118.94767f, 188.9982f, 116.75152f, 191.17702f, 113.94754f, 191.89716f),
                    PathNode.CurveTo(111.14356f, 192.61731f, 108.16929f, 191.7664f, 106.17045f, 189.67224f),
                    PathNode.CurveTo(104.1716f, 187.57808f, 103.46009f, 184.56741f, 104.31f, 181.8f),
                    PathNode.LineTo(136.31f, 69.8f),
                    PathNode.CurveTo(137.58942f, 65.63402f, 141.96796f, 63.25852f, 146.15788f, 64.4572f),
                    PathNode.CurveTo(150.34782f, 65.655876f, 152.80746f, 69.987686f, 151.69f, 74.2f),
                    PathNode.Close,
                    PathNode.MoveTo(204.8f, 134.4f),
                    PathNode.LineTo(172.8f, 158.4f),
                    PathNode.CurveTo(169.26538f, 161.05096f, 164.25096f, 160.33463f, 161.6f, 156.8f),
                    PathNode.CurveTo(158.94904f, 153.26538f, 159.66537f, 148.25096f, 163.2f, 145.6f),
                    PathNode.LineTo(186.67f, 128.0f),
                    PathNode.LineTo(163.2f, 110.4f),
                    PathNode.CurveTo(159.66537f, 107.74903f, 158.94904f, 102.73462f, 161.6f, 99.2f),
                    PathNode.CurveTo(164.25096f, 95.665375f, 169.26538f, 94.949036f, 172.8f, 97.6f),
                    PathNode.LineTo(204.8f, 121.6f),
                    PathNode.CurveTo(206.81445f, 123.11083f, 208.0f, 125.48194f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 130.51805f, 206.81445f, 132.88916f, 204.8f, 134.4f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _code!!
    }

private var _code: ImageVector? = null
