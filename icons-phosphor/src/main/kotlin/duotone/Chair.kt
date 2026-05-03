package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorDuotoneIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 56.000 88.000 L 56.000 40.000 C 56.000 35.582 59.582 32.000 64.000 32.000 L 192.000 32.000 C 196.418 32.000 200.000 35.582 200.000 40.000 L 200.000 88.000 C 200.000 92.418 196.418 96.000 192.000 96.000 L 64.000 96.000 C 59.582 96.000 56.000 92.418 56.000 88.000 ZM 208.000 144.000 L 48.000 144.000 C 43.582 144.000 40.000 147.582 40.000 152.000 L 40.000 168.000 C 40.000 172.418 43.582 176.000 48.000 176.000 L 208.000 176.000 C 212.418 176.000 216.000 172.418 216.000 168.000 L 216.000 152.000 C 216.000 147.582 212.418 144.000 208.000 144.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 136.000 L 176.000 136.000 L 176.000 104.000 L 192.000 104.000 C 200.837 104.000 208.000 96.837 208.000 88.000 L 208.000 40.000 C 208.000 31.163 200.837 24.000 192.000 24.000 L 64.000 24.000 C 55.163 24.000 48.000 31.163 48.000 40.000 L 48.000 88.000 C 48.000 96.837 55.163 104.000 64.000 104.000 L 80.000 104.000 L 80.000 136.000 L 48.000 136.000 C 39.163 136.000 32.000 143.163 32.000 152.000 L 32.000 168.000 C 32.000 176.837 39.163 184.000 48.000 184.000 L 56.000 184.000 L 56.000 224.000 C 56.000 228.418 59.582 232.000 64.000 232.000 C 68.418 232.000 72.000 228.418 72.000 224.000 L 72.000 184.000 L 184.000 184.000 L 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 L 200.000 184.000 L 208.000 184.000 C 216.837 184.000 224.000 176.837 224.000 168.000 L 224.000 152.000 C 224.000 143.163 216.837 136.000 208.000 136.000 ZM 64.000 40.000 L 192.000 40.000 L 192.000 88.000 L 64.000 88.000 ZM 96.000 104.000 L 160.000 104.000 L 160.000 136.000 L 96.000 136.000 ZM 208.000 168.000 L 48.000 168.000 L 48.000 152.000 L 208.000 152.000 L 208.000 168.000 Z"),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
