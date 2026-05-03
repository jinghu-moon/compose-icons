package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleDownLeft: ImageVector
    get() {
        if (_arrowCircleDownLeft != null) return _arrowCircleDownLeft!!
        _arrowCircleDownLeft = phosphorBoldIcon(
            name = "ArrowCircleDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 168.490 87.510 C 170.749 89.762 172.019 92.820 172.019 96.010 C 172.019 99.200 170.749 102.258 168.490 104.510 L 125.000 148.000 L 144.000 148.000 C 150.627 148.000 156.000 153.373 156.000 160.000 C 156.000 166.627 150.627 172.000 144.000 172.000 L 96.000 172.000 C 89.373 172.000 84.000 166.627 84.000 160.000 L 84.000 112.000 C 84.000 105.373 89.373 100.000 96.000 100.000 C 102.627 100.000 108.000 105.373 108.000 112.000 L 108.000 131.000 L 151.510 87.480 C 153.765 85.231 156.821 83.970 160.006 83.976 C 163.191 83.981 166.243 85.253 168.490 87.510 Z"),
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
        return _arrowCircleDownLeft!!
    }

private var _arrowCircleDownLeft: ImageVector? = null
