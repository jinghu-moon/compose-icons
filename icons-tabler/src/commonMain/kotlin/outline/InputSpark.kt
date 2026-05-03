package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InputSpark: ImageVector
    get() {
        if (_inputSpark != null) return _inputSpark!!
        _inputSpark = tablerOutlineIcon(
            name = "InputSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 22.5f),
                    PathNode.CurveTo(19.418587f, 20.769625f, 20.769625f, 19.418587f, 22.5f, 19.0f),
                    PathNode.CurveTo(20.769625f, 18.581413f, 19.418587f, 17.230375f, 19.0f, 15.5f),
                    PathNode.CurveTo(18.581413f, 17.230375f, 17.230375f, 18.581413f, 15.5f, 19.0f),
                    PathNode.CurveTo(17.230375f, 19.418587f, 18.581413f, 20.769625f, 19.0f, 22.5f)
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
                    PathNode.MoveTo(20.0f, 11.5f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 7.895431f, 19.10457f, 7.0f, 18.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(4.895431f, 7.0f, 4.0f, 7.895431f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.CurveTo(4.0f, 15.104569f, 4.895431f, 16.0f, 6.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f)
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
        return _inputSpark!!
    }

private var _inputSpark: ImageVector? = null
