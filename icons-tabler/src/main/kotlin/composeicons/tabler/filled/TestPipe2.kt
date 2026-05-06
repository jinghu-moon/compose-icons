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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1v14c0 2.209-1.791 4-4 4C9.791 22 8 20.209 8 18v-14C7.448 4 7 3.552 7 3 7 2.448 7.448 2 8 2ZM14 4h-4v7h4Z"),
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
        return _testPipe2!!
    }

private var _testPipe2: ImageVector? = null
