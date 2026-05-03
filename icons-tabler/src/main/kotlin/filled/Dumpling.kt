package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dumpling: ImageVector
    get() {
        if (_dumpling != null) return _dumpling!!
        _dumpling = tablerFilledIcon(
            name = "Dumpling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.003 2.040 C 10.918 1.897 11.853 2.120 12.605 2.660 L 12.695 2.730 L 12.844 2.620 C 13.735 2.008 14.856 1.838 15.888 2.158 L 16.095 2.230 C 16.989 2.569 17.707 3.255 18.085 4.133 L 18.099 4.164 L 18.144 4.160 C 19.102 4.084 20.049 4.401 20.768 5.039 L 20.921 5.183 L 21.279 5.541 C 23.255 7.518 20.959 12.289 16.624 16.624 C 12.288 20.959 7.518 23.256 5.541 21.279 L 5.159 20.897 L 5.024 20.752 C 4.407 20.049 4.094 19.130 4.154 18.196 L 4.164 18.096 L 4.002 18.024 C 3.122 17.601 2.456 16.832 2.164 15.900 L 2.109 15.708 C 1.851 14.694 2.056 13.619 2.669 12.771 L 2.731 12.692 L 2.661 12.600 C 2.162 11.904 1.933 11.051 2.017 10.199 L 2.042 9.999 C 2.205 8.950 2.832 8.030 3.749 7.494 L 3.795 7.468 L 3.790 7.328 C 3.788 6.464 4.103 5.630 4.675 4.983 L 4.825 4.823 L 4.984 4.674 C 5.631 4.102 6.466 3.788 7.330 3.790 L 7.470 3.794 L 7.496 3.748 C 7.997 2.892 8.834 2.286 9.804 2.078 Z"),
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
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
