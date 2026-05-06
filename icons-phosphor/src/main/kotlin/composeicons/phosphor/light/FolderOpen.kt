package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorLightIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.36 111.81C240.727 108.16 236.5 105.998 232 106h-18v-18c0-7.732-6.268-14-14-14h-70L101.74 52.8C99.315 50.986 96.368 50.004 93.34 50h-53.34C32.268 50 26 56.268 26 64v144c0 3.314 2.686 6 6 6h179.1c2.581-.001 4.873-1.652 5.69-4.1l28.49-85.47c1.427-4.271 .712-8.967-1.92-12.62ZM40 62h53.34c.433 0 .854 .14 1.2 .4l29.86 22.4c1.039 .779 2.302 1.2 3.6 1.2h72c1.105 0 2 .895 2 2v18h-132.23c-6.025 0-11.374 3.855-13.28 9.57L38 171v-107c0-1.105 .895-2 2-2ZM233.9 120.63 206.78 202h-166.45L67.87 119.37c.272-.819 1.038-1.371 1.9-1.37h162.23c.643-.001 1.247 .308 1.623 .829 .376 .521 .479 1.191 .277 1.801Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
