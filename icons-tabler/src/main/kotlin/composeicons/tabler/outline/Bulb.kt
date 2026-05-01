package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bulb: ImageVector
    get() {
        if (_bulb != null) return _bulb!!
        _bulb = tablerOutlineIcon(
            name = "Bulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.MoveTo(5.6f, 5.6f),
                    PathNode.LineTo(6.3f, 6.3f),
                    PathNode.MoveTo(18.4f, 5.6f),
                    PathNode.LineTo(17.7f, 6.3f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.CurveTo(7.278279f, 14.708709f, 6.576013f, 12.460572f, 7.256584f, 10.418861f),
                    PathNode.CurveTo(7.937154f, 8.377151f, 9.847848f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(14.152152f, 7.0f, 16.062847f, 8.377151f, 16.743416f, 10.418861f),
                    PathNode.CurveTo(17.423986f, 12.460572f, 16.721722f, 14.708709f, 15.0f, 16.0f),
                    PathNode.CurveTo(14.208162f, 16.783829f, 13.836827f, 17.897835f, 14.0f, 19.0f),
                    PathNode.CurveTo(14.0f, 20.10457f, 13.104569f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(10.895431f, 21.0f, 10.0f, 20.10457f, 10.0f, 19.0f),
                    PathNode.CurveTo(10.163173f, 17.897835f, 9.791838f, 16.783829f, 9.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.7f, 17.0f),
                    PathNode.LineTo(14.3f, 17.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bulb!!
    }

private var _bulb: ImageVector? = null
