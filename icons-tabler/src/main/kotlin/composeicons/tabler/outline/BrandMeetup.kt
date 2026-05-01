package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMeetup: ImageVector
    get() {
        if (_brandMeetup != null) return _brandMeetup!!
        _brandMeetup = tablerOutlineIcon(
            name = "BrandMeetup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.455f, 10.82f),
                    PathNode.CurveTo(6.39f, 8.657f, 8.5f, 7.0f, 11.0f, 7.0f),
                    PathNode.CurveTo(13.104f, 7.0f, 13.844f, 8.915f, 13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 17.0f)
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
                    PathNode.MoveTo(6.981f, 7.0f),
                    PathNode.LineTo(3.0f, 16.914f)
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
                    PathNode.MoveTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.937f, 8.84f, 16.071f, 7.198f, 18.42f, 7.028f),
                    PathNode.CurveTo(20.524f, 7.028f, 21.548f, 8.734f, 20.704f, 10.82f),
                    PathNode.LineTo(18.25f, 16.914f),
                    PathNode.CurveTo(17.397f, 18.59f, 19.0f, 19.5f, 21.0f, 19.0f)
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
        return _brandMeetup!!
    }

private var _brandMeetup: ImageVector? = null
