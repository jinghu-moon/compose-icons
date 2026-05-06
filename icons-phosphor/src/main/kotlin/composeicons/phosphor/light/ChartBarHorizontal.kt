package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorLightIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 98h-42v-42c0-3.314-2.686-6-6-6h-122v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v176c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h90c3.314 0 6-2.686 6-6v-42h74c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM170 62v36h-116v-36ZM138 194h-84v-36h84ZM218 146h-164v-36h164Z"),
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
