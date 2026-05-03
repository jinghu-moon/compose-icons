package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorDuotoneIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.000 210.372 214.947 212.621 213.126 214.141 C 211.305 215.661 208.904 216.294 206.570 215.870 L 46.570 186.780 C 42.766 186.089 40.001 182.776 40.000 178.910 L 40.000 77.090 C 40.001 73.224 42.766 69.911 46.570 69.220 L 206.570 40.130 C 208.904 39.706 211.305 40.339 213.126 41.859 C 214.947 43.379 216.000 45.628 216.000 48.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 240.000 120.000 L 224.000 120.000 L 224.000 48.000 C 223.999 43.256 221.894 38.758 218.252 35.718 C 214.610 32.679 209.807 31.412 205.140 32.260 L 45.140 61.350 C 37.532 62.732 32.001 69.357 32.000 77.090 L 32.000 120.000 L 16.000 120.000 C 11.582 120.000 8.000 123.582 8.000 128.000 C 8.000 132.418 11.582 136.000 16.000 136.000 L 32.000 136.000 L 32.000 178.910 C 32.001 186.643 37.532 193.268 45.140 194.650 L 205.140 223.740 C 206.084 223.910 207.041 223.997 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 136.000 L 240.000 136.000 C 244.418 136.000 248.000 132.418 248.000 128.000 C 248.000 123.582 244.418 120.000 240.000 120.000 ZM 48.000 77.090 L 208.000 48.000 L 208.000 120.000 L 48.000 120.000 ZM 208.000 208.000 L 48.000 178.910 L 48.000 136.000 L 208.000 136.000 Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
