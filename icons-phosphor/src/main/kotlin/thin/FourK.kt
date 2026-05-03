package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorThinIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 L 224.000 44.000 C 226.209 44.000 228.000 45.791 228.000 48.000 C 228.000 50.209 226.209 52.000 224.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 50.209 28.000 48.000 ZM 224.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 205.791 28.000 208.000 C 28.000 210.209 29.791 212.000 32.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 C 228.000 205.791 226.209 204.000 224.000 204.000 ZM 144.000 76.000 C 141.791 76.000 140.000 77.791 140.000 80.000 L 140.000 176.000 C 140.000 178.209 141.791 180.000 144.000 180.000 C 146.209 180.000 148.000 178.209 148.000 176.000 L 148.000 145.500 L 165.750 125.220 L 196.540 178.000 C 197.221 179.302 198.561 180.126 200.030 180.146 C 201.499 180.165 202.861 179.378 203.577 178.095 C 204.293 176.812 204.248 175.240 203.460 174.000 L 171.300 118.870 L 203.000 82.630 C 204.066 81.578 204.455 80.018 204.007 78.588 C 203.560 77.159 202.351 76.099 200.875 75.842 C 199.399 75.586 197.904 76.175 197.000 77.370 L 148.000 133.370 L 148.000 80.000 C 148.000 77.791 146.209 76.000 144.000 76.000 ZM 92.000 176.000 L 92.000 156.000 L 40.000 156.000 C 38.470 156.002 37.073 155.132 36.401 153.758 C 35.729 152.383 35.899 150.746 36.840 149.540 L 92.840 77.540 C 93.889 76.188 95.682 75.654 97.300 76.209 C 98.918 76.765 100.003 78.289 100.000 80.000 L 100.000 148.000 L 112.000 148.000 C 114.209 148.000 116.000 149.791 116.000 152.000 C 116.000 154.209 114.209 156.000 112.000 156.000 L 100.000 156.000 L 100.000 176.000 C 100.000 178.209 98.209 180.000 96.000 180.000 C 93.791 180.000 92.000 178.209 92.000 176.000 ZM 92.000 148.000 L 92.000 91.660 L 48.180 148.000 Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
