package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = tablerFilledIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 15.292 2.000 18.000 4.435 18.000 7.500 C 18.000 8.837 17.485 10.054 16.631 11.000 L 21.000 11.000 C 21.552 11.000 22.000 11.448 22.000 12.000 C 22.000 15.292 19.565 18.000 16.500 18.000 C 15.164 18.000 13.947 17.485 13.000 16.632 L 13.000 21.000 C 13.000 21.552 12.552 22.000 12.000 22.000 C 8.708 22.000 6.000 19.565 6.000 16.500 C 6.000 15.164 6.515 13.947 7.368 13.000 L 3.000 13.000 C 2.448 13.000 2.000 12.552 2.000 12.000 C 2.000 8.708 4.435 6.000 7.500 6.000 C 8.837 6.000 10.054 6.515 11.000 7.369 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
