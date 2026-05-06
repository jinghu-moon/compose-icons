package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorFillIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226 88.08c-.4-1-.82-2-1.25-3-6.452-14.88-16.894-27.685-30.17-37h21.42c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-104c-45.864 .058-84.014 35.286-87.72 81C10.063 116.614 .062 129.351 0 144c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .004-5.946 3.304-11.399 8.57-14.16 1.991 17.949 9.475 34.845 21.43 48.38l12.56 35.16c2.275 6.373 8.313 10.625 15.08 10.62h12.72c6.763 .001 12.796-4.251 15.07-10.62L103.35 208h57.3l1.92 5.38c2.274 6.369 8.307 10.621 15.07 10.62h12.72c6.763 .001 12.796-4.251 15.07-10.62L221.64 168h2.36c13.255 0 24-10.745 24-24v-32c.002-12.481-9.563-22.88-22-23.92ZM152 72h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM180 128c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
