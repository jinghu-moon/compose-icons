package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pinned: ImageVector
    get() {
        if (_pinned != null) return _pinned!!
        _pinned = tablerFilledIcon(
            name = "Pinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.CurveTo(16.529093f, 3.000587f, 16.966166f, 3.413211f, 16.997171f, 3.941395f),
                    PathNode.CurveTo(17.02818f, 4.469579f, 16.642391f, 4.930509f, 16.117f, 4.993f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.LineTo(16.0f, 9.764f),
                    PathNode.LineTo(17.894f, 13.553f),
                    PathNode.CurveTo(17.9463f, 13.65669f, 17.980139f, 13.768697f, 17.994f, 13.884f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(17.999933f, 16.506975f, 17.620493f, 16.933683f, 17.117f, 16.993f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(12.999413f, 21.529093f, 12.586789f, 21.966166f, 12.058605f, 21.997171f),
                    PathNode.CurveTo(11.530421f, 22.02818f, 11.06949f, 21.642391f, 11.007f, 21.117f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(6.493026f, 16.999933f, 6.066316f, 16.620493f, 6.007f, 16.117f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.CurveTo(6.000137f, 13.884046f, 6.020439f, 13.768997f, 6.06f, 13.66f),
                    PathNode.LineTo(6.106f, 13.553f),
                    PathNode.LineTo(8.0f, 9.762f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.CurveTo(7.470907f, 4.999413f, 7.033836f, 4.58679f, 7.002828f, 4.058605f),
                    PathNode.CurveTo(6.971821f, 3.530421f, 7.35761f, 3.069491f, 7.883f, 3.007f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
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
        return _pinned!!
    }

private var _pinned: ImageVector? = null
