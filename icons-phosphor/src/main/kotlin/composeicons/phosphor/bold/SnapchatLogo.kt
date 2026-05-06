package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorBoldIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.75 181.48c-.825-4.087-3.732-7.442-7.66-8.84-1.42-.54-25.86-10.18-39.35-43.23l15.68-6.27c4.062-1.534 6.978-5.144 7.626-9.437 .647-4.294-1.076-8.602-4.505-11.266-3.429-2.664-8.03-3.267-12.03-1.577l-13.35 5.34C196.676 97.547 195.953 88.78 196 80 196 42.445 165.555 12 128 12 90.445 12 60 42.445 60 80c.037 8.79-.693 17.567-2.18 26.23L44.46 100.89c-4-1.69-8.601-1.087-12.03 1.577-3.429 2.664-5.152 6.972-4.505 11.266 .647 4.294 3.563 7.903 7.626 9.437l15.68 6.27C37.74 162.46 13.31 172.09 12 172.6c-3.936 1.408-6.856 4.763-7.708 8.856-.851 4.093 .489 8.334 3.538 11.194 8.09 7.6 19.85 8.76 30.23 9.79 5.62 .55 12 1.18 14.85 2.75 2.59 1.42 5.94 6 8.9 10.07 5.51 7.56 12.38 17 23.47 19.8 10.23 2.61 20.11-.75 28.82-3.72 5-1.7 10.17-3.46 13.92-3.46 3.75 0 8.92 1.76 13.92 3.46 6.51 2.22 13.67 4.66 21.15 4.66 2.586 .009 5.163-.307 7.67-.94h0c11.09-2.84 18-12.24 23.47-19.8 3-4 6.31-8.65 8.9-10.07 2.85-1.57 9.23-2.2 14.85-2.75 10.38-1 22.14-2.19 30.23-9.79 3.041-2.855 4.382-7.084 3.54-11.17ZM191.53 184.16c-7.27 4-12.29 10.88-16.72 17-3.25 4.45-7.3 10-10 10.7-3.3 .85-9.32-1.2-15.14-3.18-6.53-2.23-13.93-4.75-21.65-4.75-7.72 0-15.12 2.52-21.65 4.75-5.82 2-11.84 4-15.14 3.18-2.74-.7-6.79-6.25-10-10.7-4.43-6.07-9.45-13-16.72-17-5.75-3.17-12.44-4.34-19.16-5.1 2.672-2.408 5.218-4.951 7.63-7.62 8.64-9.57 18.29-24 24.52-44.4 .004-.02 .004-.04 0-.06 .28-.687 .491-1.401 .63-2.13C82.167 110.247 84.143 95.15 84 80 84 55.699 103.699 36 128 36c24.301 0 44 19.699 44 44-.129 15.163 1.863 30.269 5.92 44.88 .147 .727 .358 1.44 .63 2.13-.004 .02-.004 .04 0 .06 6.23 20.44 15.88 34.83 24.52 44.4 2.411 2.669 4.958 5.212 7.63 7.62-6.7 .73-13.41 1.91-19.17 5.07Z"),
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
