package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorFillIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128c0 4.418-3.582 8-8 8h-16.67c-3.934 23.078-23.919 39.968-47.33 40h-40v24h24c17.673 0 32 14.327 32 32 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-8.837-7.163-16-16-16h-24v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-24c-8.837 0-16 7.163-16 16 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-17.673 14.327-32 32-32h24v-24h-40C56.589 175.968 36.604 159.078 32.67 136h-16.67c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 17.673 14.327 32 32 32h96c17.673 0 32-14.327 32-32 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8ZM80 144h96c4.638 0 9.048-2.012 12.087-5.516 3.039-3.503 4.408-8.153 3.753-12.744L178.12 29.74C176.963 21.874 170.231 16.034 162.28 16h-68.56c-7.951 .034-14.683 5.874-15.84 13.74L64.16 125.74c-.655 4.591 .714 9.241 3.753 12.744 3.039 3.503 7.449 5.516 12.087 5.516Z"),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
