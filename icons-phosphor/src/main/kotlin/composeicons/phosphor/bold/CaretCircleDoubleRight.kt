package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorBoldIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.4 51.6C162.214 9.45 93.849 9.469 51.687 51.643 9.524 93.817 9.524 162.183 51.687 204.357c42.162 42.174 110.527 42.194 152.713 .043 42.132-42.221 42.132-110.579 0-152.8ZM187.4 187.42c-32.811 32.785-85.985 32.772-118.779-.031C35.828 154.587 35.828 101.413 68.621 68.611c32.794-32.802 85.968-32.816 118.779-.031 32.774 32.831 32.783 85.998 .02 118.84ZM128.47 119.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-32 32c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L103 128 79.49 104.47c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0ZM184.47 136.51l-32 32c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L159 128 135.48 104.47c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l32 32c2.27 2.248 3.549 5.309 3.555 8.504 .006 3.195-1.263 6.26-3.525 8.516Z"),
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
