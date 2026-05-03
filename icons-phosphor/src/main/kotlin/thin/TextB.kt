package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorThinIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.270 117.210 C 184.881 107.401 191.364 89.195 186.243 72.359 C 181.121 55.523 165.598 44.011 148.000 44.000 L 80.000 44.000 C 77.791 44.000 76.000 45.791 76.000 48.000 L 76.000 200.000 C 76.000 202.209 77.791 204.000 80.000 204.000 L 160.000 204.000 C 182.309 204.011 201.096 187.325 203.717 165.171 C 206.339 143.016 191.965 122.406 170.270 117.210 ZM 84.000 52.000 L 148.000 52.000 C 165.673 52.000 180.000 66.327 180.000 84.000 C 180.000 101.673 165.673 116.000 148.000 116.000 L 84.000 116.000 ZM 160.000 196.000 L 84.000 196.000 L 84.000 124.000 L 160.000 124.000 C 179.882 124.000 196.000 140.118 196.000 160.000 C 196.000 179.882 179.882 196.000 160.000 196.000 Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
