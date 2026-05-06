package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorLightIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 58C111.431 58 98 71.431 98 88c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30C158 71.431 144.569 58 128 58ZM128 106c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM128 138c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30 0-16.569-13.431-30-30-30ZM128 186c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM216 146h-18v-68h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-26c0-7.732-6.268-14-14-14h-112C64.268 26 58 32.268 58 40v26h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v68h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v58c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-58h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM186 216c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-176c0-1.105 .895-2 2-2h112c1.105 0 2 .895 2 2Z"),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
