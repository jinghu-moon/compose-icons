package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) return _bellSimpleSlash!!
        _bellSimpleSlash = phosphorDuotoneIcon(
            name = "BellSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 192h-160c-2.85-.017-5.475-1.549-6.892-4.021-1.417-2.472-1.413-5.511 .012-7.979C47.71 168.6 56 139.81 56 104 56 64.235 88.235 32 128 32c39.764 0 72 32.235 72 72 0 35.82 8.3 64.6 14.9 76 1.427 2.471 1.429 5.514 .007 7.988-1.422 2.473-4.054 4.002-6.907 4.012Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L58.82 63.8C51.711 76.003 47.976 89.877 48 104c0 35.34-8.26 62.38-13.81 71.94-2.885 4.947-2.906 11.058-.055 16.025 2.851 4.967 8.138 8.031 13.865 8.035h134.64l19.44 21.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM48 184c7.7-13.24 16-43.92 16-80-.014-9.56 2.126-19 6.26-27.62L168.09 184ZM168 224c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM214 179.25c-.934 .362-1.928 .549-2.93 .55-3.288-.003-6.24-2.019-7.44-5.08C196.35 156.19 192 129.75 192 104 192.007 81.22 179.904 60.154 160.222 48.685 140.54 37.216 116.245 37.073 96.43 48.31c-3.83 2.075-8.616 .705-10.768-3.083-2.151-3.788-.877-8.601 2.868-10.827 24.768-14.049 55.136-13.874 79.74 .46C192.875 49.194 208.005 75.525 208 104c0 35.35 8.05 58.59 10.52 64.88 1.615 4.112-.409 8.754-4.52 10.37Z"),
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
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
