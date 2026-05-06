package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileSvg: ImageVector
    get() {
        if (_fileSvg != null) return _fileSvg!!
        _fileSvg = phosphorRegularIcon(
            name = "FileSvg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.82 196.31c-.631 6.196-4.003 11.783-9.19 15.23C73.44 215 67 216 61.14 216 56.03 215.968 50.943 215.296 46 214c-4.202-1.231-6.634-5.61-5.457-9.828 1.177-4.217 5.525-6.705 9.757-5.582 4.38 1.2 14.95 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .35-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .63-6.073 3.928-11.551 9-14.95 11.84-8 30.72-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.48-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.11 .9-.14 1.09 1.12 1.9 2.31 1.49 6.44 2.68 10.45 3.84 9.79 2.83 26.35 7.66 24.11 24.97ZM216 88v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.119 .001 4.151 .843 5.65 2.34l56 56c1.504 1.5 2.349 3.536 2.35 5.66ZM160 80h28.69L160 51.31ZM146.7 144.47c-1.998-.715-4.199-.607-6.118 .3-1.919 .908-3.398 2.541-4.112 4.54L124 184.21 111.53 149.31c-.895-2.777-3.231-4.847-6.096-5.401-2.865-.554-5.804 .496-7.67 2.74-1.866 2.244-2.362 5.325-1.294 8.041l20 56c1.136 3.185 4.153 5.312 7.535 5.312 3.382 0 6.399-2.127 7.535-5.312l20-56c1.483-4.159-.683-8.733-4.84-10.22ZM208 176h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8v5.29c-2.304 1.743-5.111 2.694-8 2.71-8.82 0-16-9-16-20 0-11 7.18-20 16-20 2.693 .011 5.32 .841 7.53 2.38 3.659 2.383 8.553 1.391 10.996-2.228 2.443-3.619 1.532-8.529-2.046-11.032C203.623 145.802 197.882 144.018 192 144c-17.64 0-32 16.15-32 36 0 19.85 14.36 36 32 36 8.272-.067 16.15-3.54 21.78-9.6 1.425-1.489 2.22-3.47 2.22-5.53v-16.87c0-4.418-3.582-8-8-8Z"),
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
        return _fileSvg!!
    }

private var _fileSvg: ImageVector? = null
