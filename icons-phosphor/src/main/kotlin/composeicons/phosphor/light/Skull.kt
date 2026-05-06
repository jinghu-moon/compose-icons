package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorLightIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 106c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26ZM92 146c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM164 106c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26ZM164 146c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM128 18C71.76 18 26 62 26 116c0 33.77 18.3 65.31 48 83.15v16.85c0 7.732 6.268 14 14 14h80c7.732 0 14-6.268 14-14v-16.85C211.7 181.31 230 149.77 230 116 230 62 184.24 18 128 18ZM173.09 190.44c-1.908 1.058-3.091 3.068-3.09 5.25v20.31c0 1.105-.895 2-2 2h-18v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26h-20v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26h-18c-1.105 0-2-.895-2-2v-20.31c.001-2.182-1.182-4.192-3.09-5.25C55.21 175.09 38 146.56 38 116 38 68.58 78.37 30 128 30c49.63 0 90 38.58 90 86 0 30.56-17.21 59.09-44.91 74.44Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
