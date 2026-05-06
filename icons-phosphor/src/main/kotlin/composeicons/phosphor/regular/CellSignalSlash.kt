package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorRegularIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 152v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM40 184c-4.418 0-8 3.582-8 8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8c0-4.418-3.582-8-8-8ZM213.92 210.62 53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L112 122.29v77.71c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-60.11l24 26.4v33.71c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16.11l34.08 37.49c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM160 123.62c4.418 0 8-3.582 8-8v-43.62c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v43.63c0 4.418 3.582 8 8 8ZM200 167.62c4.418 0 8-3.582 8-8v-127.62c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v127.63c0 4.418 3.582 8 8 8Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
