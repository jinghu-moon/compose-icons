package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPlanetscale: ImageVector
    get() {
        if (_brandPlanetscale != null) return _brandPlanetscale!!
        _brandPlanetscale = tablerOutlineIcon(
            name = "BrandPlanetscale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.993f, 11.63f),
                    PathNode.CurveTo(21.096294f, 14.143201f, 20.143154f, 16.584951f, 18.364553f, 18.363552f),
                    PathNode.CurveTo(16.58595f, 20.142155f, 14.144201f, 21.095295f, 11.631f, 20.992f),
                    PathNode.LineTo(20.993f, 11.63f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(15.504307f, 2.999293f, 18.690462f, 5.032486f, 20.166f, 8.211001f),
                    PathNode.LineTo(8.211001f, 20.166f),
                    PathNode.CurveTo(4.377446f, 18.389729f, 2.295579f, 14.185916f, 3.206247f, 10.060148f),
                    PathNode.CurveTo(4.116915f, 5.934381f, 7.774925f, 2.997514f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(6.0f, 18.0f)
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
        return _brandPlanetscale!!
    }

private var _brandPlanetscale: ImageVector? = null
