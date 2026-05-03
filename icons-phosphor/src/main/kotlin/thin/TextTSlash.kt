package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorThinIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.690 219.000 C 209.055 220.485 206.526 220.365 205.040 218.730 L 132.040 138.390 L 132.040 196.000 L 160.040 196.000 C 162.249 196.000 164.040 197.791 164.040 200.000 C 164.040 202.209 162.249 204.000 160.040 204.000 L 96.000 204.000 C 93.791 204.000 92.000 202.209 92.000 200.000 C 92.000 197.791 93.791 196.000 96.000 196.000 L 124.000 196.000 L 124.000 129.550 L 60.780 60.000 L 60.000 60.000 L 60.000 88.000 C 60.000 90.209 58.209 92.000 56.000 92.000 C 53.791 92.000 52.000 90.209 52.000 88.000 L 52.000 56.000 C 52.005 54.576 52.767 53.262 54.000 52.550 L 45.000 42.690 C 43.514 41.033 43.653 38.486 45.310 37.000 C 46.967 35.514 49.514 35.653 51.000 37.310 L 211.000 213.310 C 211.721 214.102 212.094 215.150 212.036 216.220 C 211.977 217.289 211.493 218.291 210.690 219.000 ZM 105.790 60.000 L 124.000 60.000 L 124.000 80.430 C 124.000 82.639 125.791 84.430 128.000 84.430 C 130.209 84.430 132.000 82.639 132.000 80.430 L 132.000 60.000 L 196.000 60.000 L 196.000 88.000 C 196.000 90.209 197.791 92.000 200.000 92.000 C 202.209 92.000 204.000 90.209 204.000 88.000 L 204.000 56.000 C 204.000 53.791 202.209 52.000 200.000 52.000 L 105.790 52.000 C 103.581 52.000 101.790 53.791 101.790 56.000 C 101.790 58.209 103.581 60.000 105.790 60.000 Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
