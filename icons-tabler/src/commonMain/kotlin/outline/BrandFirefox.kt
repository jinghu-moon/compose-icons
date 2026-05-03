package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFirefox: ImageVector
    get() {
        if (_brandFirefox != null) return _brandFirefox!!
        _brandFirefox = tablerOutlineIcon(
            name = "BrandFirefox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.028f, 7.82f),
                    PathNode.CurveTo(1.766462f, 12.132554f, 3.345176f, 17.461699f, 7.59077f, 19.84657f),
                    PathNode.CurveTo(11.836363f, 22.231441f, 17.208788f, 20.806952f, 19.715012f, 16.631845f),
                    PathNode.CurveTo(22.221237f, 12.456738f, 20.952152f, 7.045496f, 16.851f, 4.42f),
                    PathNode.CurveTo(15.215f, 3.4f, 13.787f, 3.4f, 12.0f, 3.4f),
                    PathNode.LineTo(10.353f, 3.4f)
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
                    PathNode.MoveTo(4.914f, 9.485f),
                    PathNode.CurveTo(3.158f, 7.916f, 4.109f, 4.105f, 5.023f, 3.315f),
                    PathNode.CurveTo(5.109f, 4.211f, 5.608f, 4.523f, 6.134f, 5.0f),
                    PathNode.CurveTo(7.014f, 4.725f, 7.447f, 4.718f, 8.001001f, 5.0f),
                    PathNode.CurveTo(8.821f, 4.09f, 9.695f, 2.646f, 10.629f, 2.907f),
                    PathNode.CurveTo(9.547f, 4.648f, 10.559f, 6.64f, 12.0f, 7.08f),
                    PathNode.CurveTo(11.83f, 8.055001f, 10.516f, 8.993f, 9.24f, 9.766f),
                    PathNode.CurveTo(7.944f, 10.704f, 8.518f, 11.616f, 9.24f, 12.0f),
                    PathNode.CurveTo(10.189f, 12.506f, 12.851f, 11.0f, 13.785f, 12.354f),
                    PathNode.CurveTo(12.087f, 12.456f, 12.249f, 15.461f, 9.802f, 15.081f),
                    PathNode.CurveTo(12.325f, 16.038f, 14.147f, 15.543f, 15.26f, 14.741f),
                    PathNode.CurveTo(17.225f, 13.221f, 18.139f, 11.199f, 18.139f, 9.184f),
                    PathNode.CurveTo(18.125f, 7.786f, 18.333f, 6.489f, 16.879f, 4.434f)
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
        return _brandFirefox!!
    }

private var _brandFirefox: ImageVector? = null
