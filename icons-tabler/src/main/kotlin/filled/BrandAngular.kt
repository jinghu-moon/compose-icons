package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) return _brandAngular!!
        _brandAngular = tablerFilledIcon(
            name = "BrandAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.665 2.174 L 20.065 4.786 C 20.959 5.102 21.509 6.002 21.381 6.942 L 20.058 16.645 C 19.974 17.262 19.608 17.804 19.068 18.113 L 12.992 21.584 C 12.377 21.935 11.623 21.935 11.008 21.584 L 4.932 18.114 C 4.443 17.835 4.095 17.363 3.972 16.814 L 3.942 16.647 L 2.620 6.943 C 2.492 6.003 3.042 5.103 3.936 4.787 L 11.336 2.174 C 11.766 2.022 12.236 2.022 12.666 2.174M 12.937 6.649 C 12.613 5.784 11.389 5.784 11.065 6.649 L 8.065 14.649 C 7.871 15.166 8.133 15.742 8.650 15.936 L 8.761 15.971 C 9.254 16.093 9.759 15.826 9.937 15.351 L 10.443 14.000 L 13.556 14.000 L 14.064 15.352 C 14.242 15.827 14.747 16.094 15.240 15.972 L 15.351 15.937 C 15.868 15.743 16.130 15.167 15.936 14.650 ZM 12.000 9.848 L 12.807 11.999 L 11.193 11.999 Z"),
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
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
