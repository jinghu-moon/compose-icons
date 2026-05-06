package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorThinIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM213 163.19c-30.407 21.439-70.734 22.453-102.18 2.57L130.31 132h89.6c-.459 10.721-2.798 21.278-6.91 31.19ZM85.52 46.42C95.033 41.439 105.352 38.179 116 36.79c33.762 15.622 54.792 50.04 53.29 87.21h-39ZM219.91 124h-42.62c1.305-35.384-16.189-68.824-46-87.93 47.927 1.769 86.476 40.019 88.62 87.93ZM78.59 50.42 99.89 87.31C68.604 103.868 48.39 135.721 46.73 171.08 24.238 128.708 38.112 76.165 78.59 50.42ZM55 183.94C51.67 146.912 70.952 111.519 103.87 94.24L123.38 128 78.59 205.58C69.532 199.788 61.55 192.466 55 183.94ZM128 220c-14.795 .017-29.372-3.559-42.48-10.42l21.3-36.89c29.974 18.812 67.655 20.393 99.1 4.16C189.105 203.686 159.669 219.986 128 220Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
