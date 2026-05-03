package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorLightIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 170.000 C 185.749 170.016 173.469 180.041 170.600 194.000 L 72.000 194.000 C 53.222 194.000 38.000 178.778 38.000 160.000 C 38.000 141.222 53.222 126.000 72.000 126.000 L 168.000 126.000 C 188.987 126.000 206.000 108.987 206.000 88.000 C 206.000 67.013 188.987 50.000 168.000 50.000 L 72.000 50.000 C 68.686 50.000 66.000 52.686 66.000 56.000 C 66.000 59.314 68.686 62.000 72.000 62.000 L 168.000 62.000 C 182.359 62.000 194.000 73.641 194.000 88.000 C 194.000 102.359 182.359 114.000 168.000 114.000 L 72.000 114.000 C 46.595 114.000 26.000 134.595 26.000 160.000 C 26.000 185.405 46.595 206.000 72.000 206.000 L 170.600 206.000 C 173.757 221.468 188.362 231.842 204.007 229.730 C 219.652 227.619 230.983 213.743 229.927 197.992 C 228.870 182.241 215.787 170.003 200.000 170.000 ZM 200.000 218.000 C 190.059 218.000 182.000 209.941 182.000 200.000 C 182.000 190.059 190.059 182.000 200.000 182.000 C 209.941 182.000 218.000 190.059 218.000 200.000 C 218.000 209.941 209.941 218.000 200.000 218.000 Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
