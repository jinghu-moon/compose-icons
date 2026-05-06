package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorLightIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 208c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6v-160c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v98.78L92.05 99.48c2.135-1.865 5.283-1.982 7.55-.28l60.11 45.08L220.05 91.48c2.507-1.931 6.083-1.583 8.171 .795 2.088 2.378 1.969 5.969-.271 8.205l-64 56c-2.135 1.865-5.283 1.982-7.55 .28L96.29 111.72 38 162.72v39.28h186c3.314 0 6 2.686 6 6Z"),
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
