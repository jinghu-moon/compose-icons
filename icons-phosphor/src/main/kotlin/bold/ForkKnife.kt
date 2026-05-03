package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorBoldIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 68.000 88.000 L 68.000 40.000 C 68.000 33.373 73.373 28.000 80.000 28.000 C 86.627 28.000 92.000 33.373 92.000 40.000 L 92.000 88.000 C 92.000 94.627 86.627 100.000 80.000 100.000 C 73.373 100.000 68.000 94.627 68.000 88.000 ZM 220.000 40.000 L 220.000 224.000 C 220.000 230.627 214.627 236.000 208.000 236.000 C 201.373 236.000 196.000 230.627 196.000 224.000 L 196.000 180.000 L 152.000 180.000 C 145.373 180.000 140.000 174.627 140.000 168.000 C 140.375 148.520 142.832 129.137 147.330 110.180 C 157.420 68.420 176.760 40.330 203.270 29.000 C 206.973 27.412 211.226 27.788 214.593 30.002 C 217.959 32.215 219.990 35.971 220.000 40.000 ZM 196.000 62.920 C 182.600 77.000 175.000 98.000 170.770 115.380 C 167.605 128.730 165.525 142.314 164.550 156.000 L 196.000 156.000 ZM 128.000 39.000 C 127.448 32.373 121.627 27.448 115.000 28.000 C 108.373 28.552 103.448 34.373 104.000 41.000 L 108.000 88.460 C 108.000 103.924 95.464 116.460 80.000 116.460 C 64.536 116.460 52.000 103.924 52.000 88.460 L 56.000 41.000 C 56.552 34.373 51.627 28.552 45.000 28.000 C 38.373 27.448 32.552 32.373 32.000 39.000 L 28.000 87.000 C 28.000 87.340 28.000 87.670 28.000 88.000 C 28.039 112.081 44.577 132.997 68.000 138.590 L 68.000 224.000 C 68.000 230.627 73.373 236.000 80.000 236.000 C 86.627 236.000 92.000 230.627 92.000 224.000 L 92.000 138.590 C 115.423 132.997 131.960 112.081 132.000 88.000 C 132.000 87.670 132.000 87.340 132.000 87.000 Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
