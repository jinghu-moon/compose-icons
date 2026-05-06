package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorThinIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 72v-20h-115.68l58.8 73.5c1.17 1.461 1.17 3.539 0 5L72.32 204h115.68v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v24c0 2.209-1.791 4-4 4h-128c-1.537-.001-2.938-.883-3.604-2.269-.665-1.386-.477-3.031 .484-4.231L122.88 128 60.88 50.5c-.961-1.2-1.149-2.845-.484-4.231C61.062 44.883 62.463 44.001 64 44h128c2.209 0 4 1.791 4 4v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
