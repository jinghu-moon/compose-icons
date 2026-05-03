package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigUpLines: ImageVector
    get() {
        if (_arrowBigUpLines != null) return _arrowBigUpLines!!
        _arrowBigUpLines = tablerFilledIcon(
            name = "ArrowBigUpLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.586 3.000 L 4.000 9.586 C 3.428 10.158 3.256 11.018 3.566 11.766 L 3.634 11.911 C 3.976 12.579 4.663 13.000 5.414 13.000 L 8.000 13.000 L 8.000 15.000 C 8.000 15.552 8.448 16.000 9.000 16.000 L 15.000 16.000 L 15.117 15.993 C 15.620 15.934 16.000 15.507 16.000 15.000 L 15.999 13.000 L 18.586 13.000 C 19.395 13.000 20.124 12.513 20.433 11.765 C 20.743 11.018 20.572 10.158 20.000 9.586 L 13.414 3.000 C 12.633 2.219 11.367 2.219 10.586 3.000 Z"),
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
                pathData = parseSvgPathData("M 15.000 20.000 C 15.529 20.001 15.966 20.413 15.997 20.941 C 16.028 21.470 15.642 21.931 15.117 21.993 L 15.000 22.000 L 9.000 22.000 C 8.471 21.999 8.034 21.587 8.003 21.059 C 7.972 20.530 8.358 20.069 8.883 20.007 L 9.000 20.000 L 15.000 20.000 Z"),
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
                pathData = parseSvgPathData("M 15.000 17.000 C 15.529 17.001 15.966 17.413 15.997 17.941 C 16.028 18.470 15.642 18.931 15.117 18.993 L 15.000 19.000 L 9.000 19.000 C 8.471 18.999 8.034 18.587 8.003 18.059 C 7.972 17.530 8.358 17.069 8.883 17.007 L 9.000 17.000 L 15.000 17.000 Z"),
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
        return _arrowBigUpLines!!
    }

private var _arrowBigUpLines: ImageVector? = null
