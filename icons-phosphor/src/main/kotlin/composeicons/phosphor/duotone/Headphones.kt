package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorDuotoneIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 144v40c0 8.837-7.163 16-16 16h-16c-8.837 0-16-7.163-16-16v-56h32c8.837 0 16 7.163 16 16ZM192 128c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16h16c8.837 0 16-7.163 16-16v-56Z"),
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
                pathData = parseSvgPathData("M201.89 54.66C172.177 24.773 127.372 15.754 88.409 31.818 49.447 47.881 24.016 85.856 24 128v56c0 13.255 10.745 24 24 24h16c13.255 0 24-10.745 24-24v-40C88 130.745 77.255 120 64 120h-23.64C44.497 74.686 82.497 39.998 128 40h.67c45.311 .191 83.017 34.864 87 80h-23.67c-13.255 0-24 10.745-24 24v40c0 13.255 10.745 24 24 24h16c13.255 0 24-10.745 24-24v-56c.105-27.476-10.729-53.864-30.11-73.34ZM64 136c4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8v-48ZM216 184c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8v-40c0-4.418 3.582-8 8-8h24Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
