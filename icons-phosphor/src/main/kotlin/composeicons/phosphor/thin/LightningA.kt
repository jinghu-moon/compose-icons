package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorThinIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.92 112.34c-.257-1.262-1.106-2.322-2.28-2.85l-53-23.78L131.07 24.92c.421-1.77-.405-3.601-2.01-4.456-1.605-.856-3.586-.52-4.82 .816L29.06 124.14c-.876 .946-1.243 2.256-.985 3.519 .258 1.263 1.109 2.325 2.285 2.851l53 23.78L68.91 215.07c-.425 1.768 .397 3.601 2 4.46 .578 .311 1.224 .472 1.88 .47 1.116 .002 2.181-.462 2.94-1.28L170.93 115.86c.878-.945 1.247-2.256 .99-3.52ZM80.21 202.1 91.89 152.92c.442-1.866-.502-3.783-2.25-4.57L38.72 125.49 119.79 37.9 108.11 87.08c-.442 1.866 .502 3.783 2.25 4.57l50.92 22.86ZM235.58 214.21l-36-72c-.677-1.358-2.063-2.216-3.58-2.216-1.517 0-2.903 .858-3.58 2.216l-36 72c-.989 1.977-.187 4.381 1.79 5.37 1.977 .989 4.381 .187 5.37-1.79L174.47 196h43.06l10.89 21.79c.678 1.355 2.064 2.211 3.58 2.21 .621-.003 1.233-.147 1.79-.42 .95-.474 1.672-1.307 2.008-2.314 .336-1.007 .257-2.107-.218-3.056ZM178.47 188 196 152.94 213.53 188Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
