package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorLightIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.42f, 202.57f),
                    PathNode.CurveTo(204.73811f, 204.00975f, 203.51164f, 205.11923f, 202.01097f, 205.65385f),
                    PathNode.CurveTo(200.51028f, 206.18846f, 198.8586f, 206.10434f, 197.42f, 205.42f),
                    PathNode.LineTo(45.42f, 133.42f),
                    PathNode.CurveTo(43.327305f, 132.4263f, 41.993637f, 130.31664f, 41.993637f, 128.0f),
                    PathNode.CurveTo(41.993637f, 125.683365f, 43.327305f, 123.57369f, 45.42f, 122.58f),
                    PathNode.LineTo(197.42f, 50.58f),
                    PathNode.CurveTo(200.3971f, 49.250595f, 203.89093f, 50.541904f, 205.28784f, 53.487923f),
                    PathNode.CurveTo(206.68475f, 56.433937f, 205.47342f, 59.956306f, 202.56f, 61.42f),
                    PathNode.LineTo(62.0f, 128.0f),
                    PathNode.LineTo(202.55f, 194.58f),
                    PathNode.CurveTo(203.99072f, 195.2583f, 205.10272f, 196.48149f, 205.64104f, 197.98015f),
                    PathNode.CurveTo(206.17934f, 199.47882f, 206.09984f, 201.13f, 205.42f, 202.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
