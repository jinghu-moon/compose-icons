package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = tablerFilledIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 10.447 13.106 C 9.953 12.859 9.353 13.059 9.106 13.553 L 8.106 15.553 C 7.965 15.834 7.965 16.166 8.106 16.447 L 9.106 18.447 C 9.353 18.941 9.953 19.141 10.447 18.894 L 10.549 18.836 C 10.973 18.558 11.121 18.006 10.894 17.553 L 10.118 16.000 L 10.894 14.447 C 11.141 13.953 10.941 13.353 10.447 13.106M 14.894 13.553 C 14.647 13.059 14.047 12.859 13.553 13.106 L 13.451 13.164 C 13.027 13.442 12.879 13.994 13.106 14.447 L 13.880 16.000 L 13.105 17.553 C 12.878 18.043 13.082 18.625 13.566 18.867 C 14.049 19.108 14.637 18.923 14.893 18.447 L 15.893 16.447 C 16.034 16.166 16.034 15.834 15.893 15.553 Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
