package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyCheck: ImageVector
    get() {
        if (_copyCheck != null) return _copyCheck!!
        _copyCheck = tablerFilledIcon(
            name = "CopyCheck",
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
                    PathNode.Close,
                    PathNode.MoveTo(16.293f, 11.293f),
                    PathNode.LineTo(13.0f, 14.585f),
                    PathNode.LineTo(11.707f, 13.293f),
                    PathNode.CurveTo(11.314621f, 12.914028f, 10.690915f, 12.919448f, 10.305182f, 13.305182f),
                    PathNode.CurveTo(9.919448f, 13.690915f, 9.914028f, 14.314621f, 10.293f, 14.707f),
                    PathNode.LineTo(12.293f, 16.707f),
                    PathNode.CurveTo(12.6835f, 17.097382f, 13.3165f, 17.097382f, 13.707f, 16.707f),
                    PathNode.LineTo(17.707f, 12.707f),
                    PathNode.CurveTo(18.085972f, 12.314621f, 18.080553f, 11.690915f, 17.694818f, 11.305182f),
                    PathNode.CurveTo(17.309084f, 10.919448f, 16.685379f, 10.914028f, 16.293f, 11.293f)
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
        return _copyCheck!!
    }

private var _copyCheck: ImageVector? = null
