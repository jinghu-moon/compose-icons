package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigLeftLines: ImageVector
    get() {
        if (_arrowBigLeftLines != null) return _arrowBigLeftLines!!
        _arrowBigLeftLines = tablerFilledIcon(
            name = "ArrowBigLeftLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.586 4.000 L 3.000 10.586 C 2.219 11.367 2.219 12.633 3.000 13.414 L 9.586 20.000 C 10.158 20.572 11.018 20.744 11.766 20.434 L 11.911 20.366 C 12.579 20.024 13.000 19.337 13.000 18.586 L 13.000 16.000 L 15.000 16.000 C 15.552 16.000 16.000 15.552 16.000 15.000 L 16.000 9.000 L 15.993 8.883 C 15.934 8.380 15.507 8.000 15.000 8.000 L 13.000 7.999 L 13.000 5.414 C 13.000 4.605 12.513 3.876 11.765 3.567 C 11.018 3.257 10.158 3.428 9.586 4.000 Z"),
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
                pathData = parseSvgPathData("M 21.000 8.000 C 21.507 8.000 21.934 8.380 21.993 8.883 L 22.000 9.000 L 22.000 15.000 C 21.999 15.529 21.587 15.966 21.059 15.997 C 20.530 16.028 20.069 15.642 20.007 15.117 L 20.000 15.000 L 20.000 9.000 C 20.000 8.448 20.448 8.000 21.000 8.000 Z"),
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
                pathData = parseSvgPathData("M 18.000 8.000 C 18.507 8.000 18.934 8.380 18.993 8.883 L 19.000 9.000 L 19.000 15.000 C 18.999 15.529 18.587 15.966 18.059 15.997 C 17.530 16.028 17.069 15.642 17.007 15.117 L 17.000 15.000 L 17.000 9.000 C 17.000 8.448 17.448 8.000 18.000 8.000 Z"),
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
        return _arrowBigLeftLines!!
    }

private var _arrowBigLeftLines: ImageVector? = null
