package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Keyframes: ImageVector
    get() {
        if (_keyframes != null) return _keyframes!!
        _keyframes = tablerOutlineIcon(
            name = "Keyframes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.225f, 18.412f),
                    PathNode.CurveTo(8.924751f, 18.78083f, 8.475575f, 18.996435f, 8.0f, 19.0f),
                    PathNode.CurveTo(7.532f, 19.0f, 7.086f, 18.786f, 6.775f, 18.412f),
                    PathNode.LineTo(2.414f, 13.164f),
                    PathNode.CurveTo(1.862252f, 12.486075f, 1.862252f, 11.513925f, 2.414f, 10.836f),
                    PathNode.LineTo(6.775f, 5.588f),
                    PathNode.CurveTo(7.075249f, 5.21917f, 7.524425f, 5.003566f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.468f, 5.0f, 8.914f, 5.214f, 9.225f, 5.588f),
                    PathNode.LineTo(13.586f, 10.836f),
                    PathNode.CurveTo(14.137749f, 11.513925f, 14.137749f, 12.486075f, 13.586f, 13.164f),
                    PathNode.LineTo(9.225f, 18.412f)
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.LineTo(21.586f, 10.836f),
                    PathNode.CurveTo(22.137749f, 11.513925f, 22.137749f, 12.486075f, 21.586f, 13.164f),
                    PathNode.LineTo(17.0f, 19.0f)
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
                    PathNode.MoveTo(13.0f, 5.0f),
                    PathNode.LineTo(17.586f, 10.836f),
                    PathNode.CurveTo(18.137749f, 11.513925f, 18.137749f, 12.486075f, 17.586f, 13.164f),
                    PathNode.LineTo(13.0f, 19.0f)
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
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
