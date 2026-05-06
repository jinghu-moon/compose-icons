package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorThinIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 120c0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4ZM252 120v64c0 6.627-5.373 12-12 12h-20.29c-1.997 13.767-13.799 23.981-27.71 23.981-13.911 0-25.713-10.213-27.71-23.981h-56.58C105.713 209.767 93.911 219.981 80 219.981 66.089 219.981 54.287 209.767 52.29 196h-20.29c-6.627 0-12-5.373-12-12v-112C20 65.373 25.373 60 32 60h152c2.209 0 4 1.791 4 4v12h38.58c4.909-.004 9.325 2.983 11.15 7.54l14 35c.18 .466 .272 .961 .27 1.46ZM188 84v32h54.09L230.3 86.51c-.61-1.519-2.083-2.513-3.72-2.51ZM32 188h20.29C54.287 174.233 66.089 164.019 80 164.019c13.911 0 25.713 10.213 27.71 23.981h56.58c1.35-9.276 7.245-17.264 15.71-21.29v-98.71h-148c-2.209 0-4 1.791-4 4v112c0 2.209 1.791 4 4 4ZM100 192c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM212 192c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM244 184v-60h-56v40.29c15.303-2.208 29.499 8.407 31.71 23.71h20.29c2.209 0 4-1.791 4-4Z"),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
