package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorRegularIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 208c0 4.418-3.582 8-8 8h-80c-8.837 0-16-7.163-16-16v-136C24 55.163 31.163 48 40 48h53.33c3.461 .009 6.826 1.131 9.6 3.2L130.67 72h85.33c8.837 0 16 7.163 16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-88c-1.731 0-3.415-.561-4.8-1.6L93.33 64h-53.33v136h80c4.418 0 8 3.582 8 8ZM237.09 167.78l-22.51 18.59 6.85 27.71c.769 3.124-.408 6.404-2.987 8.326-2.579 1.922-6.059 2.113-8.833 .484L184 207.82l-25.61 15.07c-2.774 1.629-6.254 1.439-8.833-.484-2.579-1.922-3.756-5.203-2.987-8.326l6.85-27.71L130.91 167.78c-2.511-2.077-3.512-5.469-2.529-8.576 .982-3.107 3.751-5.308 6.999-5.564l29.84-2.31 11.43-26.5c1.262-2.938 4.153-4.841 7.35-4.841 3.197 0 6.088 1.904 7.35 4.841l11.43 26.5 29.84 2.31c3.249 .256 6.017 2.457 6.999 5.564 .982 3.107-.018 6.499-2.529 8.576ZM211.62 168.06l-14.89-1.15c-2.96-.227-5.551-2.075-6.73-4.8l-6-13.92-6 13.92c-1.179 2.725-3.77 4.573-6.73 4.8l-14.89 1.15 11.11 9.18c2.375 1.957 3.417 5.102 2.68 8.09l-3.5 14.12 13.27-7.81c2.506-1.476 5.614-1.476 8.12 0l13.27 7.81-3.5-14.12c-.737-2.988 .305-6.133 2.68-8.09Z"),
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
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
