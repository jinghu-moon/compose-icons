package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) return _arrowCircleRight!!
        _arrowCircleRight = phosphorBoldIcon(
            name = "ArrowCircleRight",
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
                    PathNode.MoveTo(176.49f, 119.51f),
                    PathNode.CurveTo(178.74945f, 121.76162f, 180.01947f, 124.82018f, 180.01947f, 128.01f),
                    PathNode.CurveTo(180.01947f, 131.19981f, 178.74945f, 134.25838f, 176.49f, 136.51f),
                    PathNode.LineTo(144.49f, 168.51f),
                    PathNode.CurveTo(139.79558f, 173.20442f, 132.18442f, 173.20442f, 127.49f, 168.51f),
                    PathNode.CurveTo(122.79558f, 163.81558f, 122.79558f, 156.20442f, 127.49f, 151.51f),
                    PathNode.LineTo(139.0f, 140.0f),
                    PathNode.LineTo(88.0f, 140.0f),
                    PathNode.CurveTo(81.37258f, 140.0f, 76.0f, 134.62741f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 121.37258f, 81.37258f, 116.0f, 88.0f, 116.0f),
                    PathNode.LineTo(139.0f, 116.0f),
                    PathNode.LineTo(127.48f, 104.49f),
                    PathNode.CurveTo(122.785576f, 99.79558f, 122.785576f, 92.18442f, 127.48f, 87.49f),
                    PathNode.CurveTo(132.17442f, 82.79558f, 139.78558f, 82.79558f, 144.48f, 87.49f),
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
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
