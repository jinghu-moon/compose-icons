package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = tablerFilledIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 6.552285f, 14.447715f, 7.0f, 15.0f, 7.0f),
                    PathNode.CurveTo(15.552285f, 7.0f, 16.0f, 6.552285f, 16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.CurveTo(21.999933f, 10.506975f, 21.620493f, 10.933684f, 21.117f, 10.993f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(20.470907f, 11.000587f, 20.033834f, 11.413211f, 20.002829f, 11.941395f),
                    PathNode.CurveTo(19.97182f, 12.469579f, 20.357609f, 12.93051f, 20.883f, 12.993f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(21.552284f, 13.0f, 22.0f, 13.447715f, 22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(15.999933f, 17.493025f, 15.620493f, 17.066317f, 15.117f, 17.007f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(14.447715f, 17.0f, 14.0f, 17.447716f, 14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 14.0f),
                    PathNode.CurveTo(2.000067f, 13.493025f, 2.379507f, 13.066316f, 2.883f, 13.007f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(3.529094f, 12.999413f, 3.966165f, 12.586789f, 3.997172f, 12.058605f),
                    PathNode.CurveTo(4.028179f, 11.530421f, 3.642391f, 11.06949f, 3.117f, 11.007f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.CurveTo(2.447715f, 11.0f, 2.0f, 10.552285f, 2.0f, 10.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(1.998957f, 5.448989f, 3.182211f, 4.153788f, 4.727f, 4.015f),
                    PathNode.LineTo(4.949f, 4.001f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(14.447715f, 10.0f, 14.0f, 10.447715f, 14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 13.552285f, 14.447715f, 14.0f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.552285f, 14.0f, 16.0f, 13.552285f, 16.0f, 13.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f)
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
