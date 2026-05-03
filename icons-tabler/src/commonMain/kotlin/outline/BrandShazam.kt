package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandShazam: ImageVector
    get() {
        if (_brandShazam != null) return _brandShazam!!
        _brandShazam = tablerOutlineIcon(
            name = "BrandShazam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.530377f, 9.469462f, 13.24982f, 9.171396f, 14.0f, 9.171396f),
                    PathNode.CurveTo(14.75018f, 9.171396f, 15.469623f, 9.469462f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.530539f, 10.530377f, 16.828604f, 11.24982f, 16.828604f, 12.0f),
                    PathNode.CurveTo(16.828604f, 12.75018f, 16.530539f, 13.469623f, 16.0f, 14.0f),
                    PathNode.LineTo(13.0f, 17.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.CurveTo(10.895431f, 15.104569f, 9.104569f, 15.104569f, 8.0f, 14.0f),
                    PathNode.CurveTo(6.895431f, 12.895431f, 6.895431f, 11.104569f, 8.0f, 10.0f),
                    PathNode.LineTo(11.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
        return _brandShazam!!
    }

private var _brandShazam: ImageVector? = null
