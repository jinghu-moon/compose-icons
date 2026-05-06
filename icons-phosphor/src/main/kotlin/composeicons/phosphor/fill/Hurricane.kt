package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorFillIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M158.32 45.36l9.41-35.3c.716-2.69-.018-5.56-1.938-7.576C163.872 .468 161.042-.404 158.32 .18 137.53 5.282 117.718 13.758 99.67 25.27 60.63 50.37 40 85.89 40 128c.02 36.909 23.042 69.893 57.68 82.64l-9.41 35.3c-.716 2.69 .018 5.56 1.938 7.576 1.92 2.016 4.75 2.889 7.472 2.304 20.79-5.102 40.602-13.578 58.65-25.09C195.37 205.63 216 170.11 216 128 215.983 91.09 192.959 58.104 158.32 45.36ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
