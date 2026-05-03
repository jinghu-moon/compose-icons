package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLine: ImageVector
    get() {
        if (_brandLine != null) return _brandLine!!
        _brandLine = tablerOutlineIcon(
            name = "BrandLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 10.663f),
                    PathNode.CurveTo(21.0f, 6.439f, 16.959f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.041f, 3.0f, 3.0f, 6.439f, 3.0f, 10.663f),
                    PathNode.CurveTo(3.0f, 14.446f, 6.201f, 17.621f, 10.527f, 18.223f),
                    PathNode.CurveTo(11.58f, 18.462f, 11.459f, 18.867f, 11.223f, 20.356f),
                    PathNode.CurveTo(11.184f, 20.594f, 11.039f, 21.288f, 12.0f, 20.868f),
                    PathNode.CurveTo(12.96f, 20.448f, 17.18f, 17.667f, 19.073f, 15.388f),
                    PathNode.CurveTo(20.377f, 13.884f, 21.0f, 12.359f, 21.0f, 10.673f),
                    PathNode.LineTo(21.0f, 10.663f)
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
        return _brandLine!!
    }

private var _brandLine: ImageVector? = null
