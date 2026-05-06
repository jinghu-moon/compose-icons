package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorBoldIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 128v-80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM182.55 46c-5.541-3.412-12.792-1.786-16.345 3.666-3.553 5.452-2.114 12.742 3.245 16.434C191.41 80.37 204 103 204 128c0 41.974-34.026 76-76 76C86.026 204 52 169.974 52 128 52 103 64.59 80.37 86.55 66.05c5.063-3.795 6.31-10.869 2.849-16.166C85.938 44.587 78.959 42.887 73.45 46 44.56 64.78 28 94.69 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C228 94.69 211.44 64.78 182.55 46Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
