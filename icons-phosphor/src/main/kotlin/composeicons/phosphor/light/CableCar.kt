package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorLightIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.91 31c-.28-1.574-1.176-2.972-2.49-3.882-1.314-.911-2.938-1.259-4.51-.968L15 66.1c-3.034 .559-5.15 3.328-4.892 6.403 .258 3.075 2.806 5.452 5.892 5.497 .359-.001 .716-.031 1.07-.09L122 59.17v38.83h-58C47.431 98 34 111.431 34 128v64c0 16.569 13.431 30 30 30h128c16.569 0 30-13.431 30-30v-64C222 111.431 208.569 98 192 98h-58v-41L241.05 37.91c3.242-.579 5.411-3.663 4.86-6.91ZM102 162v-52h52v52ZM64 110h26v52h-44v-34c0-9.941 8.059-18 18-18ZM192 210h-128c-9.941 0-18-8.059-18-18v-18h164v18c0 9.941-8.059 18-18 18ZM210 128v34h-44v-52h26c9.941 0 18 8.059 18 18Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
