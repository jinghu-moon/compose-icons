package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost3: ImageVector
    get() {
        if (_ghost3 != null) return _ghost3!!
        _ghost3 = tablerFilledIcon(
            name = "Ghost3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 16.418 3.000 20.000 6.582 20.000 11.000 L 20.000 17.954 L 20.009 18.057 C 20.073 19.142 19.500 20.164 18.541 20.675 L 18.378 20.755 C 17.267 21.257 15.958 20.975 15.112 20.015 C 14.989 19.857 14.800 19.765 14.600 19.765 C 14.400 19.765 14.211 19.857 14.088 20.015 C 13.586 20.658 12.816 21.033 12.000 21.033 C 11.184 21.033 10.414 20.658 9.912 20.015 C 9.789 19.858 9.600 19.766 9.400 19.766 C 9.200 19.766 9.011 19.858 8.850 20.062 C 8.065 20.951 6.802 21.244 5.706 20.792 C 4.609 20.339 3.921 19.241 3.991 18.057 L 4.001 17.953 L 4.008 17.876 L 4.000 17.950 L 4.000 11.000 L 4.004 10.750 C 4.136 6.528 7.529 3.136 11.751 3.004 ZM 10.010 9.000 L 10.000 9.000 C 9.448 9.000 9.000 9.448 9.000 10.000 C 9.000 10.552 9.448 11.000 10.000 11.000 L 10.010 11.000 C 10.562 11.000 11.010 10.552 11.010 10.000 C 11.010 9.448 10.562 9.000 10.010 9.000M 14.010 9.000 L 14.000 9.000 C 13.448 9.000 13.000 9.448 13.000 10.000 C 13.000 10.552 13.448 11.000 14.000 11.000 L 14.010 11.000 C 14.562 11.000 15.010 10.552 15.010 10.000 C 15.010 9.448 14.562 9.000 14.010 9.000"),
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
        return _ghost3!!
    }

private var _ghost3: ImageVector? = null
