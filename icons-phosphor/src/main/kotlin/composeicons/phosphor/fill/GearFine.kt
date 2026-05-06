package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorFillIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 120h-8.34c-.935-11.408-3.923-22.554-8.82-32.9l7.23-4.17C225.897 80.721 227.209 75.827 225 72c-2.209-3.827-7.103-5.139-10.93-2.93l-7.25 4.19C200.276 63.876 192.124 55.724 182.74 49.18l4.19-7.25C189.139 38.103 187.827 33.209 184 31c-3.827-2.209-8.721-.897-10.93 2.93l-4.17 7.23C158.554 36.263 147.408 33.275 136 32.34v-8.34c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8.34c-11.408 .935-22.554 3.923-32.9 8.82L82.93 33.93C80.721 30.103 75.827 28.791 72 31c-3.827 2.209-5.139 7.103-2.93 10.93l4.19 7.25C63.876 55.724 55.724 63.876 49.18 73.26L41.93 69.07C38.103 66.861 33.209 68.173 31 72c-2.209 3.827-.897 8.721 2.93 10.93l7.23 4.17C36.263 97.446 33.275 108.592 32.34 120h-8.34c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8.34c.935 11.408 3.923 22.554 8.82 32.9l-7.23 4.17c-3.138 1.81-4.668 5.502-3.731 9 .937 3.499 4.108 5.931 7.731 5.93 1.405 .004 2.785-.365 4-1.07l7.25-4.19c6.544 9.384 14.696 17.536 24.08 24.08l-4.19 7.25c-2.209 3.827-.897 8.721 2.93 10.93 3.827 2.209 8.721 .897 10.93-2.93l4.17-7.23c10.346 4.897 21.492 7.885 32.9 8.82v8.34c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8.34c11.408-.935 22.554-3.923 32.9-8.82l4.17 7.23c2.209 3.827 7.103 5.139 10.93 2.93 3.827-2.209 5.139-7.103 2.93-10.93l-4.19-7.25c9.384-6.544 17.536-14.696 24.08-24.08l7.25 4.19c1.838 1.061 4.022 1.349 6.072 .799 2.05-.55 3.797-1.891 4.858-3.729 2.212-3.825 .904-8.718-2.92-10.93l-7.23-4.17c4.897-10.346 7.885-21.492 8.82-32.9h8.33c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72 128C71.992 110.828 79.875 94.605 93.38 84l25.38 44L93.38 172C79.875 161.395 71.992 145.172 72 128ZM128 184c-7.119 .008-14.173-1.35-20.78-4l25.4-44h50.8c-4.013 27.53-27.599 47.959-55.42 48ZM132.62 120 107.22 76c15.938-6.367 33.915-5.074 48.778 3.508 14.863 8.582 24.969 23.506 27.422 40.492Z"),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
