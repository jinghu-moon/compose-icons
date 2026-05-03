package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorBoldIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 44.000 C 74.981 44.000 32.000 86.981 32.000 140.000 C 32.000 193.019 74.981 236.000 128.000 236.000 C 181.019 236.000 224.000 193.019 224.000 140.000 C 223.939 87.006 180.994 44.061 128.000 44.000 ZM 128.000 212.000 C 88.235 212.000 56.000 179.764 56.000 140.000 C 56.000 100.235 88.235 68.000 128.000 68.000 C 167.764 68.000 200.000 100.235 200.000 140.000 C 199.956 179.746 167.746 211.956 128.000 212.000 ZM 164.490 99.510 C 166.749 101.762 168.019 104.820 168.019 108.010 C 168.019 111.200 166.749 114.258 164.490 116.510 L 136.490 144.510 C 131.796 149.204 124.184 149.204 119.490 144.510 C 114.796 139.816 114.796 132.204 119.490 127.510 L 147.490 99.510 C 149.742 97.251 152.800 95.981 155.990 95.981 C 159.180 95.981 162.238 97.251 164.490 99.510 ZM 92.000 16.000 C 92.000 9.373 97.373 4.000 104.000 4.000 L 152.000 4.000 C 158.627 4.000 164.000 9.373 164.000 16.000 C 164.000 22.627 158.627 28.000 152.000 28.000 L 104.000 28.000 C 97.373 28.000 92.000 22.627 92.000 16.000 Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
