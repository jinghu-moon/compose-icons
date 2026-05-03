package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = tablerFilledIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.001 C 12.720 1.001 13.385 1.388 13.749 2.031 L 21.879 17.021 C 21.958 17.167 22.000 17.331 22.000 17.498 L 22.000 17.996 C 22.000 20.456 17.694 21.941 12.323 21.998 L 12.000 22.000 C 6.480 22.000 2.000 20.505 2.000 17.997 L 2.000 17.497 C 2.000 17.330 2.042 17.166 2.121 17.020 L 10.260 2.015 C 10.615 1.388 11.280 1.000 12.000 1.000"),
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
        return _cone!!
    }

private var _cone: ImageVector? = null
