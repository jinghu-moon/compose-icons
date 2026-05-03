package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorFillIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 112.000 L 232.000 144.000 C 232.000 148.418 228.418 152.000 224.000 152.000 L 56.000 152.000 L 56.000 168.000 L 144.000 168.000 C 148.418 168.000 152.000 171.582 152.000 176.000 L 152.000 200.000 C 152.000 204.418 148.418 208.000 144.000 208.000 L 56.000 208.000 L 56.000 216.000 C 56.000 220.418 52.418 224.000 48.000 224.000 C 43.582 224.000 40.000 220.418 40.000 216.000 L 40.000 40.000 C 40.000 35.582 43.582 32.000 48.000 32.000 C 52.418 32.000 56.000 35.582 56.000 40.000 L 56.000 48.000 L 176.000 48.000 C 180.418 48.000 184.000 51.582 184.000 56.000 L 184.000 80.000 C 184.000 84.418 180.418 88.000 176.000 88.000 L 56.000 88.000 L 56.000 104.000 L 224.000 104.000 C 228.418 104.000 232.000 107.582 232.000 112.000 Z"),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
