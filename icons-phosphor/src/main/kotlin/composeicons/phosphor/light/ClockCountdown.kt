package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorLightIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 136.49c-4.636 53.934-50.552 94.88-104.663 93.333C71.226 228.276 27.724 184.774 26.177 130.663 24.63 76.552 65.576 30.636 119.51 26c3.314-.276 6.224 2.186 6.5 5.5 .276 3.314-2.186 6.224-5.5 6.5C72.902 42.077 36.749 82.599 38.107 130.361c1.357 47.763 39.753 86.166 87.515 87.533 47.763 1.367 88.292-34.777 92.378-82.384 .276-3.314 3.186-5.776 6.5-5.5 3.314 .276 5.776 3.186 5.5 6.5ZM122 72v56c0 3.314 2.686 6 6 6h56c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-50v-50c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6ZM160 46c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10ZM196 70c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10ZM220 106c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
