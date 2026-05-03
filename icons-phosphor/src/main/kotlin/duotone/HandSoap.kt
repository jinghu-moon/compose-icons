package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorDuotoneIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 136.000 L 208.000 216.000 C 208.000 220.418 204.418 224.000 200.000 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 136.000 C 48.000 118.327 62.327 104.000 80.000 104.000 L 176.000 104.000 C 193.673 104.000 208.000 118.327 208.000 136.000 Z"),
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
                pathData = parseSvgPathData("M 184.000 96.800 L 184.000 88.000 C 184.000 70.327 169.673 56.000 152.000 56.000 L 136.000 56.000 L 136.000 32.000 L 168.000 32.000 C 172.418 32.000 176.000 35.582 176.000 40.000 C 176.000 44.418 179.582 48.000 184.000 48.000 C 188.418 48.000 192.000 44.418 192.000 40.000 C 192.000 26.745 181.255 16.000 168.000 16.000 L 104.000 16.000 C 99.582 16.000 96.000 19.582 96.000 24.000 C 96.000 28.418 99.582 32.000 104.000 32.000 L 120.000 32.000 L 120.000 56.000 L 104.000 56.000 C 86.327 56.000 72.000 70.327 72.000 88.000 L 72.000 96.800 C 53.388 100.627 40.023 116.999 40.000 136.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 136.000 C 215.977 116.999 202.612 100.627 184.000 96.800 ZM 104.000 72.000 L 152.000 72.000 C 160.837 72.000 168.000 79.163 168.000 88.000 L 168.000 96.000 L 88.000 96.000 L 88.000 88.000 C 88.000 79.163 95.163 72.000 104.000 72.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 136.000 C 56.000 122.745 66.745 112.000 80.000 112.000 L 176.000 112.000 C 189.255 112.000 200.000 122.745 200.000 136.000 L 200.000 216.000 Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
