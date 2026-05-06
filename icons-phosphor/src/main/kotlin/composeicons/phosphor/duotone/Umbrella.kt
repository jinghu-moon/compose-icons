package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorDuotoneIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32c0 0-40 32-40 104h-56c-2.251 .009-4.401-.931-5.923-2.588C24.554 131.754 23.8 129.532 24 127.29 28.636 73.327 73.838 31.91 128 32ZM232 127.29C227.364 73.327 182.162 31.91 128 32c0 0 40 32 40 104h56c2.251 .009 4.401-.931 5.923-2.588 1.522-1.658 2.276-3.88 2.077-6.122Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 126.63C236.274 83.908 208.571 47.026 168.58 31.543 128.588 16.061 83.272 24.674 51.75 53.75 31.123 72.7 18.379 98.716 16.05 126.63c-.384 4.467 1.124 8.89 4.156 12.192 3.032 3.302 7.311 5.181 11.794 5.178h88v56c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16v-56h88c4.492 .016 8.784-1.856 11.827-5.16 3.043-3.304 4.558-7.735 4.173-12.21ZM32 128h0C35.641 85.682 66.617 50.767 108.2 42.11 96.48 58 81.85 86.11 80.17 128ZM96.15 128C97.54 97.23 106.68 75.19 114.45 61.76 118.281 55.089 122.824 48.852 128 43.16c5.166 5.693 9.699 11.929 13.52 18.6C154.8 84.7 159 109.28 159.82 128ZM175.8 128c-1.68-41.89-16.31-70-28-85.94C189.413 50.698 220.406 85.652 224 128Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
