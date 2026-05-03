package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) return _arrowCircleDown!!
        _arrowCircleDown = phosphorBoldIcon(
            name = "ArrowCircleDown",
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
                    PathNode.MoveTo(168.49f, 127.51f),
                    PathNode.CurveTo(170.74945f, 129.76163f, 172.01947f, 132.82018f, 172.01947f, 136.01f),
                    PathNode.CurveTo(172.01947f, 139.19981f, 170.74945f, 142.25838f, 168.49f, 144.51f),
                    PathNode.LineTo(136.49f, 176.51f),
                    PathNode.CurveTo(134.23837f, 178.76945f, 131.17982f, 180.03946f, 127.99f, 180.03946f),
                    PathNode.CurveTo(124.80018f, 180.03946f, 121.74162f, 178.76945f, 119.49f, 176.51f),
                    PathNode.LineTo(87.49f, 144.51f),
                    PathNode.CurveTo(82.79558f, 139.81558f, 82.79558f, 132.20442f, 87.49f, 127.51f),
                    PathNode.CurveTo(92.18442f, 122.81558f, 99.79558f, 122.81558f, 104.49f, 127.51f),
                    PathNode.LineTo(116.0f, 139.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 81.37258f, 121.37258f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(134.62741f, 76.0f, 140.0f, 81.37258f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 139.0f),
                    PathNode.LineTo(151.51f, 127.48f),
                    PathNode.CurveTo(153.7648f, 125.230644f, 156.82132f, 123.969925f, 160.00623f, 123.975555f),
                    PathNode.CurveTo(163.19113f, 123.98118f, 166.24316f, 125.25269f, 168.49f, 127.51f),
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
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
