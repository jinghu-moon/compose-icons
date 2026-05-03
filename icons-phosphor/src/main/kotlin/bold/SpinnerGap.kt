package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) return _spinnerGap!!
        _spinnerGap = phosphorBoldIcon(
            name = "SpinnerGap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 32.000 L 140.000 64.000 C 140.000 70.627 134.627 76.000 128.000 76.000 C 121.373 76.000 116.000 70.627 116.000 64.000 L 116.000 32.000 C 116.000 25.373 121.373 20.000 128.000 20.000 C 134.627 20.000 140.000 25.373 140.000 32.000 ZM 224.000 116.000 L 192.000 116.000 C 185.373 116.000 180.000 121.373 180.000 128.000 C 180.000 134.627 185.373 140.000 192.000 140.000 L 224.000 140.000 C 230.627 140.000 236.000 134.627 236.000 128.000 C 236.000 121.373 230.627 116.000 224.000 116.000 ZM 181.740 164.770 C 177.046 160.076 169.434 160.076 164.740 164.770 C 160.046 169.464 160.046 177.076 164.740 181.770 L 187.370 204.400 C 192.064 209.094 199.676 209.094 204.370 204.400 C 209.064 199.706 209.064 192.094 204.370 187.400 ZM 128.000 180.000 C 121.373 180.000 116.000 185.373 116.000 192.000 L 116.000 224.000 C 116.000 230.627 121.373 236.000 128.000 236.000 C 134.627 236.000 140.000 230.627 140.000 224.000 L 140.000 192.000 C 140.000 185.373 134.627 180.000 128.000 180.000 ZM 74.260 164.770 L 51.630 187.400 C 46.936 192.094 46.936 199.706 51.630 204.400 C 56.324 209.094 63.936 209.094 68.630 204.400 L 91.260 181.770 C 95.954 177.076 95.954 169.464 91.260 164.770 C 86.566 160.076 78.954 160.076 74.260 164.770 ZM 76.000 128.000 C 76.000 121.373 70.627 116.000 64.000 116.000 L 32.000 116.000 C 25.373 116.000 20.000 121.373 20.000 128.000 C 20.000 134.627 25.373 140.000 32.000 140.000 L 64.000 140.000 C 70.627 140.000 76.000 134.627 76.000 128.000 ZM 68.600 51.630 C 63.906 46.936 56.294 46.936 51.600 51.630 C 46.906 56.324 46.906 63.936 51.600 68.630 L 74.260 91.230 C 78.954 95.924 86.566 95.924 91.260 91.230 C 95.954 86.536 95.954 78.924 91.260 74.230 Z"),
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
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
