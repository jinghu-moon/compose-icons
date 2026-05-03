package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bath: ImageVector
    get() {
        if (_bath != null) return _bath!!
        _bath = tablerFilledIcon(
            name = "Bath",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 2.0f),
                    PathNode.CurveTo(11.506975f, 2.000067f, 11.933684f, 2.379507f, 11.993f, 2.883f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 5.25f),
                    PathNode.CurveTo(11.999413f, 5.779094f, 11.586789f, 6.216165f, 11.058605f, 6.247172f),
                    PathNode.CurveTo(10.530421f, 6.278179f, 10.06949f, 5.892391f, 10.007f, 5.367f),
                    PathNode.LineTo(10.0f, 5.25f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(7.493026f, 4.000067f, 7.066316f, 4.379507f, 7.007f, 4.883f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(21.046625f, 10.999669f, 21.916504f, 11.806323f, 21.995f, 12.85f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.475f, 21.362f, 18.8f, 20.346f, 19.715f),
                    PathNode.LineTo(20.832f, 20.445f),
                    PathNode.CurveTo(21.12825f, 20.88573f, 21.028343f, 21.481155f, 20.604467f, 21.801058f),
                    PathNode.CurveTo(20.180592f, 22.120958f, 19.580597f, 22.053753f, 19.238f, 21.648f),
                    PathNode.LineTo(19.168f, 21.555f),
                    PathNode.LineTo(18.618f, 20.732f),
                    PathNode.CurveTo(18.186344f, 20.879492f, 17.736471f, 20.966976f, 17.281f, 20.992f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(6.449248f, 21.000551f, 5.902197f, 20.909996f, 5.381f, 20.732f),
                    PathNode.LineTo(4.832f, 21.555f),
                    PathNode.CurveTo(4.538365f, 21.996197f, 3.951515f, 22.131687f, 3.494184f, 21.86387f),
                    PathNode.CurveTo(3.036854f, 21.596056f, 2.867888f, 21.017956f, 3.109f, 20.546f),
                    PathNode.LineTo(3.168f, 20.446f),
                    PathNode.LineTo(3.654f, 19.716f),
                    PathNode.CurveTo(2.666835f, 18.828756f, 2.074085f, 17.584593f, 2.007f, 16.259f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 13.0f),
                    PathNode.CurveTo(1.999669f, 11.953375f, 2.806323f, 11.083497f, 3.85f, 11.005f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(4.999912f, 3.411442f, 6.238179f, 2.098195f, 7.824f, 2.005f),
                    PathNode.LineTo(8.0f, 2.0f),
                    PathNode.LineTo(11.0f, 2.0f),
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
        return _bath!!
    }

private var _bath: ImageVector? = null
