package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorRegularIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 16.000 C 195.582 16.000 192.000 19.582 192.000 24.000 L 192.000 40.000 L 160.000 40.000 L 160.000 24.000 C 160.000 19.582 156.418 16.000 152.000 16.000 C 147.582 16.000 144.000 19.582 144.000 24.000 L 144.000 40.000 L 112.000 40.000 L 112.000 24.000 C 112.000 19.582 108.418 16.000 104.000 16.000 C 99.582 16.000 96.000 19.582 96.000 24.000 L 96.000 40.000 L 64.000 40.000 L 64.000 24.000 C 64.000 19.582 60.418 16.000 56.000 16.000 C 51.582 16.000 48.000 19.582 48.000 24.000 L 48.000 232.000 C 48.000 236.418 51.582 240.000 56.000 240.000 C 60.418 240.000 64.000 236.418 64.000 232.000 L 64.000 216.000 L 96.000 216.000 L 96.000 232.000 C 96.000 236.418 99.582 240.000 104.000 240.000 C 108.418 240.000 112.000 236.418 112.000 232.000 L 112.000 216.000 L 144.000 216.000 L 144.000 232.000 C 144.000 236.418 147.582 240.000 152.000 240.000 C 156.418 240.000 160.000 236.418 160.000 232.000 L 160.000 216.000 L 192.000 216.000 L 192.000 232.000 C 192.000 236.418 195.582 240.000 200.000 240.000 C 204.418 240.000 208.000 236.418 208.000 232.000 L 208.000 24.000 C 208.000 19.582 204.418 16.000 200.000 16.000 ZM 64.000 56.000 L 192.000 56.000 L 192.000 200.000 L 64.000 200.000 ZM 128.000 176.000 C 130.809 176.001 133.413 174.528 134.860 172.120 L 158.860 132.120 C 160.383 129.585 160.383 126.415 158.860 123.880 L 134.860 83.880 C 133.414 81.470 130.810 79.996 128.000 79.996 C 125.190 79.996 122.586 81.470 121.140 83.880 L 97.140 123.880 C 95.617 126.415 95.617 129.585 97.140 132.120 L 121.140 172.120 C 122.587 174.528 125.191 176.001 128.000 176.000 ZM 128.000 103.550 L 142.670 128.000 L 128.000 152.450 L 113.330 128.000 Z"),
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
