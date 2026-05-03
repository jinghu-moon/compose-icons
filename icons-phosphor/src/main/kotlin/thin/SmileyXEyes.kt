package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorThinIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 186.830 98.830 L 173.660 112.000 L 186.830 125.170 C 188.393 126.733 188.393 129.267 186.830 130.830 C 185.267 132.393 182.733 132.393 181.170 130.830 L 168.000 117.660 L 154.830 130.830 C 153.267 132.393 150.733 132.393 149.170 130.830 C 147.607 129.267 147.607 126.733 149.170 125.170 L 162.340 112.000 L 149.170 98.830 C 147.607 97.267 147.607 94.733 149.170 93.170 C 150.733 91.607 153.267 91.607 154.830 93.170 L 168.000 106.340 L 181.170 93.170 C 182.733 91.607 185.267 91.607 186.830 93.170 C 188.393 94.733 188.393 97.267 186.830 98.830 ZM 106.830 98.830 L 93.660 112.000 L 106.830 125.170 C 108.393 126.733 108.393 129.267 106.830 130.830 C 105.267 132.393 102.733 132.393 101.170 130.830 L 88.000 117.660 L 74.830 130.830 C 73.267 132.393 70.733 132.393 69.170 130.830 C 67.607 129.267 67.607 126.733 69.170 125.170 L 82.340 112.000 L 69.170 98.830 C 67.607 97.267 67.607 94.733 69.170 93.170 C 70.733 91.607 73.267 91.607 74.830 93.170 L 88.000 106.340 L 101.170 93.170 C 102.733 91.607 105.267 91.607 106.830 93.170 C 108.393 94.733 108.393 97.267 106.830 98.830 ZM 136.000 180.000 C 136.000 184.418 132.418 188.000 128.000 188.000 C 123.582 188.000 120.000 184.418 120.000 180.000 C 120.000 175.582 123.582 172.000 128.000 172.000 C 132.418 172.000 136.000 175.582 136.000 180.000 Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
