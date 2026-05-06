package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorDuotoneIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 176l20-7.27v15.27c0 17.673-14.327 32-32 32h-96C62.327 216 48 201.673 48 184v-16.73L68 160l40 16 40-16ZM215.82 86.28C209.32 55.55 172.48 32 128 32 83.52 32 46.68 55.55 40.18 86.28c-.524 2.38 .065 4.87 1.602 6.762 1.536 1.892 3.851 2.981 6.288 2.958h159.86c2.437 .024 4.752-1.065 6.288-2.958 1.536-1.892 2.126-4.382 1.602-6.762Z"),
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
                pathData = parseSvgPathData("M48.07 104h159.86c4.851 .025 9.451-2.153 12.507-5.92 3.056-3.767 4.238-8.718 3.213-13.46C216.22 49.5 176 24 128 24 80 24 39.78 49.5 32.35 84.62c-1.025 4.742 .157 9.692 3.213 13.46 3.056 3.767 7.656 5.945 12.507 5.92ZM128 40c39.82 0 74.21 20.61 79.93 48h-159.86L48 87.93C53.79 60.61 88.18 40 128 40ZM229.26 152.48l-41.13 15L151 152.57c-1.907-.762-4.033-.762-5.94 0l-37 14.81L71 152.57c-1.824-.729-3.853-.761-5.7-.09l-44 16c-3.859 1.699-5.738 6.101-4.293 10.063 1.445 3.961 5.716 6.122 9.763 4.937L40 178.69v5.31c0 22.091 17.909 40 40 40h96c22.091 0 40-17.909 40-40v-9.67l18.73-6.81c2.862-.838 5.021-3.198 5.6-6.123 .58-2.925-.516-5.93-2.843-7.796-2.327-1.866-5.498-2.282-8.228-1.081ZM200 184c0 13.255-10.745 24-24 24h-96C66.745 208 56 197.255 56 184v-11.12l11.87-4.32L105 183.43c1.907 .762 4.033 .762 5.94 0l37-14.81 37 14.81c1.824 .729 3.853 .761 5.7 .09l9.27-3.37ZM16 128c0-4.418 3.582-8 8-8h208c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-208c-4.418 0-8-3.582-8-8Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
