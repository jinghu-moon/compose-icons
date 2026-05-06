package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorBoldIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.79 149.32 223.7 97.11C219.904 86.777 208.471 81.454 198.12 85.2l-61.31 22.22L147.7 45.18C149.628 34.322 142.403 23.953 131.55 22L76.87 12.31c-5.219-.92-10.59 .276-14.926 3.323-4.336 3.047-7.281 7.695-8.184 12.917L28.76 171.68c-4.6 26.001 12.665 50.835 38.64 55.58 2.874 .494 5.784 .742 8.7 .74h147.9c11.046 0 20-8.954 20-20v-51.81c-.031-2.34-.439-4.66-1.21-6.87ZM99 184.18c-1.069 6.298-4.621 11.904-9.86 15.56-5.096 3.597-11.422 4.998-17.56 3.89C58.615 201.215 50.028 188.792 52.35 175.81L76.71 36.66 123.37 45 99 184.18ZM122.64 188.31l9.39-53.64 70.49-25.54 16.3 44.59-96.23 34.87c.03-.09 .06-.18 .07-.28ZM220 204h-69.48L220 178.82ZM89.22 174.07l-1.4 8C86.815 187.811 81.829 192 76 192c-.697-.001-1.393-.061-2.08-.18-6.528-1.143-10.893-7.362-9.75-13.89l1.4-8c1.168-6.503 7.373-10.839 13.881-9.699 6.508 1.14 10.87 7.326 9.759 13.839Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
