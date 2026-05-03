package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BearSmileLine: ImageVector
    get() {
        if (_bearSmileLine != null) return _bearSmileLine!!
        _bearSmileLine = remixIcon(
            name = "BearSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 C 14.209 17.000 16.000 15.209 16.000 13.000 L 14.000 13.000 C 14.000 14.105 13.105 15.000 12.000 15.000 C 10.895 15.000 10.000 14.105 10.000 13.000 L 8.000 13.000 C 8.000 15.209 9.791 17.000 12.000 17.000 ZM 6.500 2.000 C 4.015 2.000 2.000 4.015 2.000 6.500 C 2.000 7.857 2.601 9.073 3.549 9.898 C 3.194 10.866 3.000 11.911 3.000 13.000 C 3.000 17.971 7.029 22.000 12.000 22.000 C 16.971 22.000 21.000 17.971 21.000 13.000 C 21.000 11.911 20.806 10.866 20.451 9.898 C 21.399 9.073 22.000 7.857 22.000 6.500 C 22.000 4.015 19.985 2.000 17.500 2.000 C 15.874 2.000 14.450 2.862 13.660 4.153 C 13.122 4.052 12.566 4.000 12.000 4.000 C 11.434 4.000 10.878 4.052 10.340 4.153 C 9.550 2.862 8.126 2.000 6.500 2.000 ZM 4.000 6.500 C 4.000 5.119 5.119 4.000 6.500 4.000 C 7.580 4.000 8.503 4.686 8.852 5.649 L 9.170 6.527 L 10.068 6.270 C 10.680 6.094 11.328 6.000 12.000 6.000 C 12.672 6.000 13.320 6.094 13.932 6.270 L 14.830 6.527 L 15.148 5.649 C 15.497 4.686 16.420 4.000 17.500 4.000 C 18.881 4.000 20.000 5.119 20.000 6.500 C 20.000 7.433 19.489 8.248 18.728 8.679 L 17.914 9.138 L 18.318 9.981 C 18.755 10.894 19.000 11.917 19.000 13.000 C 19.000 16.866 15.866 20.000 12.000 20.000 C 8.134 20.000 5.000 16.866 5.000 13.000 C 5.000 11.917 5.245 10.894 5.682 9.981 L 6.086 9.138 L 5.272 8.679 C 4.511 8.248 4.000 7.433 4.000 6.500 Z"),
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
        return _bearSmileLine!!
    }

private var _bearSmileLine: ImageVector? = null
