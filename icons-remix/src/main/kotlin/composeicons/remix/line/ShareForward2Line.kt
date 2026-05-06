package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareForward2Line: ImageVector
    get() {
        if (_shareForward2Line != null) return _shareForward2Line!!
        _shareForward2Line = remixIcon(
            name = "ShareForward2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 19h16v-5h2v6c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-6h2v5ZM16.172 7 12.222 3.05 13.636 1.636 20 8l-6.364 6.364L12.222 12.95 16.172 9h-11.172v-2h11.172Z"),
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
        return _shareForward2Line!!
    }

private var _shareForward2Line: ImageVector? = null
