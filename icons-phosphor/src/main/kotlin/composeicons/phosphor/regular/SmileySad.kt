package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorRegularIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM80 108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM176 108c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM174.92 172c1.576 2.48 1.666 5.624 .234 8.191-1.432 2.566-4.156 4.14-7.094 4.101-2.938-.04-5.618-1.687-6.98-4.291C153.61 167.09 141.87 160 128 160c-13.87 0-25.61 7.1-33.08 20-1.362 2.604-4.042 4.251-6.98 4.291-2.938 .04-5.662-1.535-7.094-4.101-1.432-2.566-1.342-5.711 .234-8.191C91.37 154.21 108.47 144 128 144c19.53 0 36.63 10.2 46.92 28Z"),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
