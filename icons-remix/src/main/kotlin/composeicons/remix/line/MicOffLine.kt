package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicOffLine: ImageVector
    get() {
        if (_micOffLine != null) return _micOffLine!!
        _micOffLine = remixIcon(
            name = "MicOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.425 17.839l4.768 4.768 1.414-1.414L2.808 1.393 1.394 2.808 7 8.414v1.586c0 2.761 2.239 5 5 5 .482 0 .949-.068 1.39-.196l1.55 1.55c-.894 .414-1.89 .646-2.94 .646C8.474 17 5.556 14.392 5.071 11h-2.016c.461 4.172 3.773 7.484 7.945 7.945v4.055h2v-4.055c1.234-.136 2.393-.522 3.425-1.106ZM11.553 12.967C10.254 12.773 9.227 11.746 9.033 10.447l2.52 2.52ZM19.375 15.16 17.932 13.718c.508-.81 .856-1.731 .997-2.718h2.016c-.17 1.537-.726 2.957-1.57 4.16ZM16.466 12.251 14.917 10.703c.054-.226 .083-.461 .083-.703v-4c0-1.657-1.343-3-3-3C10.706 3 9.603 3.82 9.182 4.968L7.686 3.471C8.554 1.993 10.161 1 12 1c2.761 0 5 2.239 5 5v4c0 .81-.193 1.575-.534 2.251Z"),
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
        return _micOffLine!!
    }

private var _micOffLine: ImageVector? = null
