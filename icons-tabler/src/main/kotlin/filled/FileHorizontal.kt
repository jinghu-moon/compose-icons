package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileHorizontal: ImageVector
    get() {
        if (_fileHorizontal != null) return _fileHorizontal!!
        _fileHorizontal = tablerFilledIcon(
            name = "FileHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 L 21.993 11.883 C 21.939 11.424 21.576 11.061 21.117 11.007 L 21.000 11.000 L 17.000 11.000 L 16.850 10.995 C 15.866 10.921 15.083 10.141 15.006 9.157 L 15.000 9.000 L 15.000 5.000 L 14.993 4.883 C 14.939 4.424 14.576 4.061 14.117 4.007 L 14.000 4.000 L 5.000 4.000 C 3.411 4.000 2.098 5.238 2.005 6.824 L 2.000 7.000 L 2.000 17.000 C 2.000 18.589 3.238 19.902 4.824 19.995 L 5.000 20.000 L 19.000 20.000 C 20.589 20.000 21.902 18.762 21.995 17.176 L 22.000 17.000 Z"),
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
        pathData = parseSvgPathData("M 17.000 5.000 L 17.000 9.000 L 21.001 9.001 Z"),
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
        return _fileHorizontal!!
    }

private var _fileHorizontal: ImageVector? = null
