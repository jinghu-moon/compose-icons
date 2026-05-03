package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = tablerFilledIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.046625f, 1.999669f, 18.916504f, 2.806323f, 18.995f, 3.85f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 9.335f, 18.771f, 10.386f, 18.226f, 11.692f),
                    PathNode.LineTo(18.069f, 12.055f),
                    PathNode.LineTo(17.759f, 12.756f),
                    PathNode.CurveTo(17.307102f, 13.779852f, 17.052319f, 14.879734f, 17.008f, 15.998f),
                    PathNode.LineTo(17.0f, 16.375f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.000332f, 21.046625f, 16.193678f, 21.916504f, 15.15f, 21.995f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(7.953376f, 22.000332f, 7.083497f, 21.193678f, 7.005f, 20.15f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 16.375f),
                    PathNode.CurveTo(7.0f, 15.243f, 6.79f, 14.125f, 6.383f, 13.095f),
                    PathNode.LineTo(6.241f, 12.755f),
                    PathNode.LineTo(5.931f, 12.056f),
                    PathNode.CurveTo(5.327f, 10.698f, 5.048f, 9.646f, 5.006f, 8.358f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.999669f, 2.953375f, 5.806323f, 2.083497f, 6.85f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.LineTo(17.0f, 4.0f),
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
        return _beer!!
    }

private var _beer: ImageVector? = null
