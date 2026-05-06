package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lungs: ImageVector
    get() {
        if (_lungs != null) return _lungs!!
        _lungs = tablerFilledIcon(
            name = "Lungs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c.552 0 1 .448 1 1v5c0 .715 .381 1.375 1 1.732v-3.475C14 6.015 14.995 5 16.233 5c.372 0 .738 .094 1.122 .307l.18 .117c1.695 1.23 2.76 3.035 3.773 6.34q.674 2.204 .692 5.06c.016 2.195-1.657 4.024-3.843 4.168L17.92 21C15.75 21 14 19.213 14 17.02v-4.146c-.722-.187-1.378-.572-1.893-1.112L12 11.644l-.107 .118c-.515 .54-1.17 .925-1.892 1.112L10 17.02C10 19.213 8.25 21 6.081 21l-.268-.01C3.658 20.848 1.986 19.019 2.002 16.825q.018-2.858 .692-5.06C3.705 8.458 4.77 6.653 6.516 5.39l.188-.117C7.03 5.093 7.396 5 7.768 5 9.005 5 10 6.015 10 7.257l.001 3.475C10.619 10.374 11 9.714 11 9v-5c0-.552 .448-1 1-1"),
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
        return _lungs!!
    }

private var _lungs: ImageVector? = null
