package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorLightIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 90h-18v-26c0-7.732-6.268-14-14-14h-152C40.268 50 34 56.268 34 64v26h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v26c0 7.732 6.268 14 14 14h152c7.732 0 14-6.268 14-14v-26h18c1.105 0 2 .895 2 2v50c-.001 .892-.593 1.675-1.45 1.92L132.15 184.6C126.175 186.33 122.047 191.78 122 198v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34c.001-.892 .593-1.675 1.45-1.92L235.85 167.4C241.825 165.67 245.953 160.22 246 154v-50c0-7.732-6.268-14-14-14ZM202 128c0 1.105-.895 2-2 2h-152c-1.105 0-2-.895-2-2v-64c0-1.105 .895-2 2-2h152c1.105 0 2 .895 2 2Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
