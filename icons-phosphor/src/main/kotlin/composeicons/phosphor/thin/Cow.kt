package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cow: ImageVector
    get() {
        if (_cow != null) return _cow!!
        _cow = phosphorThinIcon(
            name = "Cow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 192c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4ZM176 188h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM100 116c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM156 116c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM241.3 119.59c-2.28 2.792-5.695 4.412-9.3 4.41h-36v38.08c13.172 8.814 19.031 25.205 14.43 40.372C205.828 217.618 191.849 227.991 176 228h-96C64.151 227.991 50.172 217.618 45.57 202.452 40.969 187.285 46.828 170.894 60 162.08v-38.08h-36c-3.612 .008-7.035-1.612-9.32-4.41-2.264-2.744-3.171-6.362-2.47-9.85C17.137 85.475 38.46 68.027 63.22 68h13.12C61.203 58.492 52.011 41.875 52 24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 .028 24.289 19.711 43.972 44 44h48c24.289-.028 43.972-19.711 44-44 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4-.011 17.875-9.203 34.492-24.34 44h13.12c24.757 .032 46.073 17.478 51 41.74 .698 3.489-.213 7.107-2.48 9.85ZM60 116v-12C60 93.118 64.931 82.822 73.41 76h-10.19C42.279 76.032 24.25 90.789 20.08 111.31c-.232 1.137 .066 2.319 .81 3.21 .76 .937 1.903 1.481 3.11 1.48ZM176 164h-96c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28h96c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM188 158.06v-54.06C188 88.536 175.464 76 160 76h-64C80.536 76 68 88.536 68 104v54.06c3.853-1.365 7.912-2.062 12-2.06h96c4.088-.002 8.147 .695 12 2.06ZM235.92 111.31C231.75 90.789 213.721 76.032 192.78 76h-10.19c8.479 6.822 13.41 17.118 13.41 28v12h36c1.214 .007 2.365-.537 3.13-1.48 .737-.895 1.027-2.076 .79-3.21Z"),
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
        return _cow!!
    }

private var _cow: ImageVector? = null
