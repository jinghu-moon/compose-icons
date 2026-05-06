package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorThinIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192.76 62.72l18.2-20c1.494-1.646 1.371-4.191-.275-5.685-1.646-1.494-4.191-1.371-5.685 .275l-18.2 20C148.92 26.166 93.27 30.208 60.288 66.498c-32.982 36.291-31.701 92.073 2.912 126.812L45 213.31c-1.486 1.657-1.347 4.204 .31 5.69 1.657 1.486 4.204 1.347 5.69-.31l18.2-20c37.899 30.833 93.289 26.664 126.146-9.493C228.204 153.039 227.068 97.504 192.76 62.72ZM44 128C44.016 95.488 62.792 65.905 92.205 52.051c29.412-13.854 64.178-9.492 89.255 11.199L68.63 187.36C52.85 171.638 43.986 150.275 44 128ZM128 212c-19.52 .018-38.432-6.792-53.46-19.25L187.37 68.64c23.994 24.024 31.166 60.13 18.174 91.5C192.553 191.51 161.954 211.974 128 212Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
