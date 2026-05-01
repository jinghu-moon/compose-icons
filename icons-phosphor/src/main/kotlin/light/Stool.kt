package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorLightIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 64.0f),
                    PathNode.LineTo(198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 32.268013f, 191.73198f, 26.0f, 184.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(64.26801f, 26.0f, 58.0f, 32.268013f, 58.0f, 40.0f),
                    PathNode.LineTo(58.0f, 64.0f),
                    PathNode.CurveTo(58.0f, 71.73199f, 64.26801f, 78.0f, 72.0f, 78.0f),
                    PathNode.LineTo(81.0f, 78.0f),
                    PathNode.LineTo(58.07f, 223.06f),
                    PathNode.CurveTo(57.819767f, 224.63438f, 58.20635f, 226.24362f, 59.144424f, 227.53253f),
                    PathNode.CurveTo(60.0825f, 228.82146f, 61.49494f, 229.68407f, 63.07f, 229.93f),
                    PathNode.CurveTo(64.64283f, 230.17734f, 66.24947f, 229.78938f, 67.53614f, 228.85158f),
                    PathNode.CurveTo(68.8228f, 227.91379f, 69.68397f, 226.50304f, 69.93f, 224.93f),
                    PathNode.LineTo(78.0f, 174.0f),
                    PathNode.LineTo(178.0f, 174.0f),
                    PathNode.LineTo(186.0f, 224.93f),
                    PathNode.CurveTo(186.51639f, 228.20505f, 189.58995f, 230.44139f, 192.865f, 229.925f),
                    PathNode.CurveTo(196.14005f, 229.40862f, 198.37639f, 226.33505f, 197.86f, 223.06f),
                    PathNode.LineTo(175.0f, 78.0f),
                    PathNode.LineTo(184.0f, 78.0f),
                    PathNode.CurveTo(191.73198f, 78.0f, 198.0f, 71.73199f, 198.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 64.0f),
                    PathNode.LineTo(70.0f, 40.0f),
                    PathNode.CurveTo(70.0f, 38.89543f, 70.89543f, 38.0f, 72.0f, 38.0f),
                    PathNode.LineTo(184.0f, 38.0f),
                    PathNode.CurveTo(185.10457f, 38.0f, 186.0f, 38.89543f, 186.0f, 40.0f),
                    PathNode.LineTo(186.0f, 64.0f),
                    PathNode.CurveTo(186.0f, 65.10457f, 185.10457f, 66.0f, 184.0f, 66.0f),
                    PathNode.LineTo(72.0f, 66.0f),
                    PathNode.CurveTo(70.89543f, 66.0f, 70.0f, 65.10457f, 70.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.14f, 162.0f),
                    PathNode.LineTo(79.86f, 162.0f),
                    PathNode.LineTo(93.13f, 78.0f),
                    PathNode.LineTo(162.87f, 78.0f),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
