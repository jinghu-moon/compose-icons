package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = tablerOutlineIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.057f),
                    PathNode.CurveTo(10.1374f, 12.353326f, 10.34887f, 12.609227f, 10.614f, 12.8f),
                    PathNode.CurveTo(11.674f, 13.513f, 13.086f, 12.912f, 13.657f, 11.881f),
                    PathNode.CurveTo(14.496f, 10.368f, 13.635f, 8.513f, 12.132f, 7.801f),
                    PathNode.CurveTo(10.132f, 6.851f, 7.761f, 7.955f, 6.892f, 9.887f),
                    PathNode.CurveTo(5.797f, 12.319f, 7.182f, 15.135f, 9.602f, 16.133f),
                    PathNode.CurveTo(12.533f, 17.341f, 15.885f, 15.715f, 17.04f, 12.878f),
                    PathNode.CurveTo(18.4f, 9.535f, 16.483f, 5.744f, 13.144f, 4.468f),
                    PathNode.CurveTo(9.289f, 2.994f, 4.944f, 5.148f, 3.508f, 8.89f),
                    PathNode.CurveTo(1.878f, 13.143f, 4.331f, 17.914f, 8.59f, 19.466f),
                    PathNode.CurveTo(13.368f, 21.206f, 18.708f, 18.525f, 20.423f, 13.876f),
                    PathNode.CurveTo(20.75897f, 12.97362f, 20.953598f, 12.024776f, 21.0f, 11.063f)
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
