package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorFillIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 184.000 164.000 C 184.000 167.030 182.288 169.800 179.578 171.155 C 176.867 172.511 173.624 172.218 171.200 170.400 L 123.200 134.400 C 121.186 132.889 120.000 130.518 120.000 128.000 L 120.000 164.000 C 120.000 167.030 118.288 169.800 115.578 171.155 C 112.867 172.511 109.624 172.218 107.200 170.400 L 59.200 134.400 C 57.186 132.889 56.000 130.518 56.000 128.000 C 56.000 125.482 57.186 123.111 59.200 121.600 L 107.200 85.600 C 109.624 83.782 112.867 83.489 115.578 84.845 C 118.288 86.200 120.000 88.970 120.000 92.000 L 120.000 128.000 C 120.000 125.482 121.186 123.111 123.200 121.600 L 171.200 85.600 C 173.624 83.782 176.867 83.489 179.578 84.845 C 182.288 86.200 184.000 88.970 184.000 92.000 Z"),
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
