package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorRegularIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM199.05 124.23C197.66 121.628 194.95 120.002 192 120h-49L166.71 84.44c1.643-2.463 1.792-5.632 .386-8.238C165.691 73.596 162.961 71.98 160 72h-64c-2.952-.002-5.665 1.622-7.058 4.224-1.393 2.602-1.24 5.76 .398 8.216L113.05 120h-49.05c-2.952-.002-5.665 1.622-7.058 4.224-1.393 2.602-1.24 5.76 .398 8.216l32 48c1.483 2.229 3.983 3.568 6.66 3.568 2.677 0 5.177-1.339 6.66-3.568l25.34-38 25.34 38c1.483 2.229 3.983 3.568 6.66 3.568 2.677 0 5.177-1.339 6.66-3.568l32-48c1.633-2.456 1.783-5.611 .39-8.21ZM145.05 88 128 113.58 111 88ZM96 161.58 79 136h34.1ZM160 161.58 143 136h34.1Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
