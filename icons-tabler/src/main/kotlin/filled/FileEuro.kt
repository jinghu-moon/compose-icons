package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileEuro: ImageVector
    get() {
        if (_fileEuro != null) return _fileEuro!!
        _fileEuro = tablerFilledIcon(
            name = "FileEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 14.334 11.230 C 13.277 10.856 12.111 10.942 11.120 11.469 C 10.130 11.996 9.407 12.914 9.126 14.000 L 9.000 14.000 C 8.448 14.000 8.000 14.448 8.000 15.000 C 8.000 15.552 8.448 16.000 9.000 16.000 L 9.126 16.000 C 9.407 17.086 10.130 18.004 11.120 18.531 C 12.111 19.058 13.277 19.144 14.334 18.770 C 14.848 18.581 15.114 18.014 14.932 17.497 C 14.749 16.981 14.184 16.708 13.666 16.885 L 13.510 16.934 C 12.637 17.165 11.718 16.782 11.267 16.000 L 12.000 16.000 C 12.552 16.000 13.000 15.552 13.000 15.000 C 13.000 14.448 12.552 14.000 12.000 14.000 L 11.267 14.000 Q 11.323 13.903 11.391 13.810 C 11.914 13.104 12.837 12.821 13.666 13.115 L 13.778 13.147 C 14.295 13.266 14.816 12.961 14.964 12.451 C 15.111 11.941 14.835 11.405 14.334 11.229"),
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
        pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileEuro!!
    }

private var _fileEuro: ImageVector? = null
