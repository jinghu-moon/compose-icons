package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorDuotoneIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 96h48v112h-56v-104c0-4.418 3.582-8 8-8ZM216 136h-48v72h56v-64c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M112.41 102.53c-.671-2.013-.515-4.21 .434-6.108 .949-1.898 2.613-3.341 4.626-4.012l12-4c2.44-.813 5.122-.404 7.208 1.1 2.086 1.504 3.322 3.919 3.322 6.49v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28.9l-1.47 .49c-2.013 .671-4.21 .515-6.108-.434-1.898-.949-3.341-2.613-4.012-4.626ZM248 208c0 4.418-3.582 8-8 8h-224c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-96C24 95.163 31.163 88 40 88h40v-32C80 47.163 87.163 40 96 40h64c8.837 0 16 7.163 16 16v72h40c8.837 0 16 7.163 16 16v56h8c4.418 0 8 3.582 8 8ZM176 144v56h40v-56ZM96 200h64v-144h-64ZM40 200h40v-96h-40Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
