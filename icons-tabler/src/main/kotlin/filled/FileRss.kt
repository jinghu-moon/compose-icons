package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileRss: ImageVector
    get() {
        if (_fileRss != null) return _fileRss!!
        _fileRss = tablerFilledIcon(
            name = "FileRss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 9.000 13.000 C 8.448 13.000 8.000 13.448 8.000 14.000 C 8.000 14.552 8.448 15.000 9.000 15.000 C 10.047 15.000 10.917 15.806 10.995 16.850 L 11.000 17.000 C 11.000 17.552 11.448 18.000 12.000 18.000 C 12.552 18.000 13.000 17.552 13.000 17.000 C 13.000 14.791 11.209 13.000 9.000 13.000M 9.000 10.000 C 8.448 10.000 8.000 10.448 8.000 11.000 C 8.000 11.552 8.448 12.000 9.000 12.000 C 11.761 12.000 14.000 14.239 14.000 17.000 C 14.000 17.552 14.448 18.000 15.000 18.000 C 15.552 18.000 16.000 17.552 16.000 17.000 C 16.000 13.134 12.866 10.000 9.000 10.000M 9.010 16.000 L 9.000 16.000 C 8.471 16.001 8.034 16.413 8.003 16.941 C 7.972 17.470 8.358 17.931 8.883 17.993 L 9.010 18.000 C 9.562 18.000 10.010 17.552 10.010 17.000 C 10.010 16.448 9.562 16.000 9.010 16.000M 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _fileRss!!
    }

private var _fileRss: ImageVector? = null
