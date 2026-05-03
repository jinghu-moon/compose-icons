package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Versions: ImageVector
    get() {
        if (_versions != null) return _versions!!
        _versions = tablerFilledIcon(
            name = "Versions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 4.000 L 12.000 4.000 C 10.343 4.000 9.000 5.343 9.000 7.000 L 9.000 17.000 C 9.000 18.657 10.343 20.000 12.000 20.000 L 18.000 20.000 C 19.657 20.000 21.000 18.657 21.000 17.000 L 21.000 7.000 C 21.000 5.343 19.657 4.000 18.000 4.000 Z"),
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
                pathData = parseSvgPathData("M 7.000 6.000 C 7.507 6.000 7.934 6.380 7.993 6.883 L 8.000 7.000 L 8.000 17.000 C 7.999 17.529 7.587 17.966 7.059 17.997 C 6.530 18.028 6.069 17.642 6.007 17.117 L 6.000 17.000 L 6.000 7.000 C 6.000 6.448 6.448 6.000 7.000 6.000 Z"),
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
                pathData = parseSvgPathData("M 4.000 7.000 C 4.507 7.000 4.934 7.380 4.993 7.883 L 5.000 8.000 L 5.000 16.000 C 4.999 16.529 4.587 16.966 4.059 16.997 C 3.530 17.028 3.069 16.642 3.007 16.117 L 3.000 16.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000 Z"),
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
        return _versions!!
    }

private var _versions: ImageVector? = null
