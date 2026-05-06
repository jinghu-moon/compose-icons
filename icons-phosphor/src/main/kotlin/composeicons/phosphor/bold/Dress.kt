package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorBoldIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.38 208.12c-.06-.12-.11-.25-.17-.37L173.67 112.88 193 82.56c.06-.09 .12-.18 .17-.27 3.8-6.334 3.8-14.246 0-20.58-.14-.24-.3-.48-.46-.71L172 31.44v-19.44C172 5.373 166.627 0 160 0c-6.627 0-12 5.373-12 12v19l-4.38 5.47c-3.795 4.746-9.543 7.509-15.62 7.509-6.077 0-11.825-2.763-15.62-7.509L108 31v-19C108 5.373 102.627 0 96 0 89.373 0 84 5.373 84 12v19.44L63.31 61c-.16 .23-.32 .47-.46 .71-3.8 6.334-3.8 14.246 0 20.58 0 .09 .11 .18 .17 .27l19.31 30.32L37.79 207.75c-.06 .12-.11 .25-.17 .37-2.649 6.179-2.016 13.275 1.684 18.888 3.7 5.613 9.973 8.991 16.696 8.992h144c6.725 .003 13-3.374 16.703-8.988 3.703-5.613 4.337-12.712 1.687-18.892ZM128 68c11.725 .024 22.969-4.66 31.21-13l12 17.1L153.42 100h-50.84L84.82 72.12l12-17.1C105.057 63.346 116.288 68.021 128 68ZM62.31 212l41.31-88h48.76l41.31 88Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
