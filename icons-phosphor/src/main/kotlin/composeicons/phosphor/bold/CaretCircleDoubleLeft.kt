package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorBoldIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.4 51.6C162.214 9.45 93.849 9.469 51.687 51.643 9.524 93.817 9.524 162.183 51.687 204.357c42.162 42.174 110.527 42.194 152.713 .043 42.132-42.221 42.132-110.579 0-152.8ZM187.4 187.42c-32.811 32.785-85.985 32.772-118.779-.031C35.828 154.587 35.828 101.413 68.621 68.611c32.794-32.802 85.968-32.816 118.779-.031 32.774 32.831 32.783 85.998 .02 118.84ZM176.49 104.47 153 128l23.53 23.53c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-32-32c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM120.49 104.47 97 128l23.52 23.53c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-32-32c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
