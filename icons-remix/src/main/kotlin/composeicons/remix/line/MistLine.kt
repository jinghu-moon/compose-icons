package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MistLine: ImageVector
    get() {
        if (_mistLine != null) return _mistLine!!
        _mistLine = remixIcon(
            name = "MistLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 4h4v2h-4v-2ZM16 19h4v2h-4v-2ZM2 9h5v2h-5v-2ZM9 9h3v2h-3v-2ZM14 9h6v2h-6v-2ZM4 14h6v2h-6v-2ZM12 14h3v2h-3v-2ZM17 14h5v2h-5v-2ZM10 4h12v2h-12v-2ZM2 19h12v2h-12v-2Z"),
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
        return _mistLine!!
    }

private var _mistLine: ImageVector? = null
