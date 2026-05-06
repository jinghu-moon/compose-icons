package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorThinIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 107.47l112 64c1.238 .715 2.762 .715 4 0l112-64c1.243-.713 2.01-2.037 2.01-3.47 0-1.433-.767-2.757-2.01-3.47l-112-64c-1.238-.715-2.762-.715-4 0l-112 64c-1.243 .713-2.01 2.037-2.01 3.47 0 1.433 .767 2.757 2.01 3.47ZM128 44.61 231.94 104 128 163.39 24.06 104ZM243.47 142c1.091 1.917 .424 4.355-1.49 5.45l-112 64c-1.238 .715-2.762 .715-4 0l-112-64c-1.916-1.105-2.575-3.554-1.47-5.47 1.105-1.916 3.554-2.575 5.47-1.47l110 62.86L237.98 140.51c.924-.537 2.025-.681 3.056-.401 1.031 .28 1.908 .961 2.434 1.891Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
