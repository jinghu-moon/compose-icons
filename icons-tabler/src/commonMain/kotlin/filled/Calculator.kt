package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = tablerFilledIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(19.656855f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.656855f, 19.656855f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.343146f, 22.0f, 3.0f, 20.656855f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.343146f, 4.343146f, 2.0f, 6.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.447716f, 17.0f, 7.0f, 17.447716f, 7.0f, 18.0f),
                    PathNode.LineTo(7.007f, 18.127f),
                    PathNode.CurveTo(7.069491f, 18.65239f, 7.530421f, 19.03818f, 8.058605f, 19.007172f),
                    PathNode.CurveTo(8.586789f, 18.976164f, 8.999413f, 18.539095f, 9.0f, 18.01f),
                    PathNode.LineTo(8.993f, 17.883f),
                    PathNode.CurveTo(8.933684f, 17.379507f, 8.506975f, 17.000067f, 8.0f, 17.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.CurveTo(11.447715f, 17.0f, 11.0f, 17.447716f, 11.0f, 18.0f),
                    PathNode.LineTo(11.007f, 18.127f),
                    PathNode.CurveTo(11.06949f, 18.65239f, 11.530421f, 19.03818f, 12.058605f, 19.007172f),
                    PathNode.CurveTo(12.586789f, 18.976164f, 12.999413f, 18.539095f, 13.0f, 18.01f),
                    PathNode.LineTo(12.993f, 17.883f),
                    PathNode.CurveTo(12.933684f, 17.379507f, 12.506975f, 17.000067f, 12.0f, 17.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.CurveTo(15.447715f, 17.0f, 15.0f, 17.447716f, 15.0f, 18.0f),
                    PathNode.LineTo(15.007f, 18.127f),
                    PathNode.CurveTo(15.06949f, 18.65239f, 15.530421f, 19.03818f, 16.058605f, 19.007172f),
                    PathNode.CurveTo(16.58679f, 18.976164f, 16.999413f, 18.539095f, 17.0f, 18.01f),
                    PathNode.LineTo(16.993f, 17.883f),
                    PathNode.CurveTo(16.933683f, 17.379507f, 16.506975f, 17.000067f, 16.0f, 17.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.CurveTo(7.447716f, 13.0f, 7.0f, 13.447715f, 7.0f, 14.0f),
                    PathNode.LineTo(7.007f, 14.127f),
                    PathNode.CurveTo(7.069491f, 14.65239f, 7.530421f, 15.038179f, 8.058605f, 15.007172f),
                    PathNode.CurveTo(8.586789f, 14.976165f, 8.999413f, 14.539093f, 9.0f, 14.01f),
                    PathNode.LineTo(8.993f, 13.883f),
                    PathNode.CurveTo(8.933684f, 13.379507f, 8.506975f, 13.000067f, 8.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(11.447715f, 13.0f, 11.0f, 13.447715f, 11.0f, 14.0f),
                    PathNode.LineTo(11.007f, 14.127f),
                    PathNode.CurveTo(11.06949f, 14.65239f, 11.530421f, 15.038179f, 12.058605f, 15.007172f),
                    PathNode.CurveTo(12.586789f, 14.976165f, 12.999413f, 14.539093f, 13.0f, 14.01f),
                    PathNode.LineTo(12.993f, 13.883f),
                    PathNode.CurveTo(12.933684f, 13.379507f, 12.506975f, 13.000067f, 12.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 13.0f),
                    PathNode.CurveTo(15.447715f, 13.0f, 15.0f, 13.447715f, 15.0f, 14.0f),
                    PathNode.LineTo(15.007f, 14.127f),
                    PathNode.CurveTo(15.06949f, 14.65239f, 15.530421f, 15.038179f, 16.058605f, 15.007172f),
                    PathNode.CurveTo(16.58679f, 14.976165f, 16.999413f, 14.539093f, 17.0f, 14.01f),
                    PathNode.LineTo(16.993f, 13.883f),
                    PathNode.CurveTo(16.933683f, 13.379507f, 16.506975f, 13.000067f, 16.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(7.895431f, 6.0f, 7.0f, 6.895431f, 7.0f, 8.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 10.104569f, 7.895431f, 11.0f, 9.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(16.10457f, 11.0f, 17.0f, 10.104569f, 17.0f, 9.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 6.895431f, 16.10457f, 6.0f, 15.0f, 6.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _calculator!!
    }

private var _calculator: ImageVector? = null
