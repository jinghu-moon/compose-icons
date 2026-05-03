package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorBoldIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 76.000 L 32.000 76.000 C 25.373 76.000 20.000 81.373 20.000 88.000 L 20.000 136.000 C 20.038 161.222 29.582 185.503 46.730 204.000 L 32.000 204.000 C 25.373 204.000 20.000 209.373 20.000 216.000 C 20.000 222.627 25.373 228.000 32.000 228.000 L 208.000 228.000 C 214.627 228.000 220.000 222.627 220.000 216.000 C 220.000 209.373 214.627 204.000 208.000 204.000 L 193.270 204.000 C 201.893 194.688 208.678 183.831 213.270 172.000 C 237.073 171.313 256.010 151.813 256.000 128.000 L 256.000 120.000 C 255.972 95.711 236.289 76.028 212.000 76.000 ZM 196.000 136.000 C 195.948 164.775 179.706 191.071 154.000 204.000 L 86.000 204.000 C 60.294 191.071 44.052 164.775 44.000 136.000 L 44.000 100.000 L 196.000 100.000 ZM 232.000 128.000 C 231.992 136.170 227.016 143.515 219.430 146.550 C 219.811 143.046 220.001 139.524 220.000 136.000 L 220.000 101.680 C 227.285 104.859 231.996 112.051 232.000 120.000 ZM 68.000 48.000 L 68.000 24.000 C 68.000 17.373 73.373 12.000 80.000 12.000 C 86.627 12.000 92.000 17.373 92.000 24.000 L 92.000 48.000 C 92.000 54.627 86.627 60.000 80.000 60.000 C 73.373 60.000 68.000 54.627 68.000 48.000 ZM 108.000 48.000 L 108.000 24.000 C 108.000 17.373 113.373 12.000 120.000 12.000 C 126.627 12.000 132.000 17.373 132.000 24.000 L 132.000 48.000 C 132.000 54.627 126.627 60.000 120.000 60.000 C 113.373 60.000 108.000 54.627 108.000 48.000 ZM 148.000 48.000 L 148.000 24.000 C 148.000 17.373 153.373 12.000 160.000 12.000 C 166.627 12.000 172.000 17.373 172.000 24.000 L 172.000 48.000 C 172.000 54.627 166.627 60.000 160.000 60.000 C 153.373 60.000 148.000 54.627 148.000 48.000 Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
