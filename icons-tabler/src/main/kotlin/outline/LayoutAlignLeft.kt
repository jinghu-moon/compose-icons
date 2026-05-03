package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignLeft: ImageVector
    get() {
        if (_layoutAlignLeft != null) return _layoutAlignLeft!!
        _layoutAlignLeft = tablerOutlineIcon(
            name = "LayoutAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 4.000 L 4.000 20.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 11.000 C 8.000 9.895 8.895 9.000 10.000 9.000 L 18.000 9.000 C 19.105 9.000 20.000 9.895 20.000 11.000 L 20.000 13.000 C 20.000 14.105 19.105 15.000 18.000 15.000 L 10.000 15.000 C 8.895 15.000 8.000 14.105 8.000 13.000 L 8.000 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _layoutAlignLeft!!
    }

private var _layoutAlignLeft: ImageVector? = null
