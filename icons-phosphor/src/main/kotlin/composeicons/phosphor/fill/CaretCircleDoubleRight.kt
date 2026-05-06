package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorFillIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.57 54.42C160.945 13.835 95.114 13.856 54.516 54.468c-40.599 40.612-40.599 106.442 0 147.054 40.599 40.612 106.429 40.633 147.054 .048 40.569-40.662 40.569-106.488 0-147.15ZM125.66 133.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L108.68 128 82.32 101.64c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l32 32c1.511 1.499 2.363 3.538 2.366 5.666 .004 2.128-.841 4.17-2.346 5.674ZM181.66 133.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L164.71 128 138.35 101.64c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l32 32c1.51 1.5 2.359 3.54 2.361 5.668 .002 2.128-.844 4.169-2.351 5.672Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
