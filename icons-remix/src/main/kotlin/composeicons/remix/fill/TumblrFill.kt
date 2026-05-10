package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TumblrFill: ImageVector
    get() {
        if (_tumblrFill != null) return _tumblrFill!!
        _tumblrFill = remixIcon(
            name = "TumblrFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.271 7.63C8.868 7.073 10.816 4.764 10.816 2h3.03v5.152h3.636v3.636h-3.636v5.454c0 .514 .198 1.207 .909 1.667 .474 .306 1.484 .458 3.03 .455v3.636h-4.243C11.033 22 8.998 19.965 8.998 17.455v-6.667h-2.727v-3.158Z"),
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
        return _tumblrFill!!
    }

private var _tumblrFill: ImageVector? = null
