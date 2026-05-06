package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorRegularIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.31 81.37 190.63 28.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L60.69 136c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l20.68 20.68-47 47c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l47-47 20.68 20.68c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688L243.31 104c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM124.69 200 104 179.31l29.66-29.65c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L92.69 168 72 147.31 107.31 112h52.69v52.69ZM232 92.69l-56 56v-44.69c0-4.418-3.582-8-8-8h-44.69l56-56L232 92.68ZM60 88C75.464 88 88 75.464 88 60 88 44.536 75.464 32 60 32 44.536 32 32 44.536 32 60c0 15.464 12.536 28 28 28ZM60 48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C53.373 72 48 66.627 48 60 48 53.373 53.373 48 60 48Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
