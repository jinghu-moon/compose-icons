package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorFillIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.47 189.74c-7.1 6.67-17.67 7.71-27.88 8.72-6.31 .62-12.83 1.27-16.39 3.23-3.37 1.86-6.85 6.62-10.21 11.22-5.4 7.41-11.53 15.8-21.23 18.28h0c-2.17 .551-4.401 .823-6.64 .81-6.88 0-13.7-2.32-19.9-4.43-5.55-1.89-10.8-3.68-15.21-3.68-4.41 0-9.66 1.79-15.21 3.68-8.19 2.79-17.47 6-26.54 3.62C76.55 228.71 70.42 220.32 65.02 212.91c-3.36-4.6-6.84-9.36-10.21-11.22-3.56-2-10.08-2.61-16.38-3.23-10.22-1-20.79-2.05-27.89-8.72C8.511 187.834 7.618 185.01 8.183 182.284c.565-2.726 2.507-4.962 5.127-5.904 .09 0 12.84-4.86 25.36-19 7.753-8.866 13.771-19.111 17.74-30.2L37 119.43C32.897 117.773 30.913 113.103 32.57 109c1.657-4.103 6.327-6.087 10.43-4.43l17.85 7.15C63.014 101.287 64.07 90.655 64 80 64 44.654 92.654 16 128 16c35.346 0 64 28.654 64 64-.068 10.661 1.008 21.299 3.21 31.73L213 104.57c4.103-1.657 8.773 .327 10.43 4.43 1.657 4.103-.327 8.773-4.43 10.43l-19.3 7.72c14.08 38.35 42.64 49.09 43 49.23 2.62 .942 4.562 3.178 5.127 5.904 .565 2.726-.327 5.55-2.357 7.456Z"),
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
