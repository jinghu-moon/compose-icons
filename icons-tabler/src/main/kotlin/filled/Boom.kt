package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Boom: ImageVector
    get() {
        if (_boom != null) return _boom!!
        _boom = tablerFilledIcon(
            name = "Boom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.514 3.836 C 7.665 2.927 8.860 2.689 9.348 3.470 C 11.642 7.140 13.623 7.518 15.106 4.553 C 15.577 3.609 17.000 3.945 17.000 5.000 C 17.000 7.448 18.552 9.000 21.000 9.000 C 21.890 9.000 22.337 10.077 21.707 10.707 C 20.097 12.317 20.097 13.682 21.707 15.288 C 22.337 15.918 21.892 16.995 21.001 16.996 C 18.553 16.999 18.000 17.552 18.000 20.000 C 18.000 20.961 16.777 21.369 16.200 20.600 C 13.875 17.500 10.706 17.744 8.832 20.555 C 8.329 21.309 7.162 21.059 7.014 20.165 C 6.649 17.977 5.974 17.509 2.836 16.986 C 2.467 16.924 2.163 16.662 2.048 16.305 C 1.934 15.948 2.028 15.558 2.293 15.293 C 3.911 13.675 3.911 12.266 2.240 10.312 L 2.231 10.299 L 2.218 10.285 L 2.174 10.223 L 2.164 10.212 L 2.158 10.199 L 2.120 10.133 L 2.103 10.105 L 2.102 10.101 L 2.075 10.035 L 2.056 9.994 C 2.030 9.919 2.013 9.840 2.005 9.761 L 2.003 9.716 L 2.000 9.648 C 2.002 9.536 2.022 9.425 2.060 9.320 L 2.069 9.297 L 2.092 9.248 L 2.103 9.219 L 2.112 9.204 L 2.119 9.188 L 2.138 9.159 L 2.158 9.124 L 2.170 9.107 L 2.183 9.085 L 2.210 9.051 L 2.221 9.035 L 2.239 9.015 L 2.259 8.990 L 2.280 8.970 L 2.295 8.953 L 2.330 8.921 L 2.350 8.902 L 2.359 8.895 L 2.377 8.880 L 2.432 8.841 L 2.450 8.826 L 2.458 8.822 L 2.468 8.815 L 2.529 8.781 L 2.557 8.765 L 2.561 8.763 L 2.624 8.737 L 2.668 8.718 C 2.706 8.705 2.744 8.694 2.783 8.686 L 2.787 8.684 L 3.054 8.621 C 5.444 8.008 6.988 6.431 7.465 4.098 Z"),
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
        return _boom!!
    }

private var _boom: ImageVector? = null
