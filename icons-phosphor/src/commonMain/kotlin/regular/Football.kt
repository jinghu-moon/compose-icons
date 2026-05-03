package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorRegularIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.06f, 53.89f),
                    PathNode.CurveTo(226.719f, 40.0911f, 215.9089f, 29.281f, 202.11f, 26.94f),
                    PathNode.CurveTo(169.74f, 21.45f, 108.72f, 18.94f, 63.84f, 63.84f),
                    PathNode.CurveTo(18.96f, 108.74f, 21.45f, 169.74f, 26.94f, 202.11f),
                    PathNode.CurveTo(29.287363f, 215.92398f, 40.12169f, 226.73825f, 53.94f, 229.06f),
                    PathNode.CurveTo(65.281494f, 230.99428f, 76.76476f, 231.97769f, 88.27f, 232.0f),
                    PathNode.CurveTo(120.36f, 232.0f, 160.32f, 224.0f, 192.16f, 192.16f),
                    PathNode.CurveTo(237.05f, 147.28f, 234.55f, 86.26f, 229.06f, 53.89f),
                    PathNode.Close,
                    PathNode.MoveTo(167.45f, 39.89f),
                    PathNode.CurveTo(178.17615f, 39.927845f, 188.88028f, 40.864452f, 199.45f, 42.69f),
                    PathNode.CurveTo(206.54431f, 43.901794f, 212.09845f, 49.463963f, 213.3f, 56.56f),
                    PathNode.CurveTo(215.3632f, 68.51835f, 216.26741f, 80.64792f, 216.0f, 92.78f),
                    PathNode.LineTo(163.21f, 40.0f),
                    PathNode.CurveTo(164.61f, 39.92f, 166.0f, 39.9f, 167.45f, 39.9f),
                    PathNode.Close,
                    PathNode.MoveTo(56.56f, 213.3f),
                    PathNode.CurveTo(49.464832f, 212.09332f, 43.906673f, 206.53517f, 42.7f, 199.44f),
                    PathNode.CurveTo(40.636787f, 187.48166f, 39.732597f, 175.35208f, 40.0f, 163.22f),
                    PathNode.LineTo(92.78f, 216.0f),
                    PathNode.CurveTo(80.64779f, 216.27242f, 68.51773f, 215.36818f, 56.56f, 213.3f),
                    PathNode.Close,
                    PathNode.MoveTo(180.86f, 180.86f),
                    PathNode.CurveTo(169.25f, 192.46f, 147.59f, 208.59f, 113.49f, 214.13f),
                    PathNode.LineTo(41.87f, 142.51f),
                    PathNode.CurveTo(47.41f, 108.41f, 63.54f, 86.75f, 75.14f, 75.14f),
                    PathNode.CurveTo(86.74f, 63.53f, 108.4f, 47.4f, 142.5f, 41.86f),
                    PathNode.LineTo(214.13f, 113.49f),
                    PathNode.CurveTo(208.59f, 147.59f, 192.46f, 169.25f, 180.86f, 180.86f),
                    PathNode.Close,
                    PathNode.MoveTo(165.64f, 90.36f),
                    PathNode.CurveTo(168.76172f, 93.48377f, 168.76172f, 98.546234f, 165.64f, 101.67f),
                    PathNode.LineTo(151.3f, 116.0f),
                    PathNode.LineTo(157.64f, 122.34f),
                    PathNode.CurveTo(159.79283f, 124.33196f, 160.68301f, 127.34229f, 159.95975f, 130.18474f),
                    PathNode.CurveTo(159.2365f, 133.02718f, 157.01576f, 135.24594f, 154.17268f, 135.96669f),
                    PathNode.CurveTo(151.3296f, 136.68744f, 148.32005f, 135.7946f, 146.33f, 133.64f),
                    PathNode.LineTo(140.0f, 127.31f),
                    PathNode.LineTo(127.31f, 140.0f),
                    PathNode.LineTo(133.65f, 146.34f),
                    PathNode.CurveTo(135.8046f, 148.33005f, 136.69743f, 151.3396f, 135.97668f, 154.18268f),
                    PathNode.CurveTo(135.25594f, 157.02576f, 133.03719f, 159.24649f, 130.19473f, 159.96976f),
                    PathNode.CurveTo(127.352295f, 160.69301f, 124.34196f, 159.80283f, 122.35f, 157.65f),
                    PathNode.LineTo(116.0f, 151.3f),
                    PathNode.LineTo(101.66f, 165.64f),
                    PathNode.CurveTo(99.65776f, 167.74748f, 96.66988f, 168.60301f, 93.855644f, 167.87462f),
                    PathNode.CurveTo(91.04141f, 167.14624f, 88.843765f, 164.9486f, 88.11537f, 162.13435f),
                    PathNode.CurveTo(87.386986f, 159.32011f, 88.2425f, 156.33224f, 90.35f, 154.33f),
                    PathNode.LineTo(104.7f, 140.0f),
                    PathNode.LineTo(98.36f, 133.66f),
                    PathNode.CurveTo(95.44503f, 130.50403f, 95.543236f, 125.60916f, 98.58244f, 122.57264f),
                    PathNode.CurveTo(101.62165f, 119.53612f, 106.5166f, 119.44224f, 109.67f, 122.36f),
                    PathNode.LineTo(116.01f, 128.7f),
                    PathNode.LineTo(128.69f, 116.0f),
                    PathNode.LineTo(122.35f, 109.66f),
                    PathNode.CurveTo(119.43224f, 106.5066f, 119.526115f, 101.61166f, 122.56264f, 98.57245f),
                    PathNode.CurveTo(125.59916f, 95.53323f, 130.49402f, 95.435036f, 133.65f, 98.35f),
                    PathNode.LineTo(140.0f, 104.7f),
                    PathNode.LineTo(154.34f, 90.36f),
                    PathNode.CurveTo(157.4626f, 87.244934f, 162.51738f, 87.244934f, 165.64f, 90.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _football!!
    }

private var _football: ImageVector? = null
