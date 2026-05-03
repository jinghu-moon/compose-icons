package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorFillIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 200.000 176.000 L 152.940 176.000 C 146.876 176.019 141.327 172.592 138.630 167.160 L 103.060 96.000 L 56.000 96.000 C 51.582 96.000 48.000 92.418 48.000 88.000 C 48.000 83.582 51.582 80.000 56.000 80.000 L 103.060 80.000 C 109.124 79.981 114.673 83.408 117.370 88.840 L 152.940 160.000 L 200.000 160.000 C 204.418 160.000 208.000 163.582 208.000 168.000 C 208.000 172.418 204.418 176.000 200.000 176.000 ZM 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 C 144.000 83.582 147.582 80.000 152.000 80.000 L 200.000 80.000 C 204.418 80.000 208.000 83.582 208.000 88.000 C 208.000 92.418 204.418 96.000 200.000 96.000 Z"),
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
        return _option!!
    }

private var _option: ImageVector? = null
