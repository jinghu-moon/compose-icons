package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBunpo: ImageVector
    get() {
        if (_brandBunpo != null) return _brandBunpo!!
        _brandBunpo = tablerOutlineIcon(
            name = "BrandBunpo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.9f, 7.205f),
                    PathNode.CurveTo(5.103498f, 8.30204f, 6.452129f, 9.228382f, 7.908f, 9.958f),
                    PathNode.CurveTo(9.3415f, 10.595646f, 10.932137f, 10.792996f, 12.478f, 10.525f),
                    PathNode.CurveTo(13.978f, 10.195f, 15.385f, 9.525f, 16.599f, 8.569f),
                    PathNode.CurveTo(17.720943f, 7.772683f, 18.698948f, 6.790959f, 19.491f, 5.666f),
                    PathNode.CurveTo(20.094f, 4.726f, 20.236f, 3.9f, 19.975f, 3.435f),
                    PathNode.CurveTo(19.714f, 2.97f, 19.048f, 2.867f, 18.255f, 3.178f),
                    PathNode.CurveTo(17.246267f, 3.655312f, 16.355646f, 4.349915f, 15.647f, 5.212f),
                    PathNode.CurveTo(14.623181f, 6.39173f, 13.75354f, 7.696865f, 13.059f, 9.096f),
                    PathNode.CurveTo(12.229361f, 10.729488f, 11.529534f, 12.425723f, 10.966f, 14.169f),
                    PathNode.CurveTo(10.578178f, 15.303537f, 10.350322f, 16.486578f, 10.289f, 17.684f),
                    PathNode.CurveTo(10.219f, 18.436f, 10.359f, 19.194f, 10.694f, 19.868f),
                    PathNode.CurveTo(11.017f, 20.43f, 11.754f, 21.0f, 13.037f, 21.0f),
                    PathNode.CurveTo(16.511f, 21.0f, 18.13f, 17.47f, 18.5f, 15.38f),
                    PathNode.CurveTo(18.74f, 14.015f, 18.415f, 12.183f, 17.318f, 11.37f)
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
        return _brandBunpo!!
    }

private var _brandBunpo: ImageVector? = null
