package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorDuotoneIcon(
            name = "FileVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 87.540 154.690 L 67.540 210.690 C 66.404 213.875 63.387 216.002 60.005 216.002 C 56.623 216.002 53.606 213.875 52.470 210.690 L 32.470 154.690 C 30.984 150.529 33.154 145.951 37.315 144.465 C 41.476 142.979 46.054 145.149 47.540 149.310 L 60.000 184.210 L 72.470 149.310 C 73.956 145.149 78.534 142.979 82.695 144.465 C 86.856 145.951 89.026 150.529 87.540 154.690 ZM 208.000 160.000 C 212.418 160.000 216.000 156.418 216.000 152.000 C 216.000 147.582 212.418 144.000 208.000 144.000 L 176.000 144.000 C 171.582 144.000 168.000 147.582 168.000 152.000 L 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 C 216.000 203.582 212.418 200.000 208.000 200.000 L 184.000 200.000 L 184.000 188.000 L 200.000 188.000 C 204.418 188.000 208.000 184.418 208.000 180.000 C 208.000 175.582 204.418 172.000 200.000 172.000 L 184.000 172.000 L 184.000 160.000 ZM 144.000 144.000 C 139.582 144.000 136.000 147.582 136.000 152.000 L 136.000 190.000 C 136.000 195.523 131.523 200.000 126.000 200.000 C 120.477 200.000 116.000 195.523 116.000 190.000 L 116.000 152.000 C 116.000 147.582 112.418 144.000 108.000 144.000 C 103.582 144.000 100.000 147.582 100.000 152.000 L 100.000 190.000 C 100.000 204.359 111.641 216.000 126.000 216.000 C 140.359 216.000 152.000 204.359 152.000 190.000 L 152.000 152.000 C 152.000 147.582 148.418 144.000 144.000 144.000 ZM 216.000 88.000 L 216.000 112.000 C 216.000 116.418 212.418 120.000 208.000 120.000 C 203.582 120.000 200.000 116.418 200.000 112.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 112.000 C 56.000 116.418 52.418 120.000 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 188.690 80.000 L 160.000 51.310 L 160.000 80.000 Z"),
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
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
