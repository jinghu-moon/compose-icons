package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorFillIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM56.84 75.58c-.951-1.899-1.108-4.098-.436-6.112 .672-2.015 2.116-3.679 4.016-4.628l16-8c2.481-1.241 5.428-1.109 7.787 .35C86.567 58.649 88.002 61.226 88 64v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-35.06l-4.42 2.22c-1.899 .951-4.098 1.108-6.112 .436-2.015-.672-3.679-2.116-4.628-4.016ZM92 180c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378L83.27 154.31c.481-.674 .737-1.482 .73-2.31-.003-1.946-1.407-3.607-3.325-3.936-1.918-.328-3.794 .772-4.445 2.606-1.475 4.167-6.048 6.35-10.215 4.875-4.167-1.475-6.35-6.048-4.875-10.215 2.651-7.359 9.349-12.496 17.144-13.151 7.794-.654 15.255 3.296 19.095 10.11 3.841 6.814 3.357 15.241-1.239 21.571L84 180ZM192 184h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM192 136h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM192 88h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
