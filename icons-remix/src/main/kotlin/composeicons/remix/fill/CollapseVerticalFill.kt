package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseVerticalFill: ImageVector
    get() {
        if (_collapseVerticalFill != null) return _collapseVerticalFill!!
        _collapseVerticalFill = remixIcon(
            name = "CollapseVerticalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 13.5l4.95 4.95-3.95-.001v4.551h-2v-4.552L7.052 18.447l4.947-4.947ZM11 1v4.55L7.05 5.55 12 10.5 16.95 5.55 13 5.55v-4.55h-2Z"),
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
        return _collapseVerticalFill!!
    }

private var _collapseVerticalFill: ImageVector? = null
