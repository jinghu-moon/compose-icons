package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = tablerFilledIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(14.761424f, 2.0f, 17.0f, 4.238577f, 17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 9.761424f, 14.761424f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(9.238576f, 12.0f, 7.0f, 9.761424f, 7.0f, 7.0f),
                    PathNode.LineTo(7.005f, 6.783f),
                    PathNode.CurveTo(7.121178f, 4.108605f, 9.323082f, 2.000155f, 12.0f, 2.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.CurveTo(16.761423f, 14.0f, 19.0f, 16.238577f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(19.0f, 21.10457f, 18.10457f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.895431f, 22.0f, 5.0f, 21.10457f, 5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 16.238577f, 7.238577f, 14.0f, 10.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
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
        return _user!!
    }

private var _user: ImageVector? = null
