package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorLightIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 42h-21.52L164.25 27.76C163.123 26.632 161.594 25.999 160 26h-64c-1.594-.001-3.123 .632-4.25 1.76L77.52 42h-21.52C48.268 42 42 48.268 42 56v152c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-152c0-7.732-6.268-14-14-14ZM128 69.18 107.21 38h41.58ZM160.93 41.42 170 50.49v53.51c-0 .769-.442 1.469-1.135 1.802-.693 .333-1.515 .239-2.115-.242L135.93 78.92ZM86 50.49l9.07-9.07 25 37.5L89.25 105.54c-.597 .478-1.415 .574-2.107 .246C86.452 105.459 86.008 104.765 86 104ZM54 208v-152c0-1.105 .895-2 2-2h18v50c-.034 5.442 3.118 10.401 8.06 12.68 1.86 .867 3.888 1.317 5.94 1.32 3.292 .016 6.482-1.14 9-3.26l.08-.07 25-21.56v116.89h-66.08c-1.105 0-2-.895-2-2ZM202 208c0 1.105-.895 2-2 2h-66v-116.89l25 21.56 .08 .07c2.497 2.102 5.656 3.257 8.92 3.26 2.075-.002 4.124-.463 6-1.35 4.908-2.293 8.033-7.233 8-12.65v-50h18c1.105 0 2 .895 2 2Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
