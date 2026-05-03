package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorFillIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 112.000 88.000 C 147.330 88.039 175.961 116.670 176.000 152.000 C 176.000 156.418 172.418 160.000 168.000 160.000 C 163.582 160.000 160.000 156.418 160.000 152.000 C 159.972 125.502 138.498 104.028 112.000 104.000 C 107.582 104.000 104.000 100.418 104.000 96.000 C 104.000 91.582 107.582 88.000 112.000 88.000 ZM 200.000 192.000 L 80.000 192.000 C 75.582 192.000 72.000 188.418 72.000 184.000 L 72.000 104.000 L 56.000 104.000 C 51.582 104.000 48.000 100.418 48.000 96.000 C 48.000 91.582 51.582 88.000 56.000 88.000 L 72.000 88.000 L 72.000 72.000 C 72.000 67.582 75.582 64.000 80.000 64.000 C 84.418 64.000 88.000 67.582 88.000 72.000 L 88.000 176.000 L 200.000 176.000 C 204.418 176.000 208.000 179.582 208.000 184.000 C 208.000 188.418 204.418 192.000 200.000 192.000 Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
