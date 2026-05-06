package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorFillIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 172c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM120 172c0 28.719-23.281 52-52 52C39.281 224 16 200.719 16 172c0-28.719 23.281-52 52-52 28.705 .033 51.967 23.295 52 52ZM96 172C96 156.536 83.464 144 68 144c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM248 188c-.033 19.08-14.946 34.82-33.997 35.882C194.953 224.944 178.383 210.958 176.23 192h-32.23c-4.418 0-8-3.582-8-8v-12c-.039-37.539-30.461-67.961-68-68h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-32h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h120c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v41.88l24 6.5v-32.38c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v36.71l36.39 9.86 .21 .06c6.805 2.004 11.457 8.276 11.4 15.37v31.46c5.172 6.374 7.996 14.332 8 22.54ZM228 188c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16Z"),
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
