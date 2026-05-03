package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorFillIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 80.180 L 232.000 175.820 C 231.987 181.655 228.799 187.019 223.680 189.820 L 135.680 237.990 C 130.901 240.631 125.099 240.631 120.320 237.990 L 32.320 189.820 C 27.201 187.019 24.013 181.655 24.000 175.820 L 24.000 80.180 C 24.013 74.345 27.201 68.981 32.320 66.180 L 120.320 18.010 C 125.099 15.369 130.901 15.369 135.680 18.010 L 223.680 66.180 C 228.799 68.981 231.987 74.345 232.000 80.180 Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
