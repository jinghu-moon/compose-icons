package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorDuotoneIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 188c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM68 128c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C112 147.699 92.301 128 68 128Z"),
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
                pathData = parseSvgPathData("M240 165.41v-31.41c.035-7.075-4.613-13.321-11.4-15.32l-.21-.06L192 108.71v-36.71c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32.38L152 97.88v-41.88h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v32h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h28c37.539 .039 67.961 30.461 68 68v12c0 4.418 3.582 8 8 8h32.23c1.682 15.248 12.841 27.755 27.8 31.157 14.958 3.402 30.43-3.049 38.54-16.07 8.111-13.021 7.079-29.751-2.57-41.677ZM68 88h-4v-32h72v66.77C120.226 100.94 94.933 88.007 68 88ZM152 114.45 224 134v20.1c-18.733-6.631-39.296 3.172-45.94 21.9h-26.06ZM212 208c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM68 120c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52C119.967 143.295 96.705 120.033 68 120ZM68 208C48.118 208 32 191.882 32 172c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM80 172c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null
