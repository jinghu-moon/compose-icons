package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) return _eyeOff!!
        _eyeOff = tablerOutlineIcon(
            name = "EyeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.585f, 10.587f),
                    PathNode.CurveTo(9.80407f, 11.368207f, 9.804294f, 12.634569f, 10.5855f, 13.4155f),
                    PathNode.CurveTo(11.366707f, 14.19643f, 12.633069f, 14.196207f, 13.414f, 13.415f)
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
                    PathNode.MoveTo(16.681f, 16.673f),
                    PathNode.CurveTo(15.27824f, 17.55065f, 13.654655f, 18.010914f, 12.0f, 18.0f),
                    PathNode.CurveTo(8.4f, 18.0f, 5.4f, 16.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(4.272f, 9.88f, 5.712f, 8.322f, 7.32f, 7.326f),
                    PathNode.MoveTo(10.18f, 6.18f),
                    PathNode.CurveTo(10.779037f, 6.058731f, 11.388813f, 5.998424f, 12.0f, 6.0f),
                    PathNode.CurveTo(15.6f, 6.0f, 18.6f, 8.0f, 21.0f, 12.0f),
                    PathNode.CurveTo(20.334f, 13.11f, 19.621f, 14.067f, 18.862f, 14.87f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
