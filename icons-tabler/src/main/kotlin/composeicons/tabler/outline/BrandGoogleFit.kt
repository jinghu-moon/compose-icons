package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleFit: ImageVector
    get() {
        if (_brandGoogleFit != null) return _brandGoogleFit!!
        _brandGoogleFit = tablerOutlineIcon(
            name = "BrandGoogleFit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.866f),
                    PathNode.LineTo(9.267f, 6.132f),
                    PathNode.CurveTo(7.752451f, 4.651326f, 5.328448f, 4.665033f, 3.830741f, 6.16274f),
                    PathNode.CurveTo(2.333033f, 7.660448f, 2.319326f, 10.084451f, 3.8f, 11.599f),
                    PathNode.LineTo(6.533f, 14.333f),
                    PathNode.LineTo(12.0f, 19.8f),
                    PathNode.LineTo(20.202f, 11.599f),
                    PathNode.CurveTo(21.711393f, 10.088778f, 21.710722f, 7.640895f, 20.2005f, 6.1315f),
                    PathNode.CurveTo(18.690277f, 4.622106f, 16.242393f, 4.622778f, 14.733f, 6.133f),
                    PathNode.LineTo(6.532f, 14.333f)
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
        return _brandGoogleFit!!
    }

private var _brandGoogleFit: ImageVector? = null
