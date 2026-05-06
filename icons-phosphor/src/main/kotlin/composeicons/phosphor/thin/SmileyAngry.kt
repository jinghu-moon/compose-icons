package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorThinIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM164 132c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c55.203 .061 99.939 44.797 100 100ZM220 128C220 77.19 178.81 36 128 36 77.19 36 36 77.19 36 128c0 50.81 41.19 92 92 92 50.787-.055 91.945-41.213 92-92ZM173.78 84.67 128 115.19 82.22 84.67c-1.839-1.226-4.324-.729-5.55 1.11-1.226 1.839-.729 4.324 1.11 5.55l48 32c1.344 .897 3.096 .897 4.44 0l48-32c1.839-1.226 2.336-3.711 1.11-5.55-1.226-1.839-3.711-2.336-5.55-1.11ZM154.21 180.67C146.39 175.47 138.94 172 128 172c-10.94 0-18.39 3.47-26.21 8.67-1.256 .761-1.994 2.149-1.922 3.615 .071 1.467 .94 2.776 2.264 3.412 1.324 .635 2.889 .495 4.078-.367C113.2 182.69 119 180 128 180c9 0 14.8 2.69 21.79 7.33 1.189 .861 2.754 1.002 4.078 .367 1.324-.635 2.193-1.945 2.264-3.412 .071-1.467-.666-2.854-1.922-3.615Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
