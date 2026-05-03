package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorDuotoneIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 211.470 L 200.000 224.000 C 200.000 228.418 196.418 232.000 192.000 232.000 L 88.000 232.000 C 83.582 232.000 80.000 228.418 80.000 224.000 L 80.000 167.380 C 79.994 157.656 84.409 148.457 92.000 142.380 L 108.000 129.600 C 115.591 123.523 120.006 114.324 120.000 104.600 L 120.000 72.000 L 160.000 72.000 C 186.140 113.823 200.000 162.150 200.000 211.470 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 200.000 80.000 C 204.418 80.000 208.000 76.418 208.000 72.000 C 207.967 41.086 182.914 16.033 152.000 16.000 L 80.000 16.000 C 71.163 16.000 64.000 23.163 64.000 32.000 L 64.000 80.000 C 64.000 93.255 53.255 104.000 40.000 104.000 C 35.582 104.000 32.000 107.582 32.000 112.000 C 32.000 116.418 35.582 120.000 40.000 120.000 C 62.091 120.000 80.000 102.091 80.000 80.000 L 112.000 80.000 L 112.000 104.620 C 112.021 111.914 108.706 118.816 103.000 123.360 L 87.000 136.150 C 77.493 143.723 71.968 155.225 72.000 167.380 L 72.000 224.000 C 72.000 232.837 79.163 240.000 88.000 240.000 L 192.000 240.000 C 200.837 240.000 208.000 232.837 208.000 224.000 L 208.000 211.470 C 208.013 165.471 196.312 120.226 174.000 80.000 ZM 80.000 32.000 L 152.000 32.000 C 171.000 32.027 187.370 45.390 191.200 64.000 L 80.000 64.000 ZM 192.000 211.470 L 192.000 224.000 L 88.000 224.000 L 88.000 167.380 C 87.979 160.086 91.294 153.184 97.000 148.640 L 113.000 135.850 C 122.507 128.277 128.032 116.775 128.000 104.620 L 128.000 80.000 L 155.520 80.000 C 179.402 119.694 192.014 165.146 192.000 211.470 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
