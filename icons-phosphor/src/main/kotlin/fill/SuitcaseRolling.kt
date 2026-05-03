package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorFillIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 48.000 L 168.000 48.000 L 168.000 24.000 C 168.000 10.745 157.255 0.000 144.000 0.000 L 112.000 0.000 C 98.745 0.000 88.000 10.745 88.000 24.000 L 88.000 48.000 L 64.000 48.000 C 55.163 48.000 48.000 55.163 48.000 64.000 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 80.000 224.000 L 80.000 240.000 C 80.000 244.418 83.582 248.000 88.000 248.000 C 92.418 248.000 96.000 244.418 96.000 240.000 L 96.000 224.000 L 160.000 224.000 L 160.000 240.000 C 160.000 244.418 163.582 248.000 168.000 248.000 C 172.418 248.000 176.000 244.418 176.000 240.000 L 176.000 224.000 L 192.000 224.000 C 200.837 224.000 208.000 216.837 208.000 208.000 L 208.000 64.000 C 208.000 55.163 200.837 48.000 192.000 48.000 ZM 96.000 192.000 C 96.000 196.418 92.418 200.000 88.000 200.000 C 83.582 200.000 80.000 196.418 80.000 192.000 L 80.000 80.000 C 80.000 75.582 83.582 72.000 88.000 72.000 C 92.418 72.000 96.000 75.582 96.000 80.000 ZM 136.000 192.000 C 136.000 196.418 132.418 200.000 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 ZM 152.000 48.000 L 104.000 48.000 L 104.000 24.000 C 104.000 19.582 107.582 16.000 112.000 16.000 L 144.000 16.000 C 148.418 16.000 152.000 19.582 152.000 24.000 ZM 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 C 163.582 200.000 160.000 196.418 160.000 192.000 L 160.000 80.000 C 160.000 75.582 163.582 72.000 168.000 72.000 C 172.418 72.000 176.000 75.582 176.000 80.000 Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
