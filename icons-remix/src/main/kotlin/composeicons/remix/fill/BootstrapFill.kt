package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BootstrapFill: ImageVector
    get() {
        if (_bootstrapFill != null) return _bootstrapFill!!
        _bootstrapFill = remixIcon(
            name = "BootstrapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.423 3.038C4.139 3.038 3.19 4.162 3.232 5.38c.041 1.171-.012 2.687-.394 3.924C2.455 10.544 1.808 11.33 .75 11.431v1.139c1.058 .101 1.705 .887 2.088 2.127 .382 1.237 .435 2.753 .394 3.924-.043 1.219 .907 2.342 2.191 2.342h13.155c1.284 0 2.234-1.124 2.191-2.342-.041-1.171 .012-2.687 .394-3.924 .383-1.24 1.029-2.026 2.087-2.127v-1.139c-1.058-.101-1.704-.887-2.087-2.127C20.782 8.068 20.729 6.551 20.77 5.38 20.812 4.162 19.862 3.038 18.578 3.038h-13.155 0ZM16.004 14.071c0 1.678-1.252 2.696-3.329 2.696h-3.536c-.101 0-.198-.04-.27-.112-.072-.072-.112-.169-.112-.27v-8.771c0-.101 .04-.198 .112-.27 .072-.072 .169-.112 .27-.112h3.516c1.732 0 2.868 .938 2.868 2.379 0 1.011-.765 1.916-1.739 2.075v.053c1.326 .145 2.219 1.064 2.219 2.332ZM12.29 8.442h-2.016v2.848h1.698c1.313 0 2.036-.529 2.036-1.473 0-.885-.622-1.374-1.718-1.374ZM10.274 12.42v3.138h2.09c1.367 0 2.091-.548 2.091-1.579 0-1.031-.744-1.559-2.178-1.559l-2.002 0Z"),
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
        return _bootstrapFill!!
    }

private var _bootstrapFill: ImageVector? = null
