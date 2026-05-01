package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) return _checkCircle!!
        _checkCircle = phosphorBoldIcon(
            name = "CheckCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.49f, 95.51f),
                    PathNode.CurveTo(178.74945f, 97.76162f, 180.01947f, 100.82018f, 180.01947f, 104.01f),
                    PathNode.CurveTo(180.01947f, 107.19982f, 178.74945f, 110.25838f, 176.49f, 112.51f),
                    PathNode.LineTo(120.49f, 168.51f),
                    PathNode.CurveTo(118.23838f, 170.76945f, 115.17982f, 172.03946f, 111.99f, 172.03946f),
                    PathNode.CurveTo(108.80018f, 172.03946f, 105.74162f, 170.76945f, 103.49f, 168.51f),
                    PathNode.LineTo(79.49f, 144.51f),
                    PathNode.CurveTo(74.79558f, 139.81558f, 74.79558f, 132.20442f, 79.49f, 127.51f),
                    PathNode.CurveTo(84.18442f, 122.81558f, 91.79558f, 122.81558f, 96.49f, 127.51f),
                    PathNode.LineTo(112.0f, 143.0f),
                    PathNode.LineTo(159.51f, 95.48f),
                    PathNode.CurveTo(161.7648f, 93.230644f, 164.82132f, 91.969925f, 168.00623f, 91.975555f),
                    PathNode.CurveTo(171.19113f, 91.98118f, 174.24316f, 93.25269f, 176.49f, 95.51f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 81.60808f, 174.39192f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(81.60808f, 44.0f, 44.0f, 81.60808f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 174.39192f, 81.60808f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(174.37135f, 211.9504f, 211.9504f, 174.37135f, 212.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
