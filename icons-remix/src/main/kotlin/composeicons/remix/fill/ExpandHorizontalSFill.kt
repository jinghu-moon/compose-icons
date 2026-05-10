package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandHorizontalSFill: ImageVector
    get() {
        if (_expandHorizontalSFill != null) return _expandHorizontalSFill!!
        _expandHorizontalSFill = remixIcon(
            name = "ExpandHorizontalSFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.45 7.05 2.5 12l4.947 4.947 .001-3.947h9.102l-0 3.949 4.95-4.95L16.55 7.05l-0 3.95h-9.101L7.45 7.05Z"),
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
        return _expandHorizontalSFill!!
    }

private var _expandHorizontalSFill: ImageVector? = null
