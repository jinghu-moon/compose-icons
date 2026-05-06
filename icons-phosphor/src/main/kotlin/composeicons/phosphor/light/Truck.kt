package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorLightIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.57 117.78l-14-35c-2.111-5.328-7.269-8.82-13-8.8h-36.57v-9.98c0-3.314-2.686-6-6-6h-152C24.268 58 18 64.268 18 72v112c0 7.732 6.268 14 14 14h18.6c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h53.2c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h18.6c7.732 0 14-6.268 14-14v-64c-.001-.761-.147-1.514-.43-2.22ZM190 86h36.58c.82-.001 1.557 .499 1.86 1.26L239.14 114h-49.14ZM30 72c0-1.105 .895-2 2-2h146v68h-148ZM80 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM162.6 186h-53.2C106.561 172.018 94.267 161.97 80 161.97c-14.267 0-26.561 10.048-29.4 24.03h-18.6c-1.105 0-2-.895-2-2v-34h148v15.48c-7.937 4.2-13.585 11.725-15.4 20.52ZM192 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM242 184c0 1.105-.895 2-2 2h-18.6C218.531 172.041 206.251 162.016 192 162c-.67 0-1.34 0-2 .07v-36.07h52Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
