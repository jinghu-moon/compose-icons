package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorDuotoneIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 68C92 48.118 108.118 32 128 32c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 104 92 87.882 92 68ZM128 120c-39.765 0-72 32.236-72 72v32h144v-32c0-39.764-32.236-72-72-72Z"),
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
                pathData = parseSvgPathData("M172 68C172 43.699 152.301 24 128 24 103.699 24 84 43.699 84 68c0 24.301 19.699 44 44 44 24.289-.028 43.972-19.711 44-44ZM128 96C112.536 96 100 83.464 100 68c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM208 224c0 4.418-3.582 8-8 8h-144c-3.327-.001-6.306-2.06-7.482-5.172-1.176-3.112-.303-6.627 2.192-8.828l98.07-86.54c-17.856-6.142-37.513-4.085-53.711 5.62-16.198 9.705-27.283 26.068-30.289 44.71-.873 4.185-4.882 6.945-9.103 6.266-4.221-.679-7.162-4.558-6.677-8.806 4.005-24.828 19.452-46.327 41.704-58.045 22.252-11.718 48.719-12.29 71.456-1.545L186.71 98c3.322-2.837 8.307-2.485 11.196 .793 2.889 3.277 2.615 8.267-.616 11.207L77.16 216h122.84c4.418 0 8 3.582 8 8ZM193.73 146.38c9.318 13.386 14.299 29.311 14.27 45.62 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 .025-13.045-3.958-25.783-11.41-36.49-2.521-3.629-1.624-8.614 2.005-11.135 3.629-2.521 8.614-1.624 11.135 2.005Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
