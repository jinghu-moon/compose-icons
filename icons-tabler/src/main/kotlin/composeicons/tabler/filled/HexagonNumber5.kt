package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber5: ImageVector
    get() {
        if (_hexagonNumber5 != null) return _hexagonNumber5!!
        _hexagonNumber5 = tablerFilledIcon(
            name = "HexagonNumber5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.425f, 1.414f),
                    PathNode.CurveTo(11.425951f, 0.862041f, 12.640049f, 0.862041f, 13.641f, 1.414f),
                    PathNode.LineTo(20.416f, 5.409f),
                    PathNode.CurveTo(20.483f, 5.449f, 20.543f, 5.493f, 20.596f, 5.542f),
                    PathNode.LineTo(20.604f, 5.549f),
                    PathNode.LineTo(20.711f, 5.625f),
                    PathNode.CurveTo(21.469797f, 6.193948f, 21.93949f, 7.068221f, 21.995f, 8.015001f),
                    PathNode.LineTo(22.0f, 8.218001f),
                    PathNode.LineTo(22.0f, 15.502f),
                    PathNode.CurveTo(22.0f, 16.677f, 21.357f, 17.758f, 20.377f, 18.295f),
                    PathNode.LineTo(13.573f, 22.597f),
                    PathNode.CurveTo(12.593f, 23.135f, 11.407f, 23.135f, 10.373f, 22.565f),
                    PathNode.LineTo(3.678f, 18.328f),
                    PathNode.CurveTo(2.644772f, 17.762896f, 2.001581f, 16.679667f, 2.0f, 15.502f),
                    PathNode.LineTo(2.0f, 8.217f),
                    PathNode.CurveTo(1.999071f, 7.050762f, 2.630744f, 5.97577f, 3.65f, 5.409f),
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
        return _hexagonNumber5!!
    }

private var _hexagonNumber5: ImageVector? = null
