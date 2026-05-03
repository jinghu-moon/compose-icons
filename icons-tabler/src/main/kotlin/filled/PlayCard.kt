package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard: ImageVector
    get() {
        if (_playCard != null) return _playCard!!
        _playCard = tablerFilledIcon(
            name = "PlayCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.617 1.999 19.943 3.282 19.995 4.898 Q 20.000 4.948 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 16.010 17.000 L 16.000 17.000 C 15.448 17.000 15.000 17.448 15.000 18.000 C 15.000 18.552 15.448 19.000 16.000 19.000 L 16.010 19.000 C 16.562 19.000 17.010 18.552 17.010 18.000 C 17.010 17.448 16.562 17.000 16.010 17.000M 12.800 7.400 C 12.611 7.148 12.315 7.000 12.000 7.000 C 11.685 7.000 11.389 7.148 11.200 7.400 L 8.200 11.400 C 7.933 11.756 7.933 12.244 8.200 12.600 L 11.188 16.584 L 11.200 16.600 Q 11.207 16.610 11.217 16.620 C 11.239 16.652 11.265 16.680 11.294 16.706 L 11.310 16.724 L 11.328 16.740 Q 11.353 16.764 11.380 16.783 L 11.405 16.803 C 11.431 16.824 11.459 16.843 11.489 16.859 L 11.545 16.889 Q 11.561 16.899 11.578 16.907 L 11.621 16.924 C 11.645 16.936 11.669 16.945 11.695 16.952 C 11.793 16.985 11.896 17.001 12.000 16.999 L 12.047 16.999 C 12.079 16.997 12.111 16.994 12.142 16.989 C 12.197 16.981 12.252 16.969 12.305 16.952 L 12.330 16.944 L 12.379 16.924 C 12.406 16.916 12.431 16.905 12.455 16.890 C 12.483 16.877 12.510 16.862 12.535 16.844 C 12.564 16.825 12.593 16.805 12.620 16.784 C 12.652 16.761 12.680 16.735 12.706 16.706 L 12.724 16.690 L 12.740 16.672 L 12.783 16.620 L 12.800 16.600 L 12.809 16.588 L 15.800 12.600 C 16.067 12.244 16.067 11.756 15.800 11.400 ZM 8.010 5.000 L 8.000 5.000 C 7.448 5.000 7.000 5.448 7.000 6.000 C 7.000 6.552 7.448 7.000 8.000 7.000 L 8.010 7.000 C 8.562 7.000 9.010 6.552 9.010 6.000 C 9.010 5.448 8.562 5.000 8.010 5.000"),
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
        return _playCard!!
    }

private var _playCard: ImageVector? = null
