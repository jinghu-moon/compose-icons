package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorBoldIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 84.000 C 108.000 75.163 115.163 68.000 124.000 68.000 C 132.837 68.000 140.000 75.163 140.000 84.000 C 140.000 92.837 132.837 100.000 124.000 100.000 C 115.163 100.000 108.000 92.837 108.000 84.000 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 ZM 140.000 164.680 L 140.000 132.000 C 140.000 120.954 131.046 112.000 120.000 112.000 C 114.149 111.991 109.144 116.204 108.155 121.971 C 107.166 127.738 110.480 133.378 116.000 135.320 L 116.000 168.000 C 116.000 179.046 124.954 188.000 136.000 188.000 C 141.851 188.009 146.856 183.796 147.845 178.029 C 148.834 172.262 145.520 166.622 140.000 164.680 Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
