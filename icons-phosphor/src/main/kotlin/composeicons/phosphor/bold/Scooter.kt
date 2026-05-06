package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorBoldIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 132h-.68L179.38 36.21C177.749 31.309 173.165 28.002 168 28h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h23.35l14.83 44.49L114.59 164h-31.39C79.268 144.662 61.82 131.081 42.108 132.016 22.396 132.95 6.311 148.121 4.226 167.744c-2.085 19.624 10.453 37.835 29.528 42.891C52.83 215.691 72.742 206.08 80.65 188h39.35c3.444 .001 6.722-1.478 9-4.06l54-61.13 5.6 16.81c-15.936 11.559-21.093 32.995-12.157 50.537 8.936 17.542 29.308 25.973 48.027 19.878 18.719-6.096 30.22-24.906 27.113-44.346C248.477 146.248 231.687 131.958 212 132ZM44 188c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM212 188c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
