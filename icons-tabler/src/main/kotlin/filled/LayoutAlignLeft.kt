package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignLeft: ImageVector
    get() {
        if (_layoutAlignLeft != null) return _layoutAlignLeft!!
        _layoutAlignLeft = tablerFilledIcon(
            name = "LayoutAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 3.000 C 4.552 3.000 5.000 3.448 5.000 4.000 L 5.000 20.000 C 5.000 20.552 4.552 21.000 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 8.000 C 19.657 8.000 21.000 9.343 21.000 11.000 L 21.000 13.000 C 21.000 14.657 19.657 16.000 18.000 16.000 L 10.000 16.000 C 8.343 16.000 7.000 14.657 7.000 13.000 L 7.000 11.000 C 7.000 9.343 8.343 8.000 10.000 8.000 Z"),
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
        return _layoutAlignLeft!!
    }

private var _layoutAlignLeft: ImageVector? = null
