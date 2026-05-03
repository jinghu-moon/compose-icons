package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorThinIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.220 116.670 L 114.220 84.670 C 112.992 83.851 111.413 83.774 110.112 84.471 C 108.811 85.168 107.999 86.524 108.000 88.000 L 108.000 152.000 C 107.998 153.476 108.809 154.833 110.110 155.530 C 111.412 156.227 112.992 156.150 114.220 155.330 L 162.220 123.330 C 163.334 122.588 164.004 121.339 164.004 120.000 C 164.004 118.661 163.334 117.412 162.220 116.670 ZM 116.000 144.530 L 116.000 95.470 L 152.790 120.000 ZM 208.000 44.000 L 48.000 44.000 C 36.954 44.000 28.000 52.954 28.000 64.000 L 28.000 176.000 C 28.000 187.046 36.954 196.000 48.000 196.000 L 208.000 196.000 C 219.046 196.000 228.000 187.046 228.000 176.000 L 228.000 64.000 C 228.000 52.954 219.046 44.000 208.000 44.000 ZM 220.000 176.000 C 220.000 182.627 214.627 188.000 208.000 188.000 L 48.000 188.000 C 41.373 188.000 36.000 182.627 36.000 176.000 L 36.000 64.000 C 36.000 57.373 41.373 52.000 48.000 52.000 L 208.000 52.000 C 214.627 52.000 220.000 57.373 220.000 64.000 ZM 164.000 224.000 C 164.000 226.209 162.209 228.000 160.000 228.000 L 96.000 228.000 C 93.791 228.000 92.000 226.209 92.000 224.000 C 92.000 221.791 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 221.791 164.000 224.000 Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
