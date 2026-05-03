package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorThinIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 195.790 190.130 L 161.790 156.130 C 175.389 139.834 175.389 116.146 161.790 99.850 L 195.790 65.850 C 228.069 100.981 228.069 154.979 195.790 190.110 ZM 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 ZM 190.130 60.210 L 156.130 94.210 C 139.834 80.611 116.146 80.611 99.850 94.210 L 65.850 60.210 C 100.981 27.931 154.979 27.931 190.110 60.210 ZM 60.210 65.870 L 94.210 99.870 C 80.611 116.166 80.611 139.854 94.210 156.150 L 60.210 190.150 C 27.931 155.019 27.931 101.021 60.210 65.890 ZM 65.870 195.790 L 99.870 161.790 C 116.166 175.389 139.854 175.389 156.150 161.790 L 190.150 195.790 C 155.019 228.069 101.021 228.069 65.890 195.790 Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
