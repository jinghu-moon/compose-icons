package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorRegularIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.31 188.75l-64-144C190.026 41.861 187.161 40 184 40h-112c-3.133 .005-5.974 1.838-7.27 4.69-.003 .02-.003 .04 0 .06v.12h0L.69 188.75c-1.1 2.475-.874 5.338 .602 7.609C2.767 198.63 5.292 200 8 200h240c2.708-0 5.233-1.37 6.708-3.641 1.476-2.271 1.702-5.134 .602-7.609ZM64 184h-43.69L64 85.7ZM80 184v-98.3L123.69 184ZM141.2 184 84.31 56h94.49l56.89 128Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
