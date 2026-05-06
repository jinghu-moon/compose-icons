package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorRegularIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 152v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM232 80c-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-80c0-4.418-3.582-8-8-8ZM221.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L168 175.09v48.91c-.002 3.054-1.743 5.84-4.487 7.181-2.744 1.341-6.012 1.003-8.423-.871L85.25 176h-45.25c-8.837 0-16-7.163-16-16v-64C24 87.163 31.163 80 40 80h41.55L50.08 45.38c-2.907-3.277-2.638-8.283 .604-11.229 3.242-2.946 8.251-2.737 11.236 .469ZM152 157.49 96.1 96h-56.1v64h48c1.78-.003 3.509 .592 4.91 1.69L152 207.64ZM125.06 69.31 152 48.31v58.47c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-74.78c-.002-3.054-1.743-5.84-4.487-7.181-2.744-1.341-6.012-1.003-8.423 .871L115.24 56.69c-3.415 2.733-4.002 7.703-1.317 11.156 2.685 3.453 7.646 4.11 11.137 1.474Z"),
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
