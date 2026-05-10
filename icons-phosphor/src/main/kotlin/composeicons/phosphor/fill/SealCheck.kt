package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SealCheck: ImageVector
    get() {
        if (_sealCheck != null) return _sealCheck!!
        _sealCheck = phosphorFillIcon(
            name = "SealCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.86 102.82c-3.77-3.94-7.67-8-9.14-11.57-1.36-3.27-1.44-8.69-1.52-13.94-.15-9.76-.31-20.82-8-28.51-7.69-7.69-18.75-7.85-28.51-8-5.25-.08-10.67-.16-13.94-1.52-3.56-1.47-7.63-5.37-11.57-9.14C146.28 23.51 138.44 16 128 16c-10.44 0-18.27 7.51-25.18 14.14-3.94 3.77-8 7.67-11.57 9.14C88 40.64 82.56 40.72 77.31 40.8c-9.76 .15-20.82 .31-28.51 8-7.69 7.69-7.8 18.75-8 28.51-.08 5.25-.16 10.67-1.52 13.94-1.47 3.56-5.37 7.63-9.14 11.57C23.51 109.72 16 117.56 16 128c0 10.44 7.51 18.27 14.14 25.18 3.77 3.94 7.67 8 9.14 11.57 1.36 3.27 1.44 8.69 1.52 13.94 .15 9.76 .31 20.82 8 28.51 7.69 7.69 18.75 7.85 28.51 8 5.25 .08 10.67 .16 13.94 1.52 3.56 1.47 7.63 5.37 11.57 9.14C109.72 232.49 117.56 240 128 240c10.44 0 18.27-7.51 25.18-14.14 3.94-3.77 8-7.67 11.57-9.14 3.27-1.36 8.69-1.44 13.94-1.52 9.76-.15 20.82-.31 28.51-8 7.69-7.69 7.85-18.75 8-28.51 .08-5.25 .16-10.67 1.52-13.94 1.47-3.56 5.37-7.63 9.14-11.57C232.49 146.28 240 138.44 240 128c0-10.44-7.51-18.27-14.14-25.18ZM173.66 109.66l-56 56c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L112 148.69 162.34 98.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _sealCheck!!
    }

private var _sealCheck: ImageVector? = null
