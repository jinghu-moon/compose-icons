package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandApplePodcast: ImageVector
    get() {
        if (_brandApplePodcast != null) return _brandApplePodcast!!
        _brandApplePodcast = tablerOutlineIcon(
            name = "BrandApplePodcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.364f, 18.364f),
                    PathNode.CurveTo(21.878687f, 14.84927f, 21.878664f, 9.150805f, 18.363949f, 5.636104f),
                    PathNode.CurveTo(14.849233f, 2.121403f, 9.150767f, 2.121403f, 5.636052f, 5.636104f),
                    PathNode.CurveTo(2.121336f, 9.150805f, 2.121313f, 14.84927f, 5.636f, 18.364f)
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
                    PathNode.MoveTo(11.766f, 22.0f),
                    PathNode.LineTo(12.234f, 22.0f),
                    PathNode.CurveTo(13.242839f, 22.00022f, 14.093904f, 21.249054f, 14.219f, 20.248f),
                    PathNode.LineTo(14.719f, 16.248f),
                    PathNode.CurveTo(14.790142f, 15.678702f, 14.613372f, 15.106267f, 14.233624f, 14.676206f),
                    PathNode.CurveTo(13.853877f, 14.246143f, 13.307726f, 13.999875f, 12.734f, 14.0f),
                    PathNode.LineTo(11.266f, 14.0f),
                    PathNode.CurveTo(10.692274f, 13.999875f, 10.146123f, 14.246143f, 9.766376f, 14.676206f),
                    PathNode.CurveTo(9.386628f, 15.106267f, 9.209858f, 15.678702f, 9.281f, 16.248f),
                    PathNode.LineTo(9.781f, 20.248f),
                    PathNode.CurveTo(9.906096f, 21.249054f, 10.757161f, 22.00022f, 11.766f, 22.0f)
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
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 10.104569f, 10.895431f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(13.104569f, 11.0f, 14.0f, 10.104569f, 14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 7.895431f, 13.104569f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.895431f, 7.0f, 10.0f, 7.895431f, 10.0f, 9.0f)
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
        return _brandApplePodcast!!
    }

private var _brandApplePodcast: ImageVector? = null
