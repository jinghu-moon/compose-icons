package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorThinIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.37 213.84 132.75 53.5 155.37 18.16c1.193-1.861 .651-4.337-1.21-5.53-1.861-1.193-4.337-.651-5.53 1.21L128 46.08 107.37 13.84c-1.193-1.861-3.669-2.403-5.53-1.21-1.861 1.193-2.403 3.669-1.21 5.53l22.62 35.34L20.63 213.84c-.79 1.232-.845 2.796-.143 4.08 .702 1.284 2.049 2.081 3.513 2.08h208c1.463 .001 2.81-.797 3.513-2.08 .702-1.284 .648-2.848-.143-4.08ZM79 212l49-76.58L177 212ZM186.52 212 131.38 125.84c-.735-1.15-2.005-1.845-3.37-1.845-1.365 0-2.635 .696-3.37 1.845L69.49 212h-38.18L128 60.92 224.69 212Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
