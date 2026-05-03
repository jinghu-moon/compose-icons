package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber2: ImageVector
    get() {
        if (_hexagonNumber2 != null) return _hexagonNumber2!!
        _hexagonNumber2 = tablerFilledIcon(
            name = "HexagonNumber2",
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
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(9.883f, 7.007f),
                    PathNode.CurveTo(9.37995f, 7.066837f, 9.001114f, 7.493403f, 9.001114f, 8.0f),
                    PathNode.CurveTo(9.001114f, 8.506598f, 9.37995f, 8.933164f, 9.883f, 8.993f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.85f, 11.005f),
                    PathNode.CurveTo(9.866108f, 11.078939f, 9.083146f, 11.859354f, 9.006f, 12.843f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.005f, 15.15f),
                    PathNode.CurveTo(9.078939f, 16.133892f, 9.859354f, 16.916855f, 10.843f, 16.994f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(14.117f, 16.993f),
                    PathNode.CurveTo(14.62005f, 16.933163f, 14.998886f, 16.506598f, 14.998886f, 16.0f),
                    PathNode.CurveTo(14.998886f, 15.493402f, 14.62005f, 15.066836f, 14.117f, 15.007f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.15f, 12.995f),
                    PathNode.CurveTo(14.133892f, 12.921061f, 14.916854f, 12.140646f, 14.994f, 11.157f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(14.995f, 8.85f),
                    PathNode.CurveTo(14.921061f, 7.866108f, 14.140646f, 7.083146f, 13.157f, 7.006f),
                    PathNode.LineTo(13.0f, 7.0f),
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
        return _hexagonNumber2!!
    }

private var _hexagonNumber2: ImageVector? = null
