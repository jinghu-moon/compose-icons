package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertSquare: ImageVector
    get() {
        if (_alertSquare != null) return _alertSquare!!
        _alertSquare = tablerFilledIcon(
            name = "AlertSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.588558f, 1.999912f, 21.901804f, 3.238179f, 21.995f, 4.824f),
                    PathNode.LineTo(22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.000088f, 20.588558f, 20.761822f, 21.901804f, 19.176f, 21.995f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.411442f, 22.000088f, 2.098195f, 20.761822f, 2.005f, 19.176f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(1.999912f, 3.411442f, 3.238179f, 2.098195f, 4.824f, 2.005f),
                    PathNode.LineTo(5.0f, 2.0f),
                    PathNode.LineTo(19.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 15.0f),
                    PathNode.LineTo(11.883f, 15.007f),
                    PathNode.CurveTo(11.37995f, 15.066836f, 11.001114f, 15.493402f, 11.001114f, 16.0f),
                    PathNode.CurveTo(11.001114f, 16.506598f, 11.37995f, 16.933163f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(12.127f, 16.993f),
                    PathNode.CurveTo(12.630051f, 16.933163f, 13.008885f, 16.506598f, 13.008885f, 16.0f),
                    PathNode.CurveTo(13.008885f, 15.493402f, 12.630051f, 15.066836f, 12.127f, 15.007f),
                    PathNode.LineTo(12.01f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(11.493025f, 7.000067f, 11.066316f, 7.379507f, 11.007f, 7.883f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.007f, 12.117f),
                    PathNode.CurveTo(11.066836f, 12.62005f, 11.493402f, 12.998886f, 12.0f, 12.998886f),
                    PathNode.CurveTo(12.506598f, 12.998886f, 12.933164f, 12.62005f, 12.993f, 12.117f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.993f, 7.883f),
                    PathNode.CurveTo(12.933684f, 7.379507f, 12.506975f, 7.000067f, 12.0f, 7.0f),
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
        return _alertSquare!!
    }

private var _alertSquare: ImageVector? = null
