package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorFillIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 96.000 24.000 C 96.000 19.582 99.582 16.000 104.000 16.000 L 152.000 16.000 C 156.418 16.000 160.000 19.582 160.000 24.000 C 160.000 28.418 156.418 32.000 152.000 32.000 L 104.000 32.000 C 99.582 32.000 96.000 28.418 96.000 24.000 ZM 248.000 112.000 C 248.000 116.418 244.418 120.000 240.000 120.000 L 232.000 120.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 192.000 216.000 C 183.163 216.000 176.000 208.837 176.000 200.000 L 176.000 192.000 L 80.000 192.000 L 80.000 200.000 C 80.000 208.837 72.837 216.000 64.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 120.000 L 16.000 120.000 C 11.582 120.000 8.000 116.418 8.000 112.000 C 8.000 107.582 11.582 104.000 16.000 104.000 L 27.360 104.000 L 54.750 56.060 C 57.599 51.076 62.899 48.000 68.640 48.000 L 187.360 48.000 C 193.101 48.000 198.401 51.076 201.250 56.060 L 228.640 104.000 L 240.000 104.000 C 244.418 104.000 248.000 107.582 248.000 112.000 ZM 88.000 144.000 C 88.000 139.582 84.418 136.000 80.000 136.000 L 56.000 136.000 C 51.582 136.000 48.000 139.582 48.000 144.000 C 48.000 148.418 51.582 152.000 56.000 152.000 L 80.000 152.000 C 84.418 152.000 88.000 148.418 88.000 144.000 ZM 208.000 144.000 C 208.000 139.582 204.418 136.000 200.000 136.000 L 176.000 136.000 C 171.582 136.000 168.000 139.582 168.000 144.000 C 168.000 148.418 171.582 152.000 176.000 152.000 L 200.000 152.000 C 204.418 152.000 208.000 148.418 208.000 144.000 ZM 210.210 104.000 L 187.360 64.000 L 68.640 64.000 L 45.790 104.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
