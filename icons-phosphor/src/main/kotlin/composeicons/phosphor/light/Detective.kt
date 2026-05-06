package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorLightIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 114h-28.94L171 47.77c-2.555-3.507-6.592-5.631-10.93-5.751-4.338-.119-8.486 1.779-11.23 5.141L135.93 62.08c-.052 .052-.099 .109-.14 .17-1.898 2.358-4.763 3.73-7.79 3.73-3.027 0-5.892-1.371-7.79-3.73-.041-.061-.088-.118-.14-.17L107.2 47.16c-2.744-3.377-6.901-5.286-11.25-5.167C91.6 42.113 87.554 44.248 85 47.77L36.94 114h-28.94c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h240c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM94.75 54.82c.368-.493 .943-.789 1.558-.803 .615-.014 1.202 .257 1.592 .733l.15 .17 12.86 14.92c4.163 5.172 10.45 8.174 17.09 8.16h0c6.64 .014 12.927-2.988 17.09-8.16L158 54.92l.15-.17c.39-.476 .977-.746 1.592-.733 .615 .014 1.19 .31 1.558 .803l43 59.18h-152.53ZM180 146c-18 .001-32.881 14.031-33.94 32h-36.12C108.898 160.429 94.617 146.558 77.022 146.029c-17.594-.529-32.683 12.457-34.781 29.934-2.097 17.477 9.491 33.664 26.711 37.313 17.22 3.648 34.377-6.45 39.547-23.275h39c5.138 16.696 22.093 26.782 39.217 23.329 17.124-3.453 28.845-19.322 27.111-36.704C212.094 159.242 197.469 146.002 180 146ZM76 202C63.85 202 54 192.15 54 180c0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM180 202c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
