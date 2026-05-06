package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorFillIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.57 39.43C190.412 13.236 149.699 8.409 118.141 27.761 86.584 47.113 72.425 85.588 83.91 120.78L28.69 176c-3.014 2.99-4.704 7.064-4.69 11.31v28.69c0 8.837 7.163 16 16 16h32c4.418 0 8-3.582 8-8v-16h16c4.418 0 8-3.582 8-8v-16h16c2.122 .002 4.158-.84 5.66-2.34l9.56-9.57c8.002 2.603 16.365 3.922 24.78 3.91h.1c32.34-.039 61.475-19.545 73.832-49.431C246.29 96.683 239.438 62.297 216.57 39.43ZM180 92c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
