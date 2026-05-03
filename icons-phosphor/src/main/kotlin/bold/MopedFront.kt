package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorBoldIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 170.320 36.000 C 164.939 17.088 147.663 4.042 128.000 4.042 C 108.337 4.042 91.061 17.088 85.680 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 C 36.000 54.627 41.373 60.000 48.000 60.000 L 85.680 60.000 C 87.423 66.167 90.495 71.877 94.680 76.730 C 73.261 88.770 60.003 111.429 60.000 136.000 L 60.000 200.000 C 60.000 211.046 68.954 220.000 80.000 220.000 L 96.000 220.000 C 96.000 237.673 110.327 252.000 128.000 252.000 C 145.673 252.000 160.000 237.673 160.000 220.000 L 176.000 220.000 C 187.046 220.000 196.000 211.046 196.000 200.000 L 196.000 136.000 C 195.989 111.420 182.715 88.760 161.280 76.730 C 165.465 71.877 168.537 66.167 170.280 60.000 L 208.000 60.000 C 214.627 60.000 220.000 54.627 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 136.000 220.000 C 136.000 224.418 132.418 228.000 128.000 228.000 C 123.582 228.000 120.000 224.418 120.000 220.000 L 120.000 164.000 C 120.000 159.582 123.582 156.000 128.000 156.000 C 132.418 156.000 136.000 159.582 136.000 164.000 ZM 172.000 196.000 L 160.000 196.000 L 160.000 164.000 C 160.000 146.327 145.673 132.000 128.000 132.000 C 110.327 132.000 96.000 146.327 96.000 164.000 L 96.000 196.000 L 84.000 196.000 L 84.000 136.000 C 84.000 111.699 103.699 92.000 128.000 92.000 C 152.301 92.000 172.000 111.699 172.000 136.000 ZM 108.000 48.000 C 108.000 36.954 116.954 28.000 128.000 28.000 C 139.046 28.000 148.000 36.954 148.000 48.000 C 148.000 59.046 139.046 68.000 128.000 68.000 C 116.954 68.000 108.000 59.046 108.000 48.000 Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
