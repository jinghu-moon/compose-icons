package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorLightIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 146.000 L 158.000 146.000 L 158.000 110.000 L 180.000 110.000 C 198.778 110.000 214.000 94.778 214.000 76.000 C 214.000 57.222 198.778 42.000 180.000 42.000 C 161.222 42.000 146.000 57.222 146.000 76.000 L 146.000 98.000 L 110.000 98.000 L 110.000 76.000 C 110.000 57.222 94.778 42.000 76.000 42.000 C 57.222 42.000 42.000 57.222 42.000 76.000 C 42.000 94.778 57.222 110.000 76.000 110.000 L 98.000 110.000 L 98.000 146.000 L 76.000 146.000 C 57.222 146.000 42.000 161.222 42.000 180.000 C 42.000 198.778 57.222 214.000 76.000 214.000 C 94.778 214.000 110.000 198.778 110.000 180.000 L 110.000 158.000 L 146.000 158.000 L 146.000 180.000 C 146.000 198.778 161.222 214.000 180.000 214.000 C 198.778 214.000 214.000 198.778 214.000 180.000 C 214.000 161.222 198.778 146.000 180.000 146.000 ZM 158.000 76.000 C 158.000 63.850 167.850 54.000 180.000 54.000 C 192.150 54.000 202.000 63.850 202.000 76.000 C 202.000 88.150 192.150 98.000 180.000 98.000 L 158.000 98.000 ZM 54.000 76.000 C 54.000 63.850 63.850 54.000 76.000 54.000 C 88.150 54.000 98.000 63.850 98.000 76.000 L 98.000 98.000 L 76.000 98.000 C 63.850 98.000 54.000 88.150 54.000 76.000 ZM 98.000 180.000 C 98.000 192.150 88.150 202.000 76.000 202.000 C 63.850 202.000 54.000 192.150 54.000 180.000 C 54.000 167.850 63.850 158.000 76.000 158.000 L 98.000 158.000 ZM 110.000 110.000 L 146.000 110.000 L 146.000 146.000 L 110.000 146.000 ZM 180.000 202.000 C 167.850 202.000 158.000 192.150 158.000 180.000 L 158.000 158.000 L 180.000 158.000 C 192.150 158.000 202.000 167.850 202.000 180.000 C 202.000 192.150 192.150 202.000 180.000 202.000 Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
