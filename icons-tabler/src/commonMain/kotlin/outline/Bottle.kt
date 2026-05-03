package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bottle: ImageVector
    get() {
        if (_bottle != null) return _bottle!!
        _bottle = tablerOutlineIcon(
            name = "Bottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.CurveTo(14.0f, 2.447715f, 13.552285f, 2.0f, 13.0f, 2.0f),
                    PathNode.LineTo(11.0f, 2.0f),
                    PathNode.CurveTo(10.447715f, 2.0f, 10.0f, 2.447715f, 10.0f, 3.0f),
                    PathNode.LineTo(10.0f, 5.0f)
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
                    PathNode.MoveTo(14.0f, 3.5f),
                    PathNode.CurveTo(14.0f, 5.126f, 14.507f, 6.712f, 15.45f, 8.037f),
                    PathNode.LineTo(15.5f, 8.107001f),
                    PathNode.CurveTo(16.47579f, 9.477698f, 17.000101f, 11.118448f, 17.0f, 12.801f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.10457f, 16.10457f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(7.895431f, 21.0f, 7.0f, 20.10457f, 7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 12.8f),
                    PathNode.CurveTo(7.0f, 11.118f, 7.524f, 9.478f, 8.5f, 8.107001f),
                    PathNode.LineTo(8.55f, 8.037f),
                    PathNode.CurveTo(9.493172f, 6.712147f, 10.000004f, 5.126287f, 10.0f, 3.5f)
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
                    PathNode.MoveTo(7.0f, 14.803f),
                    PathNode.CurveTo(7.400004f, 14.631001f, 7.74568f, 14.353422f, 8.0f, 14.0f),
                    PathNode.CurveTo(8.461176f, 13.357492f, 9.209289f, 12.983437f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.790711f, 12.983437f, 11.538824f, 13.357492f, 12.0f, 14.0f),
                    PathNode.CurveTo(12.461176f, 14.642508f, 13.209289f, 15.016563f, 14.0f, 15.0f),
                    PathNode.CurveTo(14.790711f, 15.016563f, 15.538824f, 14.642508f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.254053f, 13.645842f, 16.599754f, 13.367552f, 17.0f, 13.195f)
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
        return _bottle!!
    }

private var _bottle: ImageVector? = null
