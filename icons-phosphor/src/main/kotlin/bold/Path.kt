package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorBoldIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 164.000 C 184.751 164.021 171.163 173.630 166.060 188.000 L 72.000 188.000 C 56.536 188.000 44.000 175.464 44.000 160.000 C 44.000 144.536 56.536 132.000 72.000 132.000 L 168.000 132.000 C 192.301 132.000 212.000 112.301 212.000 88.000 C 212.000 63.699 192.301 44.000 168.000 44.000 L 72.000 44.000 C 65.373 44.000 60.000 49.373 60.000 56.000 C 60.000 62.627 65.373 68.000 72.000 68.000 L 168.000 68.000 C 179.046 68.000 188.000 76.954 188.000 88.000 C 188.000 99.046 179.046 108.000 168.000 108.000 L 72.000 108.000 C 43.281 108.000 20.000 131.281 20.000 160.000 C 20.000 188.719 43.281 212.000 72.000 212.000 L 166.060 212.000 C 172.163 229.261 190.248 239.193 208.088 235.080 C 225.928 230.967 237.840 214.120 235.770 195.930 C 233.700 177.739 218.308 163.999 200.000 164.000 ZM 200.000 212.000 C 193.373 212.000 188.000 206.627 188.000 200.000 C 188.000 193.373 193.373 188.000 200.000 188.000 C 206.627 188.000 212.000 193.373 212.000 200.000 C 212.000 206.627 206.627 212.000 200.000 212.000 Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
