package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DislikeFill: ImageVector
    get() {
        if (_dislikeFill != null) return _dislikeFill!!
        _dislikeFill = remixIcon(
            name = "DislikeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.808 1.393 21.192 19.778l-1.414 1.414L16.032 17.445 12 21.485 3.522 12.993C1.482 10.709 1.493 7.24 3.555 4.97L1.394 2.808 2.808 1.393ZM20.243 4.757c2.263 2.267 2.34 5.88 .236 8.236l-1.635 1.636L7.26 3.046c1.669-.206 3.408 .288 4.741 1.483 2.349-2.109 5.979-2.039 8.242 .229Z"),
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
        return _dislikeFill!!
    }

private var _dislikeFill: ImageVector? = null
