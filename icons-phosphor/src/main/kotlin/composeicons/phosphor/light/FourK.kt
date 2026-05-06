package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorLightIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M26 48c0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6ZM224 202h-192c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM144 74c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-29.75l15.42-17.62L194.82 179c1.071 1.855 3.049 2.998 5.19 3 1.055-.001 2.091-.284 3-.82 2.859-1.669 3.826-5.339 2.16-8.2L173.76 119.1 204.52 84c1.931-2.507 1.583-6.083-.795-8.171-2.378-2.088-5.969-1.969-8.205 .271L150 128v-48c0-3.314-2.686-6-6-6ZM90 176v-18h-50c-2.291 0-4.382-1.304-5.39-3.361-1.008-2.058-.755-4.509 .65-6.319L91.26 76.32c1.572-2.026 4.259-2.829 6.685-1.997 2.426 .831 4.056 3.113 4.055 5.677v66h10c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-10v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM90 146v-48.51L52.27 146Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
