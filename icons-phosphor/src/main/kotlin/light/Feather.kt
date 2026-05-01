package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorLightIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 80.0f),
                    PathNode.CurveTo(237.9995f, 54.92887f, 222.89981f, 32.325565f, 199.73927f, 22.726044f),
                    PathNode.CurveTo(176.57874f, 13.126523f, 149.9163f, 18.420374f, 132.18f, 36.14f),
                    PathNode.LineTo(62.1f, 105.41f),
                    PathNode.CurveTo(59.468937f, 108.03196f, 57.993107f, 111.59555f, 58.0f, 115.31f),
                    PathNode.LineTo(58.0f, 189.52f),
                    PathNode.LineTo(27.76f, 219.76f),
                    PathNode.CurveTo(26.154774f, 221.25575f, 25.494007f, 223.50844f, 26.036915f, 225.63431f),
                    PathNode.CurveTo(26.579824f, 227.76018f, 28.239822f, 229.42018f, 30.365688f, 229.96309f),
                    PathNode.CurveTo(32.491554f, 230.506f, 34.744236f, 229.84523f, 36.24f, 228.24f),
                    PathNode.LineTo(66.48f, 198.0f),
                    PathNode.LineTo(140.69f, 198.0f),
                    PathNode.CurveTo(144.40445f, 198.0069f, 147.96803f, 196.53107f, 150.59f, 193.9f),
                    PathNode.LineTo(150.59f, 193.9f),
                    PathNode.LineTo(219.42f, 124.27f),
                    PathNode.LineTo(219.42f, 124.27f),
                    PathNode.LineTo(219.81f, 123.87f),
                    PathNode.CurveTo(231.49326f, 112.26573f, 238.04404f, 96.466805f, 238.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.64f, 44.64f),
                    PathNode.CurveTo(159.93118f, 25.506777f, 190.97095f, 25.280762f, 210.53871f, 44.131035f),
                    PathNode.CurveTo(230.10646f, 62.981308f, 231.03958f, 94.007866f, 212.64f, 114.0f),
                    PathNode.LineTo(150.48f, 114.0f),
                    PathNode.LineTo(188.24f, 76.24f),
                    PathNode.CurveTo(190.44287f, 73.87592f, 190.37787f, 70.191925f, 188.09297f, 67.90703f),
                    PathNode.CurveTo(185.80807f, 65.62213f, 182.12408f, 65.55713f, 179.76f, 67.76f),
                    PathNode.LineTo(131.76f, 115.76f),
                    PathNode.LineTo(131.76f, 115.76f),
                    PathNode.LineTo(118.0f, 129.52f),
                    PathNode.LineTo(118.0f, 67.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 115.31f),
                    PathNode.CurveTo(69.999466f, 114.7916f, 70.20024f, 114.29325f, 70.56f, 113.92f),
                    PathNode.LineTo(106.0f, 78.92f),
                    PathNode.LineTo(106.0f, 141.55f),
                    PathNode.LineTo(70.0f, 177.55f),
                    PathNode.Close,
                    PathNode.MoveTo(142.09f, 185.42f),
                    PathNode.CurveTo(141.71748f, 185.78949f, 141.21468f, 185.99779f, 140.69f, 186.0f),
                    PathNode.LineTo(78.48f, 186.0f),
                    PathNode.LineTo(116.24f, 148.25f),
                    PathNode.LineTo(116.24f, 148.25f),
                    PathNode.LineTo(138.48f, 126.0f),
                    PathNode.LineTo(200.83f, 126.0f),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
