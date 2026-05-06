package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorThinIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c.002 1.548-.89 2.958-2.29 3.62l-152 72c-.533 .256-1.118 .386-1.71 .38-1.875 .004-3.501-1.295-3.911-3.124-.411-1.829 .505-3.698 2.201-4.496L206.66 128 62.29 59.62c-1.945-.973-2.757-3.322-1.827-5.288 .93-1.966 3.261-2.829 5.247-1.942l152 72c1.396 .66 2.288 2.065 2.29 3.61Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
