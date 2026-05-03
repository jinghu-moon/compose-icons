package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorDuotoneIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 116.000 L 232.000 116.000 C 232.000 149.137 205.137 176.000 172.000 176.000 L 160.000 176.000 L 160.000 216.000 L 96.000 216.000 L 96.000 136.000 L 84.000 136.000 C 50.863 136.000 24.000 109.137 24.000 76.000 L 24.000 76.000 C 24.000 64.954 32.954 56.000 44.000 56.000 L 44.000 56.000 C 55.046 56.000 64.000 64.954 64.000 76.000 C 64.000 87.046 72.954 96.000 84.000 96.000 L 96.000 96.000 L 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 L 128.000 24.000 C 145.673 24.000 160.000 38.327 160.000 56.000 L 160.000 136.000 L 172.000 136.000 C 183.046 136.000 192.000 127.046 192.000 116.000 C 192.000 104.954 200.954 96.000 212.000 96.000 L 212.000 96.000 C 223.046 96.000 232.000 104.954 232.000 116.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 208.000 L 168.000 208.000 L 168.000 184.000 L 172.000 184.000 C 209.539 183.961 239.961 153.539 240.000 116.000 C 240.000 100.536 227.464 88.000 212.000 88.000 C 196.536 88.000 184.000 100.536 184.000 116.000 C 184.000 122.627 178.627 128.000 172.000 128.000 L 168.000 128.000 L 168.000 56.000 C 168.000 33.909 150.091 16.000 128.000 16.000 C 105.909 16.000 88.000 33.909 88.000 56.000 L 88.000 88.000 L 84.000 88.000 C 77.373 88.000 72.000 82.627 72.000 76.000 C 72.000 60.536 59.464 48.000 44.000 48.000 C 28.536 48.000 16.000 60.536 16.000 76.000 C 16.039 113.539 46.461 143.961 84.000 144.000 L 88.000 144.000 L 88.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 211.582 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 C 224.000 211.582 220.418 208.000 216.000 208.000 ZM 96.000 128.000 L 84.000 128.000 C 55.295 127.967 32.033 104.705 32.000 76.000 C 32.000 69.373 37.373 64.000 44.000 64.000 C 50.627 64.000 56.000 69.373 56.000 76.000 C 56.000 91.464 68.536 104.000 84.000 104.000 L 96.000 104.000 C 100.418 104.000 104.000 100.418 104.000 96.000 L 104.000 56.000 C 104.000 42.745 114.745 32.000 128.000 32.000 C 141.255 32.000 152.000 42.745 152.000 56.000 L 152.000 136.000 C 152.000 140.418 155.582 144.000 160.000 144.000 L 172.000 144.000 C 187.464 144.000 200.000 131.464 200.000 116.000 C 200.000 109.373 205.373 104.000 212.000 104.000 C 218.627 104.000 224.000 109.373 224.000 116.000 C 223.967 144.705 200.705 167.967 172.000 168.000 L 160.000 168.000 C 155.582 168.000 152.000 171.582 152.000 176.000 L 152.000 208.000 L 104.000 208.000 L 104.000 136.000 C 104.000 131.582 100.418 128.000 96.000 128.000 Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
