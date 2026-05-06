package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SealWarning: ImageVector
    get() {
        if (_sealWarning != null) return _sealWarning!!
        _sealWarning = phosphorFillIcon(
            name = "SealWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.86 102.82c-3.77-3.94-7.67-8-9.14-11.57-1.36-3.27-1.44-8.69-1.52-13.94-.15-9.76-.31-20.82-8-28.51-7.69-7.69-18.75-7.85-28.51-8-5.25-.08-10.67-.16-13.94-1.52-3.56-1.47-7.63-5.37-11.57-9.14C146.28 23.51 138.44 16 128 16c-10.44 0-18.27 7.51-25.18 14.14-3.94 3.77-8 7.67-11.57 9.14C88 40.64 82.56 40.72 77.31 40.8c-9.76 .15-20.82 .31-28.51 8-7.69 7.69-7.8 18.75-8 28.51-.08 5.25-.16 10.67-1.52 13.94-1.47 3.56-5.37 7.63-9.14 11.57C23.51 109.72 16 117.56 16 128c0 10.44 7.51 18.27 14.14 25.18 3.77 3.94 7.67 8 9.14 11.57 1.36 3.27 1.44 8.69 1.52 13.94 .15 9.76 .31 20.82 8 28.51 7.69 7.69 18.75 7.85 28.51 8 5.25 .08 10.67 .16 13.94 1.52 3.56 1.47 7.63 5.37 11.57 9.14C109.72 232.49 117.56 240 128 240c10.44 0 18.27-7.51 25.18-14.14 3.94-3.77 8-7.67 11.57-9.14 3.27-1.36 8.69-1.44 13.94-1.52 9.76-.15 20.82-.31 28.51-8 7.69-7.69 7.85-18.75 8-28.51 .08-5.25 .16-10.67 1.52-13.94 1.47-3.56 5.37-7.63 9.14-11.57C232.49 146.28 240 138.44 240 128c0-10.44-7.51-18.27-14.14-25.18ZM120 80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 184c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _sealWarning!!
    }

private var _sealWarning: ImageVector? = null
