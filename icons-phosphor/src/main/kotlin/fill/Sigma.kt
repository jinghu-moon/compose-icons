package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorFillIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 184.000 88.000 C 184.000 92.418 180.418 96.000 176.000 96.000 C 171.582 96.000 168.000 92.418 168.000 88.000 L 168.000 72.000 L 96.000 72.000 L 134.400 123.200 C 136.533 126.044 136.533 129.956 134.400 132.800 L 96.000 184.000 L 168.000 184.000 L 168.000 168.000 C 168.000 163.582 171.582 160.000 176.000 160.000 C 180.418 160.000 184.000 163.582 184.000 168.000 L 184.000 192.000 C 184.000 196.418 180.418 200.000 176.000 200.000 L 80.000 200.000 C 76.970 200.000 74.200 198.288 72.845 195.578 C 71.489 192.867 71.782 189.624 73.600 187.200 L 118.000 128.000 L 73.600 68.800 C 71.782 66.376 71.489 63.133 72.845 60.422 C 74.200 57.712 76.970 56.000 80.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _sigma!!
    }

private var _sigma: ImageVector? = null
