package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorBoldIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 32v144c0 6.627-5.373 12-12 12h-115l27.52 27.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-48-48c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L87.52 119.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L77 164h103v-132c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
