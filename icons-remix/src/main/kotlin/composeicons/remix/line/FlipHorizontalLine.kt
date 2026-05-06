package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlipHorizontalLine: ImageVector
    get() {
        if (_flipHorizontalLine != null) return _flipHorizontalLine!!
        _flipHorizontalLine = remixIcon(
            name = "FlipHorizontalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2v20h2v-20h-2ZM2 6C2 4.895 2.895 4 4 4h3c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-3C2.895 20 2 19.105 2 18v-12ZM20 6v12h-3v-12h3ZM17 4c-1.105 0-2 .895-2 2v12c0 1.105 .895 2 2 2h3c1.105 0 2-.895 2-2v-12C22 4.895 21.105 4 20 4h-3Z"),
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
        return _flipHorizontalLine!!
    }

private var _flipHorizontalLine: ImageVector? = null
