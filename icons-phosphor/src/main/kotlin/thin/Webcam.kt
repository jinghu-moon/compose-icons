package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorThinIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 104.000 C 164.000 84.118 147.882 68.000 128.000 68.000 C 108.118 68.000 92.000 84.118 92.000 104.000 C 92.000 123.882 108.118 140.000 128.000 140.000 C 147.882 140.000 164.000 123.882 164.000 104.000 ZM 100.000 104.000 C 100.000 88.536 112.536 76.000 128.000 76.000 C 143.464 76.000 156.000 88.536 156.000 104.000 C 156.000 119.464 143.464 132.000 128.000 132.000 C 112.536 132.000 100.000 119.464 100.000 104.000 ZM 224.000 204.000 L 132.000 204.000 L 132.000 179.890 C 173.137 177.722 205.058 143.175 203.974 101.995 C 202.889 60.815 169.194 27.995 128.000 27.995 C 86.806 27.995 53.111 60.815 52.026 101.995 C 50.942 143.175 82.863 177.722 124.000 179.890 L 124.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 205.791 28.000 208.000 C 28.000 210.209 29.791 212.000 32.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 C 228.000 205.791 226.209 204.000 224.000 204.000 ZM 60.000 104.000 C 60.000 66.445 90.445 36.000 128.000 36.000 C 165.555 36.000 196.000 66.445 196.000 104.000 C 196.000 141.555 165.555 172.000 128.000 172.000 C 90.461 171.961 60.039 141.539 60.000 104.000 Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
