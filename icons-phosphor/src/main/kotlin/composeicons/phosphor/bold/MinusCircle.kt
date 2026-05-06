package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MinusCircle: ImageVector
    get() {
        if (_minusCircle != null) return _minusCircle!!
        _minusCircle = phosphorBoldIcon(
            name = "MinusCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 128c0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84Z"),
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
        return _minusCircle!!
    }

private var _minusCircle: ImageVector? = null
