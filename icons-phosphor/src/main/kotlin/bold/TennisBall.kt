package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorBoldIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.400 51.600 C 162.214 9.450 93.849 9.469 51.687 51.643 C 9.524 93.817 9.524 162.183 51.687 204.357 C 93.849 246.531 162.214 246.550 204.400 204.400 C 246.532 162.179 246.532 93.821 204.400 51.600 ZM 68.580 68.600 C 81.093 56.055 97.274 47.818 114.780 45.080 C 109.032 80.936 80.916 109.052 45.060 114.800 C 47.794 97.287 56.031 81.099 68.580 68.580 ZM 44.740 139.070 C 68.767 136.227 91.128 125.344 108.190 108.190 C 125.344 91.128 136.227 68.767 139.070 44.740 C 176.699 49.690 206.310 79.301 211.260 116.930 C 161.856 122.912 122.917 161.846 116.930 211.250 C 79.301 206.308 49.687 176.699 44.740 139.070 ZM 187.420 187.420 C 174.904 199.961 158.725 208.198 141.220 210.940 C 146.968 175.084 175.084 146.968 210.940 141.220 C 208.202 158.726 199.965 174.907 187.420 187.420 Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
