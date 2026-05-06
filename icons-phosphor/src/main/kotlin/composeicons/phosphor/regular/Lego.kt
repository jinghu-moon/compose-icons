package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorRegularIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.58 72.84 197.29 49.7C191.54 39.24 177.21 32 160 32c-22.43 0-40 12.3-40 28 .002 2.219 .36 4.424 1.06 6.53l-19.52 9.76C94.732 73.391 87.399 71.93 80 72 57.57 72 40 84.3 40 100c.002 2.219 .36 4.424 1.06 6.53L12.42 120.84C9.709 122.197 7.998 124.969 8 128v64c-.002 3.031 1.709 5.803 4.42 7.16l64 32c2.253 1.128 4.907 1.128 7.16 0l160-80c2.711-1.357 4.422-4.129 4.42-7.16v-64c.002-3.031-1.709-5.803-4.42-7.16ZM80 151.06 33.89 128 51 119.45c7.24 5.29 17.48 8.55 29 8.55 22.43 0 40-12.3 40-28-.038-4.648-1.562-9.161-4.35-12.88L131 79.45c7.24 5.29 17.48 8.55 29 8.55 18.38 0 33.49-8.26 38.35-19.88L222.11 80ZM160 48c13.74 0 24 6.34 24 12 0 5.66-10.26 12-24 12C146.26 72 136 65.66 136 60c0-5.66 10.26-12 24-12ZM80 88c13.74 0 24 6.34 24 12 0 5.66-10.26 12-24 12-9.67 0-17.61-3.14-21.47-7-.256-.331-.537-.642-.84-.93C56.678 102.946 56.082 101.51 56 100 56 94.34 66.26 88 80 88ZM24 140.94l48 24v46.12l-48-24ZM88 211.06v-46.12l144-72v46.12Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
