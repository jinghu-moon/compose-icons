package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) return _aspectRatio!!
        _aspectRatio = tablerFilledIcon(
            name = "AspectRatio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(3.343146f, 4.0f, 2.0f, 5.343146f, 2.0f, 7.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 18.656855f, 3.343146f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(20.656855f, 20.0f, 22.0f, 18.656855f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.343146f, 20.656855f, 4.0f, 19.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 7.0f),
                    PathNode.CurveTo(9.529094f, 7.000587f, 9.966165f, 7.413211f, 9.997172f, 7.941395f),
                    PathNode.CurveTo(10.028179f, 8.469579f, 9.64239f, 8.93051f, 9.117f, 8.993f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(6.999933f, 11.506975f, 6.620493f, 11.933684f, 6.117f, 11.993f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(5.493026f, 11.999933f, 5.066316f, 11.620493f, 5.007f, 11.117f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(5.000067f, 7.493026f, 5.379507f, 7.066316f, 5.883f, 7.007f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.506975f, 12.000067f, 18.933683f, 12.379507f, 18.993f, 12.883f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(18.999933f, 16.506975f, 18.620493f, 16.933683f, 18.117f, 16.993f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(14.470906f, 16.999413f, 14.033835f, 16.58679f, 14.002828f, 16.058605f),
                    PathNode.CurveTo(13.971821f, 15.530421f, 14.35761f, 15.06949f, 14.883f, 15.007f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.000067f, 12.493025f, 17.379507f, 12.066316f, 17.883f, 12.007f),
                    PathNode.LineTo(18.0f, 12.0f),
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
        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
