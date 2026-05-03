package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ufo: ImageVector
    get() {
        if (_ufo != null) return _ufo!!
        _ufo = tablerFilledIcon(
            name = "Ufo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 15.067 3.000 17.600 5.290 17.957 8.246 C 21.024 9.149 23.000 10.722 23.000 12.724 C 23.000 15.024 20.347 16.777 16.573 17.557 L 17.833 19.445 C 18.140 19.905 18.015 20.526 17.556 20.833 C 17.096 21.139 16.475 21.015 16.168 20.555 L 14.388 17.885 C 13.618 17.961 12.818 18.000 12.000 18.000 C 11.034 18.000 10.095 17.945 9.199 17.840 L 7.894 20.447 C 7.638 20.923 7.050 21.108 6.567 20.867 C 6.083 20.625 5.879 20.043 6.106 19.553 L 7.134 17.493 C 3.516 16.686 1.000 14.964 1.000 12.725 C 1.000 10.726 2.981 9.145 6.044 8.242 C 6.404 5.287 8.934 3.000 12.000 3.000M 12.010 13.000 L 11.883 13.007 C 11.358 13.069 10.972 13.530 11.003 14.059 C 11.034 14.587 11.471 14.999 12.000 15.000 L 12.127 14.993 C 12.652 14.931 13.038 14.470 13.007 13.941 C 12.976 13.413 12.539 13.001 12.010 13.000M 7.010 12.000 L 6.883 12.007 C 6.358 12.069 5.972 12.530 6.003 13.059 C 6.034 13.587 6.471 13.999 7.000 14.000 L 7.127 13.993 C 7.652 13.931 8.038 13.470 8.007 12.941 C 7.976 12.413 7.539 12.001 7.010 12.000M 17.010 12.000 L 16.883 12.007 C 16.358 12.069 15.972 12.530 16.003 13.059 C 16.034 13.587 16.471 13.999 17.000 14.000 L 17.127 13.993 C 17.652 13.931 18.038 13.470 18.007 12.941 C 17.976 12.413 17.539 12.001 17.010 12.000M 12.000 5.000 C 9.890 5.000 8.165 6.618 8.011 8.667 C 8.057 8.795 8.076 8.931 8.068 9.067 C 8.172 9.154 8.416 9.318 8.836 9.486 C 9.642 9.808 10.776 10.000 12.000 10.000 C 13.224 10.000 14.358 9.808 15.164 9.486 C 15.609 9.308 15.857 9.134 15.953 9.051 L 15.950 9.000 Q 15.950 8.887 15.979 8.771 L 15.993 8.725 C 15.868 6.649 14.129 5.000 12.000 5.000"),
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
        return _ufo!!
    }

private var _ufo: ImageVector? = null
