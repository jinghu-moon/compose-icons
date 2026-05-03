package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorThinIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 36.000 128.000 C 36.055 77.213 77.213 36.055 128.000 36.000 C 152.301 36.000 172.000 55.699 172.000 80.000 C 172.000 104.301 152.301 124.000 128.000 124.000 C 107.179 124.033 88.385 136.483 80.234 155.642 C 72.083 174.801 76.145 196.976 90.560 212.000 C 57.413 197.193 36.050 164.303 36.000 128.000 ZM 128.000 220.000 C 103.699 220.000 84.000 200.301 84.000 176.000 C 84.000 151.699 103.699 132.000 128.000 132.000 C 148.821 131.967 167.615 119.517 175.766 100.358 C 183.917 81.199 179.855 59.024 165.440 44.000 C 205.068 61.702 226.934 104.691 217.903 147.143 C 208.873 189.594 171.402 219.961 128.000 220.000 ZM 136.000 176.000 C 136.000 180.418 132.418 184.000 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 C 120.000 171.582 123.582 168.000 128.000 168.000 C 132.418 168.000 136.000 171.582 136.000 176.000 ZM 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 C 136.000 84.418 132.418 88.000 128.000 88.000 C 123.582 88.000 120.000 84.418 120.000 80.000 Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
