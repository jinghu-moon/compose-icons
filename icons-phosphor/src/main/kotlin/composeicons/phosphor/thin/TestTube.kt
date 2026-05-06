package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorThinIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 89.18l-60-60c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L39.94 158.41c-15.516 15.991-15.325 41.475 .429 57.231 15.754 15.756 41.238 15.952 57.231 .439L210.16 103.5l23.1-7.7c1.315-.437 2.31-1.524 2.63-2.873 .32-1.348-.081-2.766-1.06-3.747ZM91.94 210.42c-12.799 12.796-33.549 12.794-46.345-.005C32.799 197.616 32.801 176.866 45.6 164.07L75 134.63c9.2-3.38 23.94-5.08 43.11 4.93 12.09 6.31 22.74 8.48 31.66 8.48 1.64 0 3.2-.09 4.73-.22ZM206.74 96.21c-.594 .207-1.131 .55-1.57 1L165 137.39c-9.2 3.38-23.94 5.08-43.11-4.93-14.3-7.47-26.58-9.13-36.38-8.27L172 37.66l52.6 52.6Z"),
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
