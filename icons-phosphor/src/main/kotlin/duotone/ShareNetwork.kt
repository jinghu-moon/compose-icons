package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorDuotoneIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 200.000 C 208.000 217.673 193.673 232.000 176.000 232.000 C 158.327 232.000 144.000 217.673 144.000 200.000 C 144.000 182.327 158.327 168.000 176.000 168.000 C 193.673 168.000 208.000 182.327 208.000 200.000 ZM 176.000 88.000 C 193.673 88.000 208.000 73.673 208.000 56.000 C 208.000 38.327 193.673 24.000 176.000 24.000 C 158.327 24.000 144.000 38.327 144.000 56.000 C 144.000 73.673 158.327 88.000 176.000 88.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 176.000 160.000 C 165.218 159.997 154.894 164.358 147.380 172.090 L 101.280 142.460 C 104.906 133.161 104.906 122.839 101.280 113.540 L 147.380 83.910 C 161.725 98.604 184.866 100.049 200.927 87.253 C 216.988 74.458 220.751 51.579 209.634 34.314 C 198.517 17.048 176.133 11.005 157.837 20.331 C 139.542 29.656 131.280 51.320 138.720 70.460 L 92.620 100.090 C 81.265 88.432 63.978 84.816 48.902 90.945 C 33.826 97.074 23.966 111.726 23.966 128.000 C 23.966 144.274 33.826 158.926 48.902 165.055 C 63.978 171.184 81.265 167.568 92.620 155.910 L 138.720 185.540 C 132.381 201.890 137.430 220.463 151.175 231.353 C 164.920 242.242 184.155 242.910 198.622 232.999 C 213.089 223.088 219.413 204.910 214.222 188.160 C 209.032 171.410 193.536 159.993 176.000 160.000 ZM 176.000 32.000 C 189.255 32.000 200.000 42.745 200.000 56.000 C 200.000 69.255 189.255 80.000 176.000 80.000 C 162.745 80.000 152.000 69.255 152.000 56.000 C 152.000 42.745 162.745 32.000 176.000 32.000 ZM 64.000 152.000 C 50.745 152.000 40.000 141.255 40.000 128.000 C 40.000 114.745 50.745 104.000 64.000 104.000 C 77.255 104.000 88.000 114.745 88.000 128.000 C 88.000 141.255 77.255 152.000 64.000 152.000 ZM 176.000 224.000 C 162.745 224.000 152.000 213.255 152.000 200.000 C 152.000 186.745 162.745 176.000 176.000 176.000 C 189.255 176.000 200.000 186.745 200.000 200.000 C 200.000 213.255 189.255 224.000 176.000 224.000 Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
