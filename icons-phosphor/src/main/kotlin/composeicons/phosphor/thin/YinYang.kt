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
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM36 128C36.055 77.213 77.213 36.055 128 36c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44-20.821 .033-39.615 12.483-47.766 31.642C72.083 174.801 76.145 196.976 90.56 212 57.413 197.193 36.05 164.303 36 128ZM128 220C103.699 220 84 200.301 84 176c0-24.301 19.699-44 44-44 20.821-.033 39.615-12.483 47.766-31.642C183.917 81.199 179.855 59.024 165.44 44c39.628 17.702 61.494 60.691 52.463 103.143C208.873 189.594 171.402 219.961 128 220ZM136 176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM120 80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
