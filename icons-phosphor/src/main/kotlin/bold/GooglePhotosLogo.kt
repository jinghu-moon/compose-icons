package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorBoldIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 116.000 L 198.640 116.000 C 207.914 92.598 204.999 66.121 190.855 45.298 C 176.711 24.474 153.173 12.005 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 57.360 C 92.598 48.086 66.121 51.001 45.298 65.145 C 24.474 79.289 12.005 102.827 12.000 128.000 C 12.000 134.627 17.373 140.000 24.000 140.000 L 57.360 140.000 C 48.086 163.402 51.001 189.879 65.145 210.702 C 79.289 231.526 102.827 243.995 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 198.640 C 163.402 207.914 189.879 204.999 210.702 190.855 C 231.526 176.711 243.995 153.173 244.000 128.000 C 244.000 121.373 238.627 116.000 232.000 116.000 ZM 180.000 88.000 C 180.036 97.928 177.194 107.653 171.820 116.000 L 140.000 116.000 L 140.000 37.400 C 163.428 42.990 179.969 63.914 180.000 88.000 ZM 88.000 76.000 C 97.928 75.964 107.653 78.806 116.000 84.180 L 116.000 116.000 L 37.400 116.000 C 42.990 92.572 63.914 76.031 88.000 76.000 ZM 76.000 168.000 C 75.964 158.072 78.806 148.347 84.180 140.000 L 116.000 140.000 L 116.000 218.600 C 92.572 213.010 76.031 192.086 76.000 168.000 ZM 168.000 180.000 C 158.072 180.036 148.347 177.194 140.000 171.820 L 140.000 140.000 L 218.600 140.000 C 213.010 163.428 192.086 179.969 168.000 180.000 Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
