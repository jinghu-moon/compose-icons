package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorDuotoneIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 90.34 90.34 229.66c-3.124 3.122-8.186 3.122-11.31 0L26.34 177c-3.122-3.124-3.122-8.186 0-11.31L165.66 26.34c3.124-3.122 8.186-3.122 11.31 0L229.66 79c1.508 1.501 2.356 3.542 2.356 5.67 0 2.128-.848 4.169-2.356 5.67Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M235.32 73.37 182.63 20.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L20.68 160c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l52.69 52.68c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688L235.32 96c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM84.68 224 32 171.31l32-32 26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L75.31 128 96 107.31l26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L107.31 96 128 75.31l26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L139.31 64l32-32L224 84.69Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
