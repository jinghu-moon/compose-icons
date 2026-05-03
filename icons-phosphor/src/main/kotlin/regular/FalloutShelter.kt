package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorRegularIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 199.050 124.230 C 197.660 121.628 194.950 120.002 192.000 120.000 L 143.000 120.000 L 166.710 84.440 C 168.353 81.977 168.502 78.808 167.096 76.202 C 165.691 73.596 162.961 71.980 160.000 72.000 L 96.000 72.000 C 93.048 71.998 90.335 73.622 88.942 76.224 C 87.549 78.826 87.702 81.985 89.340 84.440 L 113.050 120.000 L 64.000 120.000 C 61.048 119.998 58.335 121.622 56.942 124.224 C 55.549 126.826 55.702 129.985 57.340 132.440 L 89.340 180.440 C 90.823 182.669 93.323 184.008 96.000 184.008 C 98.677 184.008 101.177 182.669 102.660 180.440 L 128.000 142.440 L 153.340 180.440 C 154.823 182.669 157.323 184.008 160.000 184.008 C 162.677 184.008 165.177 182.669 166.660 180.440 L 198.660 132.440 C 200.293 129.984 200.443 126.829 199.050 124.230 ZM 145.050 88.000 L 128.000 113.580 L 111.000 88.000 ZM 96.000 161.580 L 79.000 136.000 L 113.100 136.000 ZM 160.000 161.580 L 143.000 136.000 L 177.100 136.000 Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
