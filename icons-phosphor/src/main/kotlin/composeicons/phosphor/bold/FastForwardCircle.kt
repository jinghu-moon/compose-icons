package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorBoldIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 128c.001 3.645-1.655 7.092-4.5 9.37l-40 32c-3.602 2.884-8.538 3.447-12.697 1.449C134.644 168.82 131.999 164.614 132 160v-19.83L95.5 169.37c-3.602 2.884-8.538 3.447-12.697 1.449C78.644 168.82 75.999 164.614 76 160v-64c-.001-4.614 2.644-8.82 6.803-10.819 4.159-1.998 9.095-1.435 12.697 1.449L132 115.83v-19.83c-.001-4.614 2.644-8.82 6.803-10.819 4.159-1.998 9.095-1.435 12.697 1.449l40 32c2.845 2.278 4.501 5.725 4.5 9.37ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
