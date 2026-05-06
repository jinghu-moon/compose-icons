package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorFillIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 8.837 0 16 7.163 16 16v56h-176v-56C40 63.163 47.163 56 56 56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C38.327 40 24 54.327 24 72v92c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-20h32v20c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-92C232 54.327 217.673 40 200 40ZM91.22 179.22c-3.124 3.122-8.186 3.122-11.31 0L58.34 157.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l21.56 21.57c3.122 3.124 3.122 8.186 0 11.31ZM211.22 179.22c-3.124 3.122-8.186 3.122-11.31 0L178.34 157.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l21.56 21.57c3.122 3.124 3.122 8.186 0 11.31Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
