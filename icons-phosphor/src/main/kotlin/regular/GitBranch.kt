package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorRegularIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 64.000 C 231.992 47.373 219.250 33.522 202.681 32.129 C 186.112 30.735 171.237 42.264 168.452 58.656 C 165.667 75.049 175.901 90.843 192.000 95.000 L 192.000 112.000 C 192.000 116.418 188.418 120.000 184.000 120.000 L 96.000 120.000 C 93.274 119.999 90.568 120.466 88.000 121.380 L 88.000 95.000 C 103.602 90.971 113.775 75.970 111.745 59.984 C 109.715 43.998 96.114 32.016 80.000 32.016 C 63.886 32.016 50.285 43.998 48.255 59.984 C 46.225 75.970 56.398 90.971 72.000 95.000 L 72.000 161.000 C 56.398 165.029 46.225 180.030 48.255 196.016 C 50.285 212.002 63.886 223.984 80.000 223.984 C 96.114 223.984 109.715 212.002 111.745 196.016 C 113.775 180.030 103.602 165.029 88.000 161.000 L 88.000 144.000 C 88.000 139.582 91.582 136.000 96.000 136.000 L 184.000 136.000 C 197.255 136.000 208.000 125.255 208.000 112.000 L 208.000 95.000 C 222.122 91.332 231.986 78.591 232.000 64.000 ZM 64.000 64.000 C 64.000 55.163 71.163 48.000 80.000 48.000 C 88.837 48.000 96.000 55.163 96.000 64.000 C 96.000 72.837 88.837 80.000 80.000 80.000 C 71.163 80.000 64.000 72.837 64.000 64.000 ZM 96.000 192.000 C 96.000 200.837 88.837 208.000 80.000 208.000 C 71.163 208.000 64.000 200.837 64.000 192.000 C 64.000 183.163 71.163 176.000 80.000 176.000 C 88.837 176.000 96.000 183.163 96.000 192.000 ZM 200.000 80.000 C 191.163 80.000 184.000 72.837 184.000 64.000 C 184.000 55.163 191.163 48.000 200.000 48.000 C 208.837 48.000 216.000 55.163 216.000 64.000 C 216.000 72.837 208.837 80.000 200.000 80.000 Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
