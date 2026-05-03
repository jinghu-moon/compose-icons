package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorThinIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 60.000 188.000 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 ZM 156.000 100.000 L 204.000 100.000 L 204.000 156.000 L 156.000 156.000 ZM 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 L 204.000 92.000 L 156.000 92.000 L 156.000 80.000 C 156.000 73.373 150.627 68.000 144.000 68.000 L 68.000 68.000 ZM 36.000 176.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 144.000 76.000 C 146.209 76.000 148.000 77.791 148.000 80.000 L 148.000 176.000 C 148.000 178.209 146.209 180.000 144.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 ZM 200.000 220.000 L 72.000 220.000 C 69.791 220.000 68.000 218.209 68.000 216.000 L 68.000 188.000 L 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 164.000 L 204.000 164.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 ZM 72.120 153.000 L 60.120 105.000 C 59.568 102.857 60.857 100.672 63.000 100.120 C 65.143 99.568 67.328 100.857 67.880 103.000 L 77.260 140.510 L 88.420 118.180 C 89.097 116.822 90.483 115.964 92.000 115.964 C 93.517 115.964 94.903 116.822 95.580 118.180 L 106.740 140.510 L 116.120 103.000 C 116.686 100.892 118.836 99.627 120.954 100.156 C 123.071 100.685 124.373 102.814 123.880 104.940 L 111.880 152.940 C 111.472 154.560 110.101 155.757 108.440 155.940 L 108.000 155.940 C 106.484 155.941 105.098 155.085 104.420 153.730 L 92.000 128.940 L 79.580 153.790 C 78.832 155.288 77.229 156.162 75.564 155.979 C 73.899 155.796 72.525 154.595 72.120 152.970 Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
