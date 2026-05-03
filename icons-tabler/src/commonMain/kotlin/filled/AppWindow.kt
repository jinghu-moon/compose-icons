package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = tablerFilledIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.01f, 7.0f),
                    PathNode.LineTo(5.883f, 7.007f),
                    PathNode.CurveTo(5.35761f, 7.069491f, 4.971821f, 7.530421f, 5.002828f, 8.058605f),
                    PathNode.CurveTo(5.033836f, 8.586789f, 5.470907f, 8.999413f, 6.0f, 9.0f),
                    PathNode.LineTo(6.127f, 8.993f),
                    PathNode.CurveTo(6.652391f, 8.93051f, 7.03818f, 8.469579f, 7.007172f, 7.941395f),
                    PathNode.CurveTo(6.976165f, 7.413211f, 6.539094f, 7.000587f, 6.01f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.01f, 7.0f),
                    PathNode.LineTo(8.883f, 7.007f),
                    PathNode.CurveTo(8.35761f, 7.069491f, 7.971821f, 7.530421f, 8.002828f, 8.058605f),
                    PathNode.CurveTo(8.033836f, 8.586789f, 8.470906f, 8.999413f, 9.0f, 9.0f),
                    PathNode.LineTo(9.127f, 8.993f),
                    PathNode.CurveTo(9.65239f, 8.93051f, 10.038179f, 8.469579f, 10.007172f, 7.941395f),
                    PathNode.CurveTo(9.976165f, 7.413211f, 9.539093f, 7.000587f, 9.01f, 7.0f),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
