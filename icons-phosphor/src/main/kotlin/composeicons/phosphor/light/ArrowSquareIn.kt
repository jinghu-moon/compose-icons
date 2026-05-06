package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorLightIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126 136v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-49.51L44.24 220.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L105.51 142h-49.51c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM208 34h-128C72.268 34 66 40.268 66 48v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v128c0 1.105-.895 2-2 2h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
