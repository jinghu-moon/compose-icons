package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorFillIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.09 167.78l-22.51 18.59 6.85 27.71c.769 3.124-.408 6.404-2.987 8.326-2.579 1.922-6.059 2.113-8.833 .484L184 207.82l-25.61 15.07c-2.774 1.629-6.254 1.439-8.833-.484-2.579-1.922-3.756-5.203-2.987-8.326l6.85-27.71L130.91 167.78c-2.511-2.077-3.512-5.469-2.529-8.576 .982-3.107 3.751-5.308 6.999-5.564l29.84-2.31 11.43-26.5c1.262-2.938 4.153-4.841 7.35-4.841 3.197 0 6.088 1.904 7.35 4.841l11.43 26.5 29.84 2.31c3.249 .256 6.017 2.457 6.999 5.564 .982 3.107-.018 6.499-2.529 8.576ZM128.56 208c0 4.418-3.582 8-8 8h-81.18C30.89 215.989 24.011 209.11 24 200.62v-144.62C24 47.163 31.163 40 40 40h52.69c4.246-.014 8.32 1.676 11.31 4.69L131.31 72h84.69c8.837 0 16 7.163 16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-176v112h80.56c4.418 0 8 3.582 8 8ZM40 72h68.69l-16-16h-52.69Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
