package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaMask: ImageVector
    get() {
        if (_scubaMask != null) return _scubaMask!!
        _scubaMask = tablerOutlineIcon(
            name = "ScubaMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(16.552284f, 7.0f, 17.0f, 7.447716f, 17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 12.5f),
                    PathNode.CurveTo(17.0f, 13.880712f, 15.880712f, 15.0f, 14.5f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(12.895431f, 15.0f, 12.0f, 14.104569f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.0f, 11.895431f, 11.104569f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(8.895431f, 11.0f, 8.0f, 11.895431f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.0f, 14.104569f, 7.10457f, 15.0f, 6.0f, 15.0f),
                    PathNode.LineTo(5.5f, 15.0f),
                    PathNode.CurveTo(4.119288f, 15.0f, 3.0f, 13.880712f, 3.0f, 12.5f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 7.447716f, 3.447715f, 7.0f, 4.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 18.10457f, 10.895431f, 19.0f, 12.0f, 19.0f),
                    PathNode.LineTo(15.5f, 19.0f),
                    PathNode.CurveTo(18.537565f, 19.0f, 21.0f, 16.537565f, 21.0f, 13.5f),
                    PathNode.LineTo(21.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scubaMask!!
    }

private var _scubaMask: ImageVector? = null
