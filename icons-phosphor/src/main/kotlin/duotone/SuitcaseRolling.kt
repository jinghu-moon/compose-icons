package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorDuotoneIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 64.000 L 200.000 208.000 C 200.000 212.418 196.418 216.000 192.000 216.000 L 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 192.000 56.000 C 196.418 56.000 200.000 59.582 200.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 104.000 88.000 L 104.000 184.000 C 104.000 188.418 100.418 192.000 96.000 192.000 C 91.582 192.000 88.000 188.418 88.000 184.000 L 88.000 88.000 C 88.000 83.582 91.582 80.000 96.000 80.000 C 100.418 80.000 104.000 83.582 104.000 88.000 ZM 128.000 80.000 C 123.582 80.000 120.000 83.582 120.000 88.000 L 120.000 184.000 C 120.000 188.418 123.582 192.000 128.000 192.000 C 132.418 192.000 136.000 188.418 136.000 184.000 L 136.000 88.000 C 136.000 83.582 132.418 80.000 128.000 80.000 ZM 160.000 80.000 C 155.582 80.000 152.000 83.582 152.000 88.000 L 152.000 184.000 C 152.000 188.418 155.582 192.000 160.000 192.000 C 164.418 192.000 168.000 188.418 168.000 184.000 L 168.000 88.000 C 168.000 83.582 164.418 80.000 160.000 80.000 ZM 208.000 64.000 L 208.000 208.000 C 208.000 216.837 200.837 224.000 192.000 224.000 L 176.000 224.000 L 176.000 240.000 C 176.000 244.418 172.418 248.000 168.000 248.000 C 163.582 248.000 160.000 244.418 160.000 240.000 L 160.000 224.000 L 96.000 224.000 L 96.000 240.000 C 96.000 244.418 92.418 248.000 88.000 248.000 C 83.582 248.000 80.000 244.418 80.000 240.000 L 80.000 224.000 L 64.000 224.000 C 55.163 224.000 48.000 216.837 48.000 208.000 L 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 L 88.000 48.000 L 88.000 24.000 C 88.000 10.745 98.745 0.000 112.000 0.000 L 144.000 0.000 C 157.255 0.000 168.000 10.745 168.000 24.000 L 168.000 48.000 L 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 ZM 104.000 48.000 L 152.000 48.000 L 152.000 24.000 C 152.000 19.582 148.418 16.000 144.000 16.000 L 112.000 16.000 C 107.582 16.000 104.000 19.582 104.000 24.000 ZM 192.000 208.000 L 192.000 64.000 L 64.000 64.000 L 64.000 208.000 L 192.000 208.000 Z"),
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
