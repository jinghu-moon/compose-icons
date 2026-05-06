package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorDuotoneIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.6 183.41 213.67 216 184 198.54 154.33 216l8.07-32.59L136 161.61l34.65-2.67L184 128l13.35 30.94L232 161.61Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M120.56 200h-80.56v-112h176v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-8.837-7.163-16-16-16h-84.69L104 44.69C101.01 41.676 96.936 39.986 92.69 40h-52.69C31.163 40 24 47.163 24 56v144.62c.011 8.49 6.89 15.369 15.38 15.38h81.18c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM92.69 56l16 16h-68.69v-16ZM239.63 159.2c-.984-3.106-3.752-5.305-7-5.56l-29.84-2.31L191.36 124.83c-1.262-2.938-4.153-4.841-7.35-4.841-3.197 0-6.088 1.904-7.35 4.841l-11.43 26.5-29.84 2.31c-3.249 .256-6.017 2.457-6.999 5.564-.982 3.107 .018 6.499 2.529 8.576l22.51 18.59-6.85 27.71c-.769 3.124 .408 6.404 2.987 8.326 2.579 1.922 6.059 2.113 8.833 .484L184 207.82l25.61 15.07c2.774 1.629 6.254 1.439 8.833-.484 2.579-1.922 3.756-5.203 2.987-8.326l-6.85-27.71 22.51-18.59c2.517-2.075 3.522-5.47 2.54-8.58ZM200.51 177.2c-2.375 1.957-3.417 5.102-2.68 8.09l3.5 14.12-13.27-7.81c-2.506-1.476-5.614-1.476-8.12 0l-13.27 7.81 3.5-14.12c.737-2.988-.305-6.133-2.68-8.09l-11.11-9.18 14.89-1.15c2.96-.227 5.551-2.075 6.73-4.8l6-13.92 6 13.92c1.179 2.725 3.77 4.573 6.73 4.8l14.89 1.15Z"),
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
