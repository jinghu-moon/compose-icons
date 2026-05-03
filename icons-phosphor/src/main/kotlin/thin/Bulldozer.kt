package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorThinIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 204.000 L 240.000 204.000 C 233.373 204.000 228.000 198.627 228.000 192.000 L 228.000 160.000 C 228.000 153.373 233.373 148.000 240.000 148.000 L 248.000 148.000 C 250.209 148.000 252.000 146.209 252.000 144.000 C 252.000 141.791 250.209 140.000 248.000 140.000 L 240.000 140.000 C 228.954 140.000 220.000 148.954 220.000 160.000 L 220.000 172.000 L 195.770 172.000 C 193.821 154.818 179.951 141.438 162.710 140.110 L 125.710 51.380 C 123.851 46.922 119.500 44.014 114.670 44.000 L 24.000 44.000 C 17.373 44.000 12.000 49.373 12.000 56.000 L 12.000 153.410 C 3.305 164.199 1.574 179.021 7.549 191.523 C 13.524 204.025 26.143 211.988 40.000 212.000 L 160.000 212.000 C 178.332 211.996 193.733 198.218 195.770 180.000 L 220.000 180.000 L 220.000 192.000 C 220.000 203.046 228.954 212.000 240.000 212.000 L 248.000 212.000 C 250.209 212.000 252.000 210.209 252.000 208.000 C 252.000 205.791 250.209 204.000 248.000 204.000 ZM 118.360 54.460 L 154.000 140.000 L 60.000 140.000 L 60.000 52.000 L 114.670 52.000 C 116.284 52.001 117.739 52.971 118.360 54.460 ZM 24.000 52.000 L 52.000 52.000 L 52.000 140.000 L 40.000 140.000 C 32.877 139.989 25.912 142.107 20.000 146.080 L 20.000 56.000 C 20.000 53.791 21.791 52.000 24.000 52.000 ZM 160.000 204.000 L 40.000 204.000 C 24.536 204.000 12.000 191.464 12.000 176.000 C 12.000 160.536 24.536 148.000 40.000 148.000 L 160.000 148.000 C 175.464 148.000 188.000 160.536 188.000 176.000 C 188.000 191.464 175.464 204.000 160.000 204.000 ZM 164.000 176.000 C 164.000 178.209 162.209 180.000 160.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 C 36.000 173.791 37.791 172.000 40.000 172.000 L 160.000 172.000 C 162.209 172.000 164.000 173.791 164.000 176.000 Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
