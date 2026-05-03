package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorThinIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 128.000 L 212.000 208.000 C 212.000 214.627 206.627 220.000 200.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 56.000 C 36.000 49.373 41.373 44.000 48.000 44.000 L 128.000 44.000 C 130.209 44.000 132.000 45.791 132.000 48.000 C 132.000 50.209 130.209 52.000 128.000 52.000 L 48.000 52.000 C 45.791 52.000 44.000 53.791 44.000 56.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 200.000 212.000 C 202.209 212.000 204.000 210.209 204.000 208.000 L 204.000 128.000 C 204.000 125.791 205.791 124.000 208.000 124.000 C 210.209 124.000 212.000 125.791 212.000 128.000 ZM 228.000 60.000 C 228.000 77.673 213.673 92.000 196.000 92.000 C 178.327 92.000 164.000 77.673 164.000 60.000 C 164.000 42.327 178.327 28.000 196.000 28.000 C 213.673 28.000 228.000 42.327 228.000 60.000 ZM 220.000 60.000 C 220.000 46.745 209.255 36.000 196.000 36.000 C 182.745 36.000 172.000 46.745 172.000 60.000 C 172.000 73.255 182.745 84.000 196.000 84.000 C 209.255 84.000 220.000 73.255 220.000 60.000 Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
