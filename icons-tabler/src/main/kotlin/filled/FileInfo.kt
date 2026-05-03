package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileInfo: ImageVector
    get() {
        if (_fileInfo != null) return _fileInfo!!
        _fileInfo = tablerFilledIcon(
            name = "FileInfo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 14.000 L 11.000 14.000 C 10.448 14.000 10.000 14.448 10.000 15.000 C 10.000 15.552 10.448 16.000 11.000 16.000 L 11.000 19.000 C 11.000 19.552 11.448 20.000 12.000 20.000 L 13.000 20.000 C 13.552 20.000 14.000 19.552 14.000 19.000 L 13.993 18.883 C 13.939 18.424 13.576 18.061 13.117 18.007 L 13.000 18.000 L 13.000 15.000 C 13.000 14.448 12.552 14.000 12.000 14.000M 12.010 11.000 L 12.000 11.000 C 11.471 11.001 11.034 11.413 11.003 11.941 C 10.972 12.470 11.358 12.931 11.883 12.993 L 12.010 13.000 C 12.562 13.000 13.010 12.552 13.010 12.000 C 13.010 11.448 12.562 11.000 12.010 11.000"),
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
        return _fileInfo!!
    }

private var _fileInfo: ImageVector? = null
