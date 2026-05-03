package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScriptMinus: ImageVector
    get() {
        if (_scriptMinus != null) return _scriptMinus!!
        _scriptMinus = tablerOutlineIcon(
            name = "ScriptMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.LineTo(21.0f, 19.0f)
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
                    PathNode.MoveTo(14.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.343146f, 20.0f, 3.0f, 18.656855f, 3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 15.343145f, 4.343146f, 14.0f, 6.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(15.343145f, 14.0f, 14.0f, 15.343145f, 14.0f, 17.0f),
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 4.895431f, 20.10457f, 4.0f, 19.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(7.895431f, 4.0f, 7.0f, 4.895431f, 7.0f, 6.0f),
                    PathNode.LineTo(7.0f, 14.0f)
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
        return _scriptMinus!!
    }

private var _scriptMinus: ImageVector? = null
