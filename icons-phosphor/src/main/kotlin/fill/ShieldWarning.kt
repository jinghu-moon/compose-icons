package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorFillIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.460 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.460 154.040 233.050 177.130 214.190 C 198.480 196.670 224.000 164.720 224.000 112.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 120.000 96.000 C 120.000 91.582 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 ZM 128.000 184.000 C 121.373 184.000 116.000 178.627 116.000 172.000 C 116.000 165.373 121.373 160.000 128.000 160.000 C 134.627 160.000 140.000 165.373 140.000 172.000 C 140.000 178.627 134.627 184.000 128.000 184.000 Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
