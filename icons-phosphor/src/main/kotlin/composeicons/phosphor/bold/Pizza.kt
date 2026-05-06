package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorBoldIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.43 62.05c-1.247-5.17-4.509-9.628-9.06-12.38C168.974 10.11 87.026 10.11 21.63 49.67c-4.533 2.756-7.785 7.199-9.041 12.352-1.257 5.154-.414 10.595 2.341 15.128h0l96 157.26c3.626 5.977 10.109 9.627 17.1 9.627 6.991 0 13.474-3.65 17.1-9.627l96-157.26c2.753-4.524 3.581-9.962 2.3-15.1ZM128 44c31.746-.028 62.94 8.298 90.45 24.14L210 82C159.25 52.735 96.75 52.735 46 82L37.55 68.14C65.06 52.298 96.254 43.972 128 44ZM83.88 144.06l-20.74-34c6.201-3.064 13.545-2.707 19.419 .945 5.874 3.651 9.445 10.079 9.441 16.995-.028 6.333-3.037 12.283-8.12 16.06ZM128 216.36 96.44 164.65c13.04-8.689 20.475-23.658 19.52-39.3C115.004 109.709 105.801 95.757 91.8 88.72c35.673-9.49 73.648-4.554 105.71 13.74l-8.95 14.66c-20.57-10.968-46.124-3.988-58.264 15.913-12.14 19.901-6.651 45.816 12.514 59.087ZM148 156c.003-6.745 3.406-13.033 9.05-16.726 5.644-3.693 12.769-4.292 18.95-1.594l-20.64 33.83C150.7 167.709 147.997 162.014 148 156Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
