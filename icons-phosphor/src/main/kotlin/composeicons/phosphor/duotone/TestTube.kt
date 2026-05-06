package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorDuotoneIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M167.18 140.82 94.77 213.23c-14.36 14.359-37.64 14.359-52 0h0c-14.359-14.359-14.359-37.64 0-52l30-30c9.37-3.65 25.78-6.36 47.18 4.82 21.4 11.18 37.86 8.42 47.23 4.77Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M237.66 86.34l-60-60C176.159 24.838 174.123 23.994 172 23.994c-2.123 0-4.159 .844-5.66 2.346L37.11 155.57c-17.485 17.485-17.485 45.835 0 63.32 17.485 17.485 45.835 17.485 63.32 0L212.32 107l22.21-7.4c2.632-.876 4.623-3.052 5.261-5.752 .638-2.7-.169-5.537-2.131-7.498ZM89.11 207.57c-11.292 10.883-29.219 10.717-40.308-.372C37.713 196.109 37.547 178.182 48.43 166.89L77.23 138.09c8.47-2.9 21.75-4 39.07 5 10.6 5.54 20.18 8 28.56 8.73ZM205.47 92.41c-1.179 .392-2.251 1.052-3.13 1.93l-39.57 39.57c-8.47 2.9-21.75 4-39.07-5-10.6-5.54-20.18-8-28.56-8.73L172 43.31l45.19 45.19Z"),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
