package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ForwardEndMiniLine: ImageVector
    get() {
        if (_forwardEndMiniLine != null) return _forwardEndMiniLine!!
        _forwardEndMiniLine = remixIcon(
            name = "ForwardEndMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 6c-.552 0-1 .448-1 1v10c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-10C22 6.448 21.552 6 21 6ZM4 9.86l3.032 2.14L4 14.14v-4.28ZM2.5 17.535c.103 0 .204-.032 .288-.092L9.921 12.408c.226-.159 .279-.471 .12-.697-.033-.047-.074-.087-.12-.12L2.788 6.556c-.226-.159-.538-.105-.697 .12C2.032 6.761 2 6.862 2 6.965v10.07c0 .276 .224 .5 .5 .5ZM16.032 12 13 14.14v-4.28l3.032 2.14ZM11.092 6.677C11.032 6.761 11 6.862 11 6.965v10.07c0 .276 .224 .5 .5 .5 .103 0 .204-.032 .288-.092l7.133-5.035c.226-.159 .279-.471 .12-.697-.033-.047-.074-.087-.12-.12L11.788 6.556c-.226-.159-.537-.105-.697 .12Z"),
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
        return _forwardEndMiniLine!!
    }

private var _forwardEndMiniLine: ImageVector? = null
