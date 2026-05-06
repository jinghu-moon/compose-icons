package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorLightIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M118 64c0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6ZM170.14 196l3.72 26c.58 4.021-.615 8.096-3.275 11.167-2.66 3.071-6.523 4.835-10.585 4.833h-64c-4.063 .001-7.925-1.763-10.585-4.833C82.755 230.096 81.56 226.021 82.14 222l3.72-26C54.095 180.043 34.033 147.548 34 112c0-3.314 2.686-6 6-6h18v-66C58 32.268 64.268 26 72 26h112c7.732 0 14 6.268 14 14v66h18c3.314 0 6 2.686 6 6-.033 35.548-20.095 68.043-51.86 84ZM70 106h116v-66c0-1.105-.895-2-2-2h-112c-1.105 0-2 .895-2 2ZM158.71 200.84c-19.896 6.877-41.524 6.877-61.42 0L94 223.72c-.081 .573 .091 1.153 .47 1.59 .384 .443 .943 .695 1.53 .69h64c.58-0 1.13-.252 1.51-.69 .379-.437 .551-1.017 .47-1.59ZM209.78 118h-163.56c3.145 42.843 38.822 75.997 81.78 75.997 42.958 0 78.635-33.154 81.78-75.997Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
