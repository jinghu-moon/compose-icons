package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorThinIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM211.83 195.79C209.836 218.521 190.818 235.968 168 236h-24c-24.289-.028-43.972-19.711-44-44v-44.15C68.492 145.745 44.009 119.578 44 88v-48c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v44c-.001 13.912 5.572 27.244 15.474 37.016 9.902 9.772 23.306 15.169 37.216 14.984C133 139.63 156 115.93 156 87.17v-43.17h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4v47.17c0 32-24.84 58.59-56 60.69v44.14c0 19.882 16.118 36 36 36h24c18.42-.025 33.858-13.933 35.8-32.25-18.986-2.123-33.007-18.706-31.944-37.78 1.063-19.074 16.84-33.997 35.944-33.997 19.104 0 34.881 14.922 35.944 33.997 1.063 19.074-12.958 35.658-31.944 37.78ZM236 160c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
