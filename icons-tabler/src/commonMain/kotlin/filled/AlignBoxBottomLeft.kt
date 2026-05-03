package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxBottomLeft: ImageVector
    get() {
        if (_alignBoxBottomLeft != null) return _alignBoxBottomLeft!!
        _alignBoxBottomLeft = tablerFilledIcon(
            name = "AlignBoxBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.CurveTo(5.447716f, 15.0f, 5.0f, 15.447715f, 5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.LineTo(5.007f, 18.117f),
                    PathNode.CurveTo(5.069491f, 18.642391f, 5.530421f, 19.02818f, 6.058605f, 18.997171f),
                    PathNode.CurveTo(6.58679f, 18.966166f, 6.999413f, 18.529093f, 7.0f, 18.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.LineTo(6.993f, 15.883f),
                    PathNode.CurveTo(6.933684f, 15.379507f, 6.506975f, 15.000067f, 6.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.CurveTo(8.447715f, 11.0f, 8.0f, 11.447715f, 8.0f, 12.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.LineTo(8.007f, 18.117f),
                    PathNode.CurveTo(8.069491f, 18.642391f, 8.530421f, 19.02818f, 9.058605f, 18.997171f),
                    PathNode.CurveTo(9.586789f, 18.966166f, 9.999413f, 18.529093f, 10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(9.993f, 11.883f),
                    PathNode.CurveTo(9.933684f, 11.379507f, 9.506975f, 11.000067f, 9.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(11.447715f, 13.0f, 11.0f, 13.447715f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(11.007f, 18.117f),
                    PathNode.CurveTo(11.06949f, 18.642391f, 11.530421f, 19.02818f, 12.058605f, 18.997171f),
                    PathNode.CurveTo(12.586789f, 18.966166f, 12.999413f, 18.529093f, 13.0f, 18.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(12.993f, 13.883f),
                    PathNode.CurveTo(12.933684f, 13.379507f, 12.506975f, 13.000067f, 12.0f, 13.0f),
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
        return _alignBoxBottomLeft!!
    }

private var _alignBoxBottomLeft: ImageVector? = null
