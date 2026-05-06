package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorFillIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 208c0 4.418-3.582 8-8 8h-80c-8.837 0-16-7.163-16-16v-136C24 55.163 31.163 48 40 48h53.33c3.461 .009 6.826 1.131 9.6 3.2L130.67 72h85.33c8.837 0 16 7.163 16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-88c-1.731 0-3.415-.561-4.8-1.6L93.33 64h-53.33v136h80c4.418 0 8 3.582 8 8ZM239.63 159.2c-.984-3.106-3.752-5.305-7-5.56l-29.84-2.31L191.36 124.83c-1.262-2.938-4.153-4.841-7.35-4.841-3.197 0-6.088 1.904-7.35 4.841l-11.43 26.5-29.84 2.31c-3.249 .256-6.017 2.457-6.999 5.564-.982 3.107 .018 6.499 2.529 8.576l22.51 18.59-6.85 27.71c-.769 3.124 .408 6.404 2.987 8.326 2.579 1.922 6.059 2.113 8.833 .484L184 207.82l25.61 15.07c2.774 1.629 6.254 1.439 8.833-.484 2.579-1.922 3.756-5.203 2.987-8.326l-6.85-27.71 22.51-18.59c2.517-2.075 3.522-5.47 2.54-8.58Z"),
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
