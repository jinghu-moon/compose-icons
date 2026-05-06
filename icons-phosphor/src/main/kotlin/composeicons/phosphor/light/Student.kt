package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorLightIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.9 58.31l-96-32c-1.233-.412-2.567-.412-3.8 0L30.1 58.31C27.652 59.127 26.001 61.419 26 64v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-71.68L76.68 85.22c-9.865 14.579-13.068 32.664-8.81 49.743 4.258 17.08 15.576 31.545 31.13 39.787-19.25 6.53-36 19.59-48 38-1.429 2.737-.547 6.112 2.038 7.801 2.586 1.688 6.03 1.139 7.962-1.271C76.47 195.59 100.88 182 128 182c27.12 0 51.53 13.59 67 37.28 1.921 2.462 5.41 3.039 8.021 1.326 2.611-1.713 3.472-5.143 1.979-7.886-12-18.38-28.73-31.44-48-38 15.546-8.251 26.852-22.72 31.101-39.799 4.248-17.079 1.038-35.159-8.831-49.731L225.9 69.69c2.447-.819 4.096-3.11 4.096-5.69 0-2.58-1.65-4.871-4.096-5.69ZM178 120c.01 21.885-14.214 41.233-35.105 47.752-20.891 6.519-43.594-1.305-56.033-19.311C74.423 130.435 75.139 106.432 88.63 89.2l37.47 12.49c1.233 .412 2.567 .412 3.8 0L167.37 89.2c6.898 8.784 10.642 19.632 10.63 30.8ZM128 89.68 51 64 128 38.32 205 64Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
