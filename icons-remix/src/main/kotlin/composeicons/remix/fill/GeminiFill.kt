package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GeminiFill: ImageVector
    get() {
        if (_geminiFill != null) return _geminiFill!!
        _geminiFill = remixIcon(
            name = "GeminiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 12.024C17.562 12.412 12.411 17.563 12.023 24h-.047C11.588 17.563 6.437 12.412 0 12.024v-.047C6.437 11.588 11.588 6.437 11.976 0h.047c.388 6.437 5.539 11.588 11.976 11.976v.047Z"),
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
        return _geminiFill!!
    }

private var _geminiFill: ImageVector? = null
