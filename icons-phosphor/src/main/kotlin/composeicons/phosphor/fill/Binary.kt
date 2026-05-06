package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorFillIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 168c0 4.75-1.11 9.16-3.05 12.11-1.425 2.476-4.094 3.97-6.95 3.89-9.72 0-10-14.36-10-16 0-4.74 1.11-9.16 3.05-12.11 1.425-2.476 4.094-3.97 6.95-3.89 9.72 0 10 14.36 10 16ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM140.84 75.58c.948 1.9 2.613 3.345 4.628 4.016 2.015 .672 4.213 .515 6.112-.436L156 76.94v35.06c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c.002-2.774-1.433-5.351-3.793-6.81-2.359-1.459-5.306-1.591-7.787-.35l-16 8c-1.9 .948-3.345 2.613-4.016 4.628-.672 2.015-.515 4.213 .436 6.112ZM112 144c.002-2.774-1.433-5.351-3.793-6.81-2.359-1.459-5.306-1.591-7.787-.35l-16 8c-3.954 1.977-5.557 6.786-3.58 10.74 1.977 3.954 6.786 5.557 10.74 3.58L96 156.94v35.06c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM128 88C128 69.16 117.31 56 102 56 86.69 56 76 69.16 76 88c0 18.84 10.69 32 26 32 15.31 0 26-13.16 26-32ZM184 168c0-18.84-10.69-32-26-32-15.31 0-26 13.16-26 32 0 18.84 10.69 32 26 32 15.31 0 26-13.16 26-32ZM102 72c-2.873-.098-5.566 1.398-7 3.89-1.94 3-3 7.37-3 12.11 0 1.64 .28 16 10 16 2.873 .098 5.566-1.398 7-3.89 1.94-3 3-7.36 3-12.11 0-1.64-.28-16-10-16Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
