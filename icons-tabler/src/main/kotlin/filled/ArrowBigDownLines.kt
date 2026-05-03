package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigDownLines: ImageVector
    get() {
        if (_arrowBigDownLines != null) return _arrowBigDownLines!!
        _arrowBigDownLines = tablerFilledIcon(
            name = "ArrowBigDownLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 8.000 L 8.883 8.007 C 8.380 8.066 8.000 8.493 8.000 9.000 L 8.000 10.999 L 5.414 11.000 C 4.605 11.000 3.876 11.487 3.567 12.235 C 3.257 12.982 3.428 13.842 4.000 14.414 L 10.586 21.000 C 11.367 21.781 12.633 21.781 13.414 21.000 L 20.000 14.414 C 20.572 13.842 20.744 12.982 20.434 12.234 L 20.366 12.089 C 20.024 11.421 19.337 11.000 18.586 11.000 L 16.000 10.999 L 16.000 9.000 C 16.000 8.448 15.552 8.000 15.000 8.000 L 9.000 8.000 Z"),
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
                pathData = parseSvgPathData("M 15.000 2.000 C 15.529 2.001 15.966 2.413 15.997 2.941 C 16.028 3.470 15.642 3.931 15.117 3.993 L 15.000 4.000 L 9.000 4.000 C 8.471 3.999 8.034 3.587 8.003 3.059 C 7.972 2.530 8.358 2.069 8.883 2.007 L 9.000 2.000 L 15.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 15.000 5.000 C 15.529 5.001 15.966 5.413 15.997 5.941 C 16.028 6.470 15.642 6.931 15.117 6.993 L 15.000 7.000 L 9.000 7.000 C 8.471 6.999 8.034 6.587 8.003 6.059 C 7.972 5.530 8.358 5.069 8.883 5.007 L 9.000 5.000 L 15.000 5.000 Z"),
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
        return _arrowBigDownLines!!
    }

private var _arrowBigDownLines: ImageVector? = null
