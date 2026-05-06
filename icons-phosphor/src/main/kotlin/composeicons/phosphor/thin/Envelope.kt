package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorThinIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192c-2.209 0-4 1.791-4 4v136c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-136c0-2.209-1.791-4-4-4ZM128 138.57 42.28 60h171.44ZM104.63 128 36 190.91v-125.82ZM110.55 133.43 125.3 147c1.528 1.398 3.872 1.398 5.4 0l14.75-13.52L213.72 196h-171.44ZM151.37 128 220 65.09v125.82Z"),
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
