package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorBoldIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 180.000 96.000 L 180.000 160.000 C 180.001 164.614 177.356 168.820 173.197 170.819 C 169.038 172.817 164.102 172.254 160.500 169.370 L 124.000 140.170 L 124.000 160.000 C 124.001 164.614 121.356 168.820 117.197 170.819 C 113.038 172.817 108.102 172.254 104.500 169.370 L 64.500 137.370 C 61.654 135.093 59.997 131.645 59.997 128.000 C 59.997 124.355 61.654 120.907 64.500 118.630 L 104.500 86.630 C 108.102 83.746 113.038 83.183 117.197 85.181 C 121.356 87.180 124.001 91.386 124.000 96.000 L 124.000 115.830 L 160.500 86.630 C 164.102 83.746 169.038 83.183 173.197 85.181 C 177.356 87.180 180.001 91.386 180.000 96.000 Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
