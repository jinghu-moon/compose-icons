package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorFillIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 83.660 180.120 L 78.860 188.120 C 76.585 191.909 71.669 193.135 67.880 190.860 C 64.091 188.585 62.865 183.669 65.140 179.880 L 69.940 171.880 C 72.215 168.091 77.131 166.865 80.920 169.140 C 84.709 171.415 85.935 176.331 83.660 180.120 ZM 128.000 152.000 L 56.000 152.000 C 51.582 152.000 48.000 148.418 48.000 144.000 C 48.000 139.582 51.582 136.000 56.000 136.000 L 91.470 136.000 L 118.670 90.670 L 105.140 68.120 C 102.865 64.331 104.091 59.415 107.880 57.140 C 111.669 54.865 116.585 56.091 118.860 59.880 L 128.000 75.120 L 137.140 59.880 C 139.415 56.091 144.331 54.865 148.120 57.140 C 151.909 59.415 153.135 64.331 150.860 68.120 L 110.130 136.000 L 128.000 136.000 C 132.418 136.000 136.000 139.582 136.000 144.000 C 136.000 148.418 132.418 152.000 128.000 152.000 ZM 200.000 152.000 L 174.130 152.000 L 190.860 179.880 C 193.135 183.669 191.909 188.585 188.120 190.860 C 184.331 193.135 179.415 191.909 177.140 188.120 L 138.740 124.120 C 136.465 120.331 137.691 115.415 141.480 113.140 C 145.269 110.865 150.185 112.091 152.460 115.880 L 164.530 136.000 L 200.000 136.000 C 204.418 136.000 208.000 139.582 208.000 144.000 C 208.000 148.418 204.418 152.000 200.000 152.000 Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
