package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorBoldIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 116.000 L 219.220 116.000 C 213.721 74.740 181.260 42.279 140.000 36.780 L 140.000 16.000 C 140.000 9.373 134.627 4.000 128.000 4.000 C 121.373 4.000 116.000 9.373 116.000 16.000 L 116.000 36.780 C 74.740 42.279 42.279 74.740 36.780 116.000 L 16.000 116.000 C 9.373 116.000 4.000 121.373 4.000 128.000 C 4.000 134.627 9.373 140.000 16.000 140.000 L 36.780 140.000 C 42.279 181.260 74.740 213.721 116.000 219.220 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 219.220 C 181.260 213.721 213.721 181.260 219.220 140.000 L 240.000 140.000 C 246.627 140.000 252.000 134.627 252.000 128.000 C 252.000 121.373 246.627 116.000 240.000 116.000 ZM 128.000 196.000 C 90.445 196.000 60.000 165.555 60.000 128.000 C 60.000 90.445 90.445 60.000 128.000 60.000 C 165.555 60.000 196.000 90.445 196.000 128.000 C 195.961 165.539 165.539 195.961 128.000 196.000 ZM 128.000 84.000 C 103.699 84.000 84.000 103.699 84.000 128.000 C 84.000 152.301 103.699 172.000 128.000 172.000 C 152.301 172.000 172.000 152.301 172.000 128.000 C 171.972 103.711 152.289 84.028 128.000 84.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
