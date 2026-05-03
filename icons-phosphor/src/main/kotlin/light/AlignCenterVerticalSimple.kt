package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorLightIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 122.000 L 174.000 122.000 L 174.000 48.000 C 174.000 40.268 167.732 34.000 160.000 34.000 L 96.000 34.000 C 88.268 34.000 82.000 40.268 82.000 48.000 L 82.000 122.000 L 48.000 122.000 C 44.686 122.000 42.000 124.686 42.000 128.000 C 42.000 131.314 44.686 134.000 48.000 134.000 L 82.000 134.000 L 82.000 208.000 C 82.000 215.732 88.268 222.000 96.000 222.000 L 160.000 222.000 C 167.732 222.000 174.000 215.732 174.000 208.000 L 174.000 134.000 L 208.000 134.000 C 211.314 134.000 214.000 131.314 214.000 128.000 C 214.000 124.686 211.314 122.000 208.000 122.000 ZM 162.000 208.000 C 162.000 209.105 161.105 210.000 160.000 210.000 L 96.000 210.000 C 94.895 210.000 94.000 209.105 94.000 208.000 L 94.000 48.000 C 94.000 46.895 94.895 46.000 96.000 46.000 L 160.000 46.000 C 161.105 46.000 162.000 46.895 162.000 48.000 Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
