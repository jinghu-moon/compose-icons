package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorThinIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.2 132.81 142.84 113.16 123.19 59.8C121.459 55.116 116.994 52.006 112 52.006c-4.994 0-9.459 3.11-11.19 7.794L81.16 113.16 27.8 132.81c-4.684 1.731-7.794 6.196-7.794 11.19 0 4.994 3.11 9.459 7.794 11.19l53.36 19.65 19.65 53.36c1.731 4.684 6.196 7.794 11.19 7.794 4.994 0 9.459-3.11 11.19-7.794l19.65-53.36 53.36-19.65c4.684-1.731 7.794-6.196 7.794-11.19 0-4.994-3.11-9.459-7.794-11.19ZM193.43 147.68 138.35 168c-1.099 .405-1.965 1.271-2.37 2.37l-20.3 55.08c-.566 1.543-2.036 2.569-3.68 2.569-1.644 0-3.114-1.026-3.68-2.569L88 170.35c-.405-1.087-1.263-1.945-2.35-2.35L30.57 147.7c-1.543-.566-2.569-2.036-2.569-3.68 0-1.644 1.026-3.114 2.569-3.68L85.65 120c1.087-.405 1.945-1.263 2.35-2.35L108.3 62.57c.566-1.543 2.036-2.569 3.68-2.569 1.644 0 3.114 1.026 3.68 2.569L136 117.65c.405 1.099 1.271 1.965 2.37 2.37l55.08 20.3c1.543 .566 2.569 2.036 2.569 3.68 0 1.644-1.026 3.114-2.569 3.68ZM148 40c0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4ZM244 88c0 2.209-1.791 4-4 4h-12v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h12c2.209 0 4 1.791 4 4Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
