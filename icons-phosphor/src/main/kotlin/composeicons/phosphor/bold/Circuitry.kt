package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorBoldIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM52 52h24v95.22c-9.407 5.431-13.994 16.504-11.182 26.996 2.811 10.492 12.32 17.788 23.182 17.788 10.863 0 20.371-7.296 23.182-17.788C113.994 163.724 109.407 152.651 100 147.22v-22.22l40 40v39h-88ZM204 204h-40v-44c.003-3.184-1.26-6.238-3.51-8.49L100 91v-39h24v20c-.003 3.184 1.26 6.238 3.51 8.49l17.31 17.3c-2.8 10.491 1.793 21.555 11.199 26.979 9.406 5.424 21.282 3.858 28.96-3.82 7.678-7.678 9.244-19.554 3.82-28.96C183.375 82.583 172.311 77.99 161.82 80.79L148 67v-15h56Z"),
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
