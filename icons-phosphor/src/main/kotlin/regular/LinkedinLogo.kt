package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorRegularIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 24.000 L 40.000 24.000 C 31.163 24.000 24.000 31.163 24.000 40.000 L 24.000 216.000 C 24.000 224.837 31.163 232.000 40.000 232.000 L 216.000 232.000 C 224.837 232.000 232.000 224.837 232.000 216.000 L 232.000 40.000 C 232.000 31.163 224.837 24.000 216.000 24.000 ZM 216.000 216.000 L 40.000 216.000 L 40.000 40.000 L 216.000 40.000 L 216.000 216.000 ZM 96.000 112.000 L 96.000 176.000 C 96.000 180.418 92.418 184.000 88.000 184.000 C 83.582 184.000 80.000 180.418 80.000 176.000 L 80.000 112.000 C 80.000 107.582 83.582 104.000 88.000 104.000 C 92.418 104.000 96.000 107.582 96.000 112.000 ZM 184.000 140.000 L 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 C 171.582 184.000 168.000 180.418 168.000 176.000 L 168.000 140.000 C 168.000 128.954 159.046 120.000 148.000 120.000 C 136.954 120.000 128.000 128.954 128.000 140.000 L 128.000 176.000 C 128.000 180.418 124.418 184.000 120.000 184.000 C 115.582 184.000 112.000 180.418 112.000 176.000 L 112.000 112.000 C 112.021 107.944 115.073 104.545 119.104 104.091 C 123.134 103.637 126.867 106.270 127.790 110.220 C 138.818 102.739 153.078 101.962 164.854 108.201 C 176.630 114.440 183.996 126.673 184.000 140.000 ZM 100.000 84.000 C 100.000 90.627 94.627 96.000 88.000 96.000 C 81.373 96.000 76.000 90.627 76.000 84.000 C 76.000 77.373 81.373 72.000 88.000 72.000 C 94.627 72.000 100.000 77.373 100.000 84.000 Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
