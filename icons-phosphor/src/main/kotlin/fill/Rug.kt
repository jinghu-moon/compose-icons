package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorFillIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 16.000 C 195.582 16.000 192.000 19.582 192.000 24.000 L 192.000 40.000 L 160.000 40.000 L 160.000 24.000 C 160.000 19.582 156.418 16.000 152.000 16.000 C 147.582 16.000 144.000 19.582 144.000 24.000 L 144.000 40.000 L 112.000 40.000 L 112.000 24.000 C 112.000 19.582 108.418 16.000 104.000 16.000 C 99.582 16.000 96.000 19.582 96.000 24.000 L 96.000 40.000 L 64.000 40.000 L 64.000 24.000 C 64.000 19.582 60.418 16.000 56.000 16.000 C 51.582 16.000 48.000 19.582 48.000 24.000 L 48.000 232.000 C 48.000 236.418 51.582 240.000 56.000 240.000 C 60.418 240.000 64.000 236.418 64.000 232.000 L 64.000 216.000 L 96.000 216.000 L 96.000 232.000 C 96.000 236.418 99.582 240.000 104.000 240.000 C 108.418 240.000 112.000 236.418 112.000 232.000 L 112.000 216.000 L 144.000 216.000 L 144.000 232.000 C 144.000 236.418 147.582 240.000 152.000 240.000 C 156.418 240.000 160.000 236.418 160.000 232.000 L 160.000 216.000 L 192.000 216.000 L 192.000 232.000 C 192.000 236.418 195.582 240.000 200.000 240.000 C 204.418 240.000 208.000 236.418 208.000 232.000 L 208.000 24.000 C 208.000 19.582 204.418 16.000 200.000 16.000 ZM 155.430 130.060 L 131.430 170.060 C 130.707 171.265 129.405 172.002 128.000 172.002 C 126.595 172.002 125.293 171.265 124.570 170.060 L 100.570 130.060 C 99.808 128.792 99.808 127.208 100.570 125.940 L 124.570 85.940 C 125.293 84.735 126.595 83.998 128.000 83.998 C 129.405 83.998 130.707 84.735 131.430 85.940 L 155.430 125.940 C 156.192 127.208 156.192 128.792 155.430 130.060 Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
