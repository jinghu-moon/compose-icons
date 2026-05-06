package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorRegularIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 16C75.006 16.061 32.061 59.006 32 112c0 24 12.56 55.06 33.61 83 21.18 28.15 44.5 45 62.39 45 17.89 0 41.21-16.81 62.39-45C211.44 167 224 136 224 112 223.939 59.006 180.994 16.061 128 16ZM177.61 185.42C160.24 208.49 140.31 224 128 224 115.69 224 95.76 208.49 78.39 185.42 59.65 160.5 48 132.37 48 112 48 67.817 83.817 32 128 32c44.183 0 80 35.817 80 80 0 20.37-11.65 48.5-30.39 73.42ZM120 136C120 113.909 102.091 96 80 96c-8.837 0-16 7.163-16 16 0 22.091 17.909 40 40 40 8.837 0 16-7.163 16-16ZM80 112c13.255 0 24 10.745 24 24h0C90.745 136 80 125.255 80 112ZM176 96c-22.091 0-40 17.909-40 40 0 8.837 7.163 16 16 16 22.091 0 40-17.909 40-40 0-8.837-7.163-16-16-16ZM152 136c0-13.255 10.745-24 24-24 0 13.255-10.745 24-24 24ZM152 184c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
