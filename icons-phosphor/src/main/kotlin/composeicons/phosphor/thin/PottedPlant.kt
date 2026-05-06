package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorThinIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122.83 138.83h0L145 116.7c9 4.89 18.06 7.35 26.81 7.35 8.427 .004 16.69-2.33 23.87-6.74 22.42-13.58 34.41-45.45 32.07-85.26-.118-2.022-1.728-3.637-3.75-3.76-39.81-2.35-71.68 9.65-85.26 32.07-9.21 15.2-9 33.09 .61 50.68L120 130.34 102.94 113.28c6.66-12.78 6.71-26.2 0-37.22C92.89 59.4 69.33 50.49 40 52.21c-2.048 .105-3.685 1.742-3.79 3.79-1.73 29.36 7.19 52.92 23.85 63 5.404 3.29 11.613 5.02 17.94 5 6.755-.087 13.389-1.802 19.34-5l17 17.06-12 12h-46.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12.79l13.91 62.54c1.195 5.509 6.083 9.429 11.72 9.4h67.17c5.633 .024 10.515-3.895 11.71-9.4L187.21 156h12.79c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-86.34l9.17-9.17ZM145.53 64.51C157.15 45.31 184.8 34.8 219.9 36.1c1.29 35.1-9.21 62.74-28.41 74.37-13.08 7.92-28.77 7.32-44.29-1.68C138.21 93.28 137.61 77.59 145.53 64.51ZM95.05 111.05c-10.84 6.19-21.76 6.59-30.84 1.08C50.78 104 43.35 84.68 44 60c24.64-.69 44 6.74 52.1 20.17 5.54 9.12 5.14 20.04-1.05 30.88ZM179.05 156.05l-13.53 60.87c-.407 1.828-2.028 3.128-3.9 3.13h-67.2c-1.876 .003-3.502-1.299-3.91-3.13L77 156Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
