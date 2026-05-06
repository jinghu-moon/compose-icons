package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlipHorizontalFill: ImageVector
    get() {
        if (_flipHorizontalFill != null) return _flipHorizontalFill!!
        _flipHorizontalFill = remixIcon(
            name = "FlipHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2v20h2v-20h-2ZM7 6v12h-3v-12h3ZM4 4C2.895 4 2 4.895 2 6v12c0 1.105 .895 2 2 2h3c1.105 0 2-.895 2-2v-12C9 4.895 8.105 4 7 4h-3ZM15 6c0-1.105 .895-2 2-2h3c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-3c-1.105 0-2-.895-2-2v-12Z"),
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
        return _flipHorizontalFill!!
    }

private var _flipHorizontalFill: ImageVector? = null
