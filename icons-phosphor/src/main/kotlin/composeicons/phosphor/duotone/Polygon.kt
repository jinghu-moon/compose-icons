package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorDuotoneIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M137 65c-9.381 9.349-24.562 9.331-33.921-.039-9.359-9.37-9.359-24.551 0-33.921C112.438 21.669 127.619 21.651 137 31c4.519 4.503 7.059 10.62 7.059 17 0 6.38-2.54 12.497-7.059 17ZM23 103c-9.349 9.381-9.331 24.562 .039 33.921 9.37 9.359 24.551 9.359 33.921 0C66.331 127.562 66.349 112.381 57 103 52.497 98.481 46.38 95.941 40 95.941c-6.38 0-12.497 2.54-17 7.059ZM143 191c-9.349 9.381-9.331 24.562 .039 33.921 9.37 9.359 24.551 9.359 33.921 0 9.37-9.359 9.388-24.54 .039-33.921-4.503-4.519-10.62-7.059-17-7.059-6.38 0-12.497 2.54-17 7.059ZM225 55c-9.381-9.349-24.562-9.331-33.921 .039-9.359 9.37-9.359 24.551 0 33.921 9.359 9.37 24.54 9.388 33.921 .039 4.519-4.503 7.059-10.62 7.059-17 0-6.38-2.54-12.497-7.059-17Z"),
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
                pathData = parseSvgPathData("M230.64 49.36c-6.001-6.003-14.142-9.375-22.63-9.375-8.488 0-16.629 3.372-22.63 9.375h0c-2.014 2.013-3.749 4.286-5.16 6.76L152 48.42c.178-13.023-7.554-24.854-19.553-29.919C120.449 13.436 106.577 16.148 97.37 25.36h0C87.508 35.245 85.179 50.376 91.61 62.77L57.67 93.32C44.976 84.93 28.132 86.622 17.36 97.37h0C5.224 109.414 4.7 128.872 16.171 141.551c11.471 12.68 30.883 14.102 44.079 3.229l70 51.36c-6.229 15.599 .662 33.359 15.783 40.674 15.12 7.315 33.323 1.694 41.686-12.873 8.363-14.567 4.041-33.12-9.899-42.491l27.39-77.59q1.38 .12 2.76 .12c12.94-.002 24.605-7.797 29.558-19.752 4.953-11.955 2.219-25.716-6.928-34.868ZM108.64 36.67h0c6.25-6.243 16.378-6.24 22.623 .008 6.246 6.248 6.246 16.375 0 22.623-6.246 6.248-16.373 6.252-22.623 .008-2.999-3.006-4.68-7.082-4.673-11.328 .008-4.247 1.703-8.316 4.713-11.312ZM28.64 131.32C25.636 128.319 23.947 124.247 23.947 120c0-4.247 1.688-8.319 4.693-11.32h0c6.25-6.243 16.378-6.24 22.623 .008 6.246 6.248 6.246 16.375 0 22.623-6.246 6.248-16.373 6.252-22.623 .008ZM171.29 219.32c-6.249 6.249-16.381 6.249-22.63 0-6.249-6.249-6.249-16.381 0-22.63h0c6.249-6.249 16.381-6.249 22.63 0 6.249 6.249 6.249 16.381 0 22.63ZM162.74 176.14c-8.296-.722-16.547 1.817-23 7.08L69.74 131.86c3.432-8.658 2.943-18.38-1.34-26.65L102.35 74.66c7.383 4.893 16.463 6.508 25.08 4.459 8.617-2.049 15.999-7.577 20.39-15.269L176 71.56c-.155 10.807 5.156 20.962 14.12 27ZM219.3 83.3c-3.984 4.306-10.005 6.086-15.689 4.639C197.926 86.493 193.488 82.052 192.047 76.365c-1.441-5.686 .344-11.705 4.653-15.685h0c6.249-6.249 16.381-6.249 22.63 0 6.249 6.249 6.249 16.381 0 22.63Z"),
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
        return _polygon!!
    }

private var _polygon: ImageVector? = null
