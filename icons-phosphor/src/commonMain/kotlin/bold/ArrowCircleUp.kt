package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) return _arrowCircleUp!!
        _arrowCircleUp = phosphorBoldIcon(
            name = "ArrowCircleUp",
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
                    PathNode.MoveTo(168.49f, 111.51f),
                    PathNode.CurveTo(173.18442f, 116.20442f, 173.18442f, 123.81558f, 168.49f, 128.51f),
                    PathNode.CurveTo(163.79558f, 133.20442f, 156.18442f, 133.20442f, 151.49f, 128.51f),
                    PathNode.LineTo(140.0f, 117.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 174.62741f, 134.62741f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 117.0f),
                    PathNode.LineTo(104.49f, 128.52f),
                    PathNode.CurveTo(99.79558f, 133.21442f, 92.18442f, 133.21442f, 87.49f, 128.52f),
                    PathNode.CurveTo(82.79558f, 123.82558f, 82.79558f, 116.214424f, 87.49f, 111.52f),
                    PathNode.LineTo(119.49f, 79.52f),
                    PathNode.CurveTo(121.74162f, 77.260544f, 124.80018f, 75.99054f, 127.99f, 75.99054f),
                    PathNode.CurveTo(131.17982f, 75.99054f, 134.23837f, 77.260544f, 136.49f, 79.52f),
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
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
