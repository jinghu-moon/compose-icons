package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorDuotoneIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 104v96L32 152Z"),
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
                pathData = parseSvgPathData("M224 48c-4.418 0-8 3.582-8 8-.055 48.578-39.422 87.945-88 88h-40v-40c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-48 48c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l48 48c2.288 2.291 5.731 2.976 8.722 1.737C86.053 206.158 88.003 203.238 88 200v-40h40c57.412-.061 103.939-46.588 104-104 0-4.418-3.582-8-8-8ZM72 180.69 43.31 152 72 123.31Z"),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
