package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorLightIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 162h-10v-6c0-14.359-11.641-26-26-26-14.359 0-26 11.641-26 26v6h-10c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM174 156c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v6h-28ZM218 202h-60v-28h60ZM216 74h-85.51L102.59 46.1C99.968 43.469 96.404 41.993 92.69 42h-52.69C32.268 42 26 48.268 26 56v144.62c.006 7.387 5.993 13.374 13.38 13.38h73.18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-73.18c-.758-.011-1.369-.622-1.38-1.38v-114.62h178c1.105 0 2 .895 2 2v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16c0-7.732-6.268-14-14-14ZM40 54h52.69c.53 .002 1.037 .214 1.41 .59L113.51 74h-75.51v-18c0-1.105 .895-2 2-2Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
