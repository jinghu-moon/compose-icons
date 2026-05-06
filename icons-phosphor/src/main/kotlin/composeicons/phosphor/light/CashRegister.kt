package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = phosphorLightIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.82 158.54 215.34 68.61C213.783 62.373 208.179 57.997 201.75 58h-67.75v-18c0-7.732-6.268-14-14-14h-40C72.268 26 66 32.268 66 40v18h-11.75C47.824 57.996 42.221 62.367 40.66 68.6L18.18 158.54c-.12 .477-.18 .968-.18 1.46v32c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-32c0-.492-.06-.983-.18-1.46ZM78 40c0-1.105 .895-2 2-2h40c1.105 0 2 .895 2 2v18h-44ZM52.31 71.51c.224-.888 1.024-1.51 1.94-1.51h147.5c.916-0 1.716 .622 1.94 1.51L224.32 154h-192.64ZM224 194h-192c-1.105 0-2-.895-2-2v-26h196v26c0 1.105-.895 2-2 2ZM66 96c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM114 96c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM162 96c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM66 128c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM114 128c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM162 128c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6Z"),
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
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
