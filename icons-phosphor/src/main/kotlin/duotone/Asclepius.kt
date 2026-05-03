package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorDuotoneIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 88.000 48.000 L 88.000 56.000 C 88.000 73.673 73.673 88.000 56.000 88.000 L 32.000 88.000 L 32.000 80.000 C 32.000 62.327 46.327 48.000 64.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 79.000 L 216.000 80.000 C 216.000 102.091 198.091 120.000 176.000 120.000 L 136.000 120.000 L 136.000 200.000 L 144.000 200.000 C 150.637 200.003 156.586 195.909 158.955 189.710 C 161.323 183.510 159.618 176.492 154.670 172.070 C 151.550 169.089 151.356 164.170 154.233 160.953 C 157.110 157.736 162.020 157.381 165.330 160.150 C 175.218 168.995 178.622 183.024 173.889 195.417 C 169.156 207.810 157.266 215.998 144.000 216.000 L 136.000 216.000 L 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 216.000 L 96.000 216.000 C 91.582 216.000 88.000 212.418 88.000 208.000 C 88.000 203.582 91.582 200.000 96.000 200.000 L 120.000 200.000 L 120.000 120.000 L 96.000 120.000 C 87.163 120.000 80.000 127.163 80.000 136.000 C 80.000 144.837 87.163 152.000 96.000 152.000 C 100.418 152.000 104.000 155.582 104.000 160.000 C 104.000 164.418 100.418 168.000 96.000 168.000 C 78.327 168.000 64.000 153.673 64.000 136.000 C 64.000 118.327 78.327 104.000 96.000 104.000 L 120.000 104.000 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 104.000 L 176.000 104.000 C 189.255 104.000 200.000 93.255 200.000 80.000 L 200.000 79.000 C 200.000 66.297 189.703 56.000 177.000 56.000 L 160.000 56.000 C 155.582 56.000 152.000 52.418 152.000 48.000 C 152.000 43.582 155.582 40.000 160.000 40.000 L 177.000 40.000 C 198.539 40.000 216.000 57.461 216.000 79.000 ZM 56.000 96.000 L 32.000 96.000 C 27.582 96.000 24.000 92.418 24.000 88.000 L 24.000 80.000 C 24.000 57.909 41.909 40.000 64.000 40.000 L 96.000 40.000 C 100.418 40.000 104.000 43.582 104.000 48.000 C 104.000 52.418 100.418 56.000 96.000 56.000 C 96.000 78.091 78.091 96.000 56.000 96.000 ZM 80.000 56.000 L 64.000 56.000 C 50.745 56.000 40.000 66.745 40.000 80.000 L 56.000 80.000 C 69.255 80.000 80.000 69.255 80.000 56.000 Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
