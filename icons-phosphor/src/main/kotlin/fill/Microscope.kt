package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorFillIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 216.000 C 232.000 220.418 228.418 224.000 224.000 224.000 L 32.000 224.000 C 27.582 224.000 24.000 220.418 24.000 216.000 C 24.000 211.582 27.582 208.000 32.000 208.000 L 181.250 208.000 C 203.832 189.741 213.235 159.703 205.093 131.827 C 196.951 103.951 172.860 83.695 144.000 80.460 L 144.000 136.000 C 144.000 144.837 136.837 152.000 128.000 152.000 L 80.000 152.000 C 71.163 152.000 64.000 144.837 64.000 136.000 L 64.000 32.000 C 64.000 23.163 71.163 16.000 80.000 16.000 L 128.000 16.000 C 136.837 16.000 144.000 23.163 144.000 32.000 L 144.000 64.370 C 176.478 67.352 204.648 88.042 217.209 118.141 C 229.770 148.239 224.664 182.816 203.940 208.000 L 224.000 208.000 C 228.418 208.000 232.000 211.582 232.000 216.000 ZM 136.000 184.000 C 140.418 184.000 144.000 180.418 144.000 176.000 C 144.000 171.582 140.418 168.000 136.000 168.000 L 72.000 168.000 C 67.582 168.000 64.000 171.582 64.000 176.000 C 64.000 180.418 67.582 184.000 72.000 184.000 Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
