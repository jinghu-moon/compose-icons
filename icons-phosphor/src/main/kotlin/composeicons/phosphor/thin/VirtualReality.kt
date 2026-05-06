package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorThinIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M119.75 97.4l-24 64c-.582 1.568-2.078 2.608-3.75 2.608-1.672 0-3.168-1.04-3.75-2.608l-24-64c-.773-2.071 .279-4.377 2.35-5.15 2.071-.773 4.377 .279 5.15 2.35L92 148.6 112.25 94.6c.773-2.071 3.079-3.123 5.15-2.35 2.071 .773 3.123 3.079 2.35 5.15ZM252 128c-.044 41.955-34.045 75.956-76 76h-96C38.026 204 4 169.974 4 128 4 86.026 38.026 52 80 52h96c41.955 .044 75.956 34.045 76 76ZM244 128C243.961 90.461 213.539 60.039 176 60h-96C42.445 60 12 90.445 12 128c0 37.555 30.445 68 68 68h96c37.539-.039 67.961-30.461 68-68ZM175.5 137.06l12 21c1.091 1.917 .424 4.355-1.49 5.45-.607 .353-1.298 .536-2 .53-1.431 .002-2.754-.761-3.47-2L167.79 139.7c-1.254 .197-2.521 .297-3.79 .3h-16v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h20c10.965 .004 20.533 7.44 23.245 18.065 2.712 10.625-2.123 21.736-11.745 26.995ZM180 116c0-8.837-7.163-16-16-16h-16v32h16c8.837 0 16-7.163 16-16Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
