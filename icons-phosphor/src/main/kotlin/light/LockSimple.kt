package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LockSimple: ImageVector
    get() {
        if (_lockSimple != null) return _lockSimple!!
        _lockSimple = phosphorLightIcon(
            name = "LockSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 82.000 L 174.000 82.000 L 174.000 56.000 C 174.000 30.595 153.405 10.000 128.000 10.000 C 102.595 10.000 82.000 30.595 82.000 56.000 L 82.000 82.000 L 48.000 82.000 C 40.268 82.000 34.000 88.268 34.000 96.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 96.000 C 222.000 88.268 215.732 82.000 208.000 82.000 ZM 94.000 56.000 C 94.000 37.222 109.222 22.000 128.000 22.000 C 146.778 22.000 162.000 37.222 162.000 56.000 L 162.000 82.000 L 94.000 82.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 96.000 C 46.000 94.895 46.895 94.000 48.000 94.000 L 208.000 94.000 C 209.105 94.000 210.000 94.895 210.000 96.000 Z"),
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
        return _lockSimple!!
    }

private var _lockSimple: ImageVector? = null
