package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorBoldIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51.51 104.49l-32-32C17.251 70.238 15.981 67.18 15.981 63.99c0-3.19 1.27-6.248 3.529-8.5L51.51 23.49c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L45 64 68.49 87.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0ZM99.51 104.49c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L116.51 23.49c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L123 64 99.51 87.51C97.257 89.761 95.991 92.815 95.991 96c0 3.185 1.266 6.239 3.519 8.49ZM200 36h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16v136h-136v-56c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v60c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-144C220 44.954 211.046 36 200 36Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
