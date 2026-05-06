package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorDuotoneIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 48C104 24 128 8 128 8c0 0 24 16 24 40 0 13.255-10.745 24-24 24C114.745 72 104 61.255 104 48ZM208 96h-160c-8.837 0-16 7.163-16 16v23.33c0 17.44 13.67 32.18 31.1 32.66 8.64 .243 17.011-3.019 23.208-9.045C92.505 152.92 96.001 144.643 96 136c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32-.003 8.645 3.491 16.924 9.689 22.952 6.197 6.028 14.57 9.291 23.211 9.048C210.33 167.52 224 152.78 224 135.34v-23.34c0-8.837-7.163-16-16-16Z"),
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
                pathData = parseSvgPathData("M232 112C232 98.745 221.255 88 208 88h-72v-9c14.122-3.668 23.986-16.409 24-31C160 20 133.56 2.09 132.44 1.34c-2.688-1.794-6.192-1.794-8.88 0C122.44 2.09 96 20 96 48c.014 14.591 9.878 27.332 24 31v9h-72C34.745 88 24 98.745 24 112v23.33c.008 8.727 2.812 17.222 8 24.24v40.43c0 13.255 10.745 24 24 24h144c13.255 0 24-10.745 24-24v-40.43c5.188-7.018 7.992-15.513 8-24.24ZM112 48c0-13.57 10-24.46 16-29.79 6 5.33 16 16.22 16 29.79 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM40 112c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8v23.33c0 13.25-10.46 24.31-23.32 24.66-6.48 .184-12.76-2.262-17.408-6.781C170.623 148.69 168 142.483 168 136c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .003 6.485-2.619 12.695-7.268 17.216-4.649 4.521-10.93 6.968-17.412 6.784C50.46 159.64 40 148.58 40 135.33ZM200 208h-144c-4.418 0-8-3.582-8-8v-27.44c4.683 2.122 9.741 3.291 14.88 3.44 10.803 .336 21.277-3.749 29-11.31C93.372 163.235 94.75 161.667 96 160c7.554 10.072 19.41 16 32 16 12.59 0 24.446-5.928 32-16 1.254 1.661 2.635 3.222 4.13 4.67 7.442 7.289 17.453 11.359 27.87 11.33 .38 0 .76 0 1.14 0 5.132-.151 10.183-1.321 14.86-3.44v27.44c0 4.418-3.582 8-8 8Z"),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
