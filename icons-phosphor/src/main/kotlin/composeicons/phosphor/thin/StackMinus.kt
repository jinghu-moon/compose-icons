package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StackMinus: ImageVector
    get() {
        if (_stackMinus != null) return _stackMinus!!
        _stackMinus = phosphorThinIcon(
            name = "StackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 200c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM222 124.54l-94 54.83L34 124.54c-1.899-.994-4.244-.313-5.317 1.543-1.073 1.856-.492 4.227 1.317 5.377l96 56c1.238 .715 2.762 .715 4 0l96-56c1.302-.681 2.126-2.021 2.146-3.49 .02-1.469-.767-2.831-2.05-3.547-1.283-.716-2.855-.671-4.095 .117ZM28 80c.001-1.428 .764-2.746 2-3.46l96-56c1.238-.715 2.762-.715 4 0l96 56c1.234 .716 1.993 2.034 1.993 3.46 0 1.426-.759 2.744-1.993 3.46l-96 56c-1.238 .715-2.762 .715-4 0L30 83.46C28.764 82.746 28.001 81.428 28 80ZM39.94 80 128 131.37 216.06 80 128 28.63ZM142 219.21l-14 8.16L34 172.54c-1.899-.994-4.244-.313-5.317 1.543-1.073 1.856-.492 4.227 1.317 5.377l96 56c1.238 .715 2.762 .715 4 0l16-9.34c1.333-.664 2.187-2.013 2.216-3.502 .029-1.489-.77-2.871-2.076-3.587-1.306-.716-2.901-.647-4.14 .178Z"),
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
        return _stackMinus!!
    }

private var _stackMinus: ImageVector? = null
