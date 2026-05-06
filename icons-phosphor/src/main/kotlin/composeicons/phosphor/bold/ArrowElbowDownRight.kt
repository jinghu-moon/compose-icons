package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorBoldIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 184.49l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L187 188h-115c-6.627 0-12-5.373-12-12v-144C60 25.373 65.373 20 72 20c6.627 0 12 5.373 12 12v132h103L159.48 136.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l48 48c2.261 2.25 3.533 5.308 3.534 8.498 .002 3.19-1.266 6.249-3.524 8.502Z"),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
