package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorLightIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 74.000 76.000 C 74.000 70.477 78.477 66.000 84.000 66.000 C 89.523 66.000 94.000 70.477 94.000 76.000 C 94.000 81.523 89.523 86.000 84.000 86.000 C 78.477 86.000 74.000 81.523 74.000 76.000 ZM 118.000 76.000 C 118.000 70.477 122.477 66.000 128.000 66.000 C 133.523 66.000 138.000 70.477 138.000 76.000 C 138.000 81.523 133.523 86.000 128.000 86.000 C 122.477 86.000 118.000 81.523 118.000 76.000 ZM 162.000 76.000 C 162.000 70.477 166.477 66.000 172.000 66.000 C 177.523 66.000 182.000 70.477 182.000 76.000 C 182.000 81.523 177.523 86.000 172.000 86.000 C 166.477 86.000 162.000 81.523 162.000 76.000 ZM 184.000 106.000 L 72.000 106.000 C 68.686 106.000 66.000 108.686 66.000 112.000 L 66.000 184.000 C 66.000 187.314 68.686 190.000 72.000 190.000 L 184.000 190.000 C 187.314 190.000 190.000 187.314 190.000 184.000 L 190.000 112.000 C 190.000 108.686 187.314 106.000 184.000 106.000 ZM 178.000 178.000 L 78.000 178.000 L 78.000 118.000 L 178.000 118.000 Z"),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
