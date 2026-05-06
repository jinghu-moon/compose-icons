package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorThinIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 212h-21.16L149.65 36.06C147.972 31.233 143.421 27.998 138.31 28h-20.62c-5.111-.002-9.662 3.233-11.34 8.06L45.16 212h-21.16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h208c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM92.58 100h70.84l19.47 56h-109.78ZM113.91 38.69c.558-1.61 2.076-2.69 3.78-2.69h20.62c1.704-0 3.222 1.08 3.78 2.69L160.63 92h-65.26ZM70.32 164h115.36l16.69 48h-148.74Z"),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
