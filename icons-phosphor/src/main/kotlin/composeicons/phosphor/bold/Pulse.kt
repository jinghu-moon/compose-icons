package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorBoldIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128c0 6.627-5.373 12-12 12h-24.58l-36.69 73.37c-2.033 4.063-6.187 6.629-10.73 6.63h-.6c-4.755-.241-8.918-3.27-10.61-7.72L95 71.15 66.92 133c-1.957 4.269-6.224 7.004-10.92 7h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24.27L85.08 35c2.007-4.402 6.462-7.169 11.298-7.016 4.836 .153 9.107 3.195 10.832 7.716l54.28 142.46 27.78-55.56c2.042-4.051 6.193-6.605 10.73-6.6h32c6.627 0 12 5.373 12 12Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
