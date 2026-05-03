package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorThinIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 ZM 115.460 153.710 C 115.993 154.629 116.138 155.722 115.864 156.748 C 115.590 157.774 114.920 158.649 114.000 159.180 C 98.870 167.912 79.655 164.521 68.426 151.139 C 57.198 137.756 57.198 118.244 68.426 104.861 C 79.655 91.479 98.870 88.088 114.000 96.820 C 115.809 97.970 116.390 100.342 115.317 102.197 C 114.244 104.053 111.899 104.734 110.000 103.740 C 98.232 96.958 83.293 99.601 74.565 110.008 C 65.838 120.415 65.838 135.585 74.565 145.992 C 83.293 156.399 98.232 159.042 110.000 152.260 C 111.909 151.156 114.351 151.804 115.460 153.710 ZM 195.460 153.710 C 195.993 154.629 196.138 155.722 195.864 156.748 C 195.590 157.774 194.920 158.649 194.000 159.180 C 178.870 167.912 159.655 164.521 148.426 151.139 C 137.198 137.756 137.198 118.244 148.426 104.861 C 159.655 91.479 178.870 88.088 194.000 96.820 C 195.809 97.970 196.390 100.342 195.317 102.197 C 194.244 104.053 191.899 104.734 190.000 103.740 C 178.232 96.958 163.293 99.601 154.565 110.008 C 145.838 120.415 145.838 135.585 154.565 145.992 C 163.293 156.399 178.232 159.042 190.000 152.260 C 191.909 151.156 194.351 151.804 195.460 153.710 Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
