package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorLightIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 142.000 200.000 C 142.000 207.732 135.732 214.000 128.000 214.000 C 120.268 214.000 114.000 207.732 114.000 200.000 C 114.000 192.268 120.268 186.000 128.000 186.000 C 135.732 186.000 142.000 192.268 142.000 200.000 ZM 128.000 158.000 C 131.314 158.000 134.000 155.314 134.000 152.000 L 134.000 48.000 C 134.000 44.686 131.314 42.000 128.000 42.000 C 124.686 42.000 122.000 44.686 122.000 48.000 L 122.000 152.000 C 122.000 155.314 124.686 158.000 128.000 158.000 Z"),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
