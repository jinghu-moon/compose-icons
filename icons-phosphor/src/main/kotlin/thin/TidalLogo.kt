package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorThinIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.830 93.170 L 210.830 53.170 C 210.080 52.419 209.062 51.997 208.000 51.997 C 206.938 51.997 205.920 52.419 205.170 53.170 L 168.000 90.340 L 130.830 53.170 C 130.080 52.419 129.062 51.997 128.000 51.997 C 126.938 51.997 125.920 52.419 125.170 53.170 L 88.000 90.340 L 50.830 53.170 C 50.080 52.419 49.062 51.997 48.000 51.997 C 46.938 51.997 45.920 52.419 45.170 53.170 L 5.170 93.170 C 4.419 93.920 3.997 94.938 3.997 96.000 C 3.997 97.062 4.419 98.080 5.170 98.830 L 45.170 138.830 C 45.920 139.581 46.938 140.003 48.000 140.003 C 49.062 140.003 50.080 139.581 50.830 138.830 L 88.000 101.660 L 122.340 136.000 L 85.170 173.170 C 84.419 173.920 83.997 174.938 83.997 176.000 C 83.997 177.062 84.419 178.080 85.170 178.830 L 125.170 218.830 C 125.920 219.581 126.938 220.003 128.000 220.003 C 129.062 220.003 130.080 219.581 130.830 218.830 L 170.830 178.830 C 171.581 178.080 172.003 177.062 172.003 176.000 C 172.003 174.938 171.581 173.920 170.830 173.170 L 133.660 136.000 L 168.000 101.660 L 205.170 138.830 C 205.920 139.581 206.938 140.003 208.000 140.003 C 209.062 140.003 210.080 139.581 210.830 138.830 L 250.830 98.830 C 251.581 98.080 252.003 97.062 252.003 96.000 C 252.003 94.938 251.581 93.920 250.830 93.170 ZM 48.000 130.340 L 13.660 96.000 L 48.000 61.660 L 82.340 96.000 ZM 128.000 210.340 L 93.660 176.000 L 128.000 141.660 L 162.340 176.000 ZM 128.000 130.340 L 93.660 96.000 L 128.000 61.660 L 162.340 96.000 ZM 208.000 130.340 L 173.660 96.000 L 208.000 61.660 L 242.340 96.000 Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
