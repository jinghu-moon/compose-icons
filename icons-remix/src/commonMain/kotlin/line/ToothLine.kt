package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ToothLine: ImageVector
    get() {
        if (_toothLine != null) return _toothLine!!
        _toothLine = remixIcon(
            name = "ToothLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.706 5.890 C 6.429 5.022 7.507 4.500 9.000 4.500 C 9.907 4.500 10.749 4.767 11.454 5.227 C 12.236 5.737 12.850 6.484 13.194 7.364 C 13.394 7.878 13.974 8.132 14.489 7.931 C 15.003 7.731 15.257 7.151 15.057 6.636 C 14.769 5.900 14.351 5.229 13.832 4.653 C 14.204 4.553 14.596 4.500 15.000 4.500 C 16.493 4.500 17.571 5.022 18.294 5.890 C 19.038 6.783 19.500 8.154 19.500 10.000 C 19.500 12.903 19.014 15.385 18.270 17.102 C 17.485 18.914 16.603 19.500 16.000 19.500 C 15.850 19.500 15.725 19.465 15.538 19.142 C 15.313 18.750 15.154 18.182 14.947 17.422 C 14.773 16.783 14.557 15.989 14.195 15.360 C 13.787 14.652 13.100 14.000 12.000 14.000 C 10.900 14.000 10.213 14.652 9.805 15.360 C 9.443 15.989 9.227 16.783 9.053 17.422 C 8.846 18.182 8.687 18.750 8.462 19.142 C 8.275 19.465 8.150 19.500 8.000 19.500 C 7.397 19.500 6.515 18.914 5.730 17.102 C 4.986 15.385 4.500 12.903 4.500 10.000 C 4.500 8.154 4.962 6.783 5.706 5.890 ZM 12.000 3.232 C 11.102 2.764 10.081 2.500 9.000 2.500 C 6.993 2.500 5.321 3.228 4.169 4.610 C 3.038 5.967 2.500 7.846 2.500 10.000 C 2.500 13.097 3.014 15.865 3.895 17.898 C 4.735 19.836 6.103 21.500 8.000 21.500 C 9.100 21.500 9.787 20.848 10.195 20.140 C 10.569 19.489 10.788 18.663 10.965 18.013 C 11.163 17.288 11.319 16.739 11.538 16.358 C 11.725 16.035 11.850 16.000 12.000 16.000 C 12.150 16.000 12.275 16.035 12.462 16.358 C 12.681 16.739 12.837 17.288 13.035 18.013 C 13.212 18.663 13.431 19.489 13.805 20.140 C 14.213 20.848 14.900 21.500 16.000 21.500 C 17.897 21.500 19.265 19.836 20.105 17.898 C 20.986 15.865 21.500 13.097 21.500 10.000 C 21.500 7.846 20.962 5.967 19.831 4.610 C 18.679 3.228 17.007 2.500 15.000 2.500 C 13.919 2.500 12.898 2.764 12.000 3.232 Z"),
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
        return _toothLine!!
    }

private var _toothLine: ImageVector? = null
