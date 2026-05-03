package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Label: ImageVector
    get() {
        if (_label != null) return _label!!
        _label = tablerFilledIcon(
            name = "Label",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.520 6.000 C 17.127 6.000 17.701 6.276 18.081 6.750 L 21.781 11.375 C 22.073 11.740 22.073 12.260 21.781 12.625 L 18.081 17.249 C 17.702 17.723 17.127 18.000 16.520 18.000 L 6.000 18.000 C 4.343 18.000 3.000 16.657 3.000 15.000 L 3.000 9.000 C 3.000 7.343 4.343 6.000 6.000 6.000 Z"),
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
        return _label!!
    }

private var _label: ImageVector? = null
