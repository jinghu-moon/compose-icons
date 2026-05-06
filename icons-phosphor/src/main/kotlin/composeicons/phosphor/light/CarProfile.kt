package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorLightIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 114h-29.51L166.59 70.1C163.968 67.469 160.404 65.993 156.69 66h-112.41c-4.681-.001-9.052 2.336-11.65 6.23L3 116.67c-.655 .987-1.003 2.146-1 3.33v48c0 7.732 6.268 14 14 14h18.6c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h69.2c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h18.6c7.732 0 14-6.268 14-14v-40c0-7.732-6.268-14-14-14ZM42.62 78.89c.37-.555 .993-.889 1.66-.89h112.41c.53 .002 1.037 .214 1.41 .59L193.52 114h-174.31ZM64 194c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM192 194c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM242 168c0 1.105-.895 2-2 2h-18.6C218.561 156.018 206.267 145.97 192 145.97c-14.267 0-26.561 10.048-29.4 24.03h-69.2C90.561 156.018 78.267 145.97 64 145.97c-14.267 0-26.561 10.048-29.4 24.03h-18.6c-1.105 0-2-.895-2-2v-42h226c1.105 0 2 .895 2 2Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
