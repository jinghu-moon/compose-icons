package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorBoldIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 83.51l-60-60c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L34.28 152.75c-19.054 19.054-19.054 49.946 0 69 19.054 19.054 49.946 19.054 69 0L214.48 110.49l21.31-7.11c3.947-1.313 6.933-4.576 7.891-8.624 .958-4.048-.25-8.303-3.191-11.246ZM86.28 204.75c-9.772 8.994-24.898 8.681-34.289-.711-9.391-9.391-9.704-24.517-.711-34.289L79.41 141.62c7.73-2.41 19.58-3 35.06 5 6.908 3.677 14.296 6.37 21.95 8ZM204.2 88.62c-1.764 .592-3.369 1.58-4.69 2.89l-38.89 38.9c-7.73 2.41-19.58 3-35.06-5-6.905-3.676-14.29-6.369-21.94-8L172 49l37.79 37.79Z"),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
