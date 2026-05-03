package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorFillIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 216.000 L 200.000 216.000 L 200.000 115.310 L 211.310 104.000 C 214.324 101.010 216.014 96.936 216.000 92.690 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 L 180.000 32.000 C 175.582 32.000 172.000 35.582 172.000 40.000 L 172.000 64.000 L 148.000 64.000 L 148.000 40.000 C 148.000 35.582 144.418 32.000 140.000 32.000 L 116.000 32.000 C 111.582 32.000 108.000 35.582 108.000 40.000 L 108.000 64.000 L 84.000 64.000 L 84.000 40.000 C 84.000 35.582 80.418 32.000 76.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 92.690 C 39.986 96.936 41.676 101.010 44.690 104.000 L 56.000 115.310 L 56.000 216.000 L 40.000 216.000 C 35.582 216.000 32.000 219.582 32.000 224.000 C 32.000 228.418 35.582 232.000 40.000 232.000 L 216.000 232.000 C 220.418 232.000 224.000 228.418 224.000 224.000 C 224.000 219.582 220.418 216.000 216.000 216.000 ZM 112.000 168.000 C 112.000 159.163 119.163 152.000 128.000 152.000 C 136.837 152.000 144.000 159.163 144.000 168.000 L 144.000 216.000 L 112.000 216.000 Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
