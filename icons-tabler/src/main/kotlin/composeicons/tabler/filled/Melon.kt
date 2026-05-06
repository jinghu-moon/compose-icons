package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Melon: ImageVector
    get() {
        if (_melon != null) return _melon!!
        _melon = tablerFilledIcon(
            name = "Melon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.77 2.62c.196-.187 .459-.287 .73-.277 .271 .01 .526 .13 .706 .332 1.803 2.014 2.798 4.623 2.794 7.326C21 16.075 16.075 21 10.001 21 7.129 21.004 4.37 19.881 2.317 17.873c-.194-.189-.303-.45-.301-.721 .002-.271 .113-.53 .309-.717L6.668 12.282c.375-.359 .963-.37 1.352-.027 1.169 1.031 2.933 .996 4.059-.082 1.126-1.078 1.24-2.838 .261-4.051-.326-.405-.287-.991 .088-1.35Z"),
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
        return _melon!!
    }

private var _melon: ImageVector? = null
