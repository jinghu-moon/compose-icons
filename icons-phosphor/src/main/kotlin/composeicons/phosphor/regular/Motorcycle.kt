package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) return _motorcycle!!
        _motorcycle = phosphorRegularIcon(
            name = "Motorcycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 120c-2.211 .005-4.418 .189-6.6 .55l-5.82-15.14c4.074-.935 8.24-1.408 12.42-1.41 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-19.12L183.47 53.13C182.282 50.039 179.312 47.999 176 48h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h26.51l9.23 24h-27.74c-18.5 0-33.5 4.31-43.37 12.46-4.738 3.822-11.234 4.624-16.76 2.07C81.29 97.72 31.13 77.33 26.71 75.6L21 73.36C19.409 72.664 17.724 72.206 16 72c-3.848 .009-7.144 2.757-7.846 6.54-.702 3.783 1.388 7.53 4.976 8.92h0c.46 .18 47.19 18.3 72.13 29.63 11.095 5.048 24.091 3.386 33.56-4.29 4.86-4 14.57-8.8 33.19-8.8h18.82c-11.678 9.375-20.13 22.17-24.17 36.59-1.989 6.804-8.251 11.462-15.34 11.41h-52.12C75.093 131.88 56.418 118.139 35.988 120.203 15.557 122.266 .008 139.465 .008 160c0 20.535 15.549 37.734 35.98 39.797C56.418 201.861 75.093 188.12 79.2 168h52.12c14.256 .031 26.804-9.398 30.74-23.1 4.03-14.327 13.598-26.46 26.59-33.72l5.82 15.13c-16.763 10.729-23.088 32.15-14.841 50.264 8.247 18.114 28.556 27.409 47.655 21.812 19.099-5.598 31.178-24.385 28.342-44.085C252.79 134.601 235.902 119.983 216 120ZM40 168h22.62c-3.896 11.02-15.165 17.631-26.686 15.654C24.414 181.678 15.993 171.689 15.993 160c0-11.689 8.421-21.678 19.942-23.654 11.521-1.977 22.79 4.634 26.686 15.654h-22.62c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 184c-10.04-.012-19.012-6.273-22.487-15.693-3.475-9.42-.72-20.007 6.907-26.537l8.11 21.1c1.585 4.126 6.214 6.185 10.34 4.6 4.126-1.585 6.185-6.214 4.6-10.34L215.35 136h.65c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
