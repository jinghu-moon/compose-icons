package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignMiddle: ImageVector
    get() {
        if (_layoutAlignMiddle != null) return _layoutAlignMiddle!!
        _layoutAlignMiddle = tablerFilledIcon(
            name = "LayoutAlignMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 5c1.657 0 3 1.343 3 3v3h4c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-4v3c0 1.657-1.343 3-3 3h-2C9.343 19 8 17.657 8 16v-3h-4C3.448 13 3 12.552 3 12c0-.552 .448-1 1-1h4v-3C8 6.343 9.343 5 11 5Z"),
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
        return _layoutAlignMiddle!!
    }

private var _layoutAlignMiddle: ImageVector? = null
