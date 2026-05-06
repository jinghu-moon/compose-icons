package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorDuotoneIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 136l-96 96L32 136h48v-88c0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8v88Z"),
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
                pathData = parseSvgPathData("M231.39 132.94C230.152 129.95 227.236 128.001 224 128h-40v-80c0-8.837-7.163-16-16-16h-80C79.163 32 72 39.163 72 48v80h-40c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l96 96c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l96-96c2.287-2.289 2.97-5.731 1.73-8.72ZM128 220.69 51.31 144h28.69c4.418 0 8-3.582 8-8v-88h80v88c0 4.418 3.582 8 8 8h28.69Z"),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
