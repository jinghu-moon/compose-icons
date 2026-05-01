package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) return _caretCircleDown!!
        _caretCircleDown = phosphorBoldIcon(
            name = "CaretCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.49f, 103.51f),
                    PathNode.CurveTo(178.74945f, 105.76162f, 180.01947f, 108.82018f, 180.01947f, 112.01f),
                    PathNode.CurveTo(180.01947f, 115.19982f, 178.74945f, 118.25838f, 176.49f, 120.51f),
                    PathNode.LineTo(136.49f, 160.51f),
                    PathNode.CurveTo(134.23837f, 162.76945f, 131.17982f, 164.03946f, 127.99f, 164.03946f),
                    PathNode.CurveTo(124.80018f, 164.03946f, 121.74162f, 162.76945f, 119.49f, 160.51f),
                    PathNode.LineTo(79.49f, 120.51f),
                    PathNode.CurveTo(74.79558f, 115.81558f, 74.79558f, 108.20442f, 79.49f, 103.51f),
                    PathNode.CurveTo(84.18442f, 98.81558f, 91.79558f, 98.81558f, 96.49f, 103.51f),
                    PathNode.LineTo(128.0f, 135.0f),
                    PathNode.LineTo(159.51f, 103.48f),
                    PathNode.CurveTo(161.7648f, 101.230644f, 164.82132f, 99.969925f, 168.00623f, 99.975555f),
                    PathNode.CurveTo(171.19113f, 99.98118f, 174.24316f, 101.25269f, 176.49f, 103.51f),
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
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
