package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorBoldIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM180 96v64c.001 4.614-2.644 8.82-6.803 10.819-4.159 1.998-9.095 1.435-12.697-1.449L124 140.17v19.83c.001 4.614-2.644 8.82-6.803 10.819-4.159 1.998-9.095 1.435-12.697-1.449l-40-32C61.654 135.093 59.997 131.645 59.997 128c0-3.645 1.657-7.093 4.503-9.37l40-32c3.602-2.884 8.538-3.447 12.697-1.449 4.159 1.998 6.804 6.204 6.803 10.819v19.83L160.5 86.63c3.602-2.884 8.538-3.447 12.697-1.449 4.159 1.998 6.804 6.204 6.803 10.819Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
