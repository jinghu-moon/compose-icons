package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MistFill: ImageVector
    get() {
        if (_mistFill != null) return _mistFill!!
        _mistFill = remixIcon(
            name = "MistFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 4h4v2h-4v-2ZM16 19h4v2h-4v-2ZM2 9h10v2h-10v-2ZM14 9h6v2h-6v-2ZM4 14h6v2h-6v-2ZM12 14h10v2h-10v-2ZM10 4h12v2h-12v-2ZM2 19h12v2h-12v-2Z"),
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
        return _mistFill!!
    }

private var _mistFill: ImageVector? = null
