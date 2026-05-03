package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCode2: ImageVector
    get() {
        if (_fileCode2 != null) return _fileCode2!!
        _fileCode2 = tablerFilledIcon(
            name = "FileCode2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 10.000 11.000 L 9.000 11.000 C 8.448 11.000 8.000 11.448 8.000 12.000 L 8.000 17.000 C 8.000 17.552 8.448 18.000 9.000 18.000 L 10.000 18.000 C 10.552 18.000 11.000 17.552 11.000 17.000 L 10.993 16.883 C 10.939 16.424 10.576 16.061 10.117 16.007 L 10.000 16.000 L 10.000 13.000 C 10.552 13.000 11.000 12.552 11.000 12.000 C 11.000 11.448 10.552 11.000 10.000 11.000M 15.000 11.000 L 14.000 11.000 C 13.448 11.000 13.000 11.448 13.000 12.000 C 13.000 12.552 13.448 13.000 14.000 13.000 L 14.000 16.000 C 13.448 16.000 13.000 16.448 13.000 17.000 C 13.000 17.552 13.448 18.000 14.000 18.000 L 15.000 18.000 C 15.552 18.000 16.000 17.552 16.000 17.000 L 16.000 12.000 C 16.000 11.448 15.552 11.000 15.000 11.000M 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _fileCode2!!
    }

private var _fileCode2: ImageVector? = null
