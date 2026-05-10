package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HammerFill: ImageVector
    get() {
        if (_hammerFill != null) return _hammerFill!!
        _hammerFill = remixIcon(
            name = "HammerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 8v-6h3c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-3ZM15 22c0 .552-.448 1-1 1h-4C9.448 23 9 22.552 9 22v-14h-6.5v-1.926c0-.356 .189-.685 .496-.864L8.5 2h6.5v20Z"),
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
        return _hammerFill!!
    }

private var _hammerFill: ImageVector? = null
