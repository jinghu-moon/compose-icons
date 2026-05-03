package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorLightIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 88.000 130.000 C 73.641 130.000 62.000 141.641 62.000 156.000 C 62.000 170.359 73.641 182.000 88.000 182.000 C 102.359 182.000 114.000 170.359 114.000 156.000 C 114.000 141.641 102.359 130.000 88.000 130.000 ZM 88.000 170.000 C 80.268 170.000 74.000 163.732 74.000 156.000 C 74.000 148.268 80.268 142.000 88.000 142.000 C 95.732 142.000 102.000 148.268 102.000 156.000 C 102.000 163.732 95.732 170.000 88.000 170.000 ZM 248.000 122.000 L 221.830 122.000 C 218.644 66.883 172.184 24.305 116.999 25.930 C 61.814 27.554 17.938 72.791 18.000 128.000 L 18.000 152.000 C 18.044 190.642 49.358 221.956 88.000 222.000 L 128.000 222.000 C 166.642 221.956 197.956 190.642 198.000 152.000 L 198.000 134.000 L 248.000 134.000 C 251.314 134.000 254.000 131.314 254.000 128.000 C 254.000 124.686 251.314 122.000 248.000 122.000 ZM 186.000 152.000 C 185.961 184.017 160.017 209.961 128.000 210.000 L 127.150 210.000 C 146.430 196.992 157.991 175.258 158.000 152.000 L 158.000 134.000 L 186.000 134.000 ZM 152.000 122.000 C 148.686 122.000 146.000 124.686 146.000 128.000 L 146.000 152.000 C 146.000 184.033 120.033 210.000 88.000 210.000 C 55.967 210.000 30.000 184.033 30.000 152.000 L 30.000 128.000 C 29.998 79.462 68.487 39.666 116.998 38.047 C 165.510 36.428 206.566 73.569 209.800 122.000 Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
