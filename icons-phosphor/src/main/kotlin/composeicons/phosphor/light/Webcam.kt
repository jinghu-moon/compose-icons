package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorLightIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 104C166 83.013 148.987 66 128 66 107.013 66 90 83.013 90 104c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38ZM102 104c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26ZM224 202h-90v-20.25c41.786-3.224 73.555-38.892 71.942-80.771C204.329 59.1 169.91 25.981 128 25.981c-41.91 0-76.329 33.119-77.942 74.998-1.613 41.879 30.156 77.547 71.942 80.771v20.25h-90c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM62 104C62 67.549 91.549 38 128 38c36.451 0 66 29.549 66 66 0 36.451-29.549 66-66 66C91.567 169.956 62.044 140.433 62 104Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
