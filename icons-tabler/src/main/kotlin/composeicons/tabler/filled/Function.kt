package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = tablerFilledIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.333f, 3.0f),
                    PathNode.CurveTo(19.358229f, 3.0f, 21.0f, 4.641772f, 21.0f, 6.667f),
                    PathNode.LineTo(21.0f, 17.333f),
                    PathNode.CurveTo(21.0f, 19.358229f, 19.358229f, 21.0f, 17.333f, 21.0f),
                    PathNode.LineTo(6.667f, 21.0f),
                    PathNode.CurveTo(4.641772f, 21.0f, 3.0f, 19.358229f, 3.0f, 17.333f),
                    PathNode.LineTo(3.0f, 6.667f),
                    PathNode.CurveTo(3.0f, 4.641772f, 4.641772f, 3.0f, 6.667f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.75f, 6.0f),
                    PathNode.CurveTo(12.525948f, 5.999162f, 11.500862f, 6.926929f, 11.38f, 8.145001f),
                    PathNode.LineTo(11.095f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(8.883f, 11.007f),
                    PathNode.CurveTo(8.35761f, 11.06949f, 7.971821f, 11.530421f, 8.002828f, 12.058605f),
                    PathNode.CurveTo(8.033836f, 12.586789f, 8.470906f, 12.999413f, 9.0f, 13.0f),
                    PathNode.LineTo(10.894f, 13.0f),
                    PathNode.LineTo(10.629f, 15.656f),
                    PathNode.LineTo(10.615f, 15.727f),
                    PathNode.CurveTo(10.567471f, 15.888967f, 10.418797f, 16.000166f, 10.25f, 16.0f),
                    PathNode.CurveTo(10.111929f, 16.0f, 10.0f, 15.888071f, 10.0f, 15.75f),
                    PathNode.LineTo(10.0f, 15.5f),
                    PathNode.LineTo(9.993f, 15.383f),
                    PathNode.CurveTo(9.93051f, 14.85761f, 9.469579f, 14.471821f, 8.941395f, 14.502828f),
                    PathNode.CurveTo(8.413211f, 14.533835f, 8.000587f, 14.970906f, 8.0f, 15.5f),
                    PathNode.LineTo(8.0f, 15.75f),
                    PathNode.LineTo(8.005f, 15.904f),
                    PathNode.CurveTo(8.085968f, 17.084204f, 9.067022f, 18.000143f, 10.25f, 18.0f),
                    PathNode.CurveTo(11.474052f, 18.00084f, 12.499138f, 17.07307f, 12.62f, 15.855f),
                    PathNode.LineTo(12.904f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.117f, 12.993f),
                    PathNode.CurveTo(15.64239f, 12.93051f, 16.02818f, 12.469579f, 15.997172f, 11.941395f),
                    PathNode.CurveTo(15.966165f, 11.413211f, 15.529094f, 11.000587f, 15.0f, 11.0f),
                    PathNode.LineTo(13.105f, 11.0f),
                    PathNode.LineTo(13.371f, 8.344f),
                    PathNode.LineTo(13.385f, 8.273f),
                    PathNode.CurveTo(13.432817f, 8.111233f, 13.581314f, 8.000165f, 13.75f, 8.0f),
                    PathNode.CurveTo(13.888071f, 8.0f, 14.0f, 8.111929f, 14.0f, 8.25f),
                    PathNode.LineTo(14.0f, 8.5f),
                    PathNode.LineTo(14.007f, 8.617f),
                    PathNode.CurveTo(14.06949f, 9.14239f, 14.530421f, 9.528179f, 15.058605f, 9.497172f),
                    PathNode.CurveTo(15.586789f, 9.466165f, 15.999413f, 9.029094f, 16.0f, 8.5f),
                    PathNode.LineTo(16.0f, 8.25f),
                    PathNode.LineTo(15.995f, 8.096f),
                    PathNode.CurveTo(15.914032f, 6.915797f, 14.932978f, 5.999855f, 13.75f, 6.0f),
                    PathNode.Close
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
        return _function!!
    }

private var _function: ImageVector? = null
