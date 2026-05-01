package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.552284f, 2.0f, 17.0f, 2.447715f, 17.0f, 3.0f),
                    PathNode.CurveTo(17.0f, 3.552285f, 16.552284f, 4.0f, 16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(16.0f, 20.209139f, 14.209139f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(9.790861f, 22.0f, 8.0f, 20.209139f, 8.0f, 18.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(7.447716f, 4.0f, 7.0f, 3.552285f, 7.0f, 3.0f),
                    PathNode.CurveTo(7.0f, 2.447715f, 7.447716f, 2.0f, 8.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _testPipe2!!
    }

private var _testPipe2: ImageVector? = null
