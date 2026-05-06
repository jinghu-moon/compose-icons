package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorBoldIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48v160c0 11.046-8.954 20-20 20h-68c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64v-152h-152v88c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-92C28 36.954 36.954 28 48 28h160c11.046 0 20 8.954 20 20ZM128.49 151.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L64 199 48.49 183.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l24 24c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l56-56c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
