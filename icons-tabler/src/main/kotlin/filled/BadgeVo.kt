package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeVo: ImageVector
    get() {
        if (_badgeVo != null) return _badgeVo!!
        _badgeVo = tablerFilledIcon(
            name = "BadgeVo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 15.500 8.000 C 14.119 8.000 13.000 9.119 13.000 10.500 L 13.000 13.500 C 13.000 14.881 14.119 16.000 15.500 16.000 C 16.881 16.000 18.000 14.881 18.000 13.500 L 18.000 10.500 C 18.000 9.119 16.881 8.000 15.500 8.000M 11.316 8.051 C 11.064 7.967 10.790 7.987 10.552 8.105 C 10.315 8.224 10.135 8.432 10.051 8.684 L 9.000 11.838 L 7.949 8.684 C 7.774 8.160 7.208 7.876 6.684 8.051 C 6.160 8.226 5.876 8.792 6.051 9.316 L 8.051 15.316 C 8.355 16.228 9.645 16.228 9.949 15.316 L 11.949 9.316 C 12.033 9.064 12.013 8.790 11.895 8.552 C 11.776 8.315 11.568 8.135 11.316 8.051M 15.500 10.000 C 15.776 10.000 16.000 10.224 16.000 10.500 L 16.000 13.500 C 16.000 13.776 15.776 14.000 15.500 14.000 C 15.224 14.000 15.000 13.776 15.000 13.500 L 15.000 10.500 C 15.000 10.224 15.224 10.000 15.500 10.000"),
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
        return _badgeVo!!
    }

private var _badgeVo: ImageVector? = null
