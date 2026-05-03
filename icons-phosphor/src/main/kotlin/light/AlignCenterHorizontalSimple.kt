package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorLightIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 82.000 L 134.000 82.000 L 134.000 48.000 C 134.000 44.686 131.314 42.000 128.000 42.000 C 124.686 42.000 122.000 44.686 122.000 48.000 L 122.000 82.000 L 48.000 82.000 C 40.268 82.000 34.000 88.268 34.000 96.000 L 34.000 160.000 C 34.000 167.732 40.268 174.000 48.000 174.000 L 122.000 174.000 L 122.000 208.000 C 122.000 211.314 124.686 214.000 128.000 214.000 C 131.314 214.000 134.000 211.314 134.000 208.000 L 134.000 174.000 L 208.000 174.000 C 215.732 174.000 222.000 167.732 222.000 160.000 L 222.000 96.000 C 222.000 88.268 215.732 82.000 208.000 82.000 ZM 210.000 160.000 C 210.000 161.105 209.105 162.000 208.000 162.000 L 48.000 162.000 C 46.895 162.000 46.000 161.105 46.000 160.000 L 46.000 96.000 C 46.000 94.895 46.895 94.000 48.000 94.000 L 208.000 94.000 C 209.105 94.000 210.000 94.895 210.000 96.000 Z"),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
