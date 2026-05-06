package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VideoOffLine: ImageVector
    get() {
        if (_videoOffLine != null) return _videoOffLine!!
        _videoOffLine = remixIcon(
            name = "VideoOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 18.414l4.192 4.193 1.414-1.414L2.808 1.393 1.393 2.808 2.586 4h-.586c-.552 0-1 .448-1 1v14c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-.586ZM15 16.414v1.586h-12v-12h1.586L15 16.414ZM23 18.04c0 .212-.125 .378-.292 .455L21 16.786v-7.945l-4 2.8v1.145l-2-2v-4.786h-4.786l-2-2h7.786c.552 0 1 .448 1 1v4.2L22.213 5.551c.331-.232 .787 .005 .787 .41v12.079Z"),
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
        return _videoOffLine!!
    }

private var _videoOffLine: ImageVector? = null
