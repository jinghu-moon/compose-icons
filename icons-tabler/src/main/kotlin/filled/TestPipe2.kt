package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TestPipe2: ImageVector
    get() {
        if (_testPipe2 != null) return _testPipe2!!
        _testPipe2 = tablerFilledIcon(
            name = "TestPipe2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 C 16.552 2.000 17.000 2.448 17.000 3.000 C 17.000 3.552 16.552 4.000 16.000 4.000 L 16.000 18.000 C 16.000 20.209 14.209 22.000 12.000 22.000 C 9.791 22.000 8.000 20.209 8.000 18.000 L 8.000 4.000 C 7.448 4.000 7.000 3.552 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 ZM 14.000 4.000 L 10.000 4.000 L 10.000 11.000 L 14.000 11.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _testPipe2!!
    }

private var _testPipe2: ImageVector? = null
