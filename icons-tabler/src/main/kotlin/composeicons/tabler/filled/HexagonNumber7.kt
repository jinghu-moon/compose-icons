package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber7: ImageVector
    get() {
        if (_hexagonNumber7 != null) return _hexagonNumber7!!
        _hexagonNumber7 = tablerFilledIcon(
            name = "HexagonNumber7",
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
                    PathNode.LineTo(9.883f, 7.007f),
                    PathNode.CurveTo(9.423509f, 7.061188f, 9.061188f, 7.423509f, 9.007f, 7.883f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(9.007f, 8.117f),
                    PathNode.CurveTo(9.061188f, 8.576491f, 9.423509f, 8.938812f, 9.883f, 8.993f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(12.718f, 9.0f),
                    PathNode.LineTo(11.03f, 15.757f),
                    PathNode.LineTo(11.008f, 15.872f),
                    PathNode.CurveTo(10.943119f, 16.375027f, 11.265096f, 16.846962f, 11.757131f, 16.970034f),
                    PathNode.CurveTo(12.249165f, 17.093107f, 12.755414f, 16.828335f, 12.935f, 16.354f),
                    PathNode.LineTo(12.97f, 16.243f),
                    PathNode.LineTo(14.97f, 8.243f),
                    PathNode.LineTo(14.991f, 8.131f),
                    PathNode.CurveTo(15.026277f, 7.864948f, 14.95313f, 7.595882f, 14.788009f, 7.384309f),
                    PathNode.CurveTo(14.622888f, 7.172735f, 14.379652f, 7.036414f, 14.113f, 7.006f),
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
        return _hexagonNumber7!!
    }

private var _hexagonNumber7: ImageVector? = null
