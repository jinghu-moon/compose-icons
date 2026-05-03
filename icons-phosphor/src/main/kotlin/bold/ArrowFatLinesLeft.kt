package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorBoldIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 68.000 L 132.000 68.000 L 132.000 32.000 C 132.004 27.144 129.080 22.764 124.593 20.905 C 120.107 19.046 114.942 20.074 111.510 23.510 L 15.510 119.510 C 13.251 121.762 11.981 124.820 11.981 128.010 C 11.981 131.200 13.251 134.258 15.510 136.510 L 111.510 232.510 C 114.945 235.949 120.114 236.976 124.603 235.112 C 129.091 233.248 132.012 228.860 132.000 224.000 L 132.000 188.000 L 136.000 188.000 C 142.627 188.000 148.000 182.627 148.000 176.000 L 148.000 80.000 C 148.000 73.373 142.627 68.000 136.000 68.000 ZM 124.000 164.000 L 120.000 164.000 C 113.373 164.000 108.000 169.373 108.000 176.000 L 108.000 195.000 L 41.000 128.000 L 108.000 61.000 L 108.000 80.000 C 108.000 86.627 113.373 92.000 120.000 92.000 L 124.000 92.000 ZM 228.000 80.000 L 228.000 176.000 C 228.000 182.627 222.627 188.000 216.000 188.000 C 209.373 188.000 204.000 182.627 204.000 176.000 L 204.000 80.000 C 204.000 73.373 209.373 68.000 216.000 68.000 C 222.627 68.000 228.000 73.373 228.000 80.000 ZM 188.000 80.000 L 188.000 176.000 C 188.000 182.627 182.627 188.000 176.000 188.000 C 169.373 188.000 164.000 182.627 164.000 176.000 L 164.000 80.000 C 164.000 73.373 169.373 68.000 176.000 68.000 C 182.627 68.000 188.000 73.373 188.000 80.000 Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
