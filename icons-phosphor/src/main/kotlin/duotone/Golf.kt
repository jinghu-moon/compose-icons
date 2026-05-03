package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorDuotoneIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 96.000 C 208.000 140.183 172.183 176.000 128.000 176.000 C 83.817 176.000 48.000 140.183 48.000 96.000 C 48.000 51.817 83.817 16.000 128.000 16.000 C 172.183 16.000 208.000 51.817 208.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 176.000 100.000 C 176.000 106.627 170.627 112.000 164.000 112.000 C 157.373 112.000 152.000 106.627 152.000 100.000 C 152.000 93.373 157.373 88.000 164.000 88.000 C 170.627 88.000 176.000 93.373 176.000 100.000 ZM 132.000 120.000 C 125.373 120.000 120.000 125.373 120.000 132.000 C 120.000 138.627 125.373 144.000 132.000 144.000 C 138.627 144.000 144.000 138.627 144.000 132.000 C 144.000 125.373 138.627 120.000 132.000 120.000 ZM 216.000 96.000 C 216.000 144.601 176.601 184.000 128.000 184.000 C 79.399 184.000 40.000 144.601 40.000 96.000 C 40.000 47.399 79.399 8.000 128.000 8.000 C 176.578 8.055 215.945 47.422 216.000 96.000 ZM 200.000 96.000 C 200.000 56.235 167.764 24.000 128.000 24.000 C 88.235 24.000 56.000 56.235 56.000 96.000 C 56.000 135.764 88.235 168.000 128.000 168.000 C 167.746 167.956 199.956 135.746 200.000 96.000 ZM 165.140 192.530 C 152.000 197.560 139.850 200.000 128.000 200.000 C 116.150 200.000 104.000 197.560 90.860 192.530 C 88.178 191.449 85.122 191.900 82.866 193.708 C 80.610 195.517 79.505 198.402 79.977 201.254 C 80.448 204.107 82.422 206.483 85.140 207.470 C 96.309 211.854 108.048 214.618 120.000 215.680 L 120.000 248.000 C 120.000 252.418 123.582 256.000 128.000 256.000 C 132.418 256.000 136.000 252.418 136.000 248.000 L 136.000 215.680 C 147.952 214.618 159.691 211.854 170.860 207.470 C 173.578 206.483 175.552 204.107 176.023 201.254 C 176.495 198.402 175.390 195.517 173.134 193.708 C 170.878 191.900 167.822 191.449 165.140 192.530 Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
