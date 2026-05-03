package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorBoldIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 156.000 L 172.000 156.000 L 172.000 48.000 C 172.001 42.903 168.783 38.362 163.974 36.674 C 159.165 34.986 153.814 36.520 150.630 40.500 L 54.630 160.500 C 51.746 164.102 51.183 169.038 53.181 173.197 C 55.180 177.356 59.386 180.001 64.000 180.000 L 148.000 180.000 L 148.000 208.000 C 148.000 214.627 153.373 220.000 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 L 172.000 180.000 L 184.000 180.000 C 190.627 180.000 196.000 174.627 196.000 168.000 C 196.000 161.373 190.627 156.000 184.000 156.000 ZM 148.000 156.000 L 89.000 156.000 L 148.000 82.210 Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
