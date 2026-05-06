package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorFillIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 157.66l-48 48c-2.288 2.291-5.731 2.976-8.722 1.737C169.947 206.158 167.997 203.238 168 200v-40h-40C70.588 159.939 24.061 113.412 24 56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 .055 48.578 39.422 87.945 88 88h40v-40c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l48 48c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
