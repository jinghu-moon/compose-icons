package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pinned: ImageVector
    get() {
        if (_pinned != null) return _pinned!!
        _pinned = tablerFilledIcon(
            name = "Pinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 3.000 C 16.529 3.001 16.966 3.413 16.997 3.941 C 17.028 4.470 16.642 4.931 16.117 4.993 L 16.000 5.000 L 16.000 9.764 L 17.894 13.553 C 17.946 13.657 17.980 13.769 17.994 13.884 L 18.000 14.000 L 18.000 16.000 C 18.000 16.507 17.620 16.934 17.117 16.993 L 17.000 17.000 L 13.000 17.000 L 13.000 21.000 C 12.999 21.529 12.587 21.966 12.059 21.997 C 11.530 22.028 11.069 21.642 11.007 21.117 L 11.000 21.000 L 11.000 17.000 L 7.000 17.000 C 6.493 17.000 6.066 16.620 6.007 16.117 L 6.000 16.000 L 6.000 14.000 C 6.000 13.884 6.020 13.769 6.060 13.660 L 6.106 13.553 L 8.000 9.762 L 8.000 5.000 C 7.471 4.999 7.034 4.587 7.003 4.059 C 6.972 3.530 7.358 3.069 7.883 3.007 L 8.000 3.000 L 16.000 3.000 Z"),
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
        return _pinned!!
    }

private var _pinned: ImageVector? = null
