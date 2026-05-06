package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorLightIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 58h-208C16.268 58 10 64.268 10 72v112c0 7.732 6.268 14 14 14h208c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM234 184c0 1.105-.895 2-2 2h-208c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h208c1.105 0 2 .895 2 2ZM126 102v20h10c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-10v20h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM213.78 97.62l-18 64c-.723 2.595-3.086 4.39-5.78 4.39-2.694 0-5.057-1.795-5.78-4.39l-18-64c-.895-3.192 .968-6.505 4.16-7.4 3.192-.895 6.505 .968 7.4 4.16L190 137.84 202.22 94.38c.895-3.192 4.208-5.055 7.4-4.16 3.192 .895 5.055 4.208 4.16 7.4ZM64 90h-8c-3.314 0-6 2.686-6 6v64c0 3.314 2.686 6 6 6h8c16.569 0 30-13.431 30-30v-16C94 103.431 80.569 90 64 90ZM82 136c0 9.941-8.059 18-18 18h-2v-52h2c9.941 0 18 8.059 18 18Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
