package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorLightIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 32.000 C 206.000 35.314 203.314 38.000 200.000 38.000 L 56.000 38.000 C 52.686 38.000 50.000 35.314 50.000 32.000 C 50.000 28.686 52.686 26.000 56.000 26.000 L 200.000 26.000 C 203.314 26.000 206.000 28.686 206.000 32.000 ZM 174.000 72.000 L 174.000 224.000 C 174.000 231.732 167.732 238.000 160.000 238.000 L 96.000 238.000 C 88.268 238.000 82.000 231.732 82.000 224.000 L 82.000 72.000 C 82.000 64.268 88.268 58.000 96.000 58.000 L 160.000 58.000 C 167.732 58.000 174.000 64.268 174.000 72.000 ZM 162.000 72.000 C 162.000 70.895 161.105 70.000 160.000 70.000 L 96.000 70.000 C 94.895 70.000 94.000 70.895 94.000 72.000 L 94.000 224.000 C 94.000 225.105 94.895 226.000 96.000 226.000 L 160.000 226.000 C 161.105 226.000 162.000 225.105 162.000 224.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
