package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorLightIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.81f, 59.72f),
                    PathNode.CurveTo(218.33954f, 57.273907f, 212.89302f, 57.450096f, 208.59f, 60.18f),
                    PathNode.LineTo(126.0f, 112.79f),
                    PathNode.LineTo(126.0f, 71.84f),
                    PathNode.CurveTo(125.99571f, 66.79034f, 123.23959f, 62.14442f, 118.81f, 59.72f),
                    PathNode.CurveTo(114.33954f, 57.273907f, 108.89303f, 57.450096f, 104.59f, 60.18f),
                    PathNode.LineTo(16.41f, 116.35f),
                    PathNode.CurveTo(12.417952f, 118.87834f, 9.998455f, 123.27465f, 9.998455f, 128.0f),
                    PathNode.CurveTo(9.998455f, 132.72536f, 12.417952f, 137.12166f, 16.41f, 139.65f),
                    PathNode.LineTo(104.59f, 195.82f),
                    PathNode.CurveTo(108.89303f, 198.54991f, 114.33954f, 198.72609f, 118.81f, 196.28f),
                    PathNode.CurveTo(123.23959f, 193.85558f, 125.99571f, 189.20964f, 126.0f, 184.16f),
                    PathNode.LineTo(126.0f, 143.21f),
                    PathNode.LineTo(208.59f, 195.82f),
                    PathNode.CurveTo(212.89302f, 198.54991f, 218.33954f, 198.72609f, 222.81f, 196.28f),
                    PathNode.CurveTo(227.2396f, 193.85558f, 229.99571f, 189.20964f, 230.0f, 184.16f),
                    PathNode.LineTo(230.0f, 71.84f),
                    PathNode.CurveTo(229.99571f, 66.79034f, 227.2396f, 62.14442f, 222.81f, 59.72f),
                    PathNode.Close,
                    PathNode.MoveTo(114.0f, 184.16f),
                    PathNode.CurveTo(114.00846f, 184.84056f, 113.61708f, 185.46286f, 113.0f, 185.75f),
                    PathNode.CurveTo(112.375946f, 186.11108f, 111.60129f, 186.08784f, 111.0f, 185.69f),
                    PathNode.LineTo(22.85f, 129.53f),
                    PathNode.CurveTo(22.32041f, 129.20178f, 21.998207f, 128.62305f, 21.998207f, 128.0f),
                    PathNode.CurveTo(21.998207f, 127.37695f, 22.32041f, 126.79821f, 22.85f, 126.47f),
                    PathNode.LineTo(111.0f, 70.31f),
                    PathNode.CurveTo(111.29594f, 70.11002f, 111.642944f, 69.99898f, 112.0f, 69.99f),
                    PathNode.CurveTo(112.35035f, 69.98758f, 112.69519f, 70.07724f, 113.0f, 70.25f),
                    PathNode.CurveTo(113.61708f, 70.53715f, 114.00846f, 71.15943f, 114.0f, 71.84f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 184.16f),
                    PathNode.CurveTo(218.00845f, 184.84056f, 217.61708f, 185.46286f, 217.0f, 185.75f),
                    PathNode.CurveTo(216.37595f, 186.11108f, 215.60127f, 186.08784f, 215.0f, 185.69f),
                    PathNode.LineTo(126.81f, 129.53f),
                    PathNode.CurveTo(126.28041f, 129.20178f, 125.958206f, 128.62305f, 125.958206f, 128.0f),
                    PathNode.CurveTo(125.958206f, 127.37695f, 126.28041f, 126.79821f, 126.81f, 126.47f),
                    PathNode.LineTo(215.0f, 70.31f),
                    PathNode.CurveTo(215.29593f, 70.11002f, 215.64294f, 69.99898f, 216.0f, 69.99f),
                    PathNode.CurveTo(216.35036f, 69.98758f, 216.69519f, 70.07724f, 217.0f, 70.25f),
                    PathNode.CurveTo(217.61708f, 70.53715f, 218.00845f, 71.15943f, 218.0f, 71.84f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rewind!!
    }

private var _rewind: ImageVector? = null
