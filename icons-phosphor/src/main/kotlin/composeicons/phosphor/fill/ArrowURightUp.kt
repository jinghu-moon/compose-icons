package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorFillIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.39 83.06C222.152 86.05 219.236 87.999 216 88h-40v80c0 35.346-28.654 64-64 64C76.654 232 48 203.346 48 168v-88c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v88c0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48v-80h-40c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722l48-48c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l48 48c2.287 2.289 2.97 5.731 1.73 8.72Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
