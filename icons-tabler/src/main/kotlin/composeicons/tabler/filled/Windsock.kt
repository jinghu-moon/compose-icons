package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Windsock: ImageVector
    get() {
        if (_windsock != null) return _windsock!!
        _windsock = tablerFilledIcon(
            name = "Windsock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 2c.552 0 1 .448 1 1v1.079l11.083 .924c.518 .043 .917 .477 .917 .997v4c0 .52-.399 .954-.917 .997L7 11.92v8.08h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-4C3.448 22 3 21.552 3 21c0-.552 .448-1 1-1h1v-17C5 2.448 5.448 2 6 2M7 6.086v3.827l3-.25v-3.327ZM14 6.67v2.659l3-.25v-2.159Z"),
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
        return _windsock!!
    }

private var _windsock: ImageVector? = null
