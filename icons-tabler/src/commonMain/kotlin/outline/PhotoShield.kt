package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoShield: ImageVector
    get() {
        if (_photoShield != null) return _photoShield!!
        _photoShield = tablerOutlineIcon(
            name = "PhotoShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(15.01f, 8.0f)
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
                    PathNode.MoveTo(11.5f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(5.343146f, 20.0f, 4.0f, 18.656855f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 5.343146f, 5.343146f, 4.0f, 7.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(18.656855f, 4.0f, 20.0f, 5.343146f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 11.0f)
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
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.928f, 10.107f, 10.072f, 10.107f, 11.0f, 11.0f),
                    PathNode.LineTo(12.5f, 12.5f)
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
                    PathNode.MoveTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 20.0f, 19.5f, 22.0f, 18.5f, 22.0f),
                    PathNode.CurveTo(17.5f, 22.0f, 15.0f, 20.0f, 15.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 16.0f, 17.5f, 15.5f, 18.5f, 14.5f),
                    PathNode.CurveTo(19.5f, 15.5f, 21.0f, 16.0f, 22.0f, 16.0f)
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
        return _photoShield!!
    }

private var _photoShield: ImageVector? = null
