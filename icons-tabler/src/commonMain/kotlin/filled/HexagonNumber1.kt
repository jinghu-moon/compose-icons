package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber1: ImageVector
    get() {
        if (_hexagonNumber1 != null) return _hexagonNumber1!!
        _hexagonNumber1 = tablerFilledIcon(
            name = "HexagonNumber1",
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
                    PathNode.MoveTo(11.377f, 7.217f),
                    PathNode.LineTo(11.293f, 7.293f),
                    PathNode.LineTo(9.293f, 9.293f),
                    PathNode.LineTo(9.21f, 9.387f),
                    PathNode.CurveTo(8.930111f, 9.747744f, 8.930111f, 10.252256f, 9.21f, 10.613f),
                    PathNode.LineTo(9.293f, 10.707f),
                    PathNode.LineTo(9.387f, 10.79f),
                    PathNode.CurveTo(9.747744f, 11.069889f, 10.252256f, 11.069889f, 10.613f, 10.79f),
                    PathNode.LineTo(10.707f, 10.707f),
                    PathNode.LineTo(11.0f, 10.414f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.066836f, 16.62005f, 11.493402f, 16.998886f, 12.0f, 16.998886f),
                    PathNode.CurveTo(12.506598f, 16.998886f, 12.933164f, 16.62005f, 12.993f, 16.117f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.994f, 7.886f),
                    PathNode.CurveTo(12.911f, 7.109f, 11.986f, 6.726f, 11.377f, 7.216f),
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
        return _hexagonNumber1!!
    }

private var _hexagonNumber1: ImageVector? = null
