package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagPlus: ImageVector
    get() {
        if (_tagPlus != null) return _tagPlus!!
        _tagPlus = tablerOutlineIcon(
            name = "TagPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.5f, 7.5f),
                    PathNode.CurveTo(6.5f, 8.052285f, 6.947716f, 8.5f, 7.5f, 8.5f),
                    PathNode.CurveTo(8.052285f, 8.5f, 8.5f, 8.052285f, 8.5f, 7.5f),
                    PathNode.CurveTo(8.5f, 6.947716f, 8.052285f, 6.5f, 7.5f, 6.5f),
                    PathNode.CurveTo(6.947716f, 6.5f, 6.5f, 6.947716f, 6.5f, 7.5f)
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
                    PathNode.MoveTo(21.002f, 13.0f),
                    PathNode.CurveTo(21.002f, 12.383f, 20.767f, 11.767f, 20.296f, 11.296f),
                    PathNode.LineTo(12.586f, 3.586f),
                    PathNode.CurveTo(12.211f, 3.211f, 11.702f, 3.0f, 11.172f, 3.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 11.172f),
                    PathNode.CurveTo(3.0f, 11.702f, 3.211f, 12.211f, 3.586f, 12.586f),
                    PathNode.LineTo(11.296f, 20.296f),
                    PathNode.CurveTo(11.767f, 20.766f, 12.383f, 21.002f, 13.0f, 21.002f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _tagPlus!!
    }

private var _tagPlus: ImageVector? = null
