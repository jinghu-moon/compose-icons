package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorRegularIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128c0 4.418-3.582 8-8 8h-16.67c-3.934 23.078-23.919 39.968-47.33 40h-40v24h24c17.673 0 32 14.327 32 32 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-8.837-7.163-16-16-16h-24v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-24c-8.837 0-16 7.163-16 16 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-17.673 14.327-32 32-32h24v-24h-40C56.589 175.968 36.604 159.078 32.67 136h-16.67c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 17.673 14.327 32 32 32h96c17.673 0 32-14.327 32-32 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8ZM67.91 138.48c-3.037-3.503-4.405-8.151-3.75-12.74L77.88 29.74C79.037 21.874 85.769 16.034 93.72 16h68.56c7.951 .034 14.683 5.874 15.84 13.74l13.72 96c.655 4.591-.714 9.241-3.753 12.744-3.039 3.503-7.449 5.516-12.087 5.516h-96c-4.64-0-9.051-2.014-12.09-5.52ZM80 128h96L162.28 32h-68.57Z"),
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
