package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) return _labelImportant!!
        _labelImportant = tablerFilledIcon(
            name = "LabelImportant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.520 6.000 C 17.127 6.000 17.701 6.276 18.081 6.750 L 21.781 11.375 C 22.073 11.740 22.073 12.260 21.781 12.625 L 18.081 17.249 C 17.702 17.723 17.127 18.000 16.520 18.000 L 4.000 18.000 C 3.616 18.000 3.265 17.779 3.099 17.433 C 2.933 17.086 2.980 16.675 3.220 16.375 L 6.720 12.000 L 3.220 7.625 C 2.992 7.341 2.936 6.955 3.075 6.618 C 3.214 6.280 3.526 6.046 3.888 6.005 L 4.000 6.000 Z"),
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
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
