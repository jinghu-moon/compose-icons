package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CoinLine: ImageVector
    get() {
        if (_coinLine != null) return _coinLine!!
        _coinLine = remixIcon(
            name = "CoinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 4.003c6.075 0 11 2.686 11 6v4c0 3.314-4.925 6-11 6C6.038 20.003 1.181 17.412 1.01 14.18l-.005-.177v-4C1.005 6.689 5.93 4.003 12.005 4.003ZM12.005 16.003c-3.72 0-7.01-1.007-9-2.549l0 .549c0 1.882 3.883 4 9 4 5.011 0 8.838-2.031 8.995-3.882l.005-.118 .001-.55c-1.991 1.542-5.28 2.55-9.001 2.55ZM12.005 6.003c-5.117 0-9 2.118-9 4 0 1.882 3.883 4 9 4 5.117 0 9-2.118 9-4 0-1.882-3.883-4-9-4Z"),
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
        return _coinLine!!
    }

private var _coinLine: ImageVector? = null
