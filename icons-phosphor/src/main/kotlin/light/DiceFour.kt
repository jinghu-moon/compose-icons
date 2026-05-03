package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorLightIcon(
            name = "DiceFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 34.000 L 64.000 34.000 C 47.431 34.000 34.000 47.431 34.000 64.000 L 34.000 192.000 C 34.000 208.569 47.431 222.000 64.000 222.000 L 192.000 222.000 C 208.569 222.000 222.000 208.569 222.000 192.000 L 222.000 64.000 C 222.000 47.431 208.569 34.000 192.000 34.000 ZM 210.000 192.000 C 210.000 201.941 201.941 210.000 192.000 210.000 L 64.000 210.000 C 54.059 210.000 46.000 201.941 46.000 192.000 L 46.000 64.000 C 46.000 54.059 54.059 46.000 64.000 46.000 L 192.000 46.000 C 201.941 46.000 210.000 54.059 210.000 64.000 ZM 110.000 100.000 C 110.000 105.523 105.523 110.000 100.000 110.000 C 94.477 110.000 90.000 105.523 90.000 100.000 C 90.000 94.477 94.477 90.000 100.000 90.000 C 105.523 90.000 110.000 94.477 110.000 100.000 ZM 166.000 100.000 C 166.000 105.523 161.523 110.000 156.000 110.000 C 150.477 110.000 146.000 105.523 146.000 100.000 C 146.000 94.477 150.477 90.000 156.000 90.000 C 161.523 90.000 166.000 94.477 166.000 100.000 ZM 110.000 156.000 C 110.000 161.523 105.523 166.000 100.000 166.000 C 94.477 166.000 90.000 161.523 90.000 156.000 C 90.000 150.477 94.477 146.000 100.000 146.000 C 105.523 146.000 110.000 150.477 110.000 156.000 ZM 166.000 156.000 C 166.000 161.523 161.523 166.000 156.000 166.000 C 150.477 166.000 146.000 161.523 146.000 156.000 C 146.000 150.477 150.477 146.000 156.000 146.000 C 161.523 146.000 166.000 150.477 166.000 156.000 Z"),
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
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
