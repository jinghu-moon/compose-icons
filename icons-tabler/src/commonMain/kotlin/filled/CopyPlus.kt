package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyPlus: ImageVector
    get() {
        if (_copyPlus != null) return _copyPlus!!
        _copyPlus = tablerFilledIcon(
            name = "CopyPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 6.0f),
                    PathNode.CurveTo(20.358229f, 6.0f, 22.0f, 7.641772f, 22.0f, 9.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.358229f, 20.358229f, 22.0f, 18.333f, 22.0f),
                    PathNode.LineTo(9.667f, 22.0f),
                    PathNode.CurveTo(7.641772f, 22.0f, 6.0f, 20.358229f, 6.0f, 18.333f),
                    PathNode.LineTo(6.0f, 9.667f),
                    PathNode.CurveTo(6.0f, 7.641772f, 7.641772f, 6.0f, 9.667f, 6.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.CurveTo(13.447715f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(10.493025f, 13.000067f, 10.066316f, 13.379507f, 10.007f, 13.883f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 14.552285f, 10.447715f, 15.0f, 11.0f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.000067f, 17.506975f, 13.379507f, 17.933683f, 13.883f, 17.993f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.CurveTo(14.552285f, 18.0f, 15.0f, 17.552284f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.506975f, 14.999933f, 17.933683f, 14.620493f, 17.993f, 14.117f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.CurveTo(18.0f, 13.447715f, 17.552284f, 13.0f, 17.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(14.999933f, 10.493025f, 14.620493f, 10.066316f, 14.117f, 10.007f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(16.094f, 2.0f, 16.828f, 2.533f, 17.374f, 3.514f),
                    PathNode.CurveTo(17.64241f, 3.996697f, 17.468697f, 4.60559f, 16.986f, 4.874f),
                    PathNode.CurveTo(16.503304f, 5.142411f, 15.89441f, 4.968697f, 15.626f, 4.486f),
                    PathNode.CurveTo(15.405f, 4.088f, 15.284f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.452f, 4.0f, 4.0f, 4.452f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 14.998f),
                    PathNode.CurveTo(4.0f, 15.318f, 4.154f, 15.616f, 4.407f, 15.803f),
                    PathNode.LineTo(4.507f, 15.868f),
                    PathNode.CurveTo(4.986936f, 16.14138f, 5.154381f, 16.752064f, 4.881f, 17.232f),
                    PathNode.CurveTo(4.60762f, 17.711937f, 3.996935f, 17.879381f, 3.517f, 17.606f),
                    PathNode.CurveTo(2.579794f, 17.073034f, 2.000653f, 16.07815f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.348f, 3.348f, 2.0f, 5.0f, 2.0f),
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
        return _copyPlus!!
    }

private var _copyPlus: ImageVector? = null
