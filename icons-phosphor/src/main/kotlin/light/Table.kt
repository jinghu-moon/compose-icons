package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = phosphorLightIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 28.686 50.000 26.000 52.686 26.000 56.000 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 216.000 206.000 C 223.732 206.000 230.000 199.732 230.000 192.000 L 230.000 56.000 C 230.000 52.686 227.314 50.000 224.000 50.000 ZM 38.000 110.000 L 82.000 110.000 L 82.000 146.000 L 38.000 146.000 ZM 94.000 110.000 L 218.000 110.000 L 218.000 146.000 L 94.000 146.000 ZM 218.000 62.000 L 218.000 98.000 L 38.000 98.000 L 38.000 62.000 ZM 38.000 192.000 L 38.000 158.000 L 82.000 158.000 L 82.000 194.000 L 40.000 194.000 C 38.895 194.000 38.000 193.105 38.000 192.000 ZM 216.000 194.000 L 94.000 194.000 L 94.000 158.000 L 218.000 158.000 L 218.000 192.000 C 218.000 193.105 217.105 194.000 216.000 194.000 Z"),
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
        return _table!!
    }

private var _table: ImageVector? = null
