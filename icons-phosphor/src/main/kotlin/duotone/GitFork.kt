package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorDuotoneIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 88.000 64.000 C 88.000 77.255 77.255 88.000 64.000 88.000 C 50.745 88.000 40.000 77.255 40.000 64.000 C 40.000 50.745 50.745 40.000 64.000 40.000 C 77.255 40.000 88.000 50.745 88.000 64.000 ZM 192.000 40.000 C 178.745 40.000 168.000 50.745 168.000 64.000 C 168.000 77.255 178.745 88.000 192.000 88.000 C 205.255 88.000 216.000 77.255 216.000 64.000 C 216.000 50.745 205.255 40.000 192.000 40.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 224.000 64.000 C 223.992 47.373 211.250 33.522 194.681 32.129 C 178.112 30.735 163.237 42.264 160.452 58.656 C 157.667 75.049 167.901 90.843 184.000 95.000 L 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 L 72.000 95.000 C 87.602 90.971 97.775 75.970 95.745 59.984 C 93.715 43.998 80.114 32.016 64.000 32.016 C 47.886 32.016 34.285 43.998 32.255 59.984 C 30.225 75.970 40.398 90.971 56.000 95.000 L 56.000 112.000 C 56.000 125.255 66.745 136.000 80.000 136.000 L 120.000 136.000 L 120.000 161.000 C 104.398 165.029 94.225 180.030 96.255 196.016 C 98.285 212.002 111.886 223.984 128.000 223.984 C 144.114 223.984 157.714 212.002 159.745 196.016 C 161.775 180.030 151.602 165.029 136.000 161.000 L 136.000 136.000 L 176.000 136.000 C 189.255 136.000 200.000 125.255 200.000 112.000 L 200.000 95.000 C 214.122 91.332 223.986 78.591 224.000 64.000 ZM 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 C 72.837 48.000 80.000 55.163 80.000 64.000 C 80.000 72.837 72.837 80.000 64.000 80.000 C 55.163 80.000 48.000 72.837 48.000 64.000 ZM 144.000 192.000 C 144.000 200.837 136.837 208.000 128.000 208.000 C 119.163 208.000 112.000 200.837 112.000 192.000 C 112.000 183.163 119.163 176.000 128.000 176.000 C 136.837 176.000 144.000 183.163 144.000 192.000 ZM 192.000 80.000 C 183.163 80.000 176.000 72.837 176.000 64.000 C 176.000 55.163 183.163 48.000 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 C 208.000 72.837 200.837 80.000 192.000 80.000 Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
