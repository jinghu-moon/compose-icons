package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPrism: ImageVector
    get() {
        if (_hexagonalPrism != null) return _hexagonalPrism!!
        _hexagonalPrism = tablerOutlineIcon(
            name = "HexagonalPrism",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.792f, 6.996f),
                    PathNode.LineTo(17.017f, 9.639f),
                    PathNode.CurveTo(16.680605f, 9.873849f, 16.280262f, 9.99985f, 15.87f, 10.0f),
                    PathNode.LineTo(8.13f, 10.0f),
                    PathNode.CurveTo(7.72f, 10.0f, 7.32f, 9.874f, 6.984f, 9.638f),
                    PathNode.LineTo(3.21f, 6.997f)
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
                    PathNode.MoveTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 21.0f)
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
                    PathNode.LineTo(16.0f, 21.0f)
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
                    PathNode.MoveTo(3.853f, 18.274f),
                    PathNode.LineTo(7.22f, 20.637f),
                    PathNode.CurveTo(7.556017f, 20.87285f, 7.956473f, 20.999586f, 8.367f, 21.0f),
                    PathNode.LineTo(15.632f, 21.0f),
                    PathNode.CurveTo(16.042f, 21.0f, 16.443f, 20.874f, 16.779f, 20.637f),
                    PathNode.LineTo(20.146f, 18.274f),
                    PathNode.CurveTo(20.682f, 17.899f, 21.0f, 17.284f, 21.0f, 16.631f),
                    PathNode.LineTo(21.0f, 7.369f),
                    PathNode.CurveTo(21.0f, 6.714f, 20.682f, 6.101f, 20.147f, 5.726f),
                    PathNode.LineTo(16.78f, 3.363f),
                    PathNode.CurveTo(16.443983f, 3.127149f, 16.043528f, 3.000414f, 15.633f, 3.0f),
                    PathNode.LineTo(8.367f, 3.0f),
                    PathNode.CurveTo(7.957f, 3.0f, 7.556f, 3.126f, 7.22f, 3.363f),
                    PathNode.LineTo(3.853f, 5.726f),
                    PathNode.CurveTo(3.317562f, 6.102088f, 2.999195f, 6.71568f, 3.0f, 7.37f),
                    PathNode.LineTo(3.0f, 16.631f),
                    PathNode.CurveTo(3.0f, 17.286f, 3.318f, 17.9f, 3.853f, 18.275f)
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
        return _hexagonalPrism!!
    }

private var _hexagonalPrism: ImageVector? = null
