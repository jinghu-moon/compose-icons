package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorThinIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 36.000 L 160.000 36.000 C 153.373 36.000 148.000 41.373 148.000 48.000 L 148.000 208.000 C 148.000 214.627 153.373 220.000 160.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 214.627 212.000 208.000 L 212.000 48.000 C 212.000 41.373 206.627 36.000 200.000 36.000 ZM 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 L 160.000 212.000 C 157.791 212.000 156.000 210.209 156.000 208.000 L 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 L 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 ZM 96.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 96.000 220.000 C 102.627 220.000 108.000 214.627 108.000 208.000 L 108.000 48.000 C 108.000 41.373 102.627 36.000 96.000 36.000 ZM 100.000 208.000 C 100.000 210.209 98.209 212.000 96.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 L 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 L 96.000 44.000 C 98.209 44.000 100.000 45.791 100.000 48.000 Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
