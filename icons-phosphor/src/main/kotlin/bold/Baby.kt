package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorBoldIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 144.000 C 83.163 144.000 76.000 136.837 76.000 128.000 C 76.000 119.163 83.163 112.000 92.000 112.000 C 100.837 112.000 108.000 119.163 108.000 128.000 C 108.000 136.837 100.837 144.000 92.000 144.000 ZM 164.000 112.000 C 155.163 112.000 148.000 119.163 148.000 128.000 C 148.000 136.837 155.163 144.000 164.000 144.000 C 172.837 144.000 180.000 136.837 180.000 128.000 C 180.000 119.163 172.837 112.000 164.000 112.000 ZM 149.600 161.850 C 136.368 170.052 119.632 170.052 106.400 161.850 C 102.772 159.506 98.165 159.293 94.337 161.291 C 90.508 163.289 88.048 167.190 87.896 171.506 C 87.743 175.822 89.922 179.887 93.600 182.150 C 114.653 195.282 141.347 195.282 162.400 182.150 C 166.078 179.887 168.257 175.822 168.104 171.506 C 167.952 167.190 165.492 163.289 161.663 161.291 C 157.835 159.293 153.228 159.506 149.600 161.850 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 211.943 82.415 175.571 45.178 130.000 44.050 C 120.540 58.250 120.000 71.330 120.000 72.050 C 120.014 76.468 123.607 80.039 128.025 80.025 C 132.443 80.011 136.014 76.418 136.000 72.000 C 136.000 65.373 141.373 60.000 148.000 60.000 C 154.627 60.000 160.000 65.373 160.000 72.000 C 160.000 89.673 145.673 104.000 128.000 104.000 C 110.327 104.000 96.000 89.673 96.000 72.000 C 96.000 71.370 96.100 61.520 101.000 48.480 C 60.419 62.255 36.714 104.371 45.993 146.210 C 55.272 188.049 94.559 216.195 137.159 211.522 C 179.759 206.849 212.011 170.856 212.000 128.000 Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
