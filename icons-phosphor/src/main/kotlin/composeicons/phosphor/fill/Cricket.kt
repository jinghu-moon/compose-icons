package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorFillIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.31 81.37 190.63 28.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L60.69 136c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l20.68 20.68-47 47c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l47-47 20.68 20.68c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688L243.31 104c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM124.69 200 104 179.31l29.66-29.65c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L92.69 168 72 147.31 107.31 112h52.69v52.69ZM32 60C32 44.536 44.536 32 60 32c15.464 0 28 12.536 28 28C88 75.464 75.464 88 60 88 44.536 88 32 75.464 32 60Z"),
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
