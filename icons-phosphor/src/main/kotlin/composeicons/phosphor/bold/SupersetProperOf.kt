package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorBoldIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c-.055 50.787-41.213 91.945-92 92h-72c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h72c37.555 0 68-30.445 68-68C204 90.445 173.555 60 136 60h-72C57.373 60 52 54.627 52 48 52 41.373 57.373 36 64 36h72c50.787 .055 91.945 41.213 92 92Z"),
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
