package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBumble: ImageVector
    get() {
        if (_brandBumble != null) return _brandBumble!!
        _brandBumble = tablerOutlineIcon(
            name = "BrandBumble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.LineTo(17.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
                    PathNode.MoveTo(16.268f, 3.0f),
                    PathNode.LineTo(7.732f, 3.0f),
                    PathNode.CurveTo(7.205361f, 3.002391f, 6.720824f, 3.288222f, 6.464f, 3.748f),
                    PathNode.LineTo(2.196f, 11.257f),
                    PathNode.CurveTo(1.934809f, 11.717901f, 1.934809f, 12.282099f, 2.196f, 12.743f),
                    PathNode.LineTo(6.464f, 20.252f),
                    PathNode.CurveTo(6.724f, 20.714f, 7.208f, 20.999f, 7.732f, 21.0f),
                    PathNode.LineTo(16.268f, 21.0f),
                    PathNode.CurveTo(16.79464f, 20.997608f, 17.279177f, 20.711779f, 17.536f, 20.252f),
                    PathNode.LineTo(21.804f, 12.743f),
                    PathNode.CurveTo(22.065191f, 12.282099f, 22.065191f, 11.717901f, 21.804f, 11.257f),
                    PathNode.LineTo(17.536f, 3.748f),
                    PathNode.CurveTo(17.279177f, 3.288222f, 16.79464f, 3.002391f, 16.268f, 3.0f)
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
        return _brandBumble!!
    }

private var _brandBumble: ImageVector? = null
