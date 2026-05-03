package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Help: ImageVector
    get() {
        if (_help != null) return _help!!
        _help = tablerFilledIcon(
            name = "Help",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 20.120 5.114 22.050 8.423 22.057 12.011 C 22.065 15.600 20.150 18.917 17.038 20.705 C 13.926 22.492 10.096 22.475 7.000 20.660 C 2.258 17.880 0.649 11.794 3.397 7.033 C 6.146 2.273 12.221 0.623 17.000 3.340M 12.000 16.000 C 11.493 16.000 11.066 16.380 11.007 16.883 L 11.000 17.010 C 11.001 17.539 11.413 17.976 11.941 18.007 C 12.470 18.038 12.931 17.652 12.993 17.127 L 13.000 17.000 C 13.000 16.448 12.552 16.000 12.000 16.000M 13.173 6.144 C 11.718 5.676 10.126 6.178 9.203 7.396 C 8.881 7.817 8.943 8.415 9.344 8.761 C 9.745 9.107 10.346 9.080 10.715 8.700 L 10.797 8.604 C 11.208 8.063 11.915 7.841 12.561 8.048 C 13.207 8.256 13.652 8.850 13.671 9.528 C 13.689 10.207 13.277 10.823 12.643 11.066 C 11.605 11.440 10.937 12.454 11.002 13.556 C 11.034 14.083 11.470 14.494 11.998 14.495 C 12.526 14.496 12.964 14.087 12.998 13.560 L 12.998 13.443 C 12.987 13.251 13.088 13.070 13.257 12.977 L 13.332 12.943 C 14.771 12.402 15.709 11.009 15.670 9.473 C 15.628 7.946 14.627 6.611 13.173 6.144"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _help!!
    }

private var _help: ImageVector? = null
