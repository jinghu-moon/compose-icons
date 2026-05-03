package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorRegularIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 56.000 208.000 L 56.000 224.000 C 56.000 228.418 59.582 232.000 64.000 232.000 C 68.418 232.000 72.000 228.418 72.000 224.000 L 72.000 208.000 L 184.000 208.000 L 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 L 200.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 192.000 L 40.000 192.000 L 40.000 56.000 L 216.000 56.000 L 216.000 120.000 L 199.320 120.000 C 195.161 95.396 172.843 78.081 147.977 80.168 C 123.111 82.255 103.991 103.046 103.991 128.000 C 103.991 152.954 123.111 173.745 147.977 175.832 C 172.843 177.919 195.161 160.604 199.320 136.000 L 216.000 136.000 L 216.000 192.000 ZM 165.840 120.000 C 162.219 113.729 154.837 110.671 147.842 112.545 C 140.848 114.419 135.984 120.758 135.984 128.000 C 135.984 135.242 140.848 141.581 147.842 143.455 C 154.837 145.329 162.219 142.271 165.840 136.000 L 183.000 136.000 C 178.971 151.602 163.970 161.775 147.984 159.745 C 131.998 157.714 120.016 144.114 120.016 128.000 C 120.016 111.886 131.998 98.285 147.984 96.255 C 163.970 94.225 178.971 104.398 183.000 120.000 Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
