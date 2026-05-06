package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorThinIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 109.5v-72c-.001-1.297-.631-2.514-1.69-3.263-1.059-.749-2.416-.938-3.64-.507C48.275 50.13 20.706 97.845 29.67 146.23c.228 1.283 1.065 2.374 2.246 2.925 1.18 .551 2.555 .493 3.684-.155L98 113c1.249-.721 2.013-2.058 2-3.5ZM92 107.19 36.67 139.11C31.723 98.426 54.284 59.376 92 43.34ZM128 28c-2.209 0-4 1.791-4 4v94.12L43.2 173.18c-.92 .536-1.588 1.417-1.857 2.448-.268 1.03-.115 2.125 .427 3.042 24.539 41.752 75.47 59.919 120.894 43.123 45.424-16.796 72.283-63.728 63.756-111.401C217.893 62.719 176.43 28.009 128 28ZM128 220C96.826 219.912 67.795 204.121 50.78 178L130 131.88c1.236-.714 1.999-2.032 2-3.46v-92.33c49.955 2.211 88.998 43.918 87.91 93.911C218.823 179.993 178.004 219.963 128 220Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
