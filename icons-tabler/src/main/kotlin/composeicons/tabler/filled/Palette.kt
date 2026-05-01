package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = tablerFilledIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.498f, 2.0f, 22.0f, 6.002f, 22.0f, 11.0f),
                    PathNode.CurveTo(22.0f, 12.351f, 21.4f, 13.64f, 20.346f, 14.576f),
                    PathNode.CurveTo(19.316f, 15.49f, 17.934f, 16.0f, 16.5f, 16.0f),
                    PathNode.LineTo(13.984f, 16.0f),
                    PathNode.CurveTo(13.52501f, 15.992604f, 13.119933f, 16.298658f, 13.001654f, 16.742208f),
                    PathNode.CurveTo(12.883373f, 17.185757f, 13.082272f, 17.652872f, 13.484f, 17.875f),
                    PathNode.CurveTo(13.554036f, 17.913734f, 13.619168f, 17.960737f, 13.678f, 18.015f),
                    PathNode.CurveTo(14.379029f, 18.661894f, 14.608001f, 19.67437f, 14.253542f, 20.559961f),
                    PathNode.CurveTo(13.899083f, 21.445553f, 13.034769f, 22.020441f, 12.081f, 22.005f),
                    PathNode.LineTo(11.925f, 21.996f),
                    PathNode.LineTo(11.993f, 22.0f),
                    PathNode.LineTo(11.72f, 21.996f),
                    PathNode.CurveTo(6.42f, 21.85f, 2.15f, 17.58f, 2.004f, 12.28f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(8.5f, 8.5f),
                    PathNode.CurveTo(7.453376f, 8.499669f, 6.583497f, 9.306323f, 6.505f, 10.35f),
                    PathNode.LineTo(6.5f, 10.5f),
                    PathNode.CurveTo(6.5f, 11.604569f, 7.395431f, 12.5f, 8.5f, 12.5f),
                    PathNode.CurveTo(9.604569f, 12.5f, 10.5f, 11.604569f, 10.5f, 10.5f),
                    PathNode.CurveTo(10.5f, 9.395431f, 9.604569f, 8.5f, 8.5f, 8.5f),
                    PathNode.MoveTo(16.5f, 8.5f),
                    PathNode.CurveTo(15.453375f, 8.499669f, 14.583497f, 9.306323f, 14.505f, 10.35f),
                    PathNode.LineTo(14.5f, 10.5f),
                    PathNode.CurveTo(14.5f, 11.604569f, 15.395431f, 12.5f, 16.5f, 12.5f),
                    PathNode.CurveTo(17.60457f, 12.5f, 18.5f, 11.604569f, 18.5f, 10.5f),
                    PathNode.CurveTo(18.5f, 9.395431f, 17.60457f, 8.5f, 16.5f, 8.5f),
                    PathNode.MoveTo(12.5f, 5.5f),
                    PathNode.CurveTo(11.453375f, 5.499669f, 10.583497f, 6.306323f, 10.505f, 7.35f),
                    PathNode.LineTo(10.5f, 7.5f),
                    PathNode.CurveTo(10.5f, 8.604569f, 11.395431f, 9.5f, 12.5f, 9.5f),
                    PathNode.CurveTo(13.604569f, 9.5f, 14.5f, 8.604569f, 14.5f, 7.5f),
                    PathNode.CurveTo(14.5f, 6.395431f, 13.604569f, 5.5f, 12.5f, 5.5f)
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
        return _palette!!
    }

private var _palette: ImageVector? = null
