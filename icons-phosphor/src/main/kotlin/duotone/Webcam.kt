package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorDuotoneIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 32.000 C 88.235 32.000 56.000 64.235 56.000 104.000 C 56.000 143.764 88.235 176.000 128.000 176.000 C 167.764 176.000 200.000 143.764 200.000 104.000 C 200.000 64.235 167.764 32.000 128.000 32.000 ZM 128.000 136.000 C 110.327 136.000 96.000 121.673 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 C 160.000 121.673 145.673 136.000 128.000 136.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 168.000 104.000 C 168.000 81.909 150.091 64.000 128.000 64.000 C 105.909 64.000 88.000 81.909 88.000 104.000 C 88.000 126.091 105.909 144.000 128.000 144.000 C 150.091 144.000 168.000 126.091 168.000 104.000 ZM 104.000 104.000 C 104.000 90.745 114.745 80.000 128.000 80.000 C 141.255 80.000 152.000 90.745 152.000 104.000 C 152.000 117.255 141.255 128.000 128.000 128.000 C 114.745 128.000 104.000 117.255 104.000 104.000 ZM 224.000 200.000 L 136.000 200.000 L 136.000 183.600 C 178.412 179.337 210.034 142.569 207.900 99.996 C 205.766 57.423 170.626 24.001 128.000 24.001 C 85.374 24.001 50.234 57.423 48.100 99.996 C 45.966 142.569 77.588 179.337 120.000 183.600 L 120.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 203.582 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 C 232.000 203.582 228.418 200.000 224.000 200.000 ZM 64.000 104.000 C 64.000 68.654 92.654 40.000 128.000 40.000 C 163.346 40.000 192.000 68.654 192.000 104.000 C 192.000 139.346 163.346 168.000 128.000 168.000 C 92.670 167.961 64.039 139.330 64.000 104.000 Z"),
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
