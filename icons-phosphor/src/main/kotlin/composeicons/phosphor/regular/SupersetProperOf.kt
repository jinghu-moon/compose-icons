package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorRegularIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c-.055 48.578-39.422 87.945-88 88h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c39.764 0 72-32.236 72-72C208 88.235 175.764 56 136 56h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c48.578 .055 87.945 39.422 88 88Z"),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
