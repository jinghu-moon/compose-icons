package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorBoldIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134.88 6.17c-4.131-2.891-9.629-2.891-13.76 0C105.657 17.566 91.51 30.646 78.94 45.17 50.85 77.43 36 111.63 36 144c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 66.64 138.36 8.6 134.88 6.17ZM191.61 168h-127.22c-1.952-5.153-3.262-10.527-3.9-16h135c-.632 5.472-1.935 10.846-3.88 16ZM96.7 61.29C106.235 50.338 116.708 40.239 128 31.11c11.292 9.129 21.765 19.228 31.3 30.18 14 16.19 30.27 39.89 35.2 66.71h-133C66.43 101.18 82.69 77.48 96.7 61.29ZM128 212c-18.064 .012-35.386-7.187-48.12-20h96.24C163.386 204.813 146.064 212.012 128 212Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
