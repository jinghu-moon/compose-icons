package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandHorizontalFill: ImageVector
    get() {
        if (_expandHorizontalFill != null) return _expandHorizontalFill!!
        _expandHorizontalFill = remixIcon(
            name = "ExpandHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M.5 12 5.45 7.05 5.449 11h4.551v2h-4.552l-.001 3.947L.5 12ZM14 13h4.55l-0 3.949 4.95-4.95L18.55 7.05 18.55 11h-4.55v2Z"),
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
        return _expandHorizontalFill!!
    }

private var _expandHorizontalFill: ImageVector? = null
