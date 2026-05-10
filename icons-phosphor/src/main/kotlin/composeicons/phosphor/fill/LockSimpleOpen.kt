package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockSimpleOpen: ImageVector
    get() {
        if (_lockSimpleOpen != null) return _lockSimpleOpen!!
        _lockSimpleOpen = phosphorFillIcon(
            name = "LockSimpleOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96v112c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-112C32 87.163 39.163 80 48 80h32v-24C80.028 29.502 101.502 8.028 128 8c23.2 0 43.32 16.15 47.84 38.41 .829 4.308-1.966 8.481-6.266 9.353-4.3 .872-8.5-1.882-9.414-6.173C157.2 35 143.37 24 128 24 110.327 24 96 38.327 96 56v24h112c8.837 0 16 7.163 16 16Z"),
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
        return _lockSimpleOpen!!
    }

private var _lockSimpleOpen: ImageVector? = null
