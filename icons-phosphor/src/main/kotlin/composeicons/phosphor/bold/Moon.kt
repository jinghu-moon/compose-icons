package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorBoldIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.37 139.4c-3.137-3.143-7.753-4.297-12-3-29.664 8.955-61.848 .867-83.755-21.047C118.709 93.438 110.634 61.25 119.6 31.59c1.308-4.249 .16-8.873-2.983-12.017-3.144-3.144-7.768-4.292-12.017-2.983C82.704 23.32 63.489 36.786 49.69 55.07 25.078 87.783 21.078 131.601 39.36 168.23 57.641 204.859 95.062 228.003 136 228c23.434 .069 46.243-7.551 64.93-21.69 18.275-13.813 31.726-33.038 38.44-54.94 1.285-4.238 .132-8.839-3-11.97ZM186.49 187.14c-33.443 25.176-80.318 21.887-109.918-7.712C46.973 149.828 43.684 102.953 68.86 69.51 75.267 61.035 83.208 53.837 92.27 48.29Q92 52.13 92 56c.066 59.619 48.381 107.934 108 108q3.87 0 7.71-.27c-5.544 9.064-12.742 17.005-21.22 23.41Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
