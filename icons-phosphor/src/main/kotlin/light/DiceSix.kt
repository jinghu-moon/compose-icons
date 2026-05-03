package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceSix: ImageVector
    get() {
        if (_diceSix != null) return _diceSix!!
        _diceSix = phosphorLightIcon(
            name = "DiceSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 34.000 L 64.000 34.000 C 47.431 34.000 34.000 47.431 34.000 64.000 L 34.000 192.000 C 34.000 208.569 47.431 222.000 64.000 222.000 L 192.000 222.000 C 208.569 222.000 222.000 208.569 222.000 192.000 L 222.000 64.000 C 222.000 47.431 208.569 34.000 192.000 34.000 ZM 210.000 192.000 C 210.000 201.941 201.941 210.000 192.000 210.000 L 64.000 210.000 C 54.059 210.000 46.000 201.941 46.000 192.000 L 46.000 64.000 C 46.000 54.059 54.059 46.000 64.000 46.000 L 192.000 46.000 C 201.941 46.000 210.000 54.059 210.000 64.000 ZM 102.000 84.000 C 102.000 89.523 97.523 94.000 92.000 94.000 C 86.477 94.000 82.000 89.523 82.000 84.000 C 82.000 78.477 86.477 74.000 92.000 74.000 C 97.523 74.000 102.000 78.477 102.000 84.000 ZM 174.000 84.000 C 174.000 89.523 169.523 94.000 164.000 94.000 C 158.477 94.000 154.000 89.523 154.000 84.000 C 154.000 78.477 158.477 74.000 164.000 74.000 C 169.523 74.000 174.000 78.477 174.000 84.000 ZM 102.000 128.000 C 102.000 133.523 97.523 138.000 92.000 138.000 C 86.477 138.000 82.000 133.523 82.000 128.000 C 82.000 122.477 86.477 118.000 92.000 118.000 C 97.523 118.000 102.000 122.477 102.000 128.000 ZM 174.000 128.000 C 174.000 133.523 169.523 138.000 164.000 138.000 C 158.477 138.000 154.000 133.523 154.000 128.000 C 154.000 122.477 158.477 118.000 164.000 118.000 C 169.523 118.000 174.000 122.477 174.000 128.000 ZM 102.000 172.000 C 102.000 177.523 97.523 182.000 92.000 182.000 C 86.477 182.000 82.000 177.523 82.000 172.000 C 82.000 166.477 86.477 162.000 92.000 162.000 C 97.523 162.000 102.000 166.477 102.000 172.000 ZM 174.000 172.000 C 174.000 177.523 169.523 182.000 164.000 182.000 C 158.477 182.000 154.000 177.523 154.000 172.000 C 154.000 166.477 158.477 162.000 164.000 162.000 C 169.523 162.000 174.000 166.477 174.000 172.000 Z"),
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
        return _diceSix!!
    }

private var _diceSix: ImageVector? = null
