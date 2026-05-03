package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellMinus: ImageVector
    get() {
        if (_bellMinus != null) return _bellMinus!!
        _bellMinus = tablerOutlineIcon(
            name = "BellMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(5.105114f, 16.374203f, 5.847386f, 15.260797f, 6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.121369f, 8.414246f, 7.659831f, 6.106554f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 3.895431f, 10.895431f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.104569f, 3.0f, 14.0f, 3.895431f, 14.0f, 5.0f),
                    PathNode.CurveTo(16.34017f, 6.106554f, 17.878632f, 8.414246f, 18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.CurveTo(18.047f, 14.386f, 18.149f, 14.758f, 18.3f, 15.107f)
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
                    PathNode.CurveTo(8.999812f, 18.883884f, 9.389412f, 19.72287f, 10.064814f, 20.29303f),
                    PathNode.CurveTo(10.740216f, 20.86319f, 11.632679f, 21.106491f, 12.504f, 20.958f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
        return _bellMinus!!
    }

private var _bellMinus: ImageVector? = null
