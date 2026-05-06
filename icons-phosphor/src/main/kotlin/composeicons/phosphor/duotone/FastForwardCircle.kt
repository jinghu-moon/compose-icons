package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorDuotoneIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C74.981 32 32 74.981 32 128c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C224 74.981 181.019 32 128 32ZM80 164v-72l48 36ZM144 164v-72l48 36Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM196.8 121.6l-48-36c-2.424-1.818-5.667-2.111-8.378-.755C137.712 86.2 136 88.97 136 92v72c0 3.03 1.712 5.8 4.422 7.155 2.71 1.355 5.954 1.063 8.378-.755l48-36C198.814 132.889 200 130.518 200 128c0-2.518-1.186-4.889-3.2-6.4ZM152 148v-40l26.67 20ZM132.8 121.6l-48-36c-2.424-1.818-5.667-2.111-8.378-.755C73.712 86.2 72 88.97 72 92v72c0 3.03 1.712 5.8 4.422 7.155 2.71 1.355 5.954 1.063 8.378-.755l48-36C134.814 132.889 136 130.518 136 128c0-2.518-1.186-4.889-3.2-6.4ZM88 148v-40l26.67 20Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
