package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = tablerFilledIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.000 18.000 C 11.448 18.000 11.000 18.448 11.000 19.000 C 11.000 19.552 11.448 20.000 12.000 20.000 C 12.552 20.000 13.000 19.552 13.000 19.000 C 13.000 18.448 12.552 18.000 12.000 18.000M 15.684 7.051 L 9.684 9.051 C 9.385 9.151 9.151 9.385 9.051 9.684 L 7.044 15.710 L 7.021 15.796 L 7.004 15.909 L 7.000 15.977 L 7.000 16.021 L 7.009 16.132 L 7.021 16.202 L 7.061 16.346 L 7.106 16.446 L 7.160 16.541 L 7.224 16.631 L 7.293 16.706 L 7.377 16.780 L 7.475 16.850 L 7.575 16.904 L 7.653 16.937 L 7.758 16.970 L 7.867 16.990 L 7.910 16.995 L 7.978 16.999 L 8.022 16.999 L 8.133 16.990 L 8.203 16.978 L 8.223 16.972 L 8.242 16.970 L 8.316 16.948 L 14.316 14.948 C 14.615 14.848 14.849 14.614 14.949 14.315 L 16.949 8.315 C 17.069 7.956 16.975 7.559 16.707 7.292 C 16.440 7.024 16.043 6.930 15.684 7.050 ZM 14.419 9.580 L 13.209 13.209 L 9.580 14.419 L 10.790 10.790 L 14.419 9.580 ZM 5.000 11.000 C 4.448 11.000 4.000 11.448 4.000 12.000 C 4.000 12.552 4.448 13.000 5.000 13.000 C 5.552 13.000 6.000 12.552 6.000 12.000 C 6.000 11.448 5.552 11.000 5.000 11.000M 19.000 11.000 C 18.448 11.000 18.000 11.448 18.000 12.000 C 18.000 12.552 18.448 13.000 19.000 13.000 C 19.552 13.000 20.000 12.552 20.000 12.000 C 20.000 11.448 19.552 11.000 19.000 11.000M 12.000 4.000 C 11.448 4.000 11.000 4.448 11.000 5.000 C 11.000 5.552 11.448 6.000 12.000 6.000 C 12.552 6.000 13.000 5.552 13.000 5.000 C 13.000 4.448 12.552 4.000 12.000 4.000"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
