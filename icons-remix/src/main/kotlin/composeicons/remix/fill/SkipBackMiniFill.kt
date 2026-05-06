package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkipBackMiniFill: ImageVector
    get() {
        if (_skipBackMiniFill != null) return _skipBackMiniFill!!
        _skipBackMiniFill = remixIcon(
            name = "SkipBackMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1C6.448 18 6 17.552 6 17v-10C6 6.448 6.448 6 7 6ZM9.079 12.408c-.047-.033-.087-.074-.12-.12-.159-.226-.105-.537 .12-.697L16.212 6.556c.084-.06 .185-.092 .288-.092 .276 0 .5 .224 .5 .5v10.07c0 .103-.032 .204-.091 .288-.159 .226-.471 .279-.697 .12L9.079 12.408Z"),
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
        return _skipBackMiniFill!!
    }

private var _skipBackMiniFill: ImageVector? = null
