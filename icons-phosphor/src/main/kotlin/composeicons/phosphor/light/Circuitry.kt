package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorLightIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM88 158c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM46 208v-160c0-1.105 .895-2 2-2h34v100.84c-10.564 2.995-17.302 13.319-15.791 24.195 1.512 10.875 10.811 18.971 21.791 18.971 10.98 0 20.279-8.096 21.791-18.971C111.302 160.159 104.564 149.835 94 146.84v-36.35l52 52v47.51h-98c-1.105 0-2-.895-2-2ZM210 208c0 1.105-.895 2-2 2h-50v-50c-.001-1.591-.634-3.116-1.76-4.24L94 93.51v-47.51h36v26c.001 1.591 .634 3.116 1.76 4.24l17 17c-5.354 9.587-2.82 21.654 5.939 28.276 8.759 6.622 21.06 5.772 28.824-1.992 7.765-7.765 8.615-20.065 1.992-28.824C178.894 81.94 166.827 79.406 157.24 84.76L142 69.51v-23.51h66c1.105 0 2 .895 2 2ZM168 94c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
