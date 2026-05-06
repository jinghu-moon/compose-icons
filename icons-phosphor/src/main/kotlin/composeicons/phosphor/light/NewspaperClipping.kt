package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorLightIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v160c-.001 2.079 1.075 4.01 2.843 5.104 1.768 1.094 3.977 1.194 5.837 .266L64 206.71l29.32 14.66c1.687 .842 3.673 .842 5.36 0L128 206.71l29.32 14.66c1.687 .842 3.673 .842 5.36 0L192 206.71l29.32 14.66c.832 .415 1.75 .631 2.68 .63 1.114 .002 2.205-.31 3.15-.9 1.769-1.091 2.848-3.021 2.85-5.1v-160c0-7.732-6.268-14-14-14ZM218 206.29 194.68 194.63c-1.687-.842-3.673-.842-5.36 0L160 209.29 130.68 194.63c-1.687-.842-3.673-.842-5.36 0L96 209.29 66.68 194.63c-1.687-.842-3.673-.842-5.36 0L38 206.29v-150.29c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM198 112c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM198 144c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM112 90h-48c-3.314 0-6 2.686-6 6v64c0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6v-64c0-3.314-2.686-6-6-6ZM106 154h-36v-52h36Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
