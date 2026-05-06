package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorRegularIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM159.07 169.74c-2.066 3.904-6.905 5.395-10.81 3.33-12.651-6.8-27.869-6.8-40.52 0-3.89 1.956-8.629 .442-10.665-3.407-2.036-3.848-.62-8.618 3.185-10.733 17.354-9.179 38.126-9.179 55.48 0 3.904 2.066 5.395 6.905 3.33 10.81ZM191.07 113.74c-.999 1.873-2.702 3.272-4.733 3.889-2.031 .617-4.225 .401-6.097-.599-32.627-17.476-71.833-17.476-104.46 0-3.899 2.082-8.748 .609-10.83-3.29-2.082-3.899-.609-8.748 3.29-10.83 37.341-19.984 82.199-19.984 119.54 0 1.877 1.001 3.278 2.708 3.893 4.744 .615 2.036 .395 4.233-.613 6.106ZM175.07 141.74c-2.077 3.899-6.921 5.376-10.82 3.3-22.65-12.082-49.83-12.082-72.48 0-3.887 1.985-8.648 .489-10.7-3.364-2.052-3.853-.637-8.639 3.18-10.756 27.35-14.585 60.17-14.585 87.52 0 1.876 .999 3.277 2.704 3.894 4.737 .617 2.034 .4 4.229-.604 6.103Z"),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
