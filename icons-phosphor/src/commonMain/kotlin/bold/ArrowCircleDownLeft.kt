package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleDownLeft: ImageVector
    get() {
        if (_arrowCircleDownLeft != null) return _arrowCircleDownLeft!!
        _arrowCircleDownLeft = phosphorBoldIcon(
            name = "ArrowCircleDownLeft",
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
                    PathNode.MoveTo(168.49f, 87.51f),
                    PathNode.CurveTo(170.74945f, 89.76162f, 172.01947f, 92.82018f, 172.01947f, 96.01f),
                    PathNode.CurveTo(172.01947f, 99.19982f, 170.74945f, 102.25838f, 168.49f, 104.51f),
                    PathNode.LineTo(125.0f, 148.0f),
                    PathNode.LineTo(144.0f, 148.0f),
                    PathNode.CurveTo(150.62741f, 148.0f, 156.0f, 153.37259f, 156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 166.62741f, 150.62741f, 172.0f, 144.0f, 172.0f),
                    PathNode.LineTo(96.0f, 172.0f),
                    PathNode.CurveTo(89.37258f, 172.0f, 84.0f, 166.62741f, 84.0f, 160.0f),
                    PathNode.LineTo(84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 105.37258f, 89.37258f, 100.0f, 96.0f, 100.0f),
                    PathNode.CurveTo(102.62742f, 100.0f, 108.0f, 105.37258f, 108.0f, 112.0f),
                    PathNode.LineTo(108.0f, 131.0f),
                    PathNode.LineTo(151.51f, 87.48f),
                    PathNode.CurveTo(153.7648f, 85.230644f, 156.82132f, 83.969925f, 160.00623f, 83.975555f),
                    PathNode.CurveTo(163.19113f, 83.98118f, 166.24316f, 85.25269f, 168.49f, 87.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowCircleDownLeft!!
    }

private var _arrowCircleDownLeft: ImageVector? = null
