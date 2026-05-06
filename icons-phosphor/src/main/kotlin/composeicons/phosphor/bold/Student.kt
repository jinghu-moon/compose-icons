package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorBoldIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.79 52.62l-96-32c-2.459-.83-5.121-.83-7.58 0l-96 32C23.522 54.173 20.264 58.439 20 63.37c-.011 .21-.011 .42 0 .63v80c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-63.35l23.71 7.9c-15.184 29.065-7.434 64.828 18.42 85C69.734 181.635 55.858 194.045 46 209.44c-2.416 3.591-2.711 8.205-.772 12.074 1.939 3.87 5.811 6.395 10.134 6.61 4.323 .214 8.426-1.915 10.739-5.574C80.37 200.59 103 188 128 188c25 0 47.63 12.59 61.95 34.55 2.312 3.659 6.416 5.789 10.739 5.574 4.323-.214 8.195-2.74 10.134-6.61 1.939-3.87 1.644-8.483-.772-12.074-9.868-15.413-23.762-27.834-40.18-35.92 25.854-20.172 33.604-55.935 18.42-85L227.79 75.35c4.894-1.637 8.193-6.22 8.193-11.38 0-5.16-3.299-9.743-8.193-11.38ZM128 44.62 186.05 64 128 83.35 70 64ZM172 120c.004 18.745-11.869 35.433-29.578 41.577-17.709 6.144-37.366 .394-48.973-14.324C81.843 132.534 80.836 112.078 90.94 96.29l33.27 11.09c2.459 .827 5.121 .827 7.58 0L165.06 96.29c4.538 7.075 6.947 15.305 6.94 23.71Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
