package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorRegularIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.28 68.24l-24-23.56c-6.244-6.223-16.346-6.223-22.59 0L104 136.23 67.31 100.63c-6.257-6.203-16.351-6.181-22.58 .05l-24 24c-6.237 6.246-6.237 16.364 0 22.61l71.62 72c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688L243.33 90.91c3.007-3.009 4.692-7.091 4.683-11.345-.009-4.254-1.712-8.329-4.733-11.325ZM103.62 208 32 136 56 112c.029 .024 .056 .051 .08 .08l42.35 41.09c3.11 3.043 8.08 3.043 11.19 0L208.06 56 232 79.6Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
