package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = tablerFilledIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 2.0f),
                    PathNode.CurveTo(6.506975f, 2.000067f, 6.933684f, 2.379507f, 6.993f, 2.883f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 4.068f),
                    PathNode.LineTo(20.071f, 5.003f),
                    PathNode.CurveTo(20.604765f, 5.040804f, 21.01418f, 5.492089f, 21.0f, 6.027f),
                    PathNode.LineTo(20.99f, 6.141f),
                    PathNode.LineTo(19.99f, 13.141f),
                    PathNode.CurveTo(19.925982f, 13.591848f, 19.56545f, 13.942512f, 19.113f, 13.994f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.CurveTo(18.633957f, 16.000092f, 19.967352f, 17.307772f, 19.99926f, 18.941414f),
                    PathNode.CurveTo(20.03117f, 20.575058f, 18.749853f, 21.93381f, 17.117147f, 21.997705f),
                    PathNode.CurveTo(15.484443f, 22.061602f, 14.100859f, 20.80714f, 14.005f, 19.176f),
                    PathNode.LineTo(14.0f, 19.0f),
                    PathNode.LineTo(14.005f, 18.824f),
                    PathNode.CurveTo(14.022f, 18.536f, 14.079f, 18.26f, 14.171f, 18.0f),
                    PathNode.LineTo(8.829f, 18.0f),
                    PathNode.CurveTo(9.218771f, 19.105568f, 8.928881f, 20.336887f, 8.08682f, 21.152445f),
                    PathNode.CurveTo(7.244758f, 21.968002f, 6.004801f, 22.218378f, 4.912258f, 21.793463f),
                    PathNode.CurveTo(3.819716f, 21.368546f, 3.074757f, 20.346186f, 3.005f, 19.176f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.LineTo(3.005f, 18.824f),
                    PathNode.CurveTo(3.075748f, 17.61863f, 3.861777f, 16.572954f, 5.0f, 16.17f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(3.493025f, 3.999933f, 3.066316f, 3.620493f, 3.007f, 3.117f),
                    PathNode.LineTo(3.0f, 3.0f),
                    PathNode.CurveTo(3.000067f, 2.493025f, 3.379507f, 2.066316f, 3.883f, 2.007f),
                    PathNode.LineTo(4.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 18.0f),
                    PathNode.CurveTo(5.447716f, 18.0f, 5.0f, 18.447716f, 5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 19.552284f, 5.447716f, 20.0f, 6.0f, 20.0f),
                    PathNode.CurveTo(6.552285f, 20.0f, 7.0f, 19.552284f, 7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 18.447716f, 6.552285f, 18.0f, 6.0f, 18.0f),
                    PathNode.MoveTo(17.0f, 18.0f),
                    PathNode.CurveTo(16.447716f, 18.0f, 16.0f, 18.447716f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 19.552284f, 16.447716f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(17.552284f, 20.0f, 18.0f, 19.552284f, 18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 18.447716f, 17.552284f, 18.0f, 17.0f, 18.0f)
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
