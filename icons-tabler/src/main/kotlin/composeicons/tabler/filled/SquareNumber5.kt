package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber5: ImageVector
    get() {
        if (_squareNumber5 != null) return _squareNumber5!!
        _squareNumber5 = tablerFilledIcon(
            name = "SquareNumber5",
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.493025f, 7.000067f, 9.066316f, 7.379507f, 9.007f, 7.883f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.000067f, 12.506975f, 9.379507f, 12.933684f, 9.883f, 12.993f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(10.993f, 14.883f),
                    PathNode.CurveTo(10.93051f, 14.35761f, 10.469579f, 13.971821f, 9.941395f, 14.002828f),
                    PathNode.CurveTo(9.413211f, 14.033835f, 9.000587f, 14.470906f, 9.0f, 15.0f),
                    PathNode.CurveTo(8.999669f, 16.046625f, 9.806323f, 16.916504f, 10.85f, 16.995f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(14.046625f, 17.000332f, 14.916503f, 16.193678f, 14.995f, 15.15f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.000331f, 11.953375f, 14.193677f, 11.083497f, 13.15f, 11.005f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.506975f, 8.999933f, 14.933684f, 8.620493f, 14.993f, 8.117f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.CurveTo(14.999933f, 7.493026f, 14.620493f, 7.066316f, 14.117f, 7.007f),
                    PathNode.LineTo(14.0f, 7.0f),
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
        return _squareNumber5!!
    }

private var _squareNumber5: ImageVector? = null
