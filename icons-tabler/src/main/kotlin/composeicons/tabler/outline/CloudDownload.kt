package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) return _cloudDownload!!
        _cloudDownload = tablerOutlineIcon(
            name = "CloudDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.CurveTo(20.932997f, 18.0f, 22.5f, 16.432997f, 22.5f, 14.5f),
                    PathNode.CurveTo(22.5f, 12.567003f, 20.932997f, 11.0f, 19.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.61365f, 8.266191f, 16.648678f, 5.602285f, 13.611111f, 5.05f),
                    PathNode.CurveTo(10.573545f, 4.497716f, 7.61365f, 6.266191f, 7.0f, 9.0f),
                    PathNode.CurveTo(4.801366f, 8.911931f, 2.845464f, 10.325658f, 2.333672f, 12.372825f),
                    PathNode.CurveTo(1.821881f, 14.419991f, 2.897563f, 16.527143f, 4.9f, 17.4f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(9.0f, 19.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(15.0f, 19.0f)
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
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
