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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.292 0 6 2.435 6 5.5 0 1.337-.515 2.554-1.369 3.5h4.369c.552 0 1 .448 1 1 0 3.292-2.435 6-5.5 6C15.164 18 13.947 17.485 13 16.632v4.368c0 .552-.448 1-1 1C8.708 22 6 19.565 6 16.5 6 15.164 6.515 13.947 7.368 13h-4.368C2.448 13 2 12.552 2 12 2 8.708 4.435 6 7.5 6 8.837 6 10.054 6.515 11 7.369v-4.369c0-.552 .448-1 1-1Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
