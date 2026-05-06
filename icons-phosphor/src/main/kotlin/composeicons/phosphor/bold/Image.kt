package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorBoldIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 96c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM236 56v144c0 11.046-8.954 20-20 20h-176C28.954 220 20 211.046 20 200v-144C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM44 60v79.72L77.86 105.86c7.81-7.808 20.47-7.808 28.28 0L147.31 147l17.18-17.17c7.81-7.808 20.47-7.808 28.28 0L212 149.09v-89.09ZM44 196h118.34L92 125.66l-48 48ZM212 196v-13L178.63 149.63 164.28 164l32 32Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
