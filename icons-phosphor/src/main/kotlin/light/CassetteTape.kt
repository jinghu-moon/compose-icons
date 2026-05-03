package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorLightIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 76.000 194.000 L 91.000 174.000 L 165.000 174.000 L 180.000 194.000 ZM 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 195.000 194.000 L 172.800 164.400 C 171.667 162.889 169.889 162.000 168.000 162.000 L 88.000 162.000 C 86.111 162.000 84.333 162.889 83.200 164.400 L 61.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 ZM 176.000 82.000 L 80.000 82.000 C 63.431 82.000 50.000 95.431 50.000 112.000 C 50.000 128.569 63.431 142.000 80.000 142.000 L 176.000 142.000 C 192.569 142.000 206.000 128.569 206.000 112.000 C 206.000 95.431 192.569 82.000 176.000 82.000 ZM 152.000 94.000 C 143.973 104.658 143.973 119.342 152.000 130.000 L 104.000 130.000 C 112.027 119.342 112.027 104.658 104.000 94.000 ZM 62.000 112.000 C 62.000 102.059 70.059 94.000 80.000 94.000 C 89.941 94.000 98.000 102.059 98.000 112.000 C 98.000 121.941 89.941 130.000 80.000 130.000 C 70.059 130.000 62.000 121.941 62.000 112.000 ZM 176.000 130.000 C 166.059 130.000 158.000 121.941 158.000 112.000 C 158.000 102.059 166.059 94.000 176.000 94.000 C 185.941 94.000 194.000 102.059 194.000 112.000 C 194.000 121.941 185.941 130.000 176.000 130.000 Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
