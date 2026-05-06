package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorLightIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v160c-.001 2.079 1.075 4.01 2.843 5.104 1.768 1.094 3.977 1.194 5.837 .266L64 206.71l29.32 14.66c1.687 .842 3.673 .842 5.36 0L128 206.71l29.32 14.66c1.687 .842 3.673 .842 5.36 0L192 206.71l29.32 14.66c.832 .415 1.75 .631 2.68 .63 1.114 .002 2.205-.31 3.15-.9 1.769-1.091 2.848-3.021 2.85-5.1v-160c0-7.732-6.268-14-14-14ZM218 206.29 194.68 194.63c-1.687-.842-3.673-.842-5.36 0L160 209.29 130.68 194.63c-1.687-.842-3.673-.842-5.36 0L96 209.29 66.68 194.63c-1.687-.842-3.673-.842-5.36 0L38 206.29v-150.29c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM101.37 93.29C100.355 91.254 98.275 89.966 96 89.966c-2.275 0-4.355 1.287-5.37 3.324L58.63 157.29c-1.48 2.966-.276 6.57 2.69 8.05 2.966 1.48 6.57 .276 8.05-2.69L75.71 150h40.58l6.34 12.68c1.48 2.966 5.084 4.17 8.05 2.69 2.966-1.48 4.17-5.084 2.69-8.05ZM81.71 138 96 109.42 110.29 138ZM198 128c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6Z"),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
