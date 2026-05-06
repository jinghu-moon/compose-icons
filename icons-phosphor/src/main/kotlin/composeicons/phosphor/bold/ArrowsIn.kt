package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorBoldIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 104v-40c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v11L199.51 39.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L181 92h11c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12ZM104 140h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h11L39.51 199.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L92 181v11c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM181 164h11c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-40c-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-11l35.51 35.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM104 52C97.373 52 92 57.373 92 64v11L56.49 39.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L75 92h-11c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
