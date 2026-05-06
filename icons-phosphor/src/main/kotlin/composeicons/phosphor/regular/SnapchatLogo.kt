package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorRegularIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.83 182.28c-.567-2.725-2.51-4.96-5.13-5.9-.39-.14-28.95-10.88-43-49.23L219 119.43c4.103-1.657 6.087-6.327 4.43-10.43-1.657-4.103-6.327-6.087-10.43-4.43l-17.82 7.13C192.99 101.277 191.924 90.65 192 80 192 44.654 163.346 16 128 16 92.654 16 64 44.654 64 80c.063 10.666-1.003 21.308-3.18 31.75L43 104.57c-4.103-1.657-8.773 .327-10.43 4.43-1.657 4.103 .327 8.773 4.43 10.43l19.37 7.75c-3.969 11.089-9.987 21.334-17.74 30.2-12.52 14.14-25.27 19-25.36 19-2.62 .942-4.562 3.178-5.127 5.904-.565 2.726 .327 5.55 2.357 7.456 7.1 6.67 17.67 7.71 27.88 8.72 6.31 .62 12.83 1.27 16.39 3.23 3.37 1.86 6.85 6.62 10.21 11.22 5.4 7.41 11.53 15.8 21.24 18.28 9.07 2.33 18.35-.83 26.54-3.62 5.55-1.89 10.8-3.68 15.21-3.68 4.41 0 9.66 1.79 15.21 3.68 6.2 2.11 13 4.43 19.9 4.43 2.239 .013 4.47-.259 6.64-.81h0c9.7-2.48 15.83-10.87 21.23-18.28 3.36-4.6 6.84-9.36 10.21-11.22 3.56-2 10.08-2.61 16.39-3.23 10.21-1 20.78-2.05 27.88-8.72 2.047-1.898 2.956-4.725 2.4-7.46ZM216.01 182.54c-7.91 .78-16.08 1.59-22.53 5.13-6.45 3.54-11 9.79-15.41 15.81-4 5.48-8.15 11.16-12.28 12.21-4.46 1.15-10.76-1-17.42-3.27-6.66-2.27-13.31-4.53-20.37-4.53-7.06 0-13.83 2.3-20.37 4.53-6.54 2.23-13 4.42-17.42 3.27-4.13-1.05-8.27-6.73-12.28-12.21C73.54 197.48 69 191.24 62.52 187.67 56.04 184.1 47.9 183.32 40 182.54c-1.55-.15-3.15-.31-4.74-.49 5.336-3.919 10.258-8.372 14.69-13.29 8.37-9.27 17.72-23.23 23.74-43.13l.06-.13c.205-.52 .359-1.06 .46-1.61C78.184 109.603 80.133 94.829 80 80 80 53.49 101.49 32 128 32c26.51 0 48 21.49 48 48-.133 14.839 1.819 29.624 5.8 43.92 .101 .55 .255 1.09 .46 1.61l.06 .13c6 19.9 15.37 33.86 23.74 43.13 4.432 4.918 9.354 9.371 14.69 13.29-1.59 .15-3.18 .31-4.75 .46Z"),
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
        return _snapchatLogo!!
    }

private var _snapchatLogo: ImageVector? = null
