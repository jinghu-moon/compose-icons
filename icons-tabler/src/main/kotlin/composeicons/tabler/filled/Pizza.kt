package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = tablerFilledIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.89f, 2.542f),
                    PathNode.LineTo(21.39f, 19.059f),
                    PathNode.CurveTo(21.512632f, 19.297308f, 21.534473f, 19.57487f, 21.450624f, 19.829424f),
                    PathNode.CurveTo(21.366774f, 20.08398f, 21.184254f, 20.294224f, 20.944f, 20.413f),
                    PathNode.CurveTo(18.163382f, 21.789751f, 15.101783f, 22.504066f, 11.999f, 22.5f),
                    PathNode.LineTo(11.477f, 22.493f),
                    PathNode.CurveTo(8.551392f, 22.421114f, 5.676768f, 21.711246f, 3.054f, 20.413f),
                    PathNode.CurveTo(2.814271f, 20.293688f, 2.63241f, 20.083212f, 2.549142f, 19.828709f),
                    PathNode.CurveTo(2.465874f, 19.574205f, 2.488156f, 19.296938f, 2.611f, 19.059f),
                    PathNode.LineTo(11.111f, 2.542f),
                    PathNode.CurveTo(11.282466f, 2.209109f, 11.625545f, 1.999907f, 12.0f, 1.999907f),
                    PathNode.CurveTo(12.374455f, 1.999907f, 12.717534f, 2.209109f, 12.889f, 2.542f),
                    PathNode.MoveTo(5.825f, 17.182f),
                    PathNode.LineTo(4.865f, 19.047f),
                    PathNode.LineTo(5.274f, 19.217f),
                    PathNode.CurveTo(7.258434f, 20.004198f, 9.365891f, 20.436115f, 11.5f, 20.493f),
                    PathNode.LineTo(12.0f, 20.5f),
                    PathNode.CurveTo(14.296899f, 20.503153f, 16.573408f, 20.069096f, 18.708f, 19.221f),
                    PathNode.LineTo(19.132f, 19.045f),
                    PathNode.LineTo(18.242f, 17.317f),
                    PathNode.CurveTo(16.323065f, 18.101728f, 14.269185f, 18.503605f, 12.196f, 18.5f),
                    PathNode.CurveTo(10.004527f, 18.504347f, 7.835815f, 18.055624f, 5.826f, 17.182f),
                    PathNode.MoveTo(11.0f, 12.99f),
                    PathNode.CurveTo(10.447715f, 12.99f, 10.0f, 13.437716f, 10.0f, 13.99f),
                    PathNode.LineTo(10.007f, 14.117f),
                    PathNode.CurveTo(10.06949f, 14.64239f, 10.530421f, 15.028179f, 11.058605f, 14.997172f),
                    PathNode.CurveTo(11.586789f, 14.966165f, 11.999413f, 14.529094f, 12.0f, 14.0f),
                    PathNode.LineTo(11.993f, 13.873f),
                    PathNode.CurveTo(11.933684f, 13.369507f, 11.506975f, 12.990067f, 11.0f, 12.99f),
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.CurveTo(12.447715f, 10.0f, 12.0f, 10.447715f, 12.0f, 11.0f),
                    PathNode.LineTo(12.007f, 11.127f),
                    PathNode.CurveTo(12.06949f, 11.65239f, 12.530421f, 12.038179f, 13.058605f, 12.007172f),
                    PathNode.CurveTo(13.586789f, 11.976165f, 13.999413f, 11.539093f, 14.0f, 11.01f),
                    PathNode.LineTo(13.993f, 10.883f),
                    PathNode.CurveTo(13.933684f, 10.379507f, 13.506975f, 10.000067f, 13.0f, 10.0f)
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
