package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorFillIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 144.000 184.000 C 144.000 188.418 140.418 192.000 136.000 192.000 C 131.582 192.000 128.000 188.418 128.000 184.000 L 128.000 84.940 L 107.580 95.160 C 103.626 97.137 98.817 95.534 96.840 91.580 C 94.863 87.626 96.466 82.817 100.420 80.840 L 132.420 64.840 C 134.901 63.599 137.848 63.731 140.207 65.190 C 142.567 66.649 144.002 69.226 144.000 72.000 Z"),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
