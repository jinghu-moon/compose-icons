package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorDuotoneIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 176 88 224 40 176Z"),
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
                pathData = parseSvgPathData("M144 24C108.67 24.039 80.039 52.67 80 88v80h-40c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l48 48c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l48-48c2.291-2.288 2.976-5.731 1.737-8.722C142.158 169.947 139.238 167.997 136 168h-40v-80C96 61.49 117.49 40 144 40c26.51 0 48 21.49 48 48v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88C207.961 52.67 179.33 24.039 144 24ZM88 212.69 59.31 184h57.38Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
