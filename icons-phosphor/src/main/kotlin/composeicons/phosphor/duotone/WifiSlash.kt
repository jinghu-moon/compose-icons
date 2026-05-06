package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorDuotoneIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.2 87.69l-104 125.43c-1.52 1.827-3.773 2.884-6.15 2.884-2.377 0-4.63-1.057-6.15-2.884L17.8 87.69C16.436 86.05 15.804 83.923 16.052 81.804c.248-2.119 1.353-4.043 3.058-5.324 64.445-48.641 153.335-48.641 217.78 0 1.705 1.281 2.811 3.206 3.058 5.324 .248 2.119-.384 4.246-1.748 5.886Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858l4.55 5C35.21 55.847 24.372 62.454 14.28 70.1 10.842 72.717 8.616 76.619 8.11 80.91c-.508 4.282 .772 8.584 3.54 11.89L115.65 218.23c3.044 3.676 7.577 5.794 12.35 5.77h0c4.759 .012 9.275-2.104 12.31-5.77l28.1-33.88 33.67 37c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM128 208 24.09 82.74C34.562 74.817 45.91 68.123 57.91 62.79l99.63 109.6ZM244.35 92.8l-49.42 59.58c-2.819 3.402-7.863 3.874-11.265 1.055-3.402-2.819-3.874-7.863-1.055-11.265L231.91 82.74C202.029 60.061 165.512 47.852 128 48c-10.866-.007-21.71 .997-32.39 3-4.341 .828-8.532-2.019-9.36-6.36-.828-4.341 2.019-8.532 6.36-9.36C104.279 33.087 116.127 31.989 128 32c41.066-.154 81.036 13.237 113.72 38.1 3.438 2.617 5.664 6.519 6.17 10.81 .508 4.282-.772 8.584-3.54 11.89Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
