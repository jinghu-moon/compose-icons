package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = tablerFilledIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.327 2.26C9.682 3.757 8.041 5.259 6.404 6.764 5.778 7.364 5.192 7.974 4.63 8.607c-2.048 2.325-2.18 5.771-.314 8.245l.14 .177c1.012 1.205 2.561 1.755 4.055 1.574l.246-.037-.706 2.118c-.102 .305-.05 .64 .138 .901 .188 .261 .49 .415 .811 .415h6l.118-.007c.299-.036 .565-.204 .726-.458 .161-.254 .199-.567 .104-.852l-.688-2.065 .104 .02c1.589 .25 3.262-.387 4.32-1.785 1.866-2.473 1.736-5.917-.311-8.243C18.811 7.977 18.224 7.366 17.613 6.78L12.675 2.262c-.382-.349-.966-.349-1.348-.001Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
