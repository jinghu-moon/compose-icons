package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorLightIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 108.24f),
                    PathNode.LineTo(180.24f, 156.24f),
                    PathNode.CurveTo(177.87592f, 158.44287f, 174.19193f, 158.37787f, 171.90703f, 156.09297f),
                    PathNode.CurveTo(169.62213f, 153.80807f, 169.55713f, 150.12408f, 171.76f, 147.76f),
                    PathNode.LineTo(209.51f, 110.0f),
                    PathNode.LineTo(165.0f, 110.0f),
                    PathNode.CurveTo(123.94253f, 109.96606f, 88.073814f, 137.74095f, 77.83f, 177.5f),
                    PathNode.CurveTo(77.00157f, 180.70877f, 73.728775f, 182.63843f, 70.52f, 181.81f),
                    PathNode.CurveTo(67.311226f, 180.98157f, 65.38158f, 177.70877f, 66.21f, 174.5f),
                    PathNode.CurveTo(77.821915f, 129.44235f, 118.47015f, 97.96558f, 165.0f, 98.0f),
                    PathNode.LineTo(209.53f, 98.0f),
                    PathNode.LineTo(171.76f, 60.24f),
                    PathNode.CurveTo(169.55713f, 57.875923f, 169.62213f, 54.19192f, 171.90703f, 51.907024f),
                    PathNode.CurveTo(174.19193f, 49.622128f, 177.87592f, 49.55713f, 180.24f, 51.76f),
                    PathNode.LineTo(228.24f, 99.76f),
                    PathNode.CurveTo(230.57962f, 102.10254f, 230.57962f, 105.89746f, 228.24f, 108.24f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 210.0f),
                    PathNode.LineTo(38.0f, 210.0f),
                    PathNode.LineTo(38.0f, 88.0f),
                    PathNode.CurveTo(38.0f, 84.686295f, 35.31371f, 82.0f, 32.0f, 82.0f),
                    PathNode.CurveTo(28.68629f, 82.0f, 26.0f, 84.686295f, 26.0f, 88.0f),
                    PathNode.LineTo(26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 219.3137f, 28.68629f, 222.0f, 32.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(195.3137f, 222.0f, 198.0f, 219.3137f, 198.0f, 216.0f),
                    PathNode.CurveTo(198.0f, 212.6863f, 195.3137f, 210.0f, 192.0f, 210.0f),
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
        return _share!!
    }

private var _share: ImageVector? = null
