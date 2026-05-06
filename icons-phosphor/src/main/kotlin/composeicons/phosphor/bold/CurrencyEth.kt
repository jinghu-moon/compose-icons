package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorBoldIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.44 120.59 137.44 8.59C135.165 5.691 131.685 3.999 128 3.999c-3.685 0-7.165 1.693-9.44 4.591L30.56 120.59c-3.415 4.35-3.415 10.47 0 14.82l.6 .76c.128 .2 .276 .388 .44 .56l87 110.68c2.275 2.899 5.755 4.591 9.44 4.591 3.685 0 7.165-1.693 9.44-4.591l88-112c3.403-4.359 3.387-10.479-.04-14.82ZM140 50.7l57.12 72.7L140 149.4ZM116 149.36l-57.12-26L116 50.7ZM116 175.73v29.57l-36.15-46ZM140 175.73l36.15-16.43-36.15 46Z"),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
