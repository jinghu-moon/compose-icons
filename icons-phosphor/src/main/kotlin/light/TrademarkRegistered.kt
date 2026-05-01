package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorLightIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.16f, 139.42f),
                    PathNode.CurveTo(161.11037f, 133.67148f, 168.27316f, 119.64613f, 165.33768f, 105.78465f),
                    PathNode.CurveTo(162.40219f, 91.923164f, 150.1689f, 82.005394f, 136.0f, 82.0f),
                    PathNode.LineTo(104.0f, 82.0f),
                    PathNode.CurveTo(100.686295f, 82.0f, 98.0f, 84.686295f, 98.0f, 88.0f),
                    PathNode.LineTo(98.0f, 168.0f),
                    PathNode.CurveTo(98.0f, 171.3137f, 100.686295f, 174.0f, 104.0f, 174.0f),
                    PathNode.CurveTo(107.313705f, 174.0f, 110.0f, 171.3137f, 110.0f, 168.0f),
                    PathNode.LineTo(110.0f, 142.0f),
                    PathNode.LineTo(135.46f, 142.0f),
                    PathNode.LineTo(155.0f, 171.33f),
                    PathNode.CurveTo(156.83911f, 174.09143f, 160.56857f, 174.83911f, 163.33f, 173.0f),
                    PathNode.CurveTo(166.09143f, 171.16089f, 166.83911f, 167.43143f, 165.0f, 164.67f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 94.0f),
                    PathNode.LineTo(136.0f, 94.0f),
                    PathNode.CurveTo(145.94113f, 94.0f, 154.0f, 102.05888f, 154.0f, 112.0f),
                    PathNode.CurveTo(154.0f, 121.94112f, 145.94113f, 130.0f, 136.0f, 130.0f),
                    PathNode.LineTo(110.0f, 130.0f),
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
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
