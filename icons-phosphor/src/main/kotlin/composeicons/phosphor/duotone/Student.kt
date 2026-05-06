package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorDuotoneIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64 128 96 32 64 128 32Z"),
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
                pathData = parseSvgPathData("M226.53 56.41l-96-32c-1.642-.547-3.418-.547-5.06 0l-96 32c-2.965 1-5.075 3.637-5.4 6.75-.047 .278-.07 .559-.07 .84v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-68.9L73.59 86.29c-18.583 30.021-9.342 69.421 20.65 88.05-18 7.06-33.56 19.83-44.94 37.29-1.611 2.394-1.808 5.47-.515 8.05 1.293 2.58 3.874 4.264 6.756 4.406 2.882 .143 5.617-1.277 7.159-3.716C77.77 197.25 101.57 184 128 184c26.43 0 50.23 13.25 65.3 36.37 2.442 3.629 7.345 4.624 11.008 2.235 3.663-2.389 4.729-7.278 2.392-10.975-11.38-17.46-27-30.23-44.94-37.29 29.962-18.628 39.199-57.989 20.65-88L226.53 71.64c3.268-1.088 5.472-4.146 5.472-7.59 0-3.444-2.204-6.502-5.472-7.59ZM176 120c.006 20.835-13.429 39.294-33.257 45.693-19.827 6.399-41.519-.723-53.694-17.63C76.874 131.157 76.995 108.326 89.35 91.55l36.12 12c1.642 .547 3.418 .547 5.06 0l36.12-12c6.078 8.24 9.355 18.211 9.35 28.45ZM128 87.57 57.3 64 128 40.43 198.7 64Z"),
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
