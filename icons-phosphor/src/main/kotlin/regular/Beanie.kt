package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorRegularIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 162.160 L 224.000 144.000 C 223.919 100.130 194.161 61.874 151.660 51.000 C 159.080 39.275 156.794 23.885 146.287 14.823 C 135.780 5.761 120.220 5.761 109.713 14.823 C 99.206 23.885 96.920 39.275 104.340 51.000 C 61.839 61.874 32.081 100.130 32.000 144.000 L 32.000 162.160 C 27.055 165.015 24.006 170.290 24.000 176.000 L 24.000 208.000 C 24.000 216.837 31.163 224.000 40.000 224.000 L 216.000 224.000 C 224.837 224.000 232.000 216.837 232.000 208.000 L 232.000 176.000 C 231.994 170.290 228.945 165.015 224.000 162.160 ZM 116.000 36.000 C 116.000 29.373 121.373 24.000 128.000 24.000 C 134.627 24.000 140.000 29.373 140.000 36.000 C 140.000 42.627 134.627 48.000 128.000 48.000 C 121.373 48.000 116.000 42.627 116.000 36.000 ZM 128.000 64.000 C 172.162 64.050 207.950 99.838 208.000 144.000 L 208.000 160.000 L 48.000 160.000 L 48.000 144.000 C 48.050 99.838 83.838 64.050 128.000 64.000 ZM 120.000 176.000 L 120.000 208.000 L 80.000 208.000 L 80.000 176.000 ZM 136.000 176.000 L 176.000 176.000 L 176.000 208.000 L 136.000 208.000 ZM 40.000 176.000 L 64.000 176.000 L 64.000 208.000 L 40.000 208.000 ZM 216.000 208.000 L 192.000 208.000 L 192.000 176.000 L 216.000 176.000 L 216.000 208.000 Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
