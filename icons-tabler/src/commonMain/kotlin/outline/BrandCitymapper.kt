package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCitymapper: ImageVector
    get() {
        if (_brandCitymapper != null) return _brandCitymapper!!
        _brandCitymapper = tablerOutlineIcon(
            name = "BrandCitymapper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.550582f, 11.000047f, 3.997552f, 11.445146f, 3.999906f, 11.995723f),
                    PathNode.CurveTo(4.002261f, 12.5463f, 3.559116f, 12.995207f, 3.008554f, 12.999963f),
                    PathNode.CurveTo(2.457993f, 13.004719f, 2.007158f, 12.563536f, 2.0f, 12.013f),
                    PathNode.CurveTo(2.0f, 11.460715f, 2.447715f, 11.013f, 3.0f, 11.013f),
                    PathNode.LineTo(3.0f, 11.0f)
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
                    PathNode.MoveTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.550583f, 11.000047f, 21.99755f, 11.445146f, 21.999907f, 11.995723f),
                    PathNode.CurveTo(22.002262f, 12.5463f, 21.559116f, 12.995207f, 21.008554f, 12.999963f),
                    PathNode.CurveTo(20.457993f, 13.004719f, 20.007158f, 12.563536f, 20.0f, 12.013f),
                    PathNode.CurveTo(20.0f, 11.460715f, 20.447716f, 11.013f, 21.0f, 11.013f),
                    PathNode.LineTo(21.0f, 11.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(13.0f, 15.0f)
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
        return _brandCitymapper!!
    }

private var _brandCitymapper: ImageVector? = null
