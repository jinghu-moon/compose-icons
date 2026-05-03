package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorLightIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 38.000 56.000 L 38.000 200.000 C 38.000 203.314 35.314 206.000 32.000 206.000 C 28.686 206.000 26.000 203.314 26.000 200.000 L 26.000 56.000 C 26.000 52.686 28.686 50.000 32.000 50.000 C 35.314 50.000 38.000 52.686 38.000 56.000 ZM 238.000 96.000 L 238.000 160.000 C 238.000 167.732 231.732 174.000 224.000 174.000 L 72.000 174.000 C 64.268 174.000 58.000 167.732 58.000 160.000 L 58.000 96.000 C 58.000 88.268 64.268 82.000 72.000 82.000 L 224.000 82.000 C 231.732 82.000 238.000 88.268 238.000 96.000 ZM 226.000 96.000 C 226.000 94.895 225.105 94.000 224.000 94.000 L 72.000 94.000 C 70.895 94.000 70.000 94.895 70.000 96.000 L 70.000 160.000 C 70.000 161.105 70.895 162.000 72.000 162.000 L 224.000 162.000 C 225.105 162.000 226.000 161.105 226.000 160.000 Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
