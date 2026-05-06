package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorBoldIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C25.373 44 20 49.373 20 56v136c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-136c0-6.627-5.373-12-12-12ZM128 127.72 62.85 68h130.3ZM92.79 128 44 172.72v-89.44ZM110.55 144.28l9.34 8.57c4.588 4.207 11.632 4.207 16.22 0l9.34-8.57L193.15 188h-130.3ZM163.21 128 212 83.28v89.44Z"),
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
        return _envelope!!
    }

private var _envelope: ImageVector? = null
