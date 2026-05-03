package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeLeft: ImageVector
    get() {
        if (_arrowBadgeLeft != null) return _arrowBadgeLeft!!
        _arrowBadgeLeft = tablerFilledIcon(
            name = "ArrowBadgeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 6.000 L 11.000 6.000 C 10.697 6.000 10.410 6.138 10.220 6.375 L 6.220 11.375 C 5.927 11.740 5.927 12.260 6.220 12.625 L 10.220 17.625 C 10.410 17.862 10.697 18.000 11.000 18.000 L 17.000 18.000 L 17.112 17.994 C 17.474 17.953 17.786 17.719 17.925 17.382 C 18.064 17.045 18.009 16.659 17.781 16.375 L 14.280 12.000 L 17.780 7.625 C 18.020 7.325 18.067 6.914 17.901 6.567 C 17.735 6.221 17.384 6.000 17.000 6.000 Z"),
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
        return _arrowBadgeLeft!!
    }

private var _arrowBadgeLeft: ImageVector? = null
