package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = tablerOutlineIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 17.656855f, 3.343146f, 19.0f, 5.0f, 19.0f),
                    PathNode.CurveTo(6.656854f, 19.0f, 8.0f, 17.656855f, 8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 14.343145f, 6.656854f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(3.343146f, 13.0f, 2.0f, 14.343145f, 2.0f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.656855f, 17.343145f, 19.0f, 19.0f, 19.0f),
                    PathNode.CurveTo(20.656855f, 19.0f, 22.0f, 17.656855f, 22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 14.343145f, 20.656855f, 13.0f, 19.0f, 13.0f),
                    PathNode.CurveTo(17.343145f, 13.0f, 16.0f, 14.343145f, 16.0f, 16.0f)
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
                    PathNode.MoveTo(7.5f, 14.0f),
                    PathNode.LineTo(12.5f, 14.0f),
                    PathNode.LineTo(16.5f, 10.0f),
                    PathNode.LineTo(6.0f, 10.0f),
                    PathNode.MoveTo(7.5f, 14.0f),
                    PathNode.LineTo(11.5f, 10.0f)
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
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(16.5f, 9.0f),
                    PathNode.LineTo(18.5f, 13.0f)
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
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
