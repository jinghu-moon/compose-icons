package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) return _fireTruck!!
        _fireTruck = phosphorLightIcon(
            name = "FireTruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.57 117.77l-14-35c-2.111-5.328-7.269-8.82-13-8.8h-36.57v-9.97c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v101.48c-7.937 4.2-13.585 11.725-15.4 20.52h-53.2C106.561 172.018 94.267 161.97 80 161.97c-14.267 0-26.561 10.048-29.4 24.03h-18.6c-1.105 0-2-.895-2-2v-48c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v48c0 7.732 6.268 14 14 14h18.6c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h53.2c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h18.6c7.732 0 14-6.268 14-14v-64c-.002-.764-.148-1.52-.43-2.23ZM226.58 86c.82-.001 1.557 .499 1.86 1.26L239.14 114h-49.14v-28ZM80 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM192 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM240 186h-18.6C218.531 172.041 206.251 162.016 192 162c-.67 0-1.34 0-2 .07v-36.07h52v58c0 1.105-.895 2-2 2ZM24 98c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h128c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-28h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-128c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v28ZM122 98h-28v-28h28ZM54 70h28v28h-28Z"),
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
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
