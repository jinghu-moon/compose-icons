package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SoundModuleFill: ImageVector
    get() {
        if (_soundModuleFill != null) return _soundModuleFill!!
        _soundModuleFill = remixIcon(
            name = "SoundModuleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 18v3h-2v-3h-2v-3h6v3h-2ZM5 18v3h-2v-3h-2v-3h6v3h-2ZM11 6v-3h2v3h2v3h-6v-3h2ZM11 11h2v10h-2v-10ZM3 13v-10h2v10h-2ZM19 13v-10h2v10h-2Z"),
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
        return _soundModuleFill!!
    }

private var _soundModuleFill: ImageVector? = null
