package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Crop32: ImageVector
    get() {
        if (_crop32 != null) return _crop32!!
        _crop32 = tablerFilledIcon(
            name = "Crop32",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 6.000 C 19.657 6.000 21.000 7.343 21.000 9.000 L 21.000 15.000 C 21.000 16.657 19.657 18.000 18.000 18.000 L 6.000 18.000 C 4.343 18.000 3.000 16.657 3.000 15.000 L 3.000 9.000 C 3.000 7.343 4.343 6.000 6.000 6.000 Z"),
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
        return _crop32!!
    }

private var _crop32: ImageVector? = null
