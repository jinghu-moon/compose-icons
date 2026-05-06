package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Building2Line: ImageVector
    get() {
        if (_building2Line != null) return _building2Line!!
        _building2Line = remixIcon(
            name = "Building2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 19v-13.3c0-.421 .263-.796 .658-.94L13.329 1.244c.26-.094 .546 .04 .641 .299 .02 .055 .03 .113 .03 .171v4.953l6.316 2.105c.408 .136 .684 .518 .684 .949v9.279h2v2h-22v-2h2ZM5 19h7v-15.145L5 6.401v12.599ZM19 19v-8.558L14 8.775v10.225h5Z"),
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
        return _building2Line!!
    }

private var _building2Line: ImageVector? = null
