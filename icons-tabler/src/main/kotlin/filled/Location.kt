package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Location: ImageVector
    get() {
        if (_location != null) return _location!!
        _location = tablerFilledIcon(
            name = "Location",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.891 2.006 L 20.997 2.000 L 21.127 2.008 L 21.217 2.024 L 21.340 2.059 L 21.447 2.105 L 21.547 2.162 L 21.637 2.229 L 21.719 2.304 L 21.771 2.363 L 21.853 2.479 L 21.905 2.575 C 21.952 2.675 21.982 2.781 21.995 2.891 L 22.000 2.997 C 22.000 3.072 21.992 3.146 21.976 3.217 L 21.941 3.340 L 15.409 21.417 C 15.156 21.967 14.606 22.320 14.000 22.320 C 13.457 22.322 12.952 22.038 12.671 21.573 L 12.606 21.446 L 9.254 14.744 L 2.584 11.408 C 2.082 11.178 1.740 10.699 1.686 10.149 L 1.680 10.000 C 1.680 9.440 1.981 8.928 2.521 8.630 L 2.661 8.560 L 20.678 2.054 L 20.784 2.024 L 20.892 2.006 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _location!!
    }

private var _location: ImageVector? = null
