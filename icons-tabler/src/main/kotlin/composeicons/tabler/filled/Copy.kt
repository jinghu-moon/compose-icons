package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = tablerFilledIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.926f, 7.074f),
                    PathNode.CurveTo(21.613413f, 7.761899f, 21.999693f, 8.694509f, 22.0f, 9.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.358229f, 20.358229f, 22.0f, 18.333f, 22.0f),
                    PathNode.LineTo(9.667f, 22.0f),
                    PathNode.CurveTo(7.641772f, 22.0f, 6.0f, 20.358229f, 6.0f, 18.333f),
                    PathNode.LineTo(6.0f, 9.667f),
                    PathNode.QuadTo(6.0f, 9.614f, 6.005f, 9.565f),
                    PathNode.CurveTo(6.056539f, 7.580055f, 7.681387f, 5.998246f, 9.667f, 6.0f),
                    PathNode.LineTo(18.333f, 6.0f),
                    PathNode.CurveTo(19.306f, 6.0f, 20.238f, 6.386f, 20.926f, 7.074f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.374f, 3.514f),
                    PathNode.CurveTo(17.64241f, 3.996697f, 17.468697f, 4.60559f, 16.986f, 4.874f),
                    PathNode.CurveTo(16.503304f, 5.142411f, 15.89441f, 4.968697f, 15.626f, 4.486f),
                    PathNode.CurveTo(15.405f, 4.088f, 15.284f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.452f, 4.0f, 4.0f, 4.452f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 14.998f),
                    PathNode.CurveTo(4.0f, 15.358f, 4.194f, 15.69f, 4.507f, 15.868f),
                    PathNode.CurveTo(4.986936f, 16.14138f, 5.154381f, 16.752064f, 4.881f, 17.232f),
                    PathNode.CurveTo(4.60762f, 17.711937f, 3.996935f, 17.879381f, 3.517f, 17.606f),
                    PathNode.CurveTo(2.579794f, 17.073034f, 2.000653f, 16.07815f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.348f, 3.348f, 2.0f, 5.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.CurveTo(16.094f, 2.0f, 16.828f, 2.533f, 17.374f, 3.514f)
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
        return _copy!!
    }

private var _copy: ImageVector? = null
