package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorBoldIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 64v-24C204 28.954 195.046 20 184 20h-112C60.954 20 52 28.954 52 40v24c0 11.046 8.954 20 20 20h2L52.15 222.13c-.78 4.284 .822 8.655 4.186 11.421 3.364 2.765 7.963 3.491 12.015 1.896 4.052-1.595 6.922-5.26 7.499-9.577L83.1 180h89.8l7.25 45.87c.577 4.317 3.447 7.982 7.499 9.577 4.052 1.595 8.651 .869 12.015-1.896 3.364-2.765 4.966-7.136 4.186-11.421L182 84h2c11.046 0 20-8.954 20-20ZM76 44h104v16h-104ZM169.11 156h-82.22L98.25 84h59.5Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
