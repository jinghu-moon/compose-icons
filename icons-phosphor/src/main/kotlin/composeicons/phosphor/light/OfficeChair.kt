package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorLightIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 128c0 3.314-2.686 6-6 6h-18.39c-3.04 22.874-22.535 39.971-45.61 40h-42v28h26c16.569 0 30 13.431 30 30 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-9.941-8.059-18-18-18h-26v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-26c-9.941 0-18 8.059-18 18 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-16.569 13.431-30 30-30h26v-28h-42C56.925 173.971 37.43 156.874 34.39 134h-18.39c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 18.778 15.222 34 34 34h96c18.778 0 34-15.222 34-34 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6ZM69.43 137.17C66.763 134.101 65.563 130.024 66.14 126L79.86 30C80.882 23.126 86.77 18.028 93.72 18h68.56c6.95 .028 12.838 5.126 13.86 12l13.72 96c.58 4.021-.615 8.096-3.275 11.167-2.66 3.071-6.523 4.835-10.585 4.833h-96c-4.057-.003-7.913-1.765-10.57-4.83ZM78.49 129.31c.38 .438 .93 .69 1.51 .69h96c.58-0 1.13-.252 1.51-.69 .379-.437 .551-1.017 .47-1.59L164.26 31.72c-.14-.994-.996-1.73-2-1.72h-68.54c-1.004-.01-1.86 .726-2 1.72L78 127.72c-.075 .576 .104 1.156 .49 1.59Z"),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
