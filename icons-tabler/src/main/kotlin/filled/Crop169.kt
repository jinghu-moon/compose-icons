package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Crop169: ImageVector
    get() {
        if (_crop169 != null) return _crop169!!
        _crop169 = tablerFilledIcon(
            name = "Crop169",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 7.000 C 19.657 7.000 21.000 8.343 21.000 10.000 L 21.000 14.000 C 21.000 15.657 19.657 17.000 18.000 17.000 L 6.000 17.000 C 4.343 17.000 3.000 15.657 3.000 14.000 L 3.000 10.000 C 3.000 8.343 4.343 7.000 6.000 7.000 Z"),
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
        return _crop169!!
    }

private var _crop169: ImageVector? = null
