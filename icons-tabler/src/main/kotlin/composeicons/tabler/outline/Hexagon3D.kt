package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hexagon3D: ImageVector
    get() {
        if (_hexagon3D != null) return _hexagon3D!!
        _hexagon3D = tablerOutlineIcon(
            name = "Hexagon3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 6.844f),
                    PathNode.CurveTo(19.623938f, 7.205879f, 20.005705f, 7.874736f, 20.0f, 8.596f),
                    PathNode.LineTo(20.0f, 15.151f),
                    PathNode.CurveTo(20.0f, 15.879f, 19.606f, 16.55f, 18.97f, 16.904f),
                    PathNode.LineTo(12.97f, 20.748f),
                    PathNode.CurveTo(12.366103f, 21.083368f, 11.631897f, 21.083368f, 11.028f, 20.748f),
                    PathNode.LineTo(5.028f, 16.904f),
                    PathNode.CurveTo(4.392888f, 16.549587f, 3.999213f, 15.879308f, 3.999f, 15.152f),
                    PathNode.LineTo(3.999f, 8.596f),
                    PathNode.CurveTo(3.999f, 7.867f, 4.393f, 7.196f, 5.028f, 6.843f),
                    PathNode.LineTo(11.028f, 3.26f),
                    PathNode.CurveTo(11.649445f, 2.912737f, 12.406555f, 2.912737f, 13.028f, 3.26f),
                    PathNode.LineTo(19.028f, 6.844f),
                    PathNode.LineTo(18.998f, 6.844f),
                    PathNode.LineTo(19.0f, 6.844f)
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
                    PathNode.MoveTo(12.0f, 16.5f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(4.5f, 7.5f),
                    PathNode.LineTo(8.0f, 10.0f)
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
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.LineTo(20.0f, 7.5f)
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
                    PathNode.MoveTo(12.0f, 7.5f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(8.0f, 14.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(16.0f, 14.0f)
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
                    PathNode.MoveTo(12.0f, 16.5f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.LineTo(12.0f, 7.5f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.LineTo(12.0f, 16.5f)
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
        return _hexagon3D!!
    }

private var _hexagon3D: ImageVector? = null
