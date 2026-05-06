package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PerplexityFill: ImageVector
    get() {
        if (_perplexityFill != null) return _perplexityFill!!
        _perplexityFill = remixIcon(
            name = "PerplexityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.735 2l5.695 5.247v-.001-5.234h1.109v5.259L18.259 2v5.983h2.349v8.629h-2.341v5.327L12.538 16.907v5.09h-1.109v-5.007L5.741 22v-5.388h-2.349v-8.629h2.342v-5.983ZM10.594 9.078h-6.093v6.439h1.239v-2.031L10.594 9.078ZM6.85 13.972v5.585l4.58-4.034v-5.711L6.85 13.972ZM12.57 15.469l4.587 4.03v-2.888h-.006v-2.645L12.57 9.806v5.663ZM18.266 15.517h1.233v-6.439h-6.048l4.815 4.362v2.077ZM17.15 7.983v-3.464L13.391 7.983h3.759ZM10.603 7.983 6.843 4.519v3.464h3.759Z"),
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
        return _perplexityFill!!
    }

private var _perplexityFill: ImageVector? = null
