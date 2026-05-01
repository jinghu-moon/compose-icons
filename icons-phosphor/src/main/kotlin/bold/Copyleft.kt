package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorBoldIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 128.0f),
                    PathNode.CurveTo(179.99857f, 150.37871f, 165.67957f, 170.24661f, 144.45016f, 177.3261f),
                    PathNode.CurveTo(123.22077f, 184.40558f, 99.84296f, 177.10866f, 86.41f, 159.21f),
                    PathNode.CurveTo(83.68552f, 155.79356f, 83.03355f, 151.16618f, 84.70798f, 147.12993f),
                    PathNode.CurveTo(86.382416f, 143.09372f, 90.118546f, 140.28676f, 94.461365f, 139.80222f),
                    PathNode.CurveTo(98.80419f, 139.31764f, 103.067116f, 141.2321f, 105.59f, 144.8f),
                    PathNode.CurveTo(112.821236f, 154.44164f, 125.4108f, 158.37433f, 136.84438f, 154.56313f),
                    PathNode.CurveTo(148.27795f, 150.75194f, 155.99f, 140.05205f, 155.99f, 128.0f),
                    PathNode.CurveTo(155.99f, 115.94795f, 148.27795f, 105.24806f, 136.84438f, 101.43687f),
                    PathNode.CurveTo(125.4108f, 97.62567f, 112.821236f, 101.55836f, 105.59f, 111.2f),
                    PathNode.CurveTo(103.067116f, 114.76791f, 98.80419f, 116.682365f, 94.461365f, 116.19781f),
                    PathNode.CurveTo(90.118546f, 115.71325f, 86.382416f, 112.90628f, 84.70798f, 108.87005f),
                    PathNode.CurveTo(83.03355f, 104.833824f, 83.68552f, 100.20644f, 86.41f, 96.79f),
                    PathNode.CurveTo(99.84296f, 78.89134f, 123.22077f, 71.59441f, 144.45016f, 78.673904f),
                    PathNode.CurveTo(165.67957f, 85.753395f, 179.99857f, 105.6213f, 180.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
