package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorFillIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 128.000 L 232.000 184.000 C 232.000 197.255 221.255 208.000 208.000 208.000 L 192.000 208.000 C 178.745 208.000 168.000 197.255 168.000 184.000 L 168.000 144.000 C 168.000 130.745 178.745 120.000 192.000 120.000 L 215.650 120.000 C 211.667 74.864 173.961 40.191 128.650 40.000 L 128.000 40.000 C 82.497 39.998 44.497 74.686 40.360 120.000 L 64.000 120.000 C 77.255 120.000 88.000 130.745 88.000 144.000 L 88.000 184.000 C 88.000 197.255 77.255 208.000 64.000 208.000 L 48.000 208.000 C 34.745 208.000 24.000 197.255 24.000 184.000 L 24.000 128.000 C 24.046 85.870 49.478 47.921 88.428 31.862 C 127.378 15.804 172.166 24.804 201.890 54.660 C 221.271 74.136 232.105 100.524 232.000 128.000 Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
