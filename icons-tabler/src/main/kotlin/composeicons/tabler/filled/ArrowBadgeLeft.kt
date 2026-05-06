package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeLeft: ImageVector
    get() {
        if (_arrowBadgeLeft != null) return _arrowBadgeLeft!!
        _arrowBadgeLeft = tablerFilledIcon(
            name = "ArrowBadgeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 6h-6c-.303 0-.59 .138-.78 .375l-4 5c-.293 .365-.293 .885 0 1.25l4 5c.19 .237 .477 .375 .78 .375h6l.112-.006c.362-.041 .674-.275 .813-.612 .139-.337 .084-.723-.144-1.007L14.28 12 17.78 7.625c.24-.3 .287-.711 .121-1.058C17.735 6.221 17.384 6 17 6Z"),
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
        return _arrowBadgeLeft!!
    }

private var _arrowBadgeLeft: ImageVector? = null
