package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorLightIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 42.34v-10.34C166 19.85 156.15 10 144 10h-32C99.85 10 90 19.85 90 32v10.34C62.686 45.426 42.035 68.513 42 96v120c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-120C213.965 68.513 193.314 45.426 166 42.34ZM112 22h32c5.523 0 10 4.477 10 10v10h-52v-10c0-5.523 4.477-10 10-10ZM170 162h-84v-10c0-5.523 4.477-10 10-10h64c5.523 0 10 4.477 10 10ZM86 174h52v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h20v44h-84ZM202 216c0 1.105-.895 2-2 2h-18v-66c0-12.15-9.85-22-22-22h-64c-12.15 0-22 9.85-22 22v66h-18c-1.105 0-2-.895-2-2v-120C54 72.804 72.804 54 96 54h64c23.196 0 42 18.804 42 42ZM150 88c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
