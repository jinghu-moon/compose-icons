package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorBoldIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 104.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L180 77v115c0 6.627-5.373 12-12 12h-144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h132v-103l-27.51 27.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L159.49 39.52c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l48 48c4.686 4.686 4.686 12.284 0 16.97Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
