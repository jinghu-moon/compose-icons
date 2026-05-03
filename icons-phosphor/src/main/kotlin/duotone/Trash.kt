package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorDuotoneIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 56.000 L 200.000 208.000 C 200.000 212.418 196.418 216.000 192.000 216.000 L 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 L 56.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 48.000 L 176.000 48.000 L 176.000 40.000 C 176.000 26.745 165.255 16.000 152.000 16.000 L 104.000 16.000 C 90.745 16.000 80.000 26.745 80.000 40.000 L 80.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 C 32.000 60.418 35.582 64.000 40.000 64.000 L 48.000 64.000 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 192.000 224.000 C 200.837 224.000 208.000 216.837 208.000 208.000 L 208.000 64.000 L 216.000 64.000 C 220.418 64.000 224.000 60.418 224.000 56.000 C 224.000 51.582 220.418 48.000 216.000 48.000 ZM 96.000 40.000 C 96.000 35.582 99.582 32.000 104.000 32.000 L 152.000 32.000 C 156.418 32.000 160.000 35.582 160.000 40.000 L 160.000 48.000 L 96.000 48.000 ZM 192.000 208.000 L 64.000 208.000 L 64.000 64.000 L 192.000 64.000 ZM 112.000 104.000 L 112.000 168.000 C 112.000 172.418 108.418 176.000 104.000 176.000 C 99.582 176.000 96.000 172.418 96.000 168.000 L 96.000 104.000 C 96.000 99.582 99.582 96.000 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 ZM 160.000 104.000 L 160.000 168.000 C 160.000 172.418 156.418 176.000 152.000 176.000 C 147.582 176.000 144.000 172.418 144.000 168.000 L 144.000 104.000 C 144.000 99.582 147.582 96.000 152.000 96.000 C 156.418 96.000 160.000 99.582 160.000 104.000 Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
