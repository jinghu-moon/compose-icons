package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandVerticalFill: ImageVector
    get() {
        if (_expandVerticalFill != null) return _expandVerticalFill!!
        _expandVerticalFill = remixIcon(
            name = "ExpandVerticalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .5l4.95 4.95L13 5.448v4.551h-2v-4.552L7.052 5.447 12 .5ZM11 14v4.55h-3.949L12 23.5l4.95-4.95-3.95-0v-4.55h-2Z"),
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
        return _expandVerticalFill!!
    }

private var _expandVerticalFill: ImageVector? = null
