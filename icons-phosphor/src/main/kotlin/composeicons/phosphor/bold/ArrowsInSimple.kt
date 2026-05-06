package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorBoldIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 56.48 177 96h19c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v19L199.51 39.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM108 136h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h19L39.51 199.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L96 177v19c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12Z"),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
