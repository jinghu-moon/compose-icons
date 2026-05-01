package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) return _thumbUp!!
        _thumbUp = tablerFilledIcon(
            name = "ThumbUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 3.0f),
                    PathNode.CurveTo(14.588557f, 2.999912f, 15.901805f, 4.238179f, 15.995f, 5.824f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(19.521645f, 9.999753f, 20.802473f, 11.138745f, 20.98f, 12.65f),
                    PathNode.LineTo(20.995f, 12.824f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.LineTo(20.98f, 13.196f),
                    PathNode.LineTo(19.974f, 18.228f),
                    PathNode.CurveTo(19.593f, 19.854f, 18.472f, 21.024f, 17.164f, 21.008f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(8.493025f, 20.999933f, 8.066316f, 20.620493f, 8.007f, 20.117f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(8.001001f, 10.464f),
                    PathNode.CurveTo(8.001366f, 10.1071f, 8.191916f, 9.77745f, 8.501f, 9.599f),
                    PathNode.CurveTo(9.366989f, 9.098852f, 9.926578f, 8.199835f, 9.993f, 7.202f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(10.0f, 4.343146f, 11.343145f, 3.0f, 13.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.506975f, 10.000067f, 5.933684f, 10.379507f, 5.993f, 10.883f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(5.999933f, 20.506975f, 5.620493f, 20.933683f, 5.117f, 20.993f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(2.953375f, 21.000332f, 2.083497f, 20.193678f, 2.005f, 19.15f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(1.999669f, 10.953375f, 2.806323f, 10.083497f, 3.85f, 10.005f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.LineTo(5.0f, 10.0f),
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
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
