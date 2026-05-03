package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorFillIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 104.000 64.000 C 103.992 47.373 91.250 33.522 74.681 32.129 C 58.112 30.735 43.237 42.264 40.452 58.656 C 37.667 75.049 47.901 90.843 64.000 95.000 L 64.000 161.000 C 48.398 165.029 38.225 180.030 40.255 196.016 C 42.285 212.002 55.886 223.984 72.000 223.984 C 88.114 223.984 101.715 212.002 103.745 196.016 C 105.775 180.030 95.602 165.029 80.000 161.000 L 80.000 95.000 C 94.122 91.332 103.986 78.591 104.000 64.000 ZM 88.000 192.000 C 88.000 200.837 80.837 208.000 72.000 208.000 C 63.163 208.000 56.000 200.837 56.000 192.000 C 56.000 183.163 63.163 176.000 72.000 176.000 C 80.837 176.000 88.000 183.163 88.000 192.000 ZM 232.000 192.000 C 231.992 208.627 219.250 222.478 202.681 223.871 C 186.112 225.265 171.237 213.736 168.452 197.344 C 165.667 180.951 175.901 165.157 192.000 161.000 L 192.000 110.630 C 192.002 108.508 191.160 106.472 189.660 104.970 L 152.000 67.310 L 152.000 96.000 C 152.000 100.418 148.418 104.000 144.000 104.000 C 139.582 104.000 136.000 100.418 136.000 96.000 L 136.000 48.000 C 136.000 43.582 139.582 40.000 144.000 40.000 L 192.000 40.000 C 196.418 40.000 200.000 43.582 200.000 48.000 C 200.000 52.418 196.418 56.000 192.000 56.000 L 163.310 56.000 L 201.000 93.660 C 205.511 98.164 208.032 104.286 208.000 110.660 L 208.000 161.000 C 222.122 164.668 231.986 177.409 232.000 192.000 Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
