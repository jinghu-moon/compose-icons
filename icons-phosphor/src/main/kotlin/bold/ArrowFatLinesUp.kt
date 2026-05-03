package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorBoldIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 111.510 L 136.490 15.510 C 134.238 13.251 131.180 11.981 127.990 11.981 C 124.800 11.981 121.742 13.251 119.490 15.510 L 23.490 111.510 C 20.051 114.945 19.024 120.114 20.888 124.603 C 22.752 129.091 27.140 132.012 32.000 132.000 L 68.000 132.000 L 68.000 136.000 C 68.000 142.627 73.373 148.000 80.000 148.000 L 176.000 148.000 C 182.627 148.000 188.000 142.627 188.000 136.000 L 188.000 132.000 L 224.000 132.000 C 228.856 132.004 233.236 129.080 235.095 124.593 C 236.954 120.107 235.926 114.942 232.490 111.510 ZM 176.000 108.000 C 169.373 108.000 164.000 113.373 164.000 120.000 L 164.000 124.000 L 92.000 124.000 L 92.000 120.000 C 92.000 113.373 86.627 108.000 80.000 108.000 L 61.000 108.000 L 128.000 41.000 L 195.000 108.000 ZM 188.000 216.000 C 188.000 222.627 182.627 228.000 176.000 228.000 L 80.000 228.000 C 73.373 228.000 68.000 222.627 68.000 216.000 C 68.000 209.373 73.373 204.000 80.000 204.000 L 176.000 204.000 C 182.627 204.000 188.000 209.373 188.000 216.000 ZM 188.000 176.000 C 188.000 182.627 182.627 188.000 176.000 188.000 L 80.000 188.000 C 73.373 188.000 68.000 182.627 68.000 176.000 C 68.000 169.373 73.373 164.000 80.000 164.000 L 176.000 164.000 C 182.627 164.000 188.000 169.373 188.000 176.000 Z"),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
