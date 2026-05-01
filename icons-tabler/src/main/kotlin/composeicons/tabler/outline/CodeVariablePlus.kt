package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CodeVariablePlus: ImageVector
    get() {
        if (_codeVariablePlus != null) return _codeVariablePlus!!
        _codeVariablePlus = tablerOutlineIcon(
            name = "CodeVariablePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 16.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(4.895431f, 16.0f, 4.0f, 15.104569f, 4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 8.895431f, 4.895431f, 8.0f, 6.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(19.10457f, 8.0f, 20.0f, 8.895431f, 20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 11.0f)
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
                    PathNode.MoveTo(16.0f, 18.0f),
                    PathNode.LineTo(22.0f, 18.0f)
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
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 21.0f)
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
        return _codeVariablePlus!!
    }

private var _codeVariablePlus: ImageVector? = null
