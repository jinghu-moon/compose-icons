package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorLightIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 106h-129.32L209.53 73.57c1.547-.408 2.868-1.417 3.668-2.802 .8-1.386 1.013-3.034 .592-4.578L205.63 36.19c-2.054-7.345-9.629-11.676-17-9.72L36.32 66.67c-3.581 .93-6.637 3.262-8.48 6.47-1.834 3.15-2.324 6.905-1.36 10.42L34 111.34c0 .22 0 .44 0 .66v88c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-88c0-3.314-2.686-6-6-6ZM125.75 55.48l33 19.07L116.32 85.75l-33-19.07ZM191.75 38.07c.992-.275 2.024 .281 2.34 1.26l6.57 24.18-25.4 6.69-33-19.07ZM38.23 79.14c.25-.434 .665-.747 1.15-.87L66.86 71l33 19.08L44.66 104.68 38.06 80.41c-.119-.429-.058-.888 .17-1.27ZM210 200c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-82h164Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
