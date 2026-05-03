package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = phosphorBoldIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.860 197.650 L 229.610 77.650 C 228.390 67.567 219.826 59.987 209.670 60.000 L 179.830 60.000 C 177.641 32.999 155.090 12.201 128.000 12.201 C 100.910 12.201 78.359 32.999 76.170 60.000 L 46.330 60.000 C 36.174 59.987 27.610 67.567 26.390 77.650 L 12.140 197.650 C 11.467 203.338 13.265 209.041 17.078 213.315 C 20.890 217.589 26.353 220.022 32.080 220.000 L 223.920 220.000 C 229.647 220.022 235.110 217.589 238.922 213.315 C 242.735 209.041 244.533 203.338 243.860 197.650 ZM 128.000 36.000 C 141.918 36.001 153.722 46.225 155.710 60.000 L 100.290 60.000 C 102.278 46.225 114.082 36.001 128.000 36.000 ZM 36.500 196.000 L 49.810 84.000 L 76.000 84.000 L 76.000 104.000 C 76.000 110.627 81.373 116.000 88.000 116.000 C 94.627 116.000 100.000 110.627 100.000 104.000 L 100.000 84.000 L 156.000 84.000 L 156.000 104.000 C 156.000 110.627 161.373 116.000 168.000 116.000 C 174.627 116.000 180.000 110.627 180.000 104.000 L 180.000 84.000 L 206.190 84.000 L 219.500 196.000 Z"),
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
        return _handbag!!
    }

private var _handbag: ImageVector? = null
