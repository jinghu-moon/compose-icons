package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeTm: ImageVector
    get() {
        if (_badgeTm != null) return _badgeTm!!
        _badgeTm = tablerFilledIcon(
            name = "BadgeTm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 10.000 8.000 L 6.000 8.000 C 5.448 8.000 5.000 8.448 5.000 9.000 C 5.000 9.552 5.448 10.000 6.000 10.000 L 7.000 10.000 L 7.000 15.000 C 7.000 15.507 7.380 15.934 7.883 15.993 L 8.000 16.000 C 8.552 16.000 9.000 15.552 9.000 15.000 L 9.000 10.000 L 10.000 10.000 C 10.507 10.000 10.934 9.620 10.993 9.117 L 11.000 9.000 C 11.000 8.448 10.552 8.000 10.000 8.000M 18.000 9.000 C 18.000 8.010 16.717 7.622 16.168 8.445 L 15.000 10.197 L 13.832 8.445 C 13.283 7.622 12.000 8.011 12.000 9.000 L 12.000 15.000 C 12.000 15.552 12.448 16.000 13.000 16.000 L 13.117 15.993 C 13.620 15.934 14.000 15.507 14.000 15.000 L 14.000 12.303 L 14.168 12.555 L 14.248 12.659 C 14.453 12.893 14.755 13.018 15.066 12.998 C 15.376 12.977 15.659 12.814 15.832 12.555 L 16.000 12.302 L 16.000 15.000 C 16.000 15.552 16.448 16.000 17.000 16.000 C 17.552 16.000 18.000 15.552 18.000 15.000 Z"),
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
        return _badgeTm!!
    }

private var _badgeTm: ImageVector? = null
