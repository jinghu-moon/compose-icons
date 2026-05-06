package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorDuotoneIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.39 104.34 134.15 213.12c-1.52 1.827-3.773 2.884-6.15 2.884-2.377 0-4.63-1.057-6.15-2.884L17.8 87.69C16.436 86.05 15.804 83.923 16.052 81.804c.248-2.119 1.353-4.043 3.058-5.324C50.435 52.729 88.689 39.914 128 40c11.088-.01 22.155 .994 33.06 3 1.582 .297 3.036 1.068 4.17 2.21L224 104Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M229.66 98.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L200 91.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L188.69 80 170.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L200 68.69 218.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L211.31 80ZM196.6 137.84c-1.627-1.362-3.729-2.022-5.842-1.834-2.114 .188-4.066 1.207-5.428 2.834L128 208 24.09 82.74C53.971 60.061 90.488 47.852 128 48c2.54 0 5.11 .06 7.65 .17 4.418 .193 8.157-3.232 8.35-7.65 .193-4.418-3.232-8.157-7.65-8.35-2.77-.12-5.58-.18-8.35-.18C86.933 31.838 46.963 45.233 14.28 70.1 10.842 72.717 8.616 76.619 8.11 80.91c-.508 4.282 .772 8.584 3.54 11.89L115.65 218.23c3.044 3.676 7.577 5.794 12.35 5.77h0c4.759 .012 9.275-2.104 12.31-5.77l57.34-69.12c1.356-1.633 2.008-3.739 1.811-5.853-.197-2.114-1.226-4.063-2.861-5.417Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
