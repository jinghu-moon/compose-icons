package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorThinIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 117.790 88.420 C 116.434 87.743 114.812 87.890 113.600 88.800 L 65.600 124.800 C 64.593 125.555 64.000 126.741 64.000 128.000 C 64.000 129.259 64.593 130.445 65.600 131.200 L 113.600 167.200 C 114.292 167.719 115.135 168.000 116.000 168.000 C 116.621 167.999 117.233 167.855 117.790 167.580 C 119.145 166.902 120.001 165.516 120.000 164.000 L 120.000 92.000 C 120.001 90.484 119.145 89.098 117.790 88.420 ZM 112.000 156.000 L 74.670 128.000 L 112.000 100.000 ZM 173.790 88.420 C 172.434 87.743 170.812 87.890 169.600 88.800 L 121.600 124.800 C 120.593 125.555 120.000 126.741 120.000 128.000 C 120.000 129.259 120.593 130.445 121.600 131.200 L 169.600 167.200 C 170.292 167.719 171.135 168.000 172.000 168.000 C 172.621 167.999 173.233 167.855 173.790 167.580 C 175.145 166.902 176.001 165.516 176.000 164.000 L 176.000 92.000 C 176.001 90.484 175.145 89.098 173.790 88.420 ZM 168.000 156.000 L 130.670 128.000 L 168.000 100.000 Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
