package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = tablerFilledIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.529094f, 2.000587f, 15.966165f, 2.413211f, 15.997172f, 2.941395f),
                    PathNode.CurveTo(16.02818f, 3.469579f, 15.64239f, 3.930509f, 15.117f, 3.993f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(14.307f, 4.0f, 13.67f, 4.694f, 13.309f, 5.552f),
                    PathNode.CurveTo(13.925903f, 5.238042f, 14.600262f, 5.052951f, 15.291f, 5.008f),
                    PathNode.LineTo(15.556f, 5.0f),
                    PathNode.CurveTo(18.538f, 5.0f, 21.0f, 8.053001f, 21.0f, 11.32f),
                    PathNode.CurveTo(21.0f, 14.867f, 20.394f, 17.182f, 18.577f, 19.898f),
                    PathNode.CurveTo(16.885f, 22.149f, 14.485f, 22.651f, 12.167f, 21.132f),
                    PathNode.CurveTo(12.071166f, 21.070774f, 11.949502f, 21.066936f, 11.85f, 21.122f),
                    PathNode.CurveTo(9.515f, 22.65f, 7.115f, 22.149f, 5.39f, 19.852f),
                    PathNode.CurveTo(3.607f, 17.184f, 3.0f, 14.868f, 3.0f, 11.32f),
                    PathNode.LineTo(3.004f, 11.098f),
                    PathNode.CurveTo(3.112f, 7.917f, 5.53f, 5.0f, 8.444f, 5.0f),
                    PathNode.CurveTo(9.384f, 5.0f, 10.296f, 5.291f, 11.132f, 5.792f),
                    PathNode.CurveTo(11.551f, 3.842f, 12.95f, 2.0f, 15.0f, 2.0f),
                    PathNode.MoveTo(7.966f, 8.154001f),
                    PathNode.CurveTo(6.606f, 9.012f, 6.0f, 10.214f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 12.552285f, 6.447716f, 13.0f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.552285f, 13.0f, 8.0f, 12.552285f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 10.875f, 8.28f, 10.322f, 9.034f, 9.846f),
                    PathNode.CurveTo(9.501233f, 9.55108f, 9.64092f, 8.933233f, 9.346f, 8.466f),
                    PathNode.CurveTo(9.05108f, 7.998767f, 8.433233f, 7.85908f, 7.966f, 8.154001f)
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
        return _apple!!
    }

private var _apple: ImageVector? = null
