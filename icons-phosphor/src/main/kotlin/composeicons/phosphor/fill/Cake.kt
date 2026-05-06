package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorFillIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-72v-9c14.122-3.668 23.986-16.409 24-31C160 20 133.56 2.09 132.44 1.34c-2.688-1.794-6.192-1.794-8.88 0C122.44 2.09 96 20 96 48c.014 14.591 9.878 27.332 24 31v9h-72C34.745 88 24 98.745 24 112v23.33c.008 8.727 2.812 17.222 8 24.24v40.43c0 13.255 10.745 24 24 24h144c13.255 0 24-10.745 24-24v-40.43c5.188-7.018 7.992-15.513 8-24.24v-23.33C232 98.745 221.255 88 208 88ZM112 48c0-13.57 10-24.46 16-29.79 6 5.33 16 16.22 16 29.79 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM216 135.33c0 13.25-10.46 24.31-23.32 24.66-6.48 .184-12.76-2.262-17.408-6.781C170.623 148.69 168 142.483 168 136c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .003 6.485-2.619 12.695-7.268 17.216-4.649 4.521-10.93 6.968-17.412 6.784C50.46 159.64 40 148.58 40 135.33v-23.33c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
