package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorBoldIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM192 108v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-13.91l-8.19 7c-4.494 3.852-11.126 3.852-15.62 0l-8.19-7v13.91c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-12v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h52c2.865 0 5.635 1.025 7.81 2.89L152 116.2 172.19 98.89c3.558-3.05 8.566-3.75 12.824-1.792 4.258 1.958 6.986 6.215 6.986 10.902Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
