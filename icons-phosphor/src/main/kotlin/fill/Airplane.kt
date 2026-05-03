package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorFillIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 136.000 L 240.000 168.000 C 240.000 172.418 236.418 176.000 232.000 176.000 C 231.473 176.001 230.946 175.948 230.430 175.840 L 156.000 161.000 L 156.000 184.730 L 173.660 202.380 C 175.150 203.872 175.991 205.891 176.000 208.000 L 176.000 232.000 C 176.005 234.663 174.684 237.153 172.478 238.643 C 170.271 240.134 167.468 240.428 165.000 239.430 L 128.000 224.620 L 91.000 239.430 C 88.532 240.428 85.729 240.134 83.522 238.643 C 81.316 237.153 79.995 234.663 80.000 232.000 L 80.000 208.000 C 79.998 205.878 80.840 203.842 82.340 202.340 L 100.000 184.690 L 100.000 161.000 L 25.570 175.840 C 25.054 175.948 24.527 176.001 24.000 176.000 C 19.582 176.000 16.000 172.418 16.000 168.000 L 16.000 136.000 C 15.998 132.969 17.709 130.197 20.420 128.840 L 100.000 89.060 L 100.000 44.000 C 100.000 28.536 112.536 16.000 128.000 16.000 C 143.464 16.000 156.000 28.536 156.000 44.000 L 156.000 89.060 L 235.580 128.840 C 238.291 130.197 240.002 132.969 240.000 136.000 Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
