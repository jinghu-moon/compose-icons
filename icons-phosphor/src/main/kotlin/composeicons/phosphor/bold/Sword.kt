package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorBoldIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 28h-64c-3.622-.001-7.051 1.635-9.33 4.45L79.5 110.51l-4.66-4.65C71.089 102.108 66.001 99.999 60.695 99.999c-5.306 0-10.394 2.108-14.145 5.861L29.86 122.55c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145h0L45 166 23.86 187.17c-7.808 7.81-7.808 20.47 0 28.28l16.69 16.69c7.81 7.808 20.47 7.808 28.28 0L90 211l15.17 15.16c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861l16.69-16.69c3.756-3.751 5.866-8.842 5.866-14.15 0-5.308-2.11-10.399-5.866-14.15l-4.65-4.65 78.06-63.17c2.817-2.285 4.449-5.722 4.44-9.35v-64c0-6.627-5.373-12-12-12ZM54.69 212.34l-11-11L62 183l11 11ZM119.3 206.34 49.65 136.7l11.05-11 69.65 69.65ZM204 98.27l-75.58 61.17L121 152l47.51-47.5c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L104 135l-7.45-7.44L157.73 52h46.27Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
