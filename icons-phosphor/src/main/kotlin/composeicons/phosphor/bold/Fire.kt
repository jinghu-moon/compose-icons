package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorBoldIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M177.62 159.6c-5.098 16.207-17.793 28.902-34 34-1.166 .362-2.379 .548-3.6 .55-5.928 .004-10.97-4.32-11.87-10.179-.899-5.859 2.614-11.497 8.27-13.271 8.735-2.744 15.576-9.585 18.32-18.32 1.988-6.324 8.726-9.838 15.05-7.85 6.324 1.988 9.838 8.726 7.85 15.05ZM220 144c0 50.81-41.19 92-92 92C77.19 236 36 194.81 36 144 36 115.19 47.27 85.82 69.48 56.72c2.081-2.727 5.23-4.434 8.651-4.688 3.421-.254 6.788 .968 9.249 3.358l19.69 19.11L127 19.89c1.337-3.667 4.374-6.454 8.142-7.472 3.768-1.019 7.795-.141 10.798 2.352C168.2 33.25 220 82.85 220 144ZM196 144C196 102.29 165.39 65.61 143.48 44.71l-20.21 55.4c-1.394 3.821-4.628 6.676-8.592 7.585-3.964 .909-8.119-.252-11.038-3.085L80.71 82.36C67 103.38 60 124.06 60 144c0 37.555 30.445 68 68 68 37.555 0 68-30.445 68-68Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
