package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorRegularIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.8f, 121.6f),
                    PathNode.LineTo(148.8f, 85.6f),
                    PathNode.CurveTo(146.37585f, 83.78189f, 143.13258f, 83.48945f, 140.42229f, 84.84458f),
                    PathNode.CurveTo(137.71202f, 86.19972f, 136.0f, 88.969826f, 136.0f, 92.0f),
                    PathNode.LineTo(136.0f, 164.0f),
                    PathNode.CurveTo(136.0f, 167.03018f, 137.71202f, 169.80028f, 140.42229f, 171.15541f),
                    PathNode.CurveTo(143.13258f, 172.51056f, 146.37585f, 172.21811f, 148.8f, 170.4f),
                    PathNode.LineTo(196.8f, 134.4f),
                    PathNode.CurveTo(198.81445f, 132.88916f, 200.0f, 130.51805f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 125.48194f, 198.81445f, 123.11083f, 196.8f, 121.6f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 148.0f),
                    PathNode.LineTo(152.0f, 108.0f),
                    PathNode.LineTo(178.67f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.8f, 121.6f),
                    PathNode.LineTo(84.8f, 85.6f),
                    PathNode.CurveTo(82.37586f, 83.78189f, 79.13256f, 83.48945f, 76.422295f, 84.84458f),
                    PathNode.CurveTo(73.71202f, 86.19972f, 72.0f, 88.969826f, 72.0f, 92.0f),
                    PathNode.LineTo(72.0f, 164.0f),
                    PathNode.CurveTo(72.0f, 167.03018f, 73.71202f, 169.80028f, 76.422295f, 171.15541f),
                    PathNode.CurveTo(79.13256f, 172.51056f, 82.37586f, 172.21811f, 84.8f, 170.4f),
                    PathNode.LineTo(132.8f, 134.4f),
                    PathNode.CurveTo(134.81445f, 132.88916f, 136.0f, 130.51805f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 125.48194f, 134.81445f, 123.11083f, 132.8f, 121.6f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 148.0f),
                    PathNode.LineTo(88.0f, 108.0f),
                    PathNode.LineTo(114.67f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
