package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorLightIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 232.000 C 206.000 235.314 203.314 238.000 200.000 238.000 L 56.000 238.000 C 52.686 238.000 50.000 235.314 50.000 232.000 C 50.000 228.686 52.686 226.000 56.000 226.000 L 200.000 226.000 C 203.314 226.000 206.000 228.686 206.000 232.000 ZM 82.000 192.000 L 82.000 40.000 C 82.000 32.268 88.268 26.000 96.000 26.000 L 160.000 26.000 C 167.732 26.000 174.000 32.268 174.000 40.000 L 174.000 192.000 C 174.000 199.732 167.732 206.000 160.000 206.000 L 96.000 206.000 C 88.268 206.000 82.000 199.732 82.000 192.000 ZM 94.000 192.000 C 94.000 193.105 94.895 194.000 96.000 194.000 L 160.000 194.000 C 161.105 194.000 162.000 193.105 162.000 192.000 L 162.000 40.000 C 162.000 38.895 161.105 38.000 160.000 38.000 L 96.000 38.000 C 94.895 38.000 94.000 38.895 94.000 40.000 Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
