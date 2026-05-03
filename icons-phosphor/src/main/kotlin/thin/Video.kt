package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorThinIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.220 108.670 L 114.220 76.670 C 112.992 75.851 111.413 75.774 110.112 76.471 C 108.811 77.168 107.999 78.524 108.000 80.000 L 108.000 144.000 C 107.998 145.476 108.809 146.833 110.110 147.530 C 111.412 148.227 112.992 148.150 114.220 147.330 L 162.220 115.330 C 163.334 114.588 164.004 113.339 164.004 112.000 C 164.004 110.661 163.334 109.412 162.220 108.670 ZM 116.000 136.530 L 116.000 87.470 L 152.790 112.000 ZM 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 168.000 C 28.000 174.627 33.373 180.000 40.000 180.000 L 216.000 180.000 C 222.627 180.000 228.000 174.627 228.000 168.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 168.000 C 220.000 170.209 218.209 172.000 216.000 172.000 L 40.000 172.000 C 37.791 172.000 36.000 170.209 36.000 168.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 C 28.000 205.791 29.791 204.000 32.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
