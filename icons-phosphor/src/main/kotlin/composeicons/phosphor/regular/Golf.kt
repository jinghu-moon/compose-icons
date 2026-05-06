package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorRegularIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 100c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM132 120c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 96c0 48.601-39.399 88-88 88C79.399 184 40 144.601 40 96 40 47.399 79.399 8 128 8c48.578 .055 87.945 39.422 88 88ZM200 96C200 56.235 167.764 24 128 24 88.235 24 56 56.235 56 96c0 39.764 32.235 72 72 72 39.746-.044 71.956-32.254 72-72ZM165.14 192.53C152 197.56 139.85 200 128 200c-11.85 0-24-2.44-37.14-7.47-2.682-1.081-5.738-.63-7.994 1.178-2.256 1.808-3.361 4.694-2.889 7.546 .471 2.853 2.445 5.229 5.163 6.216 11.169 4.384 22.908 7.148 34.86 8.21v32.32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32.32c11.952-1.062 23.691-3.826 34.86-8.21 2.718-.987 4.692-3.363 5.163-6.216 .471-2.853-.633-5.738-2.889-7.546-2.256-1.808-5.312-2.259-7.994-1.178Z"),
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
