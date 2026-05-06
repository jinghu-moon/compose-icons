package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Prohibit: ImageVector
    get() {
        if (_prohibit != null) return _prohibit!!
        _prohibit = phosphorThinIcon(
            name = "Prohibit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM220 128c.015 23.015-8.627 45.193-24.21 62.13L65.87 60.21C92.763 35.585 131.661 29.167 165.04 43.847 198.418 58.528 219.976 91.536 220 128ZM36 128C35.985 104.985 44.627 82.807 60.21 65.87L190.13 195.79c-26.893 24.625-65.791 31.043-99.17 16.363C57.582 197.472 36.024 164.464 36 128Z"),
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
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
