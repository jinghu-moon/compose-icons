package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorLightIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 178h-10v-6C110 157.641 98.359 146 84 146c-14.359 0-26 11.641-26 26v6h-10c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM70 172c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v6h-28ZM114 218h-60v-28h60ZM212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v88c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-88c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
