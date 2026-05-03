package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = tablerFilledIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.046625f, 1.999669f, 18.916504f, 2.806323f, 18.995f, 3.85f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(19.0011f, 8.45706f, 17.713156f, 10.734593f, 15.607f, 12.0f),
                    PathNode.CurveTo(17.630566f, 13.215281f, 18.904613f, 15.36928f, 18.995f, 17.728f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(19.000332f, 21.046625f, 18.193678f, 21.916504f, 17.15f, 21.995f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.953376f, 22.000332f, 5.083497f, 21.193678f, 5.005f, 20.15f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(4.9989f, 15.54294f, 6.286845f, 13.265407f, 8.393f, 12.0f),
                    PathNode.CurveTo(6.369434f, 10.784719f, 5.095386f, 8.63072f, 5.005f, 6.272f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.999669f, 2.953375f, 5.806323f, 2.083497f, 6.85f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
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
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
