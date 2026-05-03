package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF4: ImageVector
    get() {
        if (_squareF4 != null) return _squareF4!!
        _squareF4 = tablerFilledIcon(
            name = "SquareF4",
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(15.493025f, 8.000067f, 15.066316f, 8.379507f, 15.007f, 8.883f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.LineTo(13.993f, 8.883f),
                    PathNode.CurveTo(13.933164f, 8.37995f, 13.506598f, 8.001114f, 13.0f, 8.001114f),
                    PathNode.CurveTo(12.493402f, 8.001114f, 12.066836f, 8.37995f, 12.007f, 8.883f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(12.005f, 11.15f),
                    PathNode.CurveTo(12.078939f, 12.133892f, 12.859354f, 12.916854f, 13.843f, 12.994f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.007f, 15.117f),
                    PathNode.CurveTo(15.066836f, 15.62005f, 15.493402f, 15.998886f, 16.0f, 15.998886f),
                    PathNode.CurveTo(16.506598f, 15.998886f, 16.933163f, 15.62005f, 16.993f, 15.117f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.LineTo(16.993f, 8.883f),
                    PathNode.CurveTo(16.933683f, 8.379507f, 16.506975f, 8.000067f, 16.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(7.883f, 8.007f),
                    PathNode.CurveTo(7.423509f, 8.061188f, 7.061188f, 8.423509f, 7.007f, 8.883f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(7.007f, 15.117f),
                    PathNode.CurveTo(7.061188f, 15.576491f, 7.423509f, 15.938812f, 7.883f, 15.993f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(8.117f, 15.993f),
                    PathNode.CurveTo(8.576491f, 15.938812f, 8.938812f, 15.576491f, 8.993f, 15.117f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(10.117f, 12.993f),
                    PathNode.CurveTo(10.62005f, 12.933164f, 10.998886f, 12.506598f, 10.998886f, 12.0f),
                    PathNode.CurveTo(10.998886f, 11.493402f, 10.62005f, 11.066836f, 10.117f, 11.007f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(10.117f, 9.993f),
                    PathNode.CurveTo(10.62005f, 9.933164f, 10.998886f, 9.506598f, 10.998886f, 9.0f),
                    PathNode.CurveTo(10.998886f, 8.493402f, 10.62005f, 8.066837f, 10.117f, 8.007f),
                    PathNode.LineTo(10.0f, 8.0f),
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
        return _squareF4!!
    }

private var _squareF4: ImageVector? = null
