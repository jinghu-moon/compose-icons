package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellQuestion: ImageVector
    get() {
        if (_bellQuestion != null) return _bellQuestion!!
        _bellQuestion = tablerOutlineIcon(
            name = "BellQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(5.105114f, 16.374203f, 5.847386f, 15.260797f, 6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.121369f, 8.414246f, 7.659831f, 6.106554f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 3.895431f, 10.895431f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.104569f, 3.0f, 14.0f, 3.895431f, 14.0f, 5.0f),
                    PathNode.CurveTo(16.34017f, 6.106554f, 17.878632f, 8.414246f, 18.0f, 11.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(8.998562f, 19.51848f, 10.131952f, 20.798586f, 11.639425f, 20.981092f),
                    PathNode.CurveTo(13.146899f, 21.1636f, 14.553027f, 20.190952f, 14.914f, 18.716f)
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
                    PathNode.MoveTo(19.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.01f)
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
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.922588f, 18.997053f, 20.72383f, 18.36431f, 20.940554f, 17.467531f),
                    PathNode.CurveTo(21.157278f, 16.570755f, 20.733423f, 15.64194f, 19.914f, 15.218f),
                    PathNode.CurveTo(19.094873f, 14.798393f, 18.094618f, 14.998527f, 17.5f, 15.701f)
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
        return _bellQuestion!!
    }

private var _bellQuestion: ImageVector? = null
