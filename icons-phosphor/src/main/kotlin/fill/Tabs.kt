package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorFillIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 168.0f),
                    PathNode.CurveTo(256.0f, 172.41827f, 252.41827f, 176.0f, 248.0f, 176.0f),
                    PathNode.LineTo(8.0f, 176.0f),
                    PathNode.CurveTo(5.452773f, 175.9995f, 3.058026f, 174.78604f, 1.55126f, 172.73225f),
                    PathNode.CurveTo(0.044494f, 170.67847f, -0.394168f, 168.0299f, 0.37f, 165.6f),
                    PathNode.LineTo(22.63f, 91.4f),
                    PathNode.CurveTo(24.634272f, 84.59515f, 30.906351f, 79.94312f, 38.0f, 80.0f),
                    PathNode.LineTo(122.1f, 80.0f),
                    PathNode.CurveTo(129.17517f, 79.96549f, 135.42085f, 84.61305f, 137.42f, 91.4f),
                    PathNode.LineTo(158.0f, 160.0f),
                    PathNode.LineTo(173.3f, 160.0f),
                    PathNode.LineTo(150.79f, 85.15f),
                    PathNode.CurveTo(150.4265f, 83.93904f, 150.65692f, 82.62752f, 151.41142f, 81.61298f),
                    PathNode.CurveTo(152.16592f, 80.59845f, 153.35567f, 80.00036f, 154.62f, 80.0f),
                    PathNode.LineTo(170.05f, 80.0f),
                    PathNode.CurveTo(177.11313f, 80.00198f, 183.33936f, 84.63507f, 185.37f, 91.4f),
                    PathNode.LineTo(206.0f, 160.0f),
                    PathNode.LineTo(221.3f, 160.0f),
                    PathNode.LineTo(198.79f, 85.15f),
                    PathNode.CurveTo(198.4265f, 83.93904f, 198.65692f, 82.62752f, 199.41142f, 81.61298f),
                    PathNode.CurveTo(200.16592f, 80.59845f, 201.35567f, 80.00036f, 202.62f, 80.0f),
                    PathNode.LineTo(218.05f, 80.0f),
                    PathNode.CurveTo(225.11313f, 80.00198f, 231.33936f, 84.63507f, 233.37f, 91.4f),
                    PathNode.LineTo(255.63f, 165.58f),
                    PathNode.CurveTo(255.87508f, 166.3633f, 255.99985f, 167.17926f, 256.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _tabs!!
    }

private var _tabs: ImageVector? = null
