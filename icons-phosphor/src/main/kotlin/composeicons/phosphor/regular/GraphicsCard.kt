package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorRegularIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48h-216c-4.418 0-8 3.582-8 8v152c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h112c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM232 176h-208v-112h208ZM176 160c22.091 0 40-17.909 40-40C216 97.909 198.091 80 176 80c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40ZM152 120c-.006-3.58 .797-7.115 2.35-10.34l32 32c-3.229 1.551-6.768 2.351-10.35 2.34-13.255 0-24-10.745-24-24ZM200 120c.006 3.58-.797 7.115-2.35 10.34l-32-32C168.879 96.789 172.418 95.989 176 96c13.255 0 24 10.745 24 24ZM80 160c22.091 0 40-17.909 40-40C120 97.909 102.091 80 80 80 57.909 80 40 97.909 40 120c0 22.091 17.909 40 40 40ZM56 120c-.006-3.58 .797-7.115 2.35-10.34l32 32C87.121 143.211 83.582 144.011 80 144 66.745 144 56 133.255 56 120ZM104 120c.006 3.58-.797 7.115-2.35 10.34l-32-32C72.879 96.789 76.418 95.989 80 96c13.255 0 24 10.745 24 24Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
