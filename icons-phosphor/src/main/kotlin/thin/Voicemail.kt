package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorThinIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 76.000 C 176.846 76.023 156.496 91.354 150.085 113.603 C 143.675 135.853 152.748 159.660 172.340 172.000 L 83.660 172.000 C 105.584 158.191 113.997 130.350 103.389 106.711 C 92.782 83.072 66.389 70.849 41.500 78.047 C 16.610 85.246 0.817 109.670 4.465 135.322 C 8.114 160.974 30.090 180.026 56.000 180.000 L 200.000 180.000 C 228.719 180.000 252.000 156.719 252.000 128.000 C 252.000 99.281 228.719 76.000 200.000 76.000 ZM 12.000 128.000 C 12.000 103.699 31.699 84.000 56.000 84.000 C 80.301 84.000 100.000 103.699 100.000 128.000 C 100.000 152.301 80.301 172.000 56.000 172.000 C 31.711 171.972 12.028 152.289 12.000 128.000 ZM 200.000 172.000 C 175.699 172.000 156.000 152.301 156.000 128.000 C 156.000 103.699 175.699 84.000 200.000 84.000 C 224.301 84.000 244.000 103.699 244.000 128.000 C 243.972 152.289 224.289 171.972 200.000 172.000 Z"),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
