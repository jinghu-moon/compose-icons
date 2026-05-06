package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorBoldIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.45 122.43l-30.08 30.06c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l30.08-30.07c14.061-14.064 14.059-36.864-.005-50.925C187.381 40.434 164.581 40.436 150.52 54.5L120.48 84.59c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L133.55 37.53c23.439-23.436 61.439-23.434 84.875 .005 23.436 23.439 23.434 61.439-.005 84.875ZM135.52 171.43l-30.07 30.08c-14.064 14.061-36.864 14.059-50.925-.005C40.464 187.441 40.466 164.641 54.53 150.58L84.59 120.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L37.55 133.58c-23.436 23.439-23.434 61.439 .005 84.875 23.439 23.436 61.439 23.434 84.875-.005l30.06-30.07c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
