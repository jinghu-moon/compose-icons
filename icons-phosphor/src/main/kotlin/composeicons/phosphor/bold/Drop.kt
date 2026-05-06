package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorBoldIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134.88 6.17c-4.131-2.891-9.629-2.891-13.76 0C105.657 17.566 91.51 30.646 78.94 45.17 50.85 77.43 36 111.62 36 144c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 66.64 138.36 8.6 134.88 6.17ZM128 212C90.461 211.961 60.039 181.539 60 144 60 110.69 80 80.63 96.7 61.29 106.235 50.338 116.708 40.239 128 31.11c11.292 9.129 21.765 19.228 31.3 30.18C176 80.63 196 110.69 196 144c-.039 37.539-30.461 67.961-68 68ZM177.62 159.6c-5.098 16.207-17.793 28.902-34 34-1.166 .362-2.379 .548-3.6 .55-5.928 .004-10.97-4.32-11.87-10.179-.899-5.859 2.614-11.497 8.27-13.271 8.735-2.744 15.576-9.585 18.32-18.32 1.988-6.324 8.726-9.838 15.05-7.85 6.324 1.988 9.838 8.726 7.85 15.05Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
