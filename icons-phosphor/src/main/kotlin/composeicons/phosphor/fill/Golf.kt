package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorFillIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M175.47 197.14c1.579 4.126-.485 8.75-4.61 10.33-11.169 4.384-22.908 7.148-34.86 8.21v32.32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32.32c-11.952-1.062-23.691-3.826-34.86-8.21-2.718-.987-4.692-3.363-5.163-6.216-.471-2.853 .633-5.738 2.889-7.546 2.256-1.808 5.312-2.259 7.994-1.178C104 197.56 116.15 200 128 200c11.85 0 24-2.44 37.14-7.47 4.126-1.579 8.75 .485 10.33 4.61ZM216 96c0 48.601-39.399 88-88 88C79.399 184 40 144.601 40 96 40 47.399 79.399 8 128 8c48.578 .055 87.945 39.422 88 88ZM144 132c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM176 100c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
