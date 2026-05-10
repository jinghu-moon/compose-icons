package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AncientGateFill: ImageVector
    get() {
        if (_ancientGateFill != null) return _ancientGateFill!!
        _ancientGateFill = remixIcon(
            name = "AncientGateFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.964 3h10.072c.249 1.722 1.724 3 3.464 3 .332 0 .663-.047 .982-.14C21.297 7.644 19.794 9 18 9h-12C4.206 9 2.703 7.644 2.519 5.86 2.837 5.953 3.168 6 3.5 6 5.24 6 6.716 4.722 6.964 3ZM22.979 11.111c-.436 .248-.941 .389-1.479 .389-1.11 0-2.08-.603-2.599-1.5h-13.803c-.519 .897-1.488 1.5-2.599 1.5-.538 0-1.042-.141-1.479-.389C1.007 11.239 1 11.369 1 11.5c0 1.396 .818 2.601 2 3.163v6.336h6v-2c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v2h6v-6.336c1.183-.562 2-1.767 2-3.163 0-.131-.007-.261-.021-.389Z"),
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
        return _ancientGateFill!!
    }

private var _ancientGateFill: ImageVector? = null
