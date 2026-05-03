package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = tablerFilledIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.000 C 17.507 3.000 17.934 3.380 17.993 3.883 L 18.000 4.000 L 18.000 6.170 C 19.243 5.732 20.626 6.157 21.409 7.216 C 22.193 8.276 22.193 9.723 21.409 10.783 C 20.626 11.842 19.243 12.267 18.000 11.829 L 18.000 12.000 C 18.000 14.928 15.887 17.428 13.000 17.917 L 13.000 20.000 L 16.000 20.000 C 16.529 20.001 16.966 20.413 16.997 20.941 C 17.028 21.470 16.642 21.931 16.117 21.993 L 16.000 22.000 L 8.000 22.000 C 7.471 21.999 7.034 21.587 7.003 21.059 C 6.972 20.530 7.358 20.069 7.883 20.007 L 8.000 20.000 L 11.000 20.000 L 11.000 17.917 C 8.197 17.442 6.111 15.066 6.004 12.225 L 6.000 12.000 L 6.000 11.829 C 5.111 12.144 4.125 12.022 3.340 11.500 C 2.554 10.979 2.059 10.118 2.004 9.176 L 2.001 9.000 L 2.006 8.824 C 2.061 7.882 2.555 7.021 3.341 6.500 C 4.126 5.978 5.112 5.856 6.001 6.170 L 6.000 4.000 C 6.000 3.448 6.448 3.000 7.000 3.000 L 17.000 3.000 ZM 5.000 8.000 C 4.448 8.000 4.000 8.448 4.000 9.000 C 4.000 9.552 4.448 10.000 5.000 10.000 C 5.552 10.000 6.000 9.552 6.000 9.000 C 6.000 8.448 5.552 8.000 5.000 8.000M 19.000 8.000 C 18.448 8.000 18.000 8.448 18.000 9.000 C 18.000 9.552 18.448 10.000 19.000 10.000 C 19.552 10.000 20.000 9.552 20.000 9.000 C 20.000 8.448 19.552 8.000 19.000 8.000"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
