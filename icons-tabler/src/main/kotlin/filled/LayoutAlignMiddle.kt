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
                pathData = parseSvgPathData("M 13.000 5.000 C 14.657 5.000 16.000 6.343 16.000 8.000 L 16.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 C 21.000 12.552 20.552 13.000 20.000 13.000 L 16.000 13.000 L 16.000 16.000 C 16.000 17.657 14.657 19.000 13.000 19.000 L 11.000 19.000 C 9.343 19.000 8.000 17.657 8.000 16.000 L 8.000 13.000 L 4.000 13.000 C 3.448 13.000 3.000 12.552 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000 L 8.000 11.000 L 8.000 8.000 C 8.000 6.343 9.343 5.000 11.000 5.000 Z"),
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
