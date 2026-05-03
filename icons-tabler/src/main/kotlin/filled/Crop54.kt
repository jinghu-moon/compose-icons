package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Crop54: ImageVector
    get() {
        if (_crop54 != null) return _crop54!!
        _crop54 = tablerFilledIcon(
            name = "Crop54",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 4.000 C 19.657 4.000 21.000 5.343 21.000 7.000 L 21.000 17.000 C 21.000 18.657 19.657 20.000 18.000 20.000 L 6.000 20.000 C 4.343 20.000 3.000 18.657 3.000 17.000 L 3.000 7.000 C 3.000 5.343 4.343 4.000 6.000 4.000 Z"),
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
        return _crop54!!
    }

private var _crop54: ImageVector? = null
