package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorThinIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.83 73.11C223.583 69.906 219.914 67.998 216 68h-84v-40h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v40h-84c-3.915-.001-7.584 1.908-9.83 5.114-2.246 3.206-2.787 7.306-1.45 10.986l26.19 72c1.723 4.74 6.226 7.897 11.27 7.9h33.82v68c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-68h40v68c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-68h33.82c5.044-.003 9.547-3.16 11.27-7.9L227.28 84.1c1.339-3.68 .798-7.783-1.45-10.99ZM107.34 156 92.79 76h70.42l-14.55 80ZM62.42 153.37 36.24 81.37c-.447-1.227-.268-2.595 .481-3.664C37.47 76.636 38.694 75.999 40 76h44.66l14.54 80h-33c-1.689 .009-3.202-1.043-3.78-2.63ZM219.76 81.37l-26.18 72c-.576 1.58-2.078 2.631-3.76 2.63h-33L171.37 76h44.63c1.306-.001 2.53 .636 3.279 1.706 .749 1.07 .929 2.437 .481 3.664Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
