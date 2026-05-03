package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorBoldIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 28.000 L 152.000 28.000 C 140.954 28.000 132.000 36.954 132.000 48.000 L 132.000 100.000 L 58.160 100.000 C 52.900 83.349 37.462 72.021 20.000 72.000 C 13.373 72.000 8.000 77.373 8.000 84.000 C 8.000 90.627 13.373 96.000 20.000 96.000 C 28.837 96.000 36.000 103.163 36.000 112.000 C 36.050 158.371 73.629 195.950 120.000 196.000 L 160.000 196.000 C 206.392 196.000 244.000 158.392 244.000 112.000 C 244.000 65.608 206.392 28.000 160.000 28.000 ZM 208.060 76.120 C 213.363 83.186 217.028 91.343 218.790 100.000 L 178.210 100.000 ZM 160.000 52.000 C 170.473 52.002 180.761 54.761 189.830 60.000 L 156.000 87.000 L 156.000 52.000 ZM 160.000 172.000 L 120.000 172.000 C 91.501 171.962 66.948 151.915 61.210 124.000 L 218.790 124.000 C 213.052 151.915 188.499 171.962 160.000 172.000 ZM 108.000 224.000 C 108.000 235.046 99.046 244.000 88.000 244.000 C 76.954 244.000 68.000 235.046 68.000 224.000 C 68.000 212.954 76.954 204.000 88.000 204.000 C 99.046 204.000 108.000 212.954 108.000 224.000 ZM 212.000 224.000 C 212.000 235.046 203.046 244.000 192.000 244.000 C 180.954 244.000 172.000 235.046 172.000 224.000 C 172.000 212.954 180.954 204.000 192.000 204.000 C 203.046 204.000 212.000 212.954 212.000 224.000 Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
