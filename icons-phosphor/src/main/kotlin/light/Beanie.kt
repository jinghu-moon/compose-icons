package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorLightIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 163.370 L 222.000 144.000 C 221.940 99.927 191.320 61.790 148.300 52.210 C 156.808 41.578 155.672 26.183 145.695 16.915 C 135.719 7.648 120.281 7.648 110.305 16.915 C 100.328 26.183 99.192 41.578 107.700 52.210 C 64.680 61.790 34.060 99.927 34.000 144.000 L 34.000 163.370 C 29.120 165.685 26.007 170.599 26.000 176.000 L 26.000 208.000 C 26.000 215.732 32.268 222.000 40.000 222.000 L 216.000 222.000 C 223.732 222.000 230.000 215.732 230.000 208.000 L 230.000 176.000 C 229.993 170.599 226.880 165.685 222.000 163.370 ZM 114.000 36.000 C 114.000 28.268 120.268 22.000 128.000 22.000 C 135.732 22.000 142.000 28.268 142.000 36.000 C 142.000 43.732 135.732 50.000 128.000 50.000 C 120.268 50.000 114.000 43.732 114.000 36.000 ZM 128.000 62.000 C 173.265 62.055 209.945 98.735 210.000 144.000 L 210.000 162.000 L 46.000 162.000 L 46.000 144.000 C 46.055 98.735 82.735 62.055 128.000 62.000 ZM 122.000 174.000 L 122.000 210.000 L 78.000 210.000 L 78.000 174.000 ZM 134.000 174.000 L 178.000 174.000 L 178.000 210.000 L 134.000 210.000 ZM 38.000 208.000 L 38.000 176.000 C 38.000 174.895 38.895 174.000 40.000 174.000 L 66.000 174.000 L 66.000 210.000 L 40.000 210.000 C 38.895 210.000 38.000 209.105 38.000 208.000 ZM 218.000 208.000 C 218.000 209.105 217.105 210.000 216.000 210.000 L 190.000 210.000 L 190.000 174.000 L 216.000 174.000 C 217.105 174.000 218.000 174.895 218.000 176.000 Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
