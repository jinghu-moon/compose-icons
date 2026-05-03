package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorLightIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 50.000 L 40.000 50.000 C 36.686 50.000 34.000 52.686 34.000 56.000 C 34.000 59.314 36.686 62.000 40.000 62.000 L 50.000 62.000 L 50.000 208.000 C 50.000 215.732 56.268 222.000 64.000 222.000 L 192.000 222.000 C 199.732 222.000 206.000 215.732 206.000 208.000 L 206.000 62.000 L 216.000 62.000 C 219.314 62.000 222.000 59.314 222.000 56.000 C 222.000 52.686 219.314 50.000 216.000 50.000 ZM 194.000 208.000 C 194.000 209.105 193.105 210.000 192.000 210.000 L 64.000 210.000 C 62.895 210.000 62.000 209.105 62.000 208.000 L 62.000 62.000 L 194.000 62.000 ZM 82.000 24.000 C 82.000 20.686 84.686 18.000 88.000 18.000 L 168.000 18.000 C 171.314 18.000 174.000 20.686 174.000 24.000 C 174.000 27.314 171.314 30.000 168.000 30.000 L 88.000 30.000 C 84.686 30.000 82.000 27.314 82.000 24.000 Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
