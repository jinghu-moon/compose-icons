package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Artboard2Line: ImageVector
    get() {
        if (_artboard2Line != null) return _artboard2Line!!
        _artboard2Line = remixIcon(
            name = "Artboard2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 8v8h8v-8h-8ZM6 6h12v12h-12v-12ZM6 2h2v3h-2v-3ZM6 19h2v3h-2v-3ZM2 6h3v2h-3v-2ZM2 16h3v2h-3v-2ZM19 6h3v2h-3v-2ZM19 16h3v2h-3v-2ZM16 2h2v3h-2v-3ZM16 19h2v3h-2v-3Z"),
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
        return _artboard2Line!!
    }

private var _artboard2Line: ImageVector? = null
