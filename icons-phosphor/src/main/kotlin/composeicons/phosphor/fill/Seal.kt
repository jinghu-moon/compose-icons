package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seal: ImageVector
    get() {
        if (_seal != null) return _seal!!
        _seal = phosphorFillIcon(
            name = "Seal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128c0 10.44-7.51 18.27-14.14 25.18-3.77 3.94-7.67 8-9.14 11.57-1.36 3.27-1.44 8.69-1.52 13.94-.15 9.76-.31 20.82-8 28.51-7.69 7.69-18.75 7.85-28.51 8-5.25 .08-10.67 .16-13.94 1.52-3.57 1.47-7.63 5.37-11.57 9.14C146.27 232.49 138.44 240 128 240c-10.44 0-18.27-7.51-25.18-14.14-3.94-3.77-8-7.67-11.57-9.14-3.27-1.36-8.69-1.44-13.94-1.52-9.76-.15-20.82-.31-28.51-8-7.69-7.69-7.85-18.75-8-28.51-.08-5.25-.16-10.67-1.52-13.94-1.47-3.57-5.37-7.63-9.14-11.57C23.51 146.27 16 138.44 16 128c0-10.44 7.51-18.27 14.14-25.18 3.77-3.94 7.67-8 9.14-11.57 1.36-3.27 1.44-8.69 1.52-13.94 .15-9.76 .31-20.82 8-28.51 7.69-7.69 18.75-7.85 28.51-8 5.25-.08 10.67-.16 13.94-1.52 3.57-1.47 7.63-5.37 11.57-9.14C109.73 23.51 117.56 16 128 16c10.44 0 18.27 7.51 25.18 14.14 3.94 3.77 8 7.67 11.57 9.14 3.27 1.36 8.69 1.44 13.94 1.52 9.76 .15 20.82 .31 28.51 8 7.69 7.69 7.85 18.75 8 28.51 .08 5.25 .16 10.67 1.52 13.94 1.47 3.57 5.37 7.63 9.14 11.57C232.49 109.73 240 117.56 240 128Z"),
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
        return _seal!!
    }

private var _seal: ImageVector? = null
