package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorRegularIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.000 103.430 L 140.870 131.430 L 190.340 195.040 C 192.143 197.292 192.593 200.341 191.519 203.018 C 190.444 205.696 188.011 207.587 185.152 207.969 C 182.292 208.350 179.449 207.162 177.710 204.860 L 128.000 141.000 L 78.320 204.910 C 75.587 208.325 70.617 208.912 67.164 206.227 C 63.710 203.542 63.054 198.581 65.690 195.090 L 115.160 131.480 L 45.000 103.430 C 40.897 101.773 38.913 97.103 40.570 93.000 C 42.227 88.897 46.897 86.913 51.000 88.570 L 120.000 116.180 L 120.000 40.000 C 120.000 35.582 123.582 32.000 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 L 136.000 116.180 L 205.000 88.570 C 209.103 86.913 213.773 88.897 215.430 93.000 C 217.087 97.103 215.103 101.773 211.000 103.430 Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
