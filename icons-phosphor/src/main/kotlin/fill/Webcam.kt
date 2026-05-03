package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorFillIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 104.000 C 160.000 121.673 145.673 136.000 128.000 136.000 C 110.327 136.000 96.000 121.673 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 ZM 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 C 24.000 203.582 27.582 200.000 32.000 200.000 L 120.000 200.000 L 120.000 183.600 C 77.588 179.337 45.966 142.569 48.100 99.996 C 50.234 57.423 85.374 24.001 128.000 24.001 C 170.626 24.001 205.766 57.423 207.900 99.996 C 210.034 142.569 178.412 179.337 136.000 183.600 L 136.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 ZM 128.000 152.000 C 154.510 152.000 176.000 130.510 176.000 104.000 C 176.000 77.490 154.510 56.000 128.000 56.000 C 101.490 56.000 80.000 77.490 80.000 104.000 C 80.028 130.498 101.502 151.972 128.000 152.000 Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
