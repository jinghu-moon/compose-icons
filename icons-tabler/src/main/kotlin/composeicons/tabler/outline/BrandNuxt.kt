package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNuxt: ImageVector
    get() {
        if (_brandNuxt != null) return _brandNuxt!!
        _brandNuxt = tablerOutlineIcon(
            name = "BrandNuxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.146f, 8.583f),
                    PathNode.LineTo(10.846f, 6.493f),
                    PathNode.CurveTo(10.653142f, 6.18342f, 10.312949f, 5.996657f, 9.948228f, 6.000128f),
                    PathNode.CurveTo(9.583506f, 6.0036f, 9.24693f, 6.196805f, 9.06f, 6.51f),
                    PathNode.LineTo(3.15f, 16.418f),
                    PathNode.CurveTo(2.957238f, 16.741032f, 2.952778f, 17.142693f, 3.13832f, 17.469925f),
                    PathNode.CurveTo(3.323862f, 17.797157f, 3.670827f, 17.999557f, 4.047f, 18.0f),
                    PathNode.LineTo(7.96f, 18.0f)
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
                    PathNode.MoveTo(20.043f, 18.0f),
                    PathNode.CurveTo(20.786f, 18.0f, 21.244f, 17.157f, 20.863f, 16.495f),
                    PathNode.LineTo(16.819f, 9.482f),
                    PathNode.CurveTo(16.654152f, 9.184056f, 16.340508f, 8.999139f, 16.0f, 8.999139f),
                    PathNode.CurveTo(15.659493f, 8.999139f, 15.345847f, 9.184056f, 15.181f, 9.482f),
                    PathNode.LineTo(11.138f, 16.495f),
                    PathNode.CurveTo(10.756f, 17.157f, 11.214f, 18.0f, 11.957f, 18.0f),
                    PathNode.LineTo(20.043f, 18.0f)
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
        return _brandNuxt!!
    }

private var _brandNuxt: ImageVector? = null
