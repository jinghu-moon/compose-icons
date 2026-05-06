package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorFillIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.57 54.42C160.945 13.835 95.114 13.856 54.516 54.468c-40.599 40.612-40.599 106.442 0 147.054 40.599 40.612 106.429 40.633 147.054 .048 40.569-40.662 40.569-106.488 0-147.15ZM117.65 154.35c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-32-32c-1.502-1.501-2.346-3.537-2.346-5.66 0-2.123 .844-4.159 2.346-5.66l32-32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L91.29 128ZM173.65 154.35c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-32-32c-1.502-1.501-2.346-3.537-2.346-5.66 0-2.123 .844-4.159 2.346-5.66l32-32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L147.32 128Z"),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
