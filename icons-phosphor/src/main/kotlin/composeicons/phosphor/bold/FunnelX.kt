package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorBoldIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.78 69.45c5.321-5.855 6.689-14.297 3.492-21.533C231.074 40.68 223.912 36.009 216 36h-176c-7.915 .001-15.085 4.669-18.288 11.908-3.203 7.238-1.835 15.684 3.488 21.542l.12 .14L92 140.75v75.25c-.002 7.376 4.056 14.155 10.558 17.637 6.502 3.482 14.394 3.103 20.532-.987l32-21.34c5.561-3.71 8.901-9.954 8.9-16.64v-53.92L230.66 69.59ZM143.23 127.8c-2.078 2.225-3.232 5.156-3.23 8.2v56.52l-24 16v-72.52c-0-3.045-1.159-5.977-3.24-8.2L49.23 60h157.52ZM248.49 207.52c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L216 209l-15.52 15.51c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L199 192 183.48 176.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L216 175l15.51-15.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L233 192Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
