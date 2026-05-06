package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorDuotoneIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.45 133.33 173.63 49.05C167.235 29.506 149.101 16.207 128.538 15.981 107.976 15.755 89.554 28.651 82.73 48.05L53.19 131.59c-12.532 33.08-1.85 70.464 26.268 91.929 28.118 21.465 66.995 21.915 95.602 1.107 28.607-20.808 40.152-57.934 28.39-91.296ZM128 200C105.909 200 88 182.091 88 160c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
                pathData = parseSvgPathData("M128 112c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48-.028-26.498-21.502-47.972-48-48ZM128 192C110.327 192 96 177.673 96 160c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM211 130.66 181.2 46.47C173.71 23.708 152.569 8.234 128.608 7.976 104.647 7.719 83.177 22.735 75.2 45.33h0L45.69 128.83c-13.749 36.393-1.971 77.496 28.967 101.083 30.938 23.587 73.692 24.06 105.145 1.164C211.255 208.18 223.94 167.348 211 130.66ZM128 232C104.336 231.984 82.188 220.349 68.748 200.872 55.308 181.395 52.288 156.56 60.67 134.43c.019-.062 .042-.122 .07-.18L90.28 50.66h0C95.981 34.505 111.335 23.774 128.465 23.973c17.13 .199 32.231 11.284 37.555 27.567l.06 .18L195.9 136c7.768 22.039 4.364 46.477-9.129 65.555C173.277 220.634 151.368 231.983 128 232Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
