package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorThinIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 108.000 L 88.000 108.000 C 68.118 108.000 52.000 124.118 52.000 144.000 L 52.000 152.000 C 52.000 171.882 68.118 188.000 88.000 188.000 L 168.000 188.000 C 187.882 188.000 204.000 171.882 204.000 152.000 L 204.000 144.000 C 204.000 124.118 187.882 108.000 168.000 108.000 ZM 196.000 152.000 C 196.000 167.464 183.464 180.000 168.000 180.000 L 88.000 180.000 C 72.536 180.000 60.000 167.464 60.000 152.000 L 60.000 144.000 C 60.000 128.536 72.536 116.000 88.000 116.000 L 168.000 116.000 C 183.464 116.000 196.000 128.536 196.000 144.000 ZM 208.000 44.000 C 194.082 44.001 182.278 54.225 180.290 68.000 L 75.710 68.000 C 73.603 53.474 60.635 43.040 45.995 44.091 C 31.354 45.143 20.010 57.322 20.000 72.000 L 20.000 152.000 C 20.039 189.539 50.461 219.961 88.000 220.000 L 168.000 220.000 C 205.539 219.961 235.961 189.539 236.000 152.000 L 236.000 72.000 C 236.000 56.536 223.464 44.000 208.000 44.000 ZM 228.000 152.000 C 227.961 185.121 201.121 211.961 168.000 212.000 L 88.000 212.000 C 54.879 211.961 28.039 185.121 28.000 152.000 L 28.000 72.000 C 28.000 60.954 36.954 52.000 48.000 52.000 C 59.046 52.000 68.000 60.954 68.000 72.000 C 68.000 74.209 69.791 76.000 72.000 76.000 L 184.000 76.000 C 186.209 76.000 188.000 74.209 188.000 72.000 C 188.000 60.954 196.954 52.000 208.000 52.000 C 219.046 52.000 228.000 60.954 228.000 72.000 ZM 100.000 148.000 C 100.000 152.418 96.418 156.000 92.000 156.000 C 87.582 156.000 84.000 152.418 84.000 148.000 C 84.000 143.582 87.582 140.000 92.000 140.000 C 96.418 140.000 100.000 143.582 100.000 148.000 ZM 172.000 148.000 C 172.000 152.418 168.418 156.000 164.000 156.000 C 159.582 156.000 156.000 152.418 156.000 148.000 C 156.000 143.582 159.582 140.000 164.000 140.000 C 168.418 140.000 172.000 143.582 172.000 148.000 Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
