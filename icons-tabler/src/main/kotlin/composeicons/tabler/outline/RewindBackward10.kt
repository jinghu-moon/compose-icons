package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindBackward10: ImageVector
    get() {
        if (_rewindBackward10 != null) return _rewindBackward10!!
        _rewindBackward10 = tablerOutlineIcon(
            name = "RewindBackward10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.LineTo(7.0f, 3.0f)
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
                    PathNode.MoveTo(15.997f, 17.918f),
                    PathNode.CurveTo(19.067345f, 17.392637f, 21.2255f, 14.605757f, 20.965824f, 11.501631f),
                    PathNode.CurveTo(20.70615f, 8.397506f, 18.114958f, 6.007932f, 15.0f, 6.0f),
                    PathNode.LineTo(4.0f, 6.0f)
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
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 20.0f)
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
                    PathNode.MoveTo(9.0f, 15.5f),
                    PathNode.LineTo(9.0f, 18.5f),
                    PathNode.CurveTo(9.0f, 19.328426f, 9.671573f, 20.0f, 10.5f, 20.0f),
                    PathNode.CurveTo(11.328427f, 20.0f, 12.0f, 19.328426f, 12.0f, 18.5f),
                    PathNode.LineTo(12.0f, 15.5f),
                    PathNode.CurveTo(12.0f, 14.671573f, 11.328427f, 14.0f, 10.5f, 14.0f),
                    PathNode.CurveTo(9.671573f, 14.0f, 9.0f, 14.671573f, 9.0f, 15.5f)
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
        return _rewindBackward10!!
    }

private var _rewindBackward10: ImageVector? = null
