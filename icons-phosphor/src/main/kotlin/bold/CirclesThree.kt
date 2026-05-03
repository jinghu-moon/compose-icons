package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorBoldIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 76.000 C 176.000 49.490 154.510 28.000 128.000 28.000 C 101.490 28.000 80.000 49.490 80.000 76.000 C 80.000 102.510 101.490 124.000 128.000 124.000 C 154.498 123.972 175.972 102.498 176.000 76.000 ZM 128.000 100.000 C 114.745 100.000 104.000 89.255 104.000 76.000 C 104.000 62.745 114.745 52.000 128.000 52.000 C 141.255 52.000 152.000 62.745 152.000 76.000 C 152.000 89.255 141.255 100.000 128.000 100.000 ZM 188.000 124.000 C 161.490 124.000 140.000 145.490 140.000 172.000 C 140.000 198.510 161.490 220.000 188.000 220.000 C 214.510 220.000 236.000 198.510 236.000 172.000 C 235.972 145.502 214.498 124.028 188.000 124.000 ZM 188.000 196.000 C 174.745 196.000 164.000 185.255 164.000 172.000 C 164.000 158.745 174.745 148.000 188.000 148.000 C 201.255 148.000 212.000 158.745 212.000 172.000 C 212.000 185.255 201.255 196.000 188.000 196.000 ZM 68.000 124.000 C 41.490 124.000 20.000 145.490 20.000 172.000 C 20.000 198.510 41.490 220.000 68.000 220.000 C 94.510 220.000 116.000 198.510 116.000 172.000 C 115.972 145.502 94.498 124.028 68.000 124.000 ZM 68.000 196.000 C 54.745 196.000 44.000 185.255 44.000 172.000 C 44.000 158.745 54.745 148.000 68.000 148.000 C 81.255 148.000 92.000 158.745 92.000 172.000 C 92.000 185.255 81.255 196.000 68.000 196.000 Z"),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
