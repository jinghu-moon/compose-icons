package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemixiconLine: ImageVector
    get() {
        if (_remixiconLine != null) return _remixiconLine!!
        _remixiconLine = remixIcon(
            name = "RemixiconLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.365 6l8.784 9.663 .721-.283c1.684-.661 2.863-2.156 3.091-3.896-.152 .011-.306 .016-.46 .016C15.251 11.5 12.558 9.115 12.077 6h-5.713ZM14.001 5c0 2.485 2.015 4.5 4.5 4.5 .805 0 1.561-.211 2.215-.582 .186 .617 .285 1.271 .285 1.947 0 2.891-1.822 5.364-4.4 6.376L20.001 21h-17v-17h11c.037 0 .074 0 .111 .001-.073 .321-.111 .656-.111 .999ZM18.501 7.5C17.12 7.5 16.001 6.381 16.001 5c0-1.381 1.119-2.5 2.5-2.5 1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5ZM5.001 7.47v11.53h10.48L5.001 7.47Z"),
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
        return _remixiconLine!!
    }

private var _remixiconLine: ImageVector? = null
