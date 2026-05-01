package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppleArcade: ImageVector
    get() {
        if (_brandAppleArcade != null) return _brandAppleArcade!!
        _brandAppleArcade = tablerOutlineIcon(
            name = "BrandAppleArcade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 6.10457f, 10.895431f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.104569f, 7.0f, 14.0f, 6.10457f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.895431f, 13.104569f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.895431f, 3.0f, 10.0f, 3.895431f, 10.0f, 5.0f)
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
                    PathNode.MoveTo(20.0f, 12.5f),
                    PathNode.LineTo(20.0f, 17.25f),
                    PathNode.CurveTo(20.006544f, 17.361101f, 19.987736f, 17.472237f, 19.945f, 17.575f),
                    PathNode.CurveTo(19.878258f, 17.735842f, 19.754274f, 17.86624f, 19.597f, 17.941f),
                    PathNode.LineTo(14.135f, 20.521f),
                    PathNode.CurveTo(12.783234f, 21.159323f, 11.216766f, 21.159323f, 9.865f, 20.521f),
                    PathNode.LineTo(4.403f, 17.941f),
                    PathNode.CurveTo(4.139128f, 17.81594f, 3.979663f, 17.541151f, 4.002f, 17.25f),
                    PathNode.LineTo(4.002f, 12.5f)
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
                    PathNode.MoveTo(4.431f, 12.216f),
                    PathNode.LineTo(10.065f, 9.884f),
                    PathNode.CurveTo(11.304147f, 9.371749f, 12.695853f, 9.371749f, 13.935f, 9.884f),
                    PathNode.LineTo(19.569f, 12.216f),
                    PathNode.CurveTo(19.82407f, 12.320226f, 19.992998f, 12.565845f, 19.999077f, 12.841319f),
                    PathNode.CurveTo(20.005156f, 13.116795f, 19.847223f, 13.369625f, 19.597f, 13.485f),
                    PathNode.LineTo(14.135f, 16.028f),
                    PathNode.CurveTo(12.781251f, 16.65742f, 11.218749f, 16.65742f, 9.865f, 16.028f),
                    PathNode.LineTo(4.403f, 13.485f),
                    PathNode.CurveTo(4.151361f, 13.370553f, 3.992148f, 13.117143f, 3.998242f, 12.840768f),
                    PathNode.CurveTo(4.004335f, 12.564392f, 4.174561f, 12.318245f, 4.431f, 12.215f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 13.0f)
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
        return _brandAppleArcade!!
    }

private var _brandAppleArcade: ImageVector? = null
