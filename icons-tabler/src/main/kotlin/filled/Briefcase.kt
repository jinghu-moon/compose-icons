package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = tablerFilledIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.478 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 13.478 L 2.553 13.755 C 8.496 16.749 15.507 16.748 21.450 13.753 L 22.000 13.478 ZM 14.000 2.000 C 15.657 2.000 17.000 3.343 17.000 5.000 L 17.000 6.000 L 19.000 6.000 C 20.657 6.000 22.000 7.343 22.000 9.000 L 22.000 11.242 L 20.553 11.966 C 15.306 14.611 9.131 14.679 3.827 12.152 L 3.180 11.832 L 2.000 11.242 L 2.000 9.000 C 2.000 7.343 3.343 6.000 5.000 6.000 L 7.000 6.000 L 7.000 5.000 C 7.000 3.343 8.343 2.000 10.000 2.000 L 14.000 2.000 ZM 12.000 10.000 C 11.448 10.000 11.000 10.448 11.000 11.000 C 10.997 11.552 11.443 12.002 11.995 12.005 C 12.547 12.008 12.997 11.562 13.000 11.010 C 13.000 10.448 12.552 10.000 12.000 10.000 ZM 14.000 4.000 L 10.000 4.000 C 9.448 4.000 9.000 4.448 9.000 5.000 L 9.000 6.000 L 15.000 6.000 L 15.000 5.000 C 15.000 4.448 14.552 4.000 14.000 4.000 Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
