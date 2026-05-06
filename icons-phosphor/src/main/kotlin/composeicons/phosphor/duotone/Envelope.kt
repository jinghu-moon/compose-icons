package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorDuotoneIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56l-96 88L32 56Z"),
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
                pathData = parseSvgPathData("M224 48h-192c-4.418 0-8 3.582-8 8v136c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-136c0-4.418-3.582-8-8-8ZM128 133.15 52.57 64h150.86ZM98.71 128 40 181.81v-107.62ZM110.55 138.85l12 11.05c3.06 2.809 7.76 2.809 10.82 0l12-11.05 58 53.15h-150.8ZM157.29 128 216 74.18v107.64Z"),
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
        return _envelope!!
    }

private var _envelope: ImageVector? = null
