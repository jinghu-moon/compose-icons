package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorBoldIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 175.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L203 196h-35c-3.869 .004-7.503-1.857-9.76-5L81.82 84h-49.82C25.373 84 20 78.627 20 72 20 65.373 25.373 60 32 60h56c3.869-.004 7.503 1.857 9.76 5l76.42 107h28.82l-3.52-3.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0ZM110.4 152.64c-2.59-1.85-5.808-2.595-8.948-2.072-3.139 .523-5.942 2.272-7.792 4.862L81.82 172h-49.82c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c3.869 .004 7.503-1.857 9.76-5l15.43-21.59c1.859-2.592 2.61-5.818 2.087-8.964-.524-3.147-2.278-5.955-4.877-7.806ZM145.6 103.36c2.59 1.85 5.808 2.595 8.948 2.072 3.139-.523 5.942-2.272 7.792-4.862L174.18 84h28.82l-3.52 3.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l24-24c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5l-24-24c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L203 60h-35c-3.869-.004-7.503 1.857-9.76 5L142.81 86.6c-1.856 2.591-2.605 5.815-2.082 8.959 .523 3.144 2.276 5.951 4.872 7.801Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
