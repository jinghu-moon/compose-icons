package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorThinIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 208c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v103.19L93.37 101c1.416-1.227 3.495-1.306 5-.19l61.41 46.05L221.37 93c1.673-1.265 4.038-1.024 5.421 .553 1.383 1.577 1.312 3.954-.161 5.447l-64 56c-1.416 1.227-3.495 1.306-5 .19l-61.41-46L36 161.81v42.19h188c2.209 0 4 1.791 4 4Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
