package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Contrast2: ImageVector
    get() {
        if (_contrast2 != null) return _contrast2!!
        _contrast2 = tablerFilledIcon(
            name = "Contrast2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 19.000 4.000 L 5.000 4.000 C 4.448 4.000 4.000 4.448 4.000 5.000 L 4.000 19.000 C 4.000 19.463 4.318 19.866 4.769 19.973 C 8.268 19.626 11.851 15.846 11.995 12.226 L 12.000 12.000 C 12.000 8.313 15.660 4.381 19.232 4.026 C 19.156 4.008 19.078 4.000 19.000 4.000"),
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
        return _contrast2!!
    }

private var _contrast2: ImageVector? = null
