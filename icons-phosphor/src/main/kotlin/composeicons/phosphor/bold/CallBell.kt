package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorBoldIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 180h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4.09C225.884 107.001 188.677 66.676 140 60.72v-16.72h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-48C97.373 20 92 25.373 92 32c0 6.627 5.373 12 12 12h12v16.72C67.323 66.676 30.116 107.001 28.09 156h-4.09c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM128 84c40.399 .048 73.718 31.659 75.89 72h-151.78C54.282 115.659 87.601 84.048 128 84ZM244 208c0 6.627-5.373 12-12 12h-208c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h208c6.627 0 12 5.373 12 12Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
