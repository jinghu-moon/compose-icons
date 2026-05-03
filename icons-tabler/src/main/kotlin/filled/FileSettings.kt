package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSettings: ImageVector
    get() {
        if (_fileSettings != null) return _fileSettings!!
        _fileSettings = tablerFilledIcon(
            name = "FileSettings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 10.500 C 11.448 10.500 11.000 10.948 11.000 11.500 L 11.000 12.170 C 10.669 12.287 10.361 12.462 10.091 12.686 L 9.515 12.340 C 9.043 12.068 8.439 12.224 8.158 12.691 C 7.877 13.159 8.023 13.765 8.485 14.054 L 9.060 14.400 Q 9.017 14.607 9.005 14.824 L 9.000 15.000 Q 9.000 15.280 9.050 15.548 L 8.468 15.884 C 7.994 16.162 7.833 16.771 8.108 17.247 C 8.383 17.723 8.990 17.888 9.468 17.616 L 10.051 17.280 C 10.328 17.518 10.649 17.705 11.001 17.830 L 11.000 18.500 C 11.000 19.052 11.448 19.500 12.000 19.500 C 12.552 19.500 13.000 19.052 13.000 18.500 L 13.000 17.829 C 13.335 17.711 13.641 17.535 13.909 17.315 L 14.485 17.660 C 14.957 17.932 15.561 17.776 15.842 17.309 C 16.123 16.841 15.977 16.235 15.515 15.946 L 14.940 15.600 C 15.017 15.222 15.021 14.832 14.950 14.452 L 15.531 14.116 C 16.005 13.838 16.166 13.229 15.891 12.753 C 15.616 12.277 15.009 12.112 14.531 12.384 L 13.949 12.719 C 13.669 12.480 13.348 12.294 13.001 12.171 L 13.000 11.500 C 13.000 10.948 12.552 10.500 12.000 10.500M 12.000 14.000 C 12.552 14.000 13.000 14.448 13.000 15.000 C 13.000 15.552 12.552 16.000 12.000 16.000 C 11.448 16.000 11.000 15.552 11.000 15.000 C 11.000 14.448 11.448 14.000 12.000 14.000"),
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
        return _fileSettings!!
    }

private var _fileSettings: ImageVector? = null
