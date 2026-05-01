package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKickstarter: ImageVector
    get() {
        if (_brandKickstarter != null) return _brandKickstarter!!
        _brandKickstarter = tablerOutlineIcon(
            name = "BrandKickstarter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 9.0f),
                    PathNode.LineTo(13.975f, 4.35f),
                    PathNode.CurveTo(14.59f, 3.45f, 15.38f, 3.0f, 16.352f, 3.0f),
                    PathNode.CurveTo(17.142f, 3.0f, 17.826f, 3.286f, 18.406f, 3.858f),
                    PathNode.CurveTo(18.982f, 4.432f, 19.272f, 5.114f, 19.272f, 5.912f),
                    PathNode.CurveTo(19.272f, 6.5f, 19.119f, 7.021f, 18.812f, 7.471f),
                    PathNode.LineTo(16.0f, 11.5f),
                    PathNode.LineTo(19.465f, 16.412f),
                    PathNode.CurveTo(19.821f, 16.872f, 20.0f, 17.412f, 20.0f, 18.025f),
                    PathNode.CurveTo(20.012144f, 18.809164f, 19.70834f, 19.56525f, 19.157f, 20.123f),
                    PathNode.CurveTo(18.596f, 20.707f, 17.915f, 21.0f, 17.117f, 21.0f),
                    PathNode.CurveTo(16.241f, 21.0f, 15.572f, 20.71f, 15.117f, 20.13f),
                    PathNode.LineTo(11.005f, 14.433f),
                    PathNode.LineTo(11.005f, 17.5f),
                    PathNode.CurveTo(11.005f, 18.376f, 10.692f, 19.19f, 10.394f, 19.675f),
                    PathNode.CurveTo(9.851f, 20.558f, 9.044f, 21.0f, 8.005f, 21.0f),
                    PathNode.CurveTo(7.061f, 21.0f, 6.252f, 20.673f, 5.734f, 20.026f),
                    PathNode.CurveTo(5.248f, 19.426f, 5.005f, 18.634f, 5.005f, 17.646f),
                    PathNode.LineTo(5.005f, 6.275f),
                    PathNode.CurveTo(5.005f, 5.341f, 5.252f, 4.569f, 5.745f, 3.962f),
                    PathNode.CurveTo(6.257f, 3.321f, 7.092f, 3.0f, 8.005f, 3.0f),
                    PathNode.CurveTo(8.873f, 3.0f, 9.826f, 3.321f, 10.405f, 3.962f),
                    PathNode.CurveTo(10.728f, 4.318f, 10.92f, 4.676f, 11.005f, 5.042f),
                    PathNode.CurveTo(11.057f, 5.266f, 11.005f, 5.685f, 11.005f, 6.302f),
                    PathNode.LineTo(11.005f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f)
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
        return _brandKickstarter!!
    }

private var _brandKickstarter: ImageVector? = null
