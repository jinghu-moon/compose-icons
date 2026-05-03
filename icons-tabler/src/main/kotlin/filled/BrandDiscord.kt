package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandDiscord: ImageVector
    get() {
        if (_brandDiscord != null) return _brandDiscord!!
        _brandDiscord = tablerFilledIcon(
            name = "BrandDiscord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.983 3.000 L 15.106 3.006 C 17.120 3.220 18.633 3.678 20.072 4.679 C 20.244 4.799 20.373 4.970 20.443 5.167 C 22.319 10.482 22.816 15.154 21.894 17.447 C 20.891 19.452 19.288 21.000 17.500 21.000 C 16.768 21.000 15.807 20.032 15.172 18.955 C 15.881 18.826 16.583 18.661 17.275 18.462 C 17.806 18.310 18.114 17.756 17.962 17.225 C 17.810 16.694 17.256 16.386 16.725 16.538 C 13.405 17.488 10.595 17.488 7.275 16.538 C 6.744 16.386 6.190 16.694 6.038 17.225 C 5.886 17.756 6.194 18.310 6.725 18.462 C 7.442 18.666 8.141 18.832 8.828 18.956 C 8.193 20.031 7.232 21.000 6.500 21.000 C 4.712 21.000 3.109 19.452 2.072 17.371 C 1.184 15.154 1.682 10.481 3.557 5.167 C 3.627 4.970 3.756 4.799 3.928 4.679 C 5.367 3.678 6.880 3.220 8.894 3.006 C 9.262 2.967 9.622 3.134 9.829 3.441 L 9.892 3.548 L 10.543 4.833 L 10.680 4.817 C 11.559 4.727 12.444 4.727 13.323 4.817 L 13.457 4.833 L 14.107 3.549 C 14.255 3.256 14.536 3.055 14.861 3.009 L 14.983 3.000 ZM 9.000 10.000 C 8.012 10.000 7.173 10.721 7.023 11.697 L 7.005 11.851 L 7.000 12.000 L 7.005 12.150 C 7.086 13.232 8.016 14.052 9.099 13.998 C 10.183 13.943 11.026 13.035 10.999 11.950 C 10.972 10.866 10.085 10.000 9.000 10.000 ZM 15.000 10.000 C 14.012 10.000 13.173 10.721 13.023 11.697 L 13.005 11.851 L 13.000 12.000 L 13.005 12.150 C 13.086 13.232 14.016 14.052 15.099 13.998 C 16.183 13.943 17.026 13.035 16.999 11.950 C 16.972 10.866 16.085 10.000 15.000 10.000 Z"),
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
        return _brandDiscord!!
    }

private var _brandDiscord: ImageVector? = null
