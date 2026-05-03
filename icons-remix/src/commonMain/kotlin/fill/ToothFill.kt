package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ToothFill: ImageVector
    get() {
        if (_toothFill != null) return _toothFill!!
        _toothFill = remixIcon(
            name = "ToothFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.232 C 13.582 4.057 14.783 5.513 15.266 7.266 C 15.413 7.798 15.964 8.111 16.496 7.964 C 17.029 7.817 17.341 7.266 17.194 6.734 C 16.735 5.068 15.781 3.607 14.500 2.519 C 14.665 2.506 14.832 2.500 15.000 2.500 C 17.007 2.500 18.679 3.228 19.831 4.610 C 20.962 5.967 21.500 7.846 21.500 10.000 C 21.500 13.097 20.986 15.865 20.105 17.898 C 19.265 19.836 17.897 21.500 16.000 21.500 C 14.900 21.500 14.213 20.848 13.805 20.140 C 13.443 19.511 13.227 18.717 13.053 18.078 C 12.846 17.318 12.687 16.750 12.462 16.358 C 12.275 16.035 12.150 16.000 12.000 16.000 C 11.850 16.000 11.725 16.035 11.538 16.358 C 11.313 16.750 11.154 17.318 10.947 18.078 L 10.947 18.078 C 10.773 18.717 10.557 19.511 10.195 20.140 C 9.787 20.848 9.100 21.500 8.000 21.500 C 6.103 21.500 4.735 19.836 3.895 17.898 C 3.014 15.865 2.500 13.097 2.500 10.000 C 2.500 7.846 3.038 5.967 4.169 4.610 C 5.321 3.228 6.993 2.500 9.000 2.500 C 9.009 2.500 9.019 2.500 9.028 2.500 C 10.099 2.505 11.110 2.769 12.000 3.232 C 12.000 3.232 12.000 3.232 12.000 3.232 Z"),
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
        return _toothFill!!
    }

private var _toothFill: ImageVector? = null
