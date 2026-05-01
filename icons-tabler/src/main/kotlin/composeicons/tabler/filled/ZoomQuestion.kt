package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomQuestion: ImageVector
    get() {
        if (_zoomQuestion != null) return _zoomQuestion!!
        _zoomQuestion = tablerFilledIcon(
            name = "ZoomQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.072f),
                    PathNode.CurveTo(16.002062f, 4.227697f, 17.406334f, 6.192927f, 17.851065f, 8.46143f),
                    PathNode.CurveTo(18.295794f, 10.729933f, 17.737497f, 13.079914f, 16.32f, 14.906f),
                    PathNode.LineTo(21.707f, 20.293f),
                    PathNode.CurveTo(22.085972f, 20.68538f, 22.080553f, 21.309084f, 21.694818f, 21.694818f),
                    PathNode.CurveTo(21.309084f, 22.080553f, 20.68538f, 22.085972f, 20.293f, 21.707f),
                    PathNode.LineTo(14.905f, 16.32f),
                    PathNode.CurveTo(12.492383f, 18.192484f, 9.224178f, 18.52801f, 6.481427f, 17.184793f),
                    PathNode.CurveTo(3.738675f, 15.841578f, 1.999957f, 13.054f, 2.0f, 10.0f),
                    PathNode.LineTo(2.005f, 9.715f),
                    PathNode.CurveTo(2.105063f, 6.90953f, 3.668295f, 4.361783f, 6.124089f, 3.001729f),
                    PathNode.CurveTo(8.579884f, 1.641675f, 11.568864f, 1.668344f, 14.0f, 3.072f),
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(9.493025f, 12.000067f, 9.066316f, 12.379507f, 9.007f, 12.883f),
                    PathNode.LineTo(9.0f, 13.01f),
                    PathNode.CurveTo(9.000587f, 13.539093f, 9.413211f, 13.976165f, 9.941395f, 14.007172f),
                    PathNode.CurveTo(10.469579f, 14.038179f, 10.93051f, 13.65239f, 10.993f, 13.127f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 12.447715f, 10.552285f, 12.0f, 10.0f, 12.0f),
                    PathNode.MoveTo(8.100001f, 6.877f),
                    PathNode.CurveTo(7.758912f, 7.278516f, 7.787838f, 7.875797f, 8.166129f, 8.242473f),
                    PathNode.CurveTo(8.544421f, 8.609149f, 9.142313f, 8.61944f, 9.533f, 8.266f),
                    PathNode.LineTo(9.621f, 8.176f),
                    PathNode.CurveTo(9.771029f, 7.999664f, 10.022495f, 7.94939f, 10.22879f, 8.054488f),
                    PathNode.CurveTo(10.435084f, 8.159588f, 10.542244f, 8.392568f, 10.487792f, 8.617597f),
                    PathNode.CurveTo(10.433341f, 8.842627f, 10.231523f, 9.000841f, 10.0f, 9.0f),
                    PathNode.CurveTo(9.447715f, 8.999448f, 8.999553f, 9.446715f, 8.999f, 9.999f),
                    PathNode.CurveTo(8.998447f, 10.551285f, 9.445715f, 10.999448f, 9.998f, 11.0f),
                    PathNode.CurveTo(11.154193f, 11.000714f, 12.160043f, 10.208516f, 12.430292f, 9.084351f),
                    PathNode.CurveTo(12.700541f, 7.960186f, 12.164676f, 6.79736f, 11.134495f, 6.272472f),
                    PathNode.CurveTo(10.104314f, 5.747583f, 8.8486f, 5.99758f, 8.098f, 6.877f)
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
        return _zoomQuestion!!
    }

private var _zoomQuestion: ImageVector? = null
