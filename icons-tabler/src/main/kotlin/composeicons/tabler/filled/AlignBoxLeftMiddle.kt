package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxLeftMiddle: ImageVector
    get() {
        if (_alignBoxLeftMiddle != null) return _alignBoxLeftMiddle!!
        _alignBoxLeftMiddle = tablerFilledIcon(
            name = "AlignBoxLeftMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 14.0f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.LineTo(5.883f, 14.007f),
                    PathNode.CurveTo(5.35761f, 14.06949f, 4.971821f, 14.530421f, 5.002828f, 15.058605f),
                    PathNode.CurveTo(5.033836f, 15.586789f, 5.470907f, 15.999413f, 6.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(8.117f, 15.993f),
                    PathNode.CurveTo(8.64239f, 15.93051f, 9.028179f, 15.469579f, 8.997172f, 14.941395f),
                    PathNode.CurveTo(8.966165f, 14.413211f, 8.529094f, 14.000587f, 8.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(5.883f, 11.007f),
                    PathNode.CurveTo(5.35761f, 11.06949f, 4.971821f, 11.530421f, 5.002828f, 12.058605f),
                    PathNode.CurveTo(5.033836f, 12.586789f, 5.470907f, 12.999413f, 6.0f, 13.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(12.117f, 12.993f),
                    PathNode.CurveTo(12.64239f, 12.93051f, 13.028179f, 12.469579f, 12.997172f, 11.941395f),
                    PathNode.CurveTo(12.966165f, 11.413211f, 12.529094f, 11.000587f, 12.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.LineTo(5.883f, 8.007f),
                    PathNode.CurveTo(5.35761f, 8.069491f, 4.971821f, 8.530421f, 5.002828f, 9.058605f),
                    PathNode.CurveTo(5.033836f, 9.586789f, 5.470907f, 9.999413f, 6.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(10.117f, 9.993f),
                    PathNode.CurveTo(10.64239f, 9.93051f, 11.028179f, 9.469579f, 10.997172f, 8.941395f),
                    PathNode.CurveTo(10.966165f, 8.413211f, 10.529094f, 8.000587f, 10.0f, 8.0f),
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
        return _alignBoxLeftMiddle!!
    }

private var _alignBoxLeftMiddle: ImageVector? = null
