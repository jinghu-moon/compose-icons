package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxTopRight: ImageVector
    get() {
        if (_alignBoxTopRight != null) return _alignBoxTopRight!!
        _alignBoxTopRight = tablerFilledIcon(
            name = "AlignBoxTopRight",
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
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.CurveTo(14.447715f, 5.0f, 14.0f, 5.447716f, 14.0f, 6.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.LineTo(14.007f, 12.117f),
                    PathNode.CurveTo(14.06949f, 12.64239f, 14.530421f, 13.028179f, 15.058605f, 12.997172f),
                    PathNode.CurveTo(15.586789f, 12.966165f, 15.999413f, 12.529094f, 16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(15.993f, 5.883f),
                    PathNode.CurveTo(15.933684f, 5.379507f, 15.506975f, 5.000067f, 15.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.CurveTo(17.447716f, 5.0f, 17.0f, 5.447716f, 17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.LineTo(17.007f, 10.117f),
                    PathNode.CurveTo(17.06949f, 10.64239f, 17.53042f, 11.028179f, 18.058605f, 10.997172f),
                    PathNode.CurveTo(18.58679f, 10.966165f, 18.999413f, 10.529094f, 19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.LineTo(18.993f, 5.883f),
                    PathNode.CurveTo(18.933683f, 5.379507f, 18.506975f, 5.000067f, 18.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.CurveTo(11.447715f, 5.0f, 11.0f, 5.447716f, 11.0f, 6.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(11.007f, 8.117f),
                    PathNode.CurveTo(11.06949f, 8.64239f, 11.530421f, 9.028179f, 12.058605f, 8.997172f),
                    PathNode.CurveTo(12.586789f, 8.966165f, 12.999413f, 8.529094f, 13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(12.993f, 5.883f),
                    PathNode.CurveTo(12.933684f, 5.379507f, 12.506975f, 5.000067f, 12.0f, 5.0f),
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
        return _alignBoxTopRight!!
    }

private var _alignBoxTopRight: ImageVector? = null
