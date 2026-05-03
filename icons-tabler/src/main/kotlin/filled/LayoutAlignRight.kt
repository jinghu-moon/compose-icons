package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignRight: ImageVector
    get() {
        if (_layoutAlignRight != null) return _layoutAlignRight!!
        _layoutAlignRight = tablerFilledIcon(
            name = "LayoutAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 C 19.448 21.000 19.000 20.552 19.000 20.000 L 19.000 4.000 C 19.000 3.448 19.448 3.000 20.000 3.000"),
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
                pathData = parseSvgPathData("M 14.000 8.000 C 15.657 8.000 17.000 9.343 17.000 11.000 L 17.000 13.000 C 17.000 14.657 15.657 16.000 14.000 16.000 L 6.000 16.000 C 4.343 16.000 3.000 14.657 3.000 13.000 L 3.000 11.000 C 3.000 9.343 4.343 8.000 6.000 8.000 Z"),
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
        return _layoutAlignRight!!
    }

private var _layoutAlignRight: ImageVector? = null
