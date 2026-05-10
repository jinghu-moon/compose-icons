package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorFillIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M254.88 195.92 200.32 103.84C197.456 98.958 192.21 95.971 186.55 96h0c-5.657-.03-10.901 2.958-13.76 7.84l-15.64 26.39c-.742 1.255-.742 2.815 0 4.07l26.8 45.47c2.105 3.493 1.297 8.005-1.89 10.55-1.817 1.41-4.152 1.971-6.411 1.538-2.259-.433-4.222-1.816-5.389-3.798L101.79 71.88C98.915 66.994 93.669 63.994 88 63.994c-5.669 0-10.915 3-13.79 7.886L1.11 195.94c-1.811 3.045-1.405 6.918 1 9.52 1.594 1.667 3.814 2.588 6.12 2.54h239.54c2.296 .03 4.501-.893 6.09-2.55 2.416-2.599 2.831-6.479 1.02-9.53ZM64.43 120 88 80l23.57 40ZM140 52c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C150.745 76 140 65.255 140 52Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
