package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorLightIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 118c3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c-.001-1.591-.634-3.116-1.76-4.24l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6ZM158 46.48 193.52 82h-35.52ZM152.88 155.48 135.37 180l17.51 24.51c1.933 2.695 1.315 6.447-1.38 8.38-2.695 1.933-6.447 1.315-8.38-1.38L128 190.32l-15.12 21.17c-1.933 2.695-5.685 3.313-8.38 1.38-2.695-1.933-3.313-5.685-1.38-8.38L120.63 180 103.12 155.49c-1.933-2.695-1.315-6.447 1.38-8.38 2.695-1.933 6.447-1.315 8.38 1.38L128 169.68l15.12-21.17c1.933-2.695 5.685-3.313 8.38-1.38 2.695 1.933 3.313 5.685 1.38 8.38ZM90 152c0 3.314-2.686 6-6 6h-14v50c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-50h-14c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM218 152c0 3.314-2.686 6-6 6h-14v50c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-50h-14c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
