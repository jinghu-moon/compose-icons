package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorFillIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.66 178.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-2.288 2.291-5.731 2.976-8.722 1.737C201.947 214.158 199.997 211.238 200 208v-16c-22.913-.322-44.31-11.509-57.65-30.14L100.63 103.46C90.109 88.753 73.143 80.018 55.06 80h-23.06c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h23.06c23.248 .019 45.061 11.244 58.59 30.15l41.72 58.4C165.696 166.99 182.25 175.688 200 176v-16c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737ZM143 107c1.727 1.233 3.872 1.73 5.965 1.381 2.093-.349 3.962-1.515 5.195-3.241l1.2-1.67C165.684 89.02 182.243 80.314 200 80v16c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l24-24c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-24-24c-2.288-2.291-5.731-2.976-8.722-1.737C201.947 41.842 199.997 44.762 200 48v16c-22.913 .322-44.31 11.509-57.65 30.14l-1.2 1.67c-1.244 1.727-1.748 3.879-1.401 5.979 .347 2.1 1.517 3.975 3.251 5.211ZM113 149c-1.727-1.233-3.872-1.73-5.965-1.381-2.093 .349-3.962 1.515-5.195 3.241l-1.2 1.67C90.119 167.244 73.149 175.982 55.06 176h-23.06c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h23.06c23.248-.019 45.061-11.244 58.59-30.15l1.2-1.67c1.241-1.727 1.743-3.876 1.396-5.974-.347-2.098-1.515-3.971-3.246-5.206Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
