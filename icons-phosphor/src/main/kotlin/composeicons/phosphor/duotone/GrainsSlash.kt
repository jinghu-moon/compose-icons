package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorDuotoneIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 64v56c-44.183 0-80 35.817-80 80C128 155.817 92.183 120 48 120v-56c12.525-.01 24.876 2.933 36.05 8.59h0C95.62 40.19 128 24 128 24c0 0 32.39 16.19 44 48.58h0C183.159 66.931 195.493 63.992 208 64Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858l9.73 10.71Q49.91 56 48 56c-4.418 0-8 3.582-8 8v80c.002 35.333 21.136 67.238 53.669 81.023 32.533 13.784 70.156 6.774 95.541-17.803l12.87 14.16c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM120 215.56C83.578 211.442 56.042 180.654 56 144v-15.56c36.422 4.118 63.958 34.906 64 71.56ZM56 112.37v-39.93c4.47 .499 8.883 1.42 13.18 2.75L136.29 149c-3.209 4.519-5.984 9.33-8.29 14.37C114.845 134.719 87.393 115.273 56 112.37ZM136 215.56v-15.56c.006-13.756 3.948-27.222 11.36-38.81l31.08 34.19C166.955 206.674 152.009 213.781 136 215.56ZM216 64v80c.004 7.906-1.055 15.777-3.15 23.4-.954 3.472-4.11 5.878-7.71 5.88-.723 .006-1.443-.088-2.14-.28-4.257-1.173-6.759-5.572-5.59-9.83 1.715-6.246 2.586-12.693 2.59-19.17v-15.57c-8.563 .935-16.885 3.418-24.56 7.33-2.559 1.398-5.676 1.293-8.135-.273-2.459-1.567-3.871-4.348-3.685-7.258 .186-2.91 1.941-5.488 4.58-6.729 9.914-5.061 20.711-8.164 31.8-9.14v-39.91c-20.158 2.292-38.427 12.945-50.35 29.36-2.593 3.59-7.605 4.398-11.195 1.805-3.59-2.593-4.398-7.605-1.805-11.195 6.781-9.339 15.329-17.255 25.16-23.3C152.62 49.8 135.45 37.74 128 33.2c-8.783 5.398-16.677 12.125-23.4 19.94-2.889 3.225-7.82 3.565-11.125 .769C90.169 51.112 89.689 46.194 92.39 42.81c8.971-10.567 19.82-19.382 32-26 2.253-1.128 4.907-1.128 7.16 0 1.32 .66 30.27 15.43 44.59 45.15C186.299 58.016 197.102 55.995 208 56c4.418 0 8 3.582 8 8Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
