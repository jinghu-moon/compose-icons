package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RewindMiniLine: ImageVector
    get() {
        if (_rewindMiniLine != null) return _rewindMiniLine!!
        _rewindMiniLine = remixIcon(
            name = "RewindMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 9.86 5.968 12l3.032 2.14v-4.28ZM10.909 17.323c-.159 .226-.471 .279-.697 .12L3.079 12.408c-.047-.033-.087-.073-.12-.12-.159-.226-.105-.537 .12-.697L10.212 6.556c.084-.06 .185-.092 .288-.092 .276 0 .5 .224 .5 .5v10.07c0 .103-.032 .204-.092 .288ZM18 14.14v-4.28L14.968 12l3.032 2.14ZM12.079 12.408c-.047-.033-.087-.073-.12-.12-.159-.226-.105-.537 .12-.697L19.212 6.556c.084-.06 .185-.092 .288-.092 .276 0 .5 .224 .5 .5v10.07c0 .103-.032 .204-.091 .288-.159 .226-.471 .279-.697 .12L12.079 12.408Z"),
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
        return _rewindMiniLine!!
    }

private var _rewindMiniLine: ImageVector? = null
