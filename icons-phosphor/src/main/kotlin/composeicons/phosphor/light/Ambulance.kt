package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorLightIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M82 120c0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6ZM254 120v64c0 7.732-6.268 14-14 14h-18.6c-2.839 13.982-15.133 24.03-29.4 24.03-14.267 0-26.561-10.048-29.4-24.03h-53.2C106.561 211.982 94.267 222.03 80 222.03 65.733 222.03 53.439 211.982 50.6 198h-18.6c-7.732 0-14-6.268-14-14v-112C18 64.268 24.268 58 32 58h152c3.314 0 6 2.686 6 6v10h36.58c5.731-.02 10.889 3.472 13 8.8l14 35c.275 .701 .417 1.447 .42 2.2ZM190 86v28h49.14L228.44 87.26c-.303-.761-1.04-1.261-1.86-1.26ZM32 186h18.6C53.439 172.018 65.733 161.97 80 161.97c14.267 0 26.561 10.048 29.4 24.03h53.2c1.815-8.795 7.463-16.32 15.4-20.52v-95.48h-146c-1.105 0-2 .895-2 2v112c0 1.105 .895 2 2 2ZM98 192c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 9.941 8.059 18 18 18 9.941 0 18-8.059 18-18ZM210 192c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 9.941 8.059 18 18 18 9.941 0 18-8.059 18-18ZM242 184v-58h-52v36.07c.66 0 1.33-.07 2-.07 14.251 .016 26.531 10.041 29.4 24h18.6c1.105 0 2-.895 2-2Z"),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
