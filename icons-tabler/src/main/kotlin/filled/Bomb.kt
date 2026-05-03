package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = tablerFilledIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.499 3.996 C 15.083 3.996 15.642 4.228 16.055 4.641 L 19.357 7.942 C 19.770 8.355 20.002 8.915 20.002 9.498 C 20.002 10.082 19.770 10.642 19.357 11.055 L 18.790 11.622 L 18.833 11.814 C 19.526 15.245 18.044 18.750 15.101 20.644 L 14.871 20.788 C 11.613 22.740 7.455 22.294 4.685 19.695 C 1.915 17.095 1.206 12.974 2.949 9.599 C 4.691 6.223 8.461 4.413 12.184 5.165 L 12.376 5.207 L 12.943 4.641 C 13.308 4.276 13.790 4.051 14.305 4.005 ZM 10.000 9.000 C 7.791 9.000 6.000 10.791 6.000 13.000 C 6.000 13.552 6.448 14.000 7.000 14.000 C 7.552 14.000 8.000 13.552 8.000 13.000 C 8.000 11.895 8.895 11.000 10.000 11.000 C 10.552 11.000 11.000 10.552 11.000 10.000 C 11.000 9.448 10.552 9.000 10.000 9.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 21.000 2.000 C 21.529 2.001 21.966 2.413 21.997 2.941 C 22.028 3.470 21.642 3.931 21.117 3.993 L 21.000 4.000 L 20.000 4.000 C 20.000 4.830 19.698 5.629 19.154 6.250 L 19.000 6.413 L 17.707 7.706 C 17.334 8.078 16.735 8.096 16.340 7.748 C 15.944 7.399 15.887 6.803 16.210 6.386 L 16.293 6.292 L 17.586 5.000 C 17.818 4.768 17.961 4.463 17.993 4.140 L 18.000 4.000 C 18.000 2.953 18.806 2.083 19.850 2.005 L 20.000 2.000 L 21.000 2.000 Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
