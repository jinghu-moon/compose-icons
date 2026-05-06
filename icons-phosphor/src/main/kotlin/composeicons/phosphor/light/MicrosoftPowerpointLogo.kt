package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorLightIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 98h-16c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c12.15 0 22-9.85 22-22C118 107.85 108.15 98 96 98ZM96 130h-10v-20h10c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM136 26C104.258 26.052 74.337 40.828 55 66h-15C32.268 66 26 72.268 26 80v96c0 7.732 6.268 14 14 14h15c29.079 37.988 80.654 50.661 124.028 30.477 43.374-20.184 66.892-67.801 56.558-114.512C225.251 59.255 183.84 26.003 136 26ZM225.8 122h-67.8v-42c0-7.732-6.268-14-14-14h-2v-27.8c44.949 3.069 80.731 38.851 83.8 83.8ZM130 38.21v27.79h-59.22C86.358 49.668 107.483 39.755 130 38.21ZM38 176v-96c0-1.105 .895-2 2-2h104c1.105 0 2 .895 2 2v96c0 1.105-.895 2-2 2h-104c-1.105 0-2-.895-2-2ZM70.78 190h59.22v27.79C107.483 216.245 86.358 206.332 70.78 190ZM142 217.8v-27.8h2c7.732 0 14-6.268 14-14v-42h67.8c-3.065 44.951-38.849 80.735-83.8 83.8Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
