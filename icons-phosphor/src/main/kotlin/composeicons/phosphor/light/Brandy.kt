package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorLightIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 88h0c.024-18.209-5.262-36.029-15.21-51.28-1.103-1.69-2.982-2.712-5-2.72h-147.56c-2.018 .008-3.897 1.03-5 2.72C39.275 51.969 33.982 69.789 34 88h0c.054 49.562 38.542 90.587 88 93.8v36.2h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-34v-36.2C183.458 178.587 221.946 137.562 222 88ZM57.56 46h140.88c6.541 10.949 10.425 23.279 11.34 36h-163.56C47.135 69.279 51.019 56.949 57.56 46ZM128 170C85.065 169.946 49.425 136.816 46.24 94h163.52c-3.185 42.816-38.825 75.946-81.76 76Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
