package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorBoldIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 92h-36v-36c0-6.627-5.373-12-12-12h-116v-4C60 33.373 54.627 28 48 28 41.373 28 36 33.373 36 40v176c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h84c6.627 0 12-5.373 12-12v-36h68c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM164 68v24h-104v-24ZM132 188h-72v-24h72ZM212 140h-152v-24h152Z"),
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
