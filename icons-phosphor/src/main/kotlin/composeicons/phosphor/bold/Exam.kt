package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorBoldIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v160c0 4.159 2.155 8.022 5.693 10.208 3.539 2.186 7.957 2.384 11.677 .522L64 213.42l26.63 13.31c3.38 1.691 7.36 1.691 10.74 0L128 213.42l26.63 13.31c3.38 1.691 7.36 1.691 10.74 0L192 213.42l26.63 13.31c3.72 1.861 8.138 1.664 11.677-.522 3.539-2.186 5.693-6.048 5.693-10.208v-160C236 44.954 227.046 36 216 36ZM212 196.58l-14.63-7.31c-3.38-1.691-7.36-1.691-10.74 0L160 202.58 133.37 189.27c-3.38-1.691-7.36-1.691-10.74 0L96 202.58 69.37 189.27c-3.38-1.691-7.36-1.691-10.74 0L44 196.58v-136.58h168ZM62.63 170.73c5.926 2.965 13.134 .565 16.1-5.36L81.42 160h37.16l2.69 5.37c1.881 3.899 5.716 6.482 10.035 6.761 4.32 .279 8.455-1.791 10.821-5.415 2.366-3.625 2.597-8.243 .604-12.085L110.73 90.63C108.696 86.568 104.543 84.003 100 84.003c-4.543 0-8.696 2.565-10.73 6.627L57.27 154.63c-2.965 5.926-.565 13.134 5.36 16.1ZM106.58 136h-13.16L100 122.83ZM144 128c0-6.627 5.373-12 12-12h4v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-4c-6.627 0-12-5.373-12-12Z"),
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
