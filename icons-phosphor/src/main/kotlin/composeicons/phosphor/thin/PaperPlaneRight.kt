package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorThinIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.89 117.43 61.89 21.55C57.534 19.107 52.121 19.617 48.298 22.83 44.475 26.044 43.042 31.289 44.7 36l31.08 92L44.71 220c-1.297 3.669-.735 7.739 1.509 10.919 2.244 3.18 5.89 5.074 9.781 5.081 2.079-.007 4.12-.547 5.93-1.57L229.87 138.35c3.78-2.125 6.119-6.124 6.119-10.46 0-4.336-2.339-8.335-6.119-10.46ZM225.89 131.43 58 227.47c-1.454 .812-3.259 .638-4.531-.436-1.272-1.074-1.746-2.825-1.189-4.394v-.07L82.87 132h61.13c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-61.13L52.26 33.37C51.678 31.811 52.152 30.054 53.44 29c.714-.616 1.618-.969 2.56-1 .68 .008 1.345 .194 1.93 .54l168 95.87c1.273 .704 2.064 2.045 2.064 3.5 0 1.455-.79 2.796-2.064 3.5Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
