package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorBoldIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 160.000 C 228.000 166.627 222.627 172.000 216.000 172.000 L 104.220 172.000 L 56.880 224.070 C 52.402 228.880 44.889 229.194 40.026 224.774 C 35.163 220.355 34.759 212.846 39.120 207.930 L 71.780 172.000 L 40.000 172.000 C 33.373 172.000 28.000 166.627 28.000 160.000 C 28.000 153.373 33.373 148.000 40.000 148.000 L 93.600 148.000 L 130.000 108.000 L 40.000 108.000 C 33.373 108.000 28.000 102.627 28.000 96.000 C 28.000 89.373 33.373 84.000 40.000 84.000 L 151.780 84.000 L 199.120 31.930 C 203.598 27.120 211.111 26.806 215.974 31.226 C 220.837 35.645 221.241 43.154 216.880 48.070 L 184.220 84.000 L 216.000 84.000 C 222.627 84.000 228.000 89.373 228.000 96.000 C 228.000 102.627 222.627 108.000 216.000 108.000 L 162.400 108.000 L 126.000 148.000 L 216.000 148.000 C 222.627 148.000 228.000 153.373 228.000 160.000 Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
