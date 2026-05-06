package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorLightIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 110c23.196 0 42-18.804 42-42C170 44.804 151.196 26 128 26 104.804 26 86 44.804 86 68c0 23.196 18.804 42 42 42ZM128 38c16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30C111.431 98 98 84.569 98 68 98 51.431 111.431 38 128 38ZM206 224c0 3.314-2.686 6-6 6h-144c-2.501 .013-4.748-1.527-5.638-3.864-.89-2.337-.237-4.982 1.638-6.636L152.58 130.75c-18.613-7.484-39.62-6.097-57.087 3.771-17.467 9.868-29.497 27.144-32.693 46.949-.466 2.904-2.968 5.043-5.91 5.05-.335 .004-.669-.02-1-.07-1.577-.246-2.991-1.11-3.93-2.401-.938-1.291-1.324-2.903-1.07-4.479 3.922-24.467 19.236-45.615 41.258-56.976 22.022-11.36 48.132-11.581 70.342-.594L188 99.5c2.485-2.193 6.277-1.955 8.47 .53 2.193 2.485 1.955 6.277-.53 8.47L71.87 218h128.13c3.314 0 6 2.686 6 6ZM192.08 147.52c9.092 13.048 13.952 28.577 13.92 44.48 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 .027-13.453-4.082-26.59-11.77-37.63-1.813-2.719-1.117-6.389 1.566-8.255 2.683-1.866 6.366-1.241 8.284 1.405Z"),
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
