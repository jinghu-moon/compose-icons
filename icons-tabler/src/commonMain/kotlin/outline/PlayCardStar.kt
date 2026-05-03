package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) return _playCardStar!!
        _playCardStar = tablerOutlineIcon(
            name = "PlayCardStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(18.10457f, 3.0f, 19.0f, 3.895431f, 19.0f, 5.0f)
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(8.01f, 6.0f)
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
                    PathNode.MoveTo(16.0f, 18.0f),
                    PathNode.LineTo(16.01f, 18.0f)
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
                    PathNode.MoveTo(11.75f, 14.112f),
                    PathNode.LineTo(10.12f, 14.965f),
                    PathNode.CurveTo(10.021572f, 15.015667f, 9.903027f, 15.006748f, 9.813288f, 14.941924f),
                    PathNode.CurveTo(9.723548f, 14.877101f, 9.67783f, 14.767364f, 9.695f, 14.658f),
                    PathNode.LineTo(10.005f, 12.85f),
                    PathNode.LineTo(8.688f, 11.57f),
                    PathNode.CurveTo(8.607783f, 11.492324f, 8.578889f, 11.375703f, 8.61356f, 11.269562f),
                    PathNode.CurveTo(8.648232f, 11.16342f, 8.740398f, 11.086345f, 8.851f, 11.071f),
                    PathNode.LineTo(10.671f, 10.807f),
                    PathNode.LineTo(11.486f, 9.163f),
                    PathNode.CurveTo(11.535584f, 9.062803f, 11.637706f, 8.999398f, 11.7495f, 8.999398f),
                    PathNode.CurveTo(11.861295f, 8.999398f, 11.963415f, 9.062803f, 12.013f, 9.163f),
                    PathNode.LineTo(12.827f, 10.807f),
                    PathNode.LineTo(14.647f, 11.071f),
                    PathNode.CurveTo(14.757774f, 11.086027f, 14.850248f, 11.162979f, 14.885152f, 11.269179f),
                    PathNode.CurveTo(14.920055f, 11.375381f, 14.891262f, 11.492188f, 14.811f, 11.57f),
                    PathNode.LineTo(13.493f, 12.85f),
                    PathNode.LineTo(13.803f, 14.657f),
                    PathNode.CurveTo(13.822241f, 14.766958f, 13.777108f, 14.878264f, 13.686719f, 14.94377f),
                    PathNode.CurveTo(13.596331f, 15.009275f, 13.476504f, 15.017515f, 13.378f, 14.965f),
                    PathNode.LineTo(11.75f, 14.112f)
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
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
