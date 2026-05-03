package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorFillIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 172.000 168.000 C 178.627 168.000 184.000 162.627 184.000 156.000 C 184.000 151.582 187.582 148.000 192.000 148.000 C 196.418 148.000 200.000 151.582 200.000 156.000 C 200.000 171.464 187.464 184.000 172.000 184.000 C 156.536 184.000 144.000 171.464 144.000 156.000 L 144.000 96.000 L 112.000 96.000 L 112.000 176.000 C 112.000 180.418 108.418 184.000 104.000 184.000 C 99.582 184.000 96.000 180.418 96.000 176.000 L 96.000 96.000 L 88.000 96.000 C 74.745 96.000 64.000 106.745 64.000 120.000 C 64.000 124.418 60.418 128.000 56.000 128.000 C 51.582 128.000 48.000 124.418 48.000 120.000 C 48.000 97.909 65.909 80.000 88.000 80.000 L 192.000 80.000 C 196.418 80.000 200.000 83.582 200.000 88.000 C 200.000 92.418 196.418 96.000 192.000 96.000 L 160.000 96.000 L 160.000 156.000 C 160.000 162.627 165.373 168.000 172.000 168.000 Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
