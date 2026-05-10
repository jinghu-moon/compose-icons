package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorFillIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L168 175.09v48.6c.05 2.914-1.435 5.64-3.91 7.18-2.829 1.683-6.401 1.461-9-.56L85.25 176h-45.25c-8.837 0-16-7.163-16-16v-64C24 87.163 31.163 80 40 80h41.55L50.08 45.38c-2.907-3.277-2.638-8.283 .604-11.229 3.242-2.946 8.251-2.737 11.236 .469ZM200.53 160c4.268-.367 7.528-3.967 7.47-8.25v-47.48c.068-4.291-3.195-7.903-7.47-8.27-2.212-.147-4.386 .631-6.003 2.147-1.617 1.517-2.532 3.636-2.527 5.853v48c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147ZM161 119.87c1.107 1.255 2.878 1.689 4.44 1.087 1.562-.602 2.583-2.113 2.56-3.787v-84.93c.037-2.452-1.018-4.794-2.88-6.39-2.885-2.387-7.04-2.454-10-.16L111.83 59.33c-.88 .685-1.433 1.705-1.528 2.816-.095 1.111 .278 2.21 1.028 3.034ZM231.47 80c-4.275 .367-7.538 3.979-7.47 8.27v79.46c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-79.98c.005-2.217-.91-4.336-2.527-5.853C235.856 80.631 233.682 79.853 231.47 80Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
