package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareOne: ImageVector
    get() {
        if (_numberSquareOne != null) return _numberSquareOne!!
        _numberSquareOne = phosphorLightIcon(
            name = "NumberSquareOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM138 80v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-84.79L111.33 101c-2.761 1.839-6.491 1.091-8.33-1.67-1.839-2.761-1.091-6.491 1.67-8.33l24-16c1.842-1.229 4.212-1.344 6.164-.297 1.952 1.046 3.169 3.083 3.166 5.297Z"),
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
        return _numberSquareOne!!
    }

private var _numberSquareOne: ImageVector? = null
