package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorDuotoneIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 48v8C88 73.673 73.673 88 56 88h-24v-8C32 62.327 46.327 48 64 48Z"),
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
                pathData = parseSvgPathData("M216 79v1c0 22.091-17.909 40-40 40h-40v80h8c6.637 .003 12.586-4.091 14.955-10.29 2.368-6.2 .664-13.218-4.285-17.64-3.12-2.981-3.314-7.9-.437-11.117 2.877-3.217 7.787-3.572 11.097-.803 9.888 8.845 13.292 22.874 8.559 35.267C169.156 207.81 157.266 215.998 144 216h-8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-80h-24c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C78.327 168 64 153.673 64 136c0-17.673 14.327-32 32-32h24v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v80h40c13.255 0 24-10.745 24-24v-1C200 66.297 189.703 56 177 56h-17c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h17c21.539 0 39 17.461 39 39ZM56 96h-24c-4.418 0-8-3.582-8-8v-8C24 57.909 41.909 40 64 40h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C96 78.091 78.091 96 56 96ZM80 56h-16C50.745 56 40 66.745 40 80h16C69.255 80 80 69.255 80 56Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
