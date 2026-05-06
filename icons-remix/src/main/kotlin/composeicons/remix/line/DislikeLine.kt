package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DislikeLine: ImageVector
    get() {
        if (_dislikeLine != null) return _dislikeLine!!
        _dislikeLine = remixIcon(
            name = "DislikeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.808 1.393 21.192 19.778l-1.414 1.414L16.032 17.445 12 21.485 3.522 12.993C1.482 10.709 1.493 7.24 3.555 4.97L1.394 2.808 2.808 1.393ZM4.98 11.623 12 18.654l2.618-2.623L4.972 6.386c-1.294 1.496-1.301 3.735 .008 5.237ZM20.243 4.757c2.263 2.267 2.34 5.88 .236 8.236l-1.635 1.636L17.43 13.215l1.59-1.592c1.373-1.577 1.299-3.958-.193-5.453C17.328 4.668 14.908 4.607 13.337 6.017L12.002 7.215 10.666 6.018C10.316 5.704 9.925 5.463 9.511 5.295L7.26 3.046c1.669-.206 3.408 .288 4.741 1.483 2.349-2.109 5.979-2.039 8.242 .229Z"),
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
        return _dislikeLine!!
    }

private var _dislikeLine: ImageVector? = null
