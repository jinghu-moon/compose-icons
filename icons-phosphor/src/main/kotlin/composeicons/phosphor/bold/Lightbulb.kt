package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorBoldIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 232c0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12ZM220 104c.074 28.253-12.907 54.956-35.17 72.35-3.015 2.297-4.798 5.86-4.83 9.65v2c0 11.046-8.954 20-20 20h-64C84.954 208 76 199.046 76 188v-2c-.004-3.728-1.741-7.242-4.7-9.51C49.1 159.198 36.083 132.66 36 104.52 35.73 54.69 76 13.2 125.79 12c24.781-.595 48.753 8.834 66.487 26.152C210.012 55.47 220.007 79.212 220 104ZM196 104c.005-18.324-7.385-35.875-20.497-48.676C162.392 42.523 144.669 35.555 126.35 36 89.56 36.88 59.8 67.55 60 104.38c.069 20.797 9.693 40.409 26.1 53.19C94.355 163.941 99.428 173.588 100 184h56.1c.583-10.431 5.652-20.098 13.9-26.51C186.456 144.627 196.051 124.887 196 104ZM175.93 98.68c-2.166-18.316-14.533-33.819-31.91-40-6.192-2.023-12.868 1.264-15.04 7.405-2.172 6.142 .953 12.895 7.04 15.215 8.733 3.061 14.97 10.814 16.09 20 .729 6.589 6.661 11.339 13.25 10.61 6.589-.729 11.339-6.661 10.61-13.25Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
