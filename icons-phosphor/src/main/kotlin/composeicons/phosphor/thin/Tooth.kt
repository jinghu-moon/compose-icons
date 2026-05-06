package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorThinIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M169.49 67.71 138.77 80l30.72 12.28c1.79 .707 2.822 2.589 2.457 4.478-.365 1.889-2.023 3.251-3.947 3.242-.511 .002-1.017-.097-1.49-.29L128 84.31 89.49 99.71c-.473 .193-.979 .292-1.49 .29-1.924 .01-3.583-1.352-3.947-3.242-.365-1.889 .668-3.771 2.457-4.478L117.23 80 86.51 67.71c-2.052-.828-3.043-3.163-2.215-5.215 .828-2.052 3.163-3.043 5.215-2.215L128 75.69 166.51 60.28c2.052-.828 4.387 .163 5.215 2.215 .828 2.052-.163 4.387-2.215 5.215ZM220 79.71c.07 71.08-23.16 130.07-45.65 146.05-3.495 2.488-8.069 2.872-11.93 1-3.955-1.821-6.601-5.656-6.9-10C154.35 200.93 149.33 164 128 164c-21.33 0-26.35 36.94-27.52 52.82-.479 6.284-5.698 11.151-12 11.19-2.45-.005-4.838-.774-6.83-2.2-22.49-16-45.72-75-45.65-146C36.105 51.165 59.355 28 88 28h80c28.621-0 51.862 23.129 52 51.75ZM212 79.71C211.841 55.523 192.188 35.999 168 36h-80C63.793 36 44.132 55.553 44 79.76c-.07 67.58 21.9 125 42.29 139.51 1.134 .825 2.633 .952 3.89 .33 1.333-.613 2.223-1.906 2.32-3.37C95.36 177.39 108 156 128 156c20 0 32.64 21.4 35.5 60.24 .097 1.464 .987 2.757 2.32 3.37 1.257 .622 2.756 .495 3.89-.33C190.1 204.8 212.07 147.34 212 79.76Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
