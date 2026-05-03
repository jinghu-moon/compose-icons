package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) return _cloudExclamation!!
        _cloudExclamation = tablerOutlineIcon(
            name = "CloudExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 18.004f),
                    PathNode.LineTo(6.657f, 18.004f),
                    PathNode.CurveTo(4.085f, 18.0f, 2.0f, 15.993f, 2.0f, 13.517f),
                    PathNode.CurveTo(2.0f, 11.042f, 4.085f, 9.035f, 6.657f, 9.035f),
                    PathNode.CurveTo(7.05f, 7.273f, 8.451f, 5.835f, 10.332f, 5.262f),
                    PathNode.CurveTo(12.212f, 4.69f, 14.288f, 5.069f, 15.776f, 6.262f),
                    PathNode.CurveTo(17.264f, 7.452f, 17.938f, 9.269f, 17.546f, 11.031f),
                    PathNode.LineTo(18.536f, 11.031f),
                    PathNode.CurveTo(19.91f, 11.031f, 21.098f, 11.836f, 21.657f, 13.003f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.01f)
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
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null
