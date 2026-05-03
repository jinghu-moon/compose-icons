package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorLightIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(110.0f, 72.0f),
                    PathNode.CurveTo(110.0f, 75.313705f, 107.313705f, 78.0f, 104.0f, 78.0f),
                    PathNode.LineTo(40.0f, 78.0f),
                    PathNode.CurveTo(36.68629f, 78.0f, 34.0f, 75.313705f, 34.0f, 72.0f),
                    PathNode.CurveTo(34.0f, 68.686295f, 36.68629f, 66.0f, 40.0f, 66.0f),
                    PathNode.LineTo(104.0f, 66.0f),
                    PathNode.CurveTo(107.313705f, 66.0f, 110.0f, 68.686295f, 110.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 178.0f),
                    PathNode.LineTo(78.0f, 178.0f),
                    PathNode.LineTo(78.0f, 152.0f),
                    PathNode.CurveTo(78.0f, 148.6863f, 75.313705f, 146.0f, 72.0f, 146.0f),
                    PathNode.CurveTo(68.686295f, 146.0f, 66.0f, 148.6863f, 66.0f, 152.0f),
                    PathNode.LineTo(66.0f, 178.0f),
                    PathNode.LineTo(40.0f, 178.0f),
                    PathNode.CurveTo(36.68629f, 178.0f, 34.0f, 180.6863f, 34.0f, 184.0f),
                    PathNode.CurveTo(34.0f, 187.3137f, 36.68629f, 190.0f, 40.0f, 190.0f),
                    PathNode.LineTo(66.0f, 190.0f),
                    PathNode.LineTo(66.0f, 216.0f),
                    PathNode.CurveTo(66.0f, 219.3137f, 68.686295f, 222.0f, 72.0f, 222.0f),
                    PathNode.CurveTo(75.313705f, 222.0f, 78.0f, 219.3137f, 78.0f, 216.0f),
                    PathNode.LineTo(78.0f, 190.0f),
                    PathNode.LineTo(104.0f, 190.0f),
                    PathNode.CurveTo(107.313705f, 190.0f, 110.0f, 187.3137f, 110.0f, 184.0f),
                    PathNode.CurveTo(110.0f, 180.6863f, 107.313705f, 178.0f, 104.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 174.0f),
                    PathNode.LineTo(216.0f, 174.0f),
                    PathNode.CurveTo(219.3137f, 174.0f, 222.0f, 171.3137f, 222.0f, 168.0f),
                    PathNode.CurveTo(222.0f, 164.6863f, 219.3137f, 162.0f, 216.0f, 162.0f),
                    PathNode.LineTo(152.0f, 162.0f),
                    PathNode.CurveTo(148.6863f, 162.0f, 146.0f, 164.6863f, 146.0f, 168.0f),
                    PathNode.CurveTo(146.0f, 171.3137f, 148.6863f, 174.0f, 152.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 194.0f),
                    PathNode.LineTo(152.0f, 194.0f),
                    PathNode.CurveTo(148.6863f, 194.0f, 146.0f, 196.6863f, 146.0f, 200.0f),
                    PathNode.CurveTo(146.0f, 203.3137f, 148.6863f, 206.0f, 152.0f, 206.0f),
                    PathNode.LineTo(216.0f, 206.0f),
                    PathNode.CurveTo(219.3137f, 206.0f, 222.0f, 203.3137f, 222.0f, 200.0f),
                    PathNode.CurveTo(222.0f, 196.6863f, 219.3137f, 194.0f, 216.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.76f, 100.24f),
                    PathNode.CurveTo(158.10254f, 102.57962f, 161.89746f, 102.57962f, 164.24f, 100.24f),
                    PathNode.LineTo(184.0f, 80.49f),
                    PathNode.LineTo(203.76f, 100.24f),
                    PathNode.CurveTo(206.12408f, 102.44287f, 209.80807f, 102.37787f, 212.09297f, 100.09297f),
                    PathNode.CurveTo(214.37787f, 97.808075f, 214.44287f, 94.12408f, 212.24f, 91.76f),
                    PathNode.LineTo(192.49f, 72.0f),
                    PathNode.LineTo(212.24f, 52.24f),
                    PathNode.CurveTo(214.44287f, 49.875923f, 214.37787f, 46.19192f, 212.09297f, 43.907024f),
                    PathNode.CurveTo(209.80807f, 41.622128f, 206.12408f, 41.55713f, 203.76f, 43.76f),
                    PathNode.LineTo(184.0f, 63.51f),
                    PathNode.LineTo(164.24f, 43.76f),
                    PathNode.CurveTo(161.87592f, 41.55713f, 158.19193f, 41.622128f, 155.90703f, 43.907024f),
                    PathNode.CurveTo(153.62213f, 46.19192f, 153.55713f, 49.875923f, 155.76f, 52.24f),
                    PathNode.LineTo(175.51f, 72.0f),
                    PathNode.LineTo(155.76f, 91.76f),
                    PathNode.CurveTo(153.42038f, 94.10254f, 153.42038f, 97.89746f, 155.76f, 100.24f),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
