package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorBoldIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 208c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12v-160C20 41.373 25.373 36 32 36c6.627 0 12 5.373 12 12v85.55L88.1 95c4.267-3.733 10.564-3.971 15.1-.57l56.22 42.16L216.1 87c3.164-3.158 7.822-4.296 12.086-2.951 4.264 1.344 7.427 4.948 8.207 9.35 .78 4.402-.951 8.873-4.493 11.601l-64 56c-4.267 3.733-10.564 3.971-15.1 .57L96.58 119.44 44 165.45v30.55h180c6.627 0 12 5.373 12 12Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
