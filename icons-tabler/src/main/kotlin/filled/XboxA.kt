package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxA: ImageVector
    get() {
        if (_xboxA != null) return _xboxA!!
        _xboxA = tablerFilledIcon(
            name = "XboxA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 12.936 7.649 C 12.612 6.784 11.388 6.784 11.064 7.649 L 8.064 15.649 C 7.870 16.166 8.132 16.742 8.649 16.936 L 8.760 16.971 C 9.253 17.093 9.758 16.826 9.936 16.351 L 10.443 15.000 L 13.557 15.000 L 14.064 16.351 C 14.183 16.695 14.478 16.947 14.837 17.010 C 15.195 17.073 15.559 16.936 15.787 16.653 C 16.016 16.370 16.073 15.986 15.936 15.649 ZM 12.000 10.848 L 12.807 13.000 L 11.193 13.000 Z"),
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
        return _xboxA!!
    }

private var _xboxA: ImageVector? = null
