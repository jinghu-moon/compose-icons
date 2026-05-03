package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) return _badgeSd!!
        _badgeSd = tablerFilledIcon(
            name = "BadgeSd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 15.000 8.000 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 15.000 16.000 C 16.657 16.000 18.000 14.657 18.000 13.000 L 18.000 11.000 C 18.000 9.343 16.657 8.000 15.000 8.000M 9.250 8.000 L 8.000 8.000 C 6.895 8.000 6.000 8.895 6.000 10.000 L 6.000 11.000 C 6.000 12.105 6.895 13.000 8.000 13.000 L 9.000 13.000 L 9.000 14.000 L 7.967 14.000 L 7.942 13.913 C 7.779 13.454 7.309 13.180 6.829 13.263 C 6.349 13.347 5.999 13.763 6.000 14.250 C 6.000 15.216 6.784 16.000 7.750 16.000 L 9.000 16.000 C 10.105 16.000 11.000 15.105 11.000 14.000 L 11.000 13.000 C 11.000 11.895 10.105 11.000 9.000 11.000 L 8.000 11.000 L 8.000 10.000 L 9.032 10.000 L 9.058 10.087 C 9.221 10.546 9.691 10.820 10.171 10.737 C 10.651 10.653 11.001 10.237 11.000 9.750 C 11.000 8.784 10.216 8.000 9.250 8.000M 15.000 10.000 C 15.552 10.000 16.000 10.448 16.000 11.000 L 16.000 13.000 C 16.000 13.507 15.620 13.934 15.117 13.993 L 15.000 14.000 Z"),
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
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
