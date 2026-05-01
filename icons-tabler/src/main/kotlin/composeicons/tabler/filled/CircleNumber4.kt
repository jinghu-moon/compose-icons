package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber4: ImageVector
    get() {
        if (_circleNumber4 != null) return _circleNumber4!!
        _circleNumber4 = tablerFilledIcon(
            name = "CircleNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(13.493025f, 7.000067f, 13.066316f, 7.379507f, 13.007f, 7.883f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(10.993f, 7.883f),
                    PathNode.CurveTo(10.933164f, 7.379949f, 10.506598f, 7.001115f, 10.0f, 7.001115f),
                    PathNode.CurveTo(9.493402f, 7.001115f, 9.066836f, 7.379949f, 9.007f, 7.883f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.005f, 11.15f),
                    PathNode.CurveTo(9.078939f, 12.133892f, 9.859354f, 12.916854f, 10.843f, 12.994f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(13.007f, 16.117f),
                    PathNode.CurveTo(13.066836f, 16.62005f, 13.493402f, 16.998886f, 14.0f, 16.998886f),
                    PathNode.CurveTo(14.506598f, 16.998886f, 14.933164f, 16.62005f, 14.993f, 16.117f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.LineTo(14.993f, 7.883f),
                    PathNode.CurveTo(14.933684f, 7.379507f, 14.506975f, 7.000067f, 14.0f, 7.0f),
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
        return _circleNumber4!!
    }

private var _circleNumber4: ImageVector? = null
