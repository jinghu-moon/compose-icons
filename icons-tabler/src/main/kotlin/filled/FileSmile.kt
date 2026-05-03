package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSmile: ImageVector
    get() {
        if (_fileSmile != null) return _fileSmile!!
        _fileSmile = tablerFilledIcon(
            name = "FileSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 14.820 16.429 C 14.505 15.976 13.882 15.864 13.429 16.179 C 12.570 16.777 11.430 16.777 10.571 16.179 C 10.118 15.864 9.494 15.976 9.179 16.429 C 8.864 16.882 8.976 17.506 9.429 17.821 C 10.974 18.897 13.026 18.897 14.571 17.821 C 14.789 17.670 14.937 17.438 14.984 17.177 C 15.031 16.916 14.972 16.647 14.821 16.429M 10.006 12.000 L 9.996 12.000 C 9.444 12.000 8.996 12.448 8.996 13.000 C 8.996 13.552 9.444 14.000 9.996 14.000 L 10.006 14.000 C 10.558 14.000 11.006 13.552 11.006 13.000 C 11.006 12.448 10.558 12.000 10.006 12.000M 14.006 12.000 L 13.996 12.000 C 13.444 12.000 12.996 12.448 12.996 13.000 C 12.996 13.552 13.444 14.000 13.996 14.000 L 14.006 14.000 C 14.558 14.000 15.006 13.552 15.006 13.000 C 15.006 12.448 14.558 12.000 14.006 12.000"),
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
        return _fileSmile!!
    }

private var _fileSmile: ImageVector? = null
