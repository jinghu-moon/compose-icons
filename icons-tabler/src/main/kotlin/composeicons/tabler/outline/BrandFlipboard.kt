package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFlipboard: ImageVector
    get() {
        if (_brandFlipboard != null) return _brandFlipboard!!
        _brandFlipboard = tablerOutlineIcon(
            name = "BrandFlipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.973f, 3.0f),
                    PathNode.LineTo(20.027f, 3.0f),
                    PathNode.CurveTo(20.564f, 3.0f, 21.0f, 3.436f, 21.0f, 3.973f),
                    PathNode.LineTo(21.0f, 8.025f),
                    PathNode.CurveTo(21.0f, 8.562373f, 20.564375f, 8.998f, 20.027f, 8.998f),
                    PathNode.LineTo(15.002f, 8.998f),
                    PathNode.LineTo(15.002f, 13.829f),
                    PathNode.CurveTo(15.002f, 14.477f, 14.477f, 15.002f, 13.829f, 15.002f),
                    PathNode.LineTo(9.0f, 15.002f),
                    PathNode.LineTo(9.0f, 20.027f),
                    PathNode.CurveTo(9.0f, 20.285229f, 8.89735f, 20.532867f, 8.714662f, 20.715368f),
                    PathNode.CurveTo(8.531972f, 20.897873f, 8.28423f, 21.000265f, 8.026f, 21.0f),
                    PathNode.LineTo(3.973f, 21.0f),
                    PathNode.CurveTo(3.435627f, 21.0f, 3.0f, 20.564375f, 3.0f, 20.027f),
                    PathNode.LineTo(3.0f, 3.973f),
                    PathNode.CurveTo(3.0f, 3.436f, 3.436f, 3.0f, 3.973f, 3.0f)
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
        return _brandFlipboard!!
    }

private var _brandFlipboard: ImageVector? = null
