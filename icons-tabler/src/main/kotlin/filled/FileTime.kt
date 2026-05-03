package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileTime: ImageVector
    get() {
        if (_fileTime != null) return _fileTime!!
        _fileTime = tablerFilledIcon(
            name = "FileTime",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 10.000 C 9.323 10.000 7.121 12.109 7.005 14.783 L 7.000 15.000 C 7.000 17.761 9.239 20.000 12.000 20.000 C 14.761 20.000 17.000 17.761 17.000 15.000 C 17.000 12.239 14.761 10.000 12.000 10.000M 12.000 12.000 C 13.657 12.000 15.000 13.343 15.000 15.000 C 15.000 16.657 13.657 18.000 12.000 18.000 C 10.343 18.000 9.000 16.657 9.000 15.000 C 9.000 13.343 10.343 12.000 12.000 12.000M 12.000 12.496 C 11.448 12.496 11.000 12.944 11.000 13.496 L 11.000 15.000 C 11.000 15.265 11.105 15.520 11.293 15.707 L 12.293 16.707 C 12.684 17.097 13.316 17.097 13.707 16.707 L 13.790 16.613 C 14.099 16.215 14.063 15.649 13.707 15.293 L 13.000 14.585 L 13.000 13.496 C 13.000 12.944 12.552 12.496 12.000 12.496"),
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
        return _fileTime!!
    }

private var _fileTime: ImageVector? = null
