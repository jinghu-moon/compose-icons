package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigRightLines: ImageVector
    get() {
        if (_arrowBigRightLines != null) return _arrowBigRightLines!!
        _arrowBigRightLines = tablerFilledIcon(
            name = "ArrowBigRightLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.089 3.634 C 11.421 3.976 11.000 4.663 11.000 5.414 L 10.999 7.999 L 9.000 8.000 C 8.448 8.000 8.000 8.448 8.000 9.000 L 8.000 15.000 L 8.007 15.117 C 8.066 15.620 8.493 16.000 9.000 16.000 L 10.999 15.999 L 11.000 18.586 C 11.000 19.395 11.487 20.124 12.235 20.433 C 12.982 20.743 13.842 20.572 14.414 20.000 L 21.000 13.414 C 21.781 12.633 21.781 11.367 21.000 10.586 L 14.414 4.000 C 13.842 3.428 12.982 3.256 12.234 3.566 L 12.089 3.634 Z"),
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
                pathData = parseSvgPathData("M 3.000 8.000 C 3.507 8.000 3.934 8.380 3.993 8.883 L 4.000 9.000 L 4.000 15.000 C 3.999 15.529 3.587 15.966 3.059 15.997 C 2.530 16.028 2.069 15.642 2.007 15.117 L 2.000 15.000 L 2.000 9.000 C 2.000 8.448 2.448 8.000 3.000 8.000 Z"),
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
                pathData = parseSvgPathData("M 6.000 8.000 C 6.507 8.000 6.934 8.380 6.993 8.883 L 7.000 9.000 L 7.000 15.000 C 6.999 15.529 6.587 15.966 6.059 15.997 C 5.530 16.028 5.069 15.642 5.007 15.117 L 5.000 15.000 L 5.000 9.000 C 5.000 8.448 5.448 8.000 6.000 8.000 Z"),
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
        return _arrowBigRightLines!!
    }

private var _arrowBigRightLines: ImageVector? = null
