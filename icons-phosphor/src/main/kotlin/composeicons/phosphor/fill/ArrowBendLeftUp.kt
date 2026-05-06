package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorFillIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 224c0 4.418-3.582 8-8 8C142.588 231.939 96.061 185.412 96 128v-40h-40c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L98.34 26.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l48 48c2.291 2.288 2.976 5.731 1.737 8.722C158.158 86.053 155.238 88.003 152 88h-40v40c.055 48.578 39.422 87.945 88 88 4.418 0 8 3.582 8 8Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
