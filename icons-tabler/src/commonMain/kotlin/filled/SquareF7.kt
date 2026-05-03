package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF7: ImageVector
    get() {
        if (_squareF7 != null) return _squareF7!!
        _squareF7 = tablerFilledIcon(
            name = "SquareF7",
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
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.883f, 8.007f),
                    PathNode.CurveTo(12.379507f, 8.066316f, 12.000067f, 8.493025f, 12.0f, 9.0f),
                    PathNode.LineTo(12.007f, 9.117f),
                    PathNode.CurveTo(12.066316f, 9.620493f, 12.493025f, 9.999933f, 13.0f, 10.0f),
                    PathNode.LineTo(14.718f, 10.0f),
                    PathNode.LineTo(13.53f, 14.757f),
                    PathNode.LineTo(13.508f, 14.872f),
                    PathNode.CurveTo(13.440434f, 15.397262f, 13.794095f, 15.88412f, 14.314511f, 15.982262f),
                    PathNode.CurveTo(14.834928f, 16.080402f, 15.341619f, 15.755793f, 15.47f, 15.242f),
                    PathNode.LineTo(16.97f, 9.242f),
                    PathNode.LineTo(16.991f, 9.132f),
                    PathNode.CurveTo(17.029041f, 8.846334f, 16.94199f, 8.558144f, 16.752163f, 8.341307f),
                    PathNode.CurveTo(16.562334f, 8.124471f, 16.288189f, 8.000072f, 16.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(7.883f, 8.007f),
                    PathNode.CurveTo(7.379507f, 8.066316f, 7.000067f, 8.493025f, 7.0f, 9.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(7.007f, 15.117f),
                    PathNode.CurveTo(7.066316f, 15.620493f, 7.493026f, 15.999933f, 8.0f, 16.0f),
                    PathNode.LineTo(8.117f, 15.993f),
                    PathNode.CurveTo(8.620493f, 15.933684f, 8.999933f, 15.506975f, 9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(10.117f, 12.993f),
                    PathNode.CurveTo(10.64239f, 12.93051f, 11.028179f, 12.469579f, 10.997172f, 11.941395f),
                    PathNode.CurveTo(10.966165f, 11.413211f, 10.529094f, 11.000587f, 10.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(10.117f, 9.993f),
                    PathNode.CurveTo(10.64239f, 9.93051f, 11.028179f, 9.469579f, 10.997172f, 8.941395f),
                    PathNode.CurveTo(10.966165f, 8.413211f, 10.529094f, 8.000587f, 10.0f, 8.0f),
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
        return _squareF7!!
    }

private var _squareF7: ImageVector? = null
