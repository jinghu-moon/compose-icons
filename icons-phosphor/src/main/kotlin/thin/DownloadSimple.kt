package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorThinIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 144.000 L 220.000 208.000 C 220.000 210.209 218.209 212.000 216.000 212.000 L 40.000 212.000 C 37.791 212.000 36.000 210.209 36.000 208.000 L 36.000 144.000 C 36.000 141.791 37.791 140.000 40.000 140.000 C 42.209 140.000 44.000 141.791 44.000 144.000 L 44.000 204.000 L 212.000 204.000 L 212.000 144.000 C 212.000 141.791 213.791 140.000 216.000 140.000 C 218.209 140.000 220.000 141.791 220.000 144.000 ZM 125.170 146.830 C 125.920 147.581 126.938 148.003 128.000 148.003 C 129.062 148.003 130.080 147.581 130.830 146.830 L 170.830 106.830 C 172.393 105.267 172.393 102.733 170.830 101.170 C 169.267 99.607 166.733 99.607 165.170 101.170 L 132.000 134.340 L 132.000 32.000 C 132.000 29.791 130.209 28.000 128.000 28.000 C 125.791 28.000 124.000 29.791 124.000 32.000 L 124.000 134.340 L 90.830 101.170 C 89.267 99.607 86.733 99.607 85.170 101.170 C 83.607 102.733 83.607 105.267 85.170 106.830 Z"),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
