package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) return _arrowFatLineUp!!
        _arrowFatLineUp = phosphorDuotoneIcon(
            name = "ArrowFatLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 120h-48v64h-96v-64h-48L128 24Z"),
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
                pathData = parseSvgPathData("M229.66 114.34l-96-96C132.159 16.838 130.123 15.994 128 15.994c-2.123 0-4.159 .844-5.66 2.346L26.34 114.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h40v56c0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8v-56h40c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722ZM176 112c-4.418 0-8 3.582-8 8v56h-80v-56c0-4.418-3.582-8-8-8h-28.69L128 35.31 204.69 112ZM184 216c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8Z"),
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
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
