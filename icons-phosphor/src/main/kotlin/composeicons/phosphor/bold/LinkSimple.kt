package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorBoldIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.5 151.52l64-64c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-64 64c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17ZM218.5 37.52c-23.452-23.399-61.418-23.399-84.87 0L103.51 67.61c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L150.58 54.55c14.061-14.064 36.861-14.066 50.925-.005 14.064 14.061 14.066 36.861 .005 50.925l-30.11 30.05c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l30.08-30.06c23.412-23.467 23.398-61.46-.03-84.91ZM135.52 171.4l-30.07 30.08c-14.064 14.061-36.864 14.059-50.925-.005C40.464 187.411 40.466 164.611 54.53 150.55L84.59 120.48c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L37.55 133.58c-23.436 23.439-23.434 61.439 .005 84.875 23.439 23.436 61.439 23.434 84.875-.005l30.06-30.07c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
