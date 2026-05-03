package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorFillIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 164.000 C 240.001 205.215 207.152 238.920 165.951 239.978 C 124.749 241.035 90.214 209.061 88.100 167.900 C 47.193 165.798 15.310 131.655 16.011 90.700 C 16.712 49.744 49.744 16.712 90.700 16.011 C 131.655 15.310 165.798 47.193 167.900 88.100 C 208.282 90.225 239.950 123.562 240.000 164.000 Z"),
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
        return _unite!!
    }

private var _unite: ImageVector? = null
