package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) return _lockLaminatedOpen!!
        _lockLaminatedOpen = phosphorThinIcon(
            name = "LockLaminatedOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 84.000 L 92.000 84.000 L 92.000 56.000 C 92.000 36.118 108.118 20.000 128.000 20.000 C 145.240 20.000 160.750 32.380 164.080 48.800 C 164.522 50.965 166.635 52.362 168.800 51.920 C 170.965 51.478 172.362 49.365 171.920 47.200 C 167.780 26.810 149.310 12.000 128.000 12.000 C 103.711 12.028 84.028 31.711 84.000 56.000 L 84.000 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 ZM 44.000 124.000 L 212.000 124.000 L 212.000 148.000 L 44.000 148.000 ZM 44.000 156.000 L 212.000 156.000 L 212.000 180.000 L 44.000 180.000 ZM 48.000 92.000 L 208.000 92.000 C 210.209 92.000 212.000 93.791 212.000 96.000 L 212.000 116.000 L 44.000 116.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 188.000 L 212.000 188.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 Z"),
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
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null
