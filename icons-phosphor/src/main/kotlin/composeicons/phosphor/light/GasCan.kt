package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorLightIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 26h-76.69c-3.714-.007-7.278 1.469-9.9 4.1L101.66 41.86 89.9 30.1C87.274 27.474 83.713 25.999 80 25.999c-3.713 0-7.274 1.475-9.9 4.101l-24 24C43.474 56.726 41.999 60.287 41.999 64c0 3.713 1.475 7.274 4.101 9.9L57.86 85.66 46.1 97.41c-2.631 2.622-4.107 6.186-4.1 9.9v108.69c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-176c0-7.732-6.268-14-14-14ZM54.59 65.41c-.775-.78-.775-2.04 0-2.82l24-24c.78-.775 2.04-.775 2.82 0L93.17 50.34 66.34 77.17ZM202 216c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-108.69c.002-.53 .214-1.037 .59-1.41l16-16h0L105.9 54.59h0l16-16c.373-.376 .88-.588 1.41-.59h76.69c1.105 0 2 .895 2 2ZM182 64c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM179.6 124.8 138 156l41.6 31.2c2.651 1.988 3.188 5.749 1.2 8.4-1.988 2.651-5.749 3.188-8.4 1.2L128 163.5 83.6 196.8c-2.651 1.988-6.412 1.451-8.4-1.2-1.988-2.651-1.451-6.412 1.2-8.4L118 156 76.4 124.8c-2.651-1.988-3.188-5.749-1.2-8.4 1.988-2.651 5.749-3.188 8.4-1.2L128 148.5l44.4-33.3c2.651-1.988 6.412-1.451 8.4 1.2 1.988 2.651 1.451 6.412-1.2 8.4Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
