package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = tablerOutlineIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 20.10457f, 9.895431f, 21.0f, 11.0f, 21.0f),
                    PathNode.CurveTo(12.104569f, 21.0f, 13.0f, 20.10457f, 13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 17.89543f, 12.104569f, 17.0f, 11.0f, 17.0f),
                    PathNode.CurveTo(9.895431f, 17.0f, 9.0f, 17.89543f, 9.0f, 19.0f)
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
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.LineTo(9.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(20.0f, 5.0f)
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
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(19.0f, 11.0f)
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
                    PathNode.MoveTo(9.592f, 4.695f),
                    PathNode.LineTo(12.898f, 6.799f),
                    PathNode.CurveTo(13.189893f, 6.984599f, 13.395783f, 7.278874f, 13.470104f, 7.616697f),
                    PathNode.CurveTo(13.544426f, 7.954521f, 13.481049f, 8.308034f, 13.294f, 8.599f),
                    PathNode.LineTo(10.2f, 13.41f),
                    PathNode.CurveTo(9.813068f, 14.012378f, 9.011918f, 14.188523f, 8.408f, 13.804f),
                    PathNode.LineTo(5.102f, 11.7f),
                    PathNode.CurveTo(4.810107f, 11.514401f, 4.604217f, 11.220126f, 4.529896f, 10.882303f),
                    PathNode.CurveTo(4.455575f, 10.544479f, 4.518952f, 10.190966f, 4.706f, 9.9f),
                    PathNode.LineTo(7.8f, 5.09f),
                    PathNode.CurveTo(8.186932f, 4.487623f, 8.988082f, 4.311477f, 9.592f, 4.696f)
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
