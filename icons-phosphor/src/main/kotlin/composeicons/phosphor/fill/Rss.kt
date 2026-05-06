package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorFillIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM76 192c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM120 192c-4.418 0-8-3.582-8-8C112 161.909 94.091 144 72 144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 30.914 .033 55.967 25.086 56 56 0 4.418-3.582 8-8 8ZM152 192c-4.418 0-8-3.582-8-8-.044-39.746-32.254-71.956-72-72-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 48.578 .055 87.945 39.422 88 88 0 4.418-3.582 8-8 8ZM184 192c-4.418 0-8-3.582-8-8C175.939 126.588 129.412 80.061 72 80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 66.244 .072 119.928 53.756 120 120 0 4.418-3.582 8-8 8Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
