package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) return _arrowCircleLeft!!
        _arrowCircleLeft = phosphorBoldIcon(
            name = "ArrowCircleLeft",
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
                    PathNode.MoveTo(180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 134.62741f, 174.62741f, 140.0f, 168.0f, 140.0f),
                    PathNode.LineTo(117.0f, 140.0f),
                    PathNode.LineTo(128.52f, 151.51f),
                    PathNode.CurveTo(133.21442f, 156.20442f, 133.21442f, 163.81558f, 128.52f, 168.51f),
                    PathNode.CurveTo(123.82558f, 173.20442f, 116.214424f, 173.20442f, 111.52f, 168.51f),
                    PathNode.LineTo(79.52f, 136.51f),
                    PathNode.CurveTo(77.260544f, 134.25838f, 75.99054f, 131.19981f, 75.99054f, 128.01f),
                    PathNode.CurveTo(75.99054f, 124.82018f, 77.260544f, 121.76162f, 79.52f, 119.51f),
                    PathNode.LineTo(111.52f, 87.51f),
                    PathNode.CurveTo(116.214424f, 82.81558f, 123.82558f, 82.81558f, 128.52f, 87.51f),
                    PathNode.CurveTo(133.21442f, 92.20442f, 133.21442f, 99.81558f, 128.52f, 104.51f),
                    PathNode.LineTo(117.0f, 116.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(174.62741f, 116.0f, 180.0f, 121.37258f, 180.0f, 128.0f),
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
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
