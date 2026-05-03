package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorLightIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 50.000 L 174.000 50.000 L 174.000 40.000 C 174.000 27.850 164.150 18.000 152.000 18.000 L 104.000 18.000 C 91.850 18.000 82.000 27.850 82.000 40.000 L 82.000 50.000 L 40.000 50.000 C 36.686 50.000 34.000 52.686 34.000 56.000 C 34.000 59.314 36.686 62.000 40.000 62.000 L 50.000 62.000 L 50.000 208.000 C 50.000 215.732 56.268 222.000 64.000 222.000 L 192.000 222.000 C 199.732 222.000 206.000 215.732 206.000 208.000 L 206.000 62.000 L 216.000 62.000 C 219.314 62.000 222.000 59.314 222.000 56.000 C 222.000 52.686 219.314 50.000 216.000 50.000 ZM 94.000 40.000 C 94.000 34.477 98.477 30.000 104.000 30.000 L 152.000 30.000 C 157.523 30.000 162.000 34.477 162.000 40.000 L 162.000 50.000 L 94.000 50.000 ZM 194.000 208.000 C 194.000 209.105 193.105 210.000 192.000 210.000 L 64.000 210.000 C 62.895 210.000 62.000 209.105 62.000 208.000 L 62.000 62.000 L 194.000 62.000 ZM 110.000 104.000 L 110.000 168.000 C 110.000 171.314 107.314 174.000 104.000 174.000 C 100.686 174.000 98.000 171.314 98.000 168.000 L 98.000 104.000 C 98.000 100.686 100.686 98.000 104.000 98.000 C 107.314 98.000 110.000 100.686 110.000 104.000 ZM 158.000 104.000 L 158.000 168.000 C 158.000 171.314 155.314 174.000 152.000 174.000 C 148.686 174.000 146.000 171.314 146.000 168.000 L 146.000 104.000 C 146.000 100.686 148.686 98.000 152.000 98.000 C 155.314 98.000 158.000 100.686 158.000 104.000 Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
