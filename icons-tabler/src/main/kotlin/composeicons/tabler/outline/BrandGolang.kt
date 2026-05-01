package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGolang: ImageVector
    get() {
        if (_brandGolang != null) return _brandGolang!!
        _brandGolang = tablerOutlineIcon(
            name = "BrandGolang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.695f, 14.305f),
                    PathNode.CurveTo(16.756f, 15.365f, 18.648f, 15.193f, 19.921f, 13.921f),
                    PathNode.CurveTo(21.193f, 12.648f, 21.365f, 10.756f, 20.305f, 9.695f),
                    PathNode.CurveTo(19.244f, 8.635f, 17.352f, 8.807f, 16.079f, 10.079f),
                    PathNode.CurveTo(14.807f, 11.352f, 14.635f, 13.244f, 15.695f, 14.305f)
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
                    PathNode.MoveTo(12.68f, 9.233f),
                    PathNode.CurveTo(11.596f, 8.736f, 10.135f, 9.042f, 9.089f, 10.079f),
                    PathNode.CurveTo(7.805f, 11.352f, 7.632f, 13.244f, 8.701f, 14.305f),
                    PathNode.CurveTo(9.771f, 15.365f, 11.679f, 15.193f, 12.962f, 13.921f),
                    PathNode.CurveTo(13.494936f, 13.400847f, 13.856972f, 12.730837f, 14.0f, 12.0f),
                    PathNode.LineTo(11.573f, 12.0f)
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
                    PathNode.MoveTo(5.5f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f)
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
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(2.0f, 12.0f)
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
        return _brandGolang!!
    }

private var _brandGolang: ImageVector? = null
