package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorRegularIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L58.82 63.8C51.711 76.003 47.976 89.877 48 104c0 35.34-8.26 62.38-13.81 71.94-2.885 4.947-2.906 11.058-.055 16.025 2.851 4.967 8.138 8.031 13.865 8.035h40.8c3.786 18.643 20.177 32.04 39.2 32.04 19.023 0 35.414-13.398 39.2-32.04h15.44l19.44 21.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM128 216c-10.168-.003-19.231-6.413-22.62-16h45.24c-3.389 9.587-12.452 15.997-22.62 16ZM48 184c7.7-13.24 16-43.92 16-80-.014-9.56 2.126-19 6.26-27.62L168.09 184ZM214 179.27c-.934 .362-1.928 .549-2.93 .55-3.288-.003-6.24-2.019-7.44-5.08C196.35 156.19 192 129.75 192 104 192.007 81.22 179.904 60.154 160.222 48.685 140.54 37.216 116.245 37.073 96.43 48.31c-3.83 2.075-8.616 .705-10.768-3.083-2.151-3.788-.877-8.601 2.868-10.827 24.768-14.049 55.136-13.874 79.74 .46C192.875 49.194 208.005 75.525 208 104c0 35.35 8.05 58.59 10.52 64.88 1.615 4.112-.409 8.754-4.52 10.37Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
