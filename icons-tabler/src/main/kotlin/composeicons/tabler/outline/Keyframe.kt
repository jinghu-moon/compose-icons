package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Keyframe: ImageVector
    get() {
        if (_keyframe != null) return _keyframe!!
        _keyframe = tablerOutlineIcon(
            name = "Keyframe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.225f, 18.412f),
                    PathNode.CurveTo(12.924751f, 18.78083f, 12.475575f, 18.996435f, 12.0f, 19.0f),
                    PathNode.CurveTo(11.532f, 19.0f, 11.086f, 18.786f, 10.775f, 18.412f),
                    PathNode.LineTo(6.414f, 13.164f),
                    PathNode.CurveTo(5.862252f, 12.486075f, 5.862252f, 11.513925f, 6.414f, 10.836f),
                    PathNode.LineTo(10.775f, 5.588f),
                    PathNode.CurveTo(11.075249f, 5.21917f, 11.524425f, 5.003566f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.468f, 5.0f, 12.914f, 5.214f, 13.225f, 5.588f),
                    PathNode.LineTo(17.586f, 10.836f),
                    PathNode.CurveTo(18.137749f, 11.513925f, 18.137749f, 12.486075f, 17.586f, 13.164f),
                    PathNode.LineTo(13.225f, 18.412f)
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
        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
