package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseHorizontalFill: ImageVector
    get() {
        if (_collapseHorizontalFill != null) return _collapseHorizontalFill!!
        _collapseHorizontalFill = remixIcon(
            name = "CollapseHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 12 18.45 7.05 18.449 11h4.551v2h-4.552l-.001 3.947L13.5 12ZM1 13h4.55l-0 3.949 4.95-4.95L5.55 7.05 5.55 11h-4.55v2Z"),
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
        return _collapseHorizontalFill!!
    }

private var _collapseHorizontalFill: ImageVector? = null
