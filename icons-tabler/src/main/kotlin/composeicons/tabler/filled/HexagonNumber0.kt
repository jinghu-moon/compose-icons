package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber0: ImageVector
    get() {
        if (_hexagonNumber0 != null) return _hexagonNumber0!!
        _hexagonNumber0 = tablerFilledIcon(
            name = "HexagonNumber0",
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.411443f, 6.999912f, 9.098195f, 8.238179f, 9.005f, 9.824f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(9.005f, 14.176f),
                    PathNode.CurveTo(9.096738f, 15.762952f, 10.410398f, 17.002867f, 12.0f, 17.002867f),
                    PathNode.CurveTo(13.589602f, 17.002867f, 14.903262f, 15.762952f, 14.995f, 14.176f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.LineTo(14.995f, 9.824f),
                    PathNode.CurveTo(14.901805f, 8.238179f, 13.588557f, 6.999912f, 12.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.506975f, 9.000067f, 12.933684f, 9.379507f, 12.993f, 9.883f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(12.993f, 14.117f),
                    PathNode.CurveTo(12.933164f, 14.62005f, 12.506598f, 14.998886f, 12.0f, 14.998886f),
                    PathNode.CurveTo(11.493402f, 14.998886f, 11.066836f, 14.62005f, 11.007f, 14.117f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(11.007f, 9.883f),
                    PathNode.CurveTo(11.066316f, 9.379507f, 11.493025f, 9.000067f, 12.0f, 9.0f),
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
        return _hexagonNumber0!!
    }

private var _hexagonNumber0: ImageVector? = null
