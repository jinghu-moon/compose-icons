package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVivaldi: ImageVector
    get() {
        if (_brandVivaldi != null) return _brandVivaldi!!
        _brandVivaldi = tablerOutlineIcon(
            name = "BrandVivaldi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.648f, 6.808f),
                    PathNode.CurveTo(19.18f, 11.088f, 16.711f, 15.368f, 14.24f, 19.644f),
                    PathNode.CurveTo(13.843f, 20.421f, 12.874f, 20.945f, 12.0f, 21.0f),
                    PathNode.CurveTo(11.038f, 21.102f, 10.3f, 20.598f, 9.846f, 19.746f),
                    PathNode.CurveTo(8.283f, 17.062f, 6.74f, 14.372f, 5.186f, 11.682f),
                    PathNode.CurveTo(4.243f, 10.049f, 3.295f, 8.416f, 2.356f, 6.777f),
                    PathNode.CurveTo(1.903694f, 6.02854f, 1.880874f, 5.096704f, 2.296f, 4.327f),
                    PathNode.CurveTo(2.712574f, 3.55478f, 3.504425f, 3.058401f, 4.381f, 3.02f),
                    PathNode.CurveTo(5.332f, 2.955f, 6.231f, 3.458f, 6.668f, 4.301f),
                    PathNode.CurveTo(7.365f, 5.491f, 8.711f, 8.131f, 9.218f, 8.983f),
                    PathNode.CurveTo(9.883256f, 10.183723f, 11.128254f, 10.948855f, 12.5f, 11.0f),
                    PathNode.CurveTo(14.626f, 11.133f, 16.474f, 10.05f, 16.71f, 7.942f),
                    PathNode.CurveTo(16.71f, 7.778f, 16.938f, 4.764f, 17.556f, 3.98f),
                    PathNode.CurveTo(18.175f, 3.196f, 19.196f, 2.825f, 20.162f, 3.087f),
                    PathNode.CurveTo(21.1262f, 3.347181f, 21.840822f, 4.159505f, 21.976f, 5.149f),
                    PathNode.CurveTo(22.056f, 5.73f, 21.935f, 6.32f, 21.633f, 6.823f)
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
        return _brandVivaldi!!
    }

private var _brandVivaldi: ImageVector? = null
