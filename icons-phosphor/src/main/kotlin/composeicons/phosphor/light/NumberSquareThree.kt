package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorLightIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM158 148c-0 13.816-8.361 26.258-21.152 31.479-12.792 5.221-27.47 2.182-37.138-7.689-2.317-2.369-2.274-6.168 .095-8.485 2.369-2.317 6.168-2.274 8.485 .095 6.989 7.131 17.904 8.66 26.584 3.725 8.68-4.935 12.948-15.096 10.396-24.749C142.718 132.723 133.985 125.999 124 126c-2.238 .002-4.291-1.242-5.325-3.227-1.034-1.984-.878-4.38 .405-6.213L140.48 86h-36.48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c2.238-.002 4.291 1.242 5.325 3.227 1.034 1.984 .878 4.38-.405 6.213l-22.53 32.18c14.059 4.532 23.594 17.609 23.61 32.38Z"),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
