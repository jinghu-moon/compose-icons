package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonFoggyFill: ImageVector
    get() {
        if (_moonFoggyFill != null) return _moonFoggyFill!!
        _moonFoggyFill = remixIcon(
            name = "MoonFoggyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 20.334v-2.334h-2v-4h-10.668C3.116 13.203 3 12.365 3 11.5 3 6.94 6.213 3.13 10.5 2.211 10.177 3.079 10 4.019 10 5 10 9.418 13.582 13 18 13c1.453 0 2.816-.387 3.99-1.065-.172 3.822-2.604 7.056-5.99 8.399ZM7 20h7v2h-7v-2ZM2 16h10v2h-10v-2Z"),
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
        return _moonFoggyFill!!
    }

private var _moonFoggyFill: ImageVector? = null
