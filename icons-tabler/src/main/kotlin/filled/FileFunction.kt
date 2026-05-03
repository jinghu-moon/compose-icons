package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileFunction: ImageVector
    get() {
        if (_fileFunction != null) return _fileFunction!!
        _fileFunction = tablerFilledIcon(
            name = "FileFunction",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 13.500 11.000 L 13.167 11.000 L 13.007 11.006 C 12.112 11.076 11.357 11.738 11.257 12.636 L 11.105 14.000 L 10.500 14.000 C 9.948 14.000 9.500 14.448 9.500 15.000 C 9.500 15.552 9.948 16.000 10.500 16.000 L 10.882 16.000 L 10.771 17.000 L 10.500 17.000 C 9.948 17.000 9.500 17.448 9.500 18.000 C 9.500 18.552 9.948 19.000 10.500 19.000 L 10.833 19.000 L 10.993 18.994 C 11.889 18.923 12.645 18.261 12.743 17.362 L 12.894 16.000 L 13.500 16.000 C 14.052 16.000 14.500 15.552 14.500 15.000 C 14.500 14.448 14.052 14.000 13.500 14.000 L 13.117 14.000 L 13.228 13.000 L 13.500 13.000 C 14.052 13.000 14.500 12.552 14.500 12.000 C 14.500 11.448 14.052 11.000 13.500 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileFunction!!
    }

private var _fileFunction: ImageVector? = null
