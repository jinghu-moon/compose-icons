package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorLightIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 107.313705f, 211.3137f, 110.0f, 208.0f, 110.0f),
                    PathNode.CurveTo(204.6863f, 110.0f, 202.0f, 107.313705f, 202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 63.130928f, 168.86908f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(87.13093f, 30.0f, 54.0f, 63.130928f, 54.0f, 104.0f),
                    PathNode.CurveTo(54.0f, 131.55f, 62.83f, 140.06f, 72.18f, 149.08f),
                    PathNode.CurveTo(76.49f, 153.23f, 80.95f, 157.53f, 84.34f, 163.55f),
                    PathNode.CurveTo(88.15f, 170.31f, 90.0f, 178.3f, 90.0f, 188.0f),
                    PathNode.CurveTo(90.0f, 208.98682f, 107.013176f, 226.0f, 128.0f, 226.0f),
                    PathNode.CurveTo(138.74f, 226.0f, 147.69f, 221.48f, 155.37f, 212.18f),
                    PathNode.CurveTo(157.47972f, 209.62292f, 161.26292f, 209.26027f, 163.82f, 211.37f),
                    PathNode.CurveTo(166.37708f, 213.47972f, 166.73973f, 217.26292f, 164.63f, 219.82f),
                    PathNode.CurveTo(154.66f, 231.88f, 142.34f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(100.39947f, 237.96693f, 78.03306f, 215.60052f, 78.0f, 188.0f),
                    PathNode.CurveTo(78.0f, 171.36f, 71.76f, 165.34f, 63.85f, 157.71f),
                    PathNode.CurveTo(54.12f, 148.33f, 42.0f, 136.64f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 56.503513f, 80.50351f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(175.49649f, 18.0f, 214.0f, 56.503513f, 214.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.86f, 162.81f),
                    PathNode.CurveTo(173.99323f, 161.15628f, 170.32878f, 162.13617f, 168.67f, 165.0f),
                    PathNode.CurveTo(166.41125f, 168.92998f, 161.7916f, 170.84915f, 157.41306f, 169.67654f),
                    PathNode.CurveTo(153.03452f, 168.50392f, 149.99232f, 164.53284f, 150.0f, 160.0f),
                    PathNode.CurveTo(150.0f, 150.0f, 155.0f, 143.33f, 160.8f, 135.6f),
                    PathNode.CurveTo(167.0f, 127.35f, 174.0f, 118.0f, 174.0f, 104.0f),
                    PathNode.CurveTo(174.0f, 78.5949f, 153.4051f, 58.0f, 128.0f, 58.0f),
                    PathNode.CurveTo(102.5949f, 58.0f, 82.0f, 78.5949f, 82.0f, 104.0f),
                    PathNode.CurveTo(82.0f, 107.313705f, 84.686295f, 110.0f, 88.0f, 110.0f),
                    PathNode.CurveTo(91.313705f, 110.0f, 94.0f, 107.313705f, 94.0f, 104.0f),
                    PathNode.CurveTo(94.0f, 85.22232f, 109.22232f, 70.0f, 128.0f, 70.0f),
                    PathNode.CurveTo(146.77768f, 70.0f, 162.0f, 85.22232f, 162.0f, 104.0f),
                    PathNode.CurveTo(162.0f, 114.0f, 157.0f, 120.67f, 151.2f, 128.4f),
                    PathNode.CurveTo(145.0f, 136.65f, 138.0f, 146.0f, 138.0f, 160.0f),
                    PathNode.CurveTo(138.002f, 169.95555f, 144.68936f, 178.669f, 154.30565f, 181.24585f),
                    PathNode.CurveTo(163.92194f, 183.8227f, 174.07022f, 179.6206f, 179.05f, 171.0f),
                    PathNode.CurveTo(180.7037f, 168.13322f, 179.72383f, 164.46878f, 176.86f, 162.81f),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
