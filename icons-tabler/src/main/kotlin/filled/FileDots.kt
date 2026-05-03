package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDots: ImageVector
    get() {
        if (_fileDots != null) return _fileDots!!
        _fileDots = tablerFilledIcon(
            name = "FileDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 9.000 14.000 C 8.493 14.000 8.066 14.380 8.007 14.883 L 8.000 15.010 C 8.001 15.539 8.413 15.976 8.941 16.007 C 9.470 16.038 9.931 15.652 9.993 15.127 L 10.000 15.000 C 10.000 14.448 9.552 14.000 9.000 14.000M 12.000 14.000 C 11.493 14.000 11.066 14.380 11.007 14.883 L 11.000 15.010 C 11.001 15.539 11.413 15.976 11.941 16.007 C 12.470 16.038 12.931 15.652 12.993 15.127 L 13.000 15.000 C 13.000 14.448 12.552 14.000 12.000 14.000M 15.000 14.000 C 14.493 14.000 14.066 14.380 14.007 14.883 L 14.000 15.010 C 14.001 15.539 14.413 15.976 14.941 16.007 C 15.470 16.038 15.931 15.652 15.993 15.127 L 16.000 15.000 C 16.000 14.448 15.552 14.000 15.000 14.000"),
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
        return _fileDots!!
    }

private var _fileDots: ImageVector? = null
