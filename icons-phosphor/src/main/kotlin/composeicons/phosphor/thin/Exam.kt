package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorThinIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v160c-.001 1.387 .717 2.676 1.896 3.405 1.18 .729 2.653 .796 3.894 .175L64 204.47l30.21 15.11c1.127 .564 2.453 .564 3.58 0L128 204.47l30.21 15.11c1.127 .564 2.453 .564 3.58 0L192 204.47l30.21 15.11c.557 .275 1.169 .419 1.79 .42 2.209 0 4-1.791 4-4v-160c0-6.627-5.373-12-12-12ZM220 209.53 193.79 196.42c-1.127-.564-2.453-.564-3.58 0L160 211.53 129.79 196.42c-1.127-.564-2.453-.564-3.58 0L96 211.53 65.79 196.42c-1.127-.564-2.453-.564-3.58 0L36 209.53v-153.53c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM99.58 94.21C98.903 92.852 97.517 91.994 96 91.994c-1.517 0-2.903 .858-3.58 2.216l-32 64c-.989 1.977-.187 4.381 1.79 5.37 1.977 .989 4.381 .187 5.37-1.79L74.47 148h43.06l6.89 13.79c.678 1.355 2.064 2.211 3.58 2.21 .621-.003 1.233-.147 1.79-.42 .95-.474 1.672-1.307 2.008-2.314 .336-1.007 .257-2.107-.218-3.056ZM78.47 140 96 104.94 113.53 140ZM196 128c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4Z"),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
