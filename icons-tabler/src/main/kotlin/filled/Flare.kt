package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flare: ImageVector
    get() {
        if (_flare != null) return _flare!!
        _flare = tablerFilledIcon(
            name = "Flare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.106 2.553 C 11.276 2.215 11.622 2.001 12.000 2.001 C 12.378 2.001 12.724 2.215 12.894 2.553 L 15.745 8.254 L 21.447 11.106 C 21.765 11.265 21.975 11.582 21.998 11.937 C 22.021 12.292 21.853 12.633 21.557 12.831 L 21.447 12.894 L 15.745 15.745 L 12.895 21.447 C 12.736 21.766 12.419 21.976 12.064 21.999 C 11.708 22.021 11.367 21.853 11.169 21.557 L 11.106 21.447 L 8.254 15.745 L 2.553 12.895 C 2.234 12.736 2.024 12.419 2.001 12.064 C 1.979 11.708 2.147 11.367 2.443 11.169 L 2.553 11.106 L 8.254 8.254 Z"),
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
        return _flare!!
    }

private var _flare: ImageVector? = null
