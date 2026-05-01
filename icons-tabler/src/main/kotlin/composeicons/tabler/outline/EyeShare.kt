package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeShare: ImageVector
    get() {
        if (_eyeShare != null) return _eyeShare!!
        _eyeShare = tablerOutlineIcon(
            name = "EyeShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f)
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
                    PathNode.MoveTo(12.597f, 17.981f),
                    PathNode.CurveTo(12.39825f, 17.99361f, 12.19915f, 17.999949f, 12.0f, 18.0f),
                    PathNode.CurveTo(8.4f, 18.0f, 5.4f, 16.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(5.4f, 8.0f, 8.4f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(15.6f, 6.0f, 18.6f, 8.0f, 21.0f, 12.0f),
                    PathNode.CurveTo(20.795f, 12.342f, 20.585f, 12.67f, 20.37f, 12.983f)
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
                    PathNode.MoveTo(16.0f, 22.0f),
                    PathNode.LineTo(21.0f, 17.0f)
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
                    PathNode.MoveTo(21.0f, 21.5f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.LineTo(16.5f, 17.0f)
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
        return _eyeShare!!
    }

private var _eyeShare: ImageVector? = null
