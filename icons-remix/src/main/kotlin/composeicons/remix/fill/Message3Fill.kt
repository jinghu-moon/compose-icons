package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Message3Fill: ImageVector
    get() {
        if (_message3Fill != null) return _message3Fill!!
        _message3Fill = remixIcon(
            name = "Message3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 8.994C2 5.683 4.677 3 8.001 3h7.999C19.313 3 22 5.695 22 8.994v12.006h-13.999C4.687 21 2 18.305 2 15.006v-6.013ZM14 11v2h2v-2h-2ZM8 11v2h2v-2h-2Z"),
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
        return _message3Fill!!
    }

private var _message3Fill: ImageVector? = null
