package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileStar: ImageVector
    get() {
        if (_fileStar != null) return _fileStar!!
        _fileStar = tablerFilledIcon(
            name = "FileStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 11.800 11.000 C 11.651 10.999 11.515 11.084 11.449 11.217 L 10.363 13.410 L 7.935 13.762 C 7.788 13.782 7.665 13.885 7.619 14.027 C 7.572 14.168 7.611 14.324 7.718 14.427 L 9.475 16.134 L 9.060 18.545 C 9.036 18.691 9.097 18.838 9.218 18.925 C 9.338 19.012 9.497 19.023 9.628 18.955 L 11.800 17.817 L 13.972 18.955 C 14.103 19.025 14.263 19.014 14.384 18.926 C 14.504 18.839 14.564 18.691 14.539 18.544 L 14.125 16.134 L 15.882 14.427 C 15.988 14.323 16.026 14.168 15.980 14.027 C 15.934 13.886 15.812 13.783 15.665 13.762 L 13.237 13.410 L 12.151 11.217 C 12.085 11.084 11.949 10.999 11.800 11.000"),
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
        return _fileStar!!
    }

private var _fileStar: ImageVector? = null
