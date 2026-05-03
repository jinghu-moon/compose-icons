package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraMoon: ImageVector
    get() {
        if (_cameraMoon != null) return _cameraMoon!!
        _cameraMoon = tablerOutlineIcon(
            name = "CameraMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.5f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.895431f, 20.0f, 3.0f, 19.10457f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 7.895431f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(7.10457f, 7.0f, 8.0f, 6.10457f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 4.447716f, 8.447715f, 4.0f, 9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(15.552285f, 4.0f, 16.0f, 4.447716f, 16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 6.10457f, 16.89543f, 7.0f, 18.0f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.10457f, 7.0f, 21.0f, 7.895431f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 12.5f)
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
                    PathNode.MoveTo(14.815f, 11.96f),
                    PathNode.CurveTo(14.314044f, 10.6027f, 12.915985f, 9.796053f, 11.490189f, 10.04166f),
                    PathNode.CurveTo(10.064392f, 10.287268f, 9.016809f, 11.515202f, 8.998868f, 12.961886f),
                    PathNode.CurveTo(8.980927f, 14.408571f, 9.997733f, 15.662107f, 11.417f, 15.943f)
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
                    PathNode.MoveTo(18.62f, 22.0f),
                    PathNode.CurveTo(16.62f, 22.0f, 15.0f, 20.42f, 15.0f, 18.47f),
                    PathNode.CurveTo(15.0f, 16.743f, 16.273f, 15.305f, 17.954f, 15.0f),
                    PathNode.CurveTo(17.794285f, 15.40222f, 17.712828f, 15.831232f, 17.714f, 16.264f),
                    PathNode.CurveTo(17.714f, 18.214f, 19.335f, 19.794f, 21.334f, 19.794f),
                    PathNode.QuadTo(21.676f, 19.794f, 22.0f, 19.734f),
                    PathNode.CurveTo(21.479f, 21.06f, 20.162f, 22.0f, 18.62f, 22.0f)
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
        return _cameraMoon!!
    }

private var _cameraMoon: ImageVector? = null
