package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorThinIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.5 104.8 179.72 30.87c-.5-1.699-2.059-2.867-3.83-2.87h-95.78c-1.771 .003-3.33 1.171-3.83 2.87L54.5 104.8c-6.527 21.666-.203 45.159 16.32 60.62 14.483 13.59 33.341 21.565 53.18 22.49v48.09h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36v-48.09c19.839-.925 38.697-8.9 53.18-22.49 16.523-15.461 22.847-38.954 16.32-60.62ZM83.1 36h89.8l20.93 71.06c.43 1.49 .8 3 1.1 4.47-23.64 10.47-50.76 .18-65.12-7.1C101.59 90.14 80.33 90.33 65.93 94.29ZM179.72 159.57c-29.1 27.241-74.34 27.241-103.44 0C61.973 146.174 56.505 125.822 62.17 107.06l1-3.46c12.66-4.87 33.45-7 63 8C137 117 154.33 124 172.8 124c7.93 .071 15.803-1.361 23.2-4.22 .666 15.008-5.285 29.553-16.28 39.79Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
