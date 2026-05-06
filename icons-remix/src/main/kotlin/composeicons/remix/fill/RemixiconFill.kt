package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RemixiconFill: ImageVector
    get() {
        if (_remixiconFill != null) return _remixiconFill!!
        _remixiconFill = remixIcon(
            name = "RemixiconFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.53 17.529 20.001 21h-17v-17h10.667v.008C13.778 4.003 13.889 4 14.001 4c.045 0 .091 0 .136 .001-.089 .37-.136 .76-.136 1.165 0 2.319 2.015 4.333 4.667 4.333 .724 0 1.419-.197 2.032-.538 .196 .645 .301 1.329 .301 2.038 0 2.974-1.855 5.515-4.471 6.529ZM18.501 7.5C17.12 7.5 16.001 6.381 16.001 5c0-1.381 1.119-2.5 2.5-2.5 1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5Z"),
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
        return _remixiconFill!!
    }

private var _remixiconFill: ImageVector? = null
