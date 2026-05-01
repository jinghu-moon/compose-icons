package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorBoldIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.56f, 36.82f),
                    PathNode.CurveTo(165.45453f, 17.496393f, 147.98665f, 4.026116f, 128.0f, 4.0f),
                    PathNode.CurveTo(121.37258f, 4.0f, 116.0f, 9.372583f, 116.0f, 16.0f),
                    PathNode.CurveTo(116.0f, 22.627417f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(134.99384f, 28.010393f, 141.4742f, 31.673368f, 145.09f, 37.66f),
                    PathNode.CurveTo(114.07848f, 44.671417f, 92.04352f, 72.20579f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 125.74f, 86.17f, 144.14f, 74.68f, 158.69f),
                    PathNode.CurveTo(62.46f, 174.16f, 43.5f, 185.77f, 18.34f, 193.18f),
                    PathNode.CurveTo(9.401872f, 195.78575f, 3.443915f, 204.21436f, 3.969481f, 213.5097f),
                    PathNode.CurveTo(4.495048f, 222.80508f, 11.365116f, 230.5084f, 20.54f, 232.09f),
                    PathNode.CurveTo(35.76537f, 234.71867f, 51.1894f, 236.02689f, 66.64f, 236.0f),
                    PathNode.CurveTo(108.25f, 236.0f, 154.64f, 226.62f, 186.85f, 199.62f),
                    PathNode.CurveTo(214.16f, 176.72f, 228.0f, 144.55f, 228.0f, 104.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(227.95625f, 70.53676f, 203.61009f, 42.06227f, 170.56f, 36.82f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 60.0f),
                    PathNode.CurveTo(177.49533f, 60.004387f, 193.32584f, 70.37353f, 200.32f, 86.41f),
                    PathNode.LineTo(192.0f, 90.58f),
                    PathNode.LineTo(165.37f, 77.26f),
                    PathNode.CurveTo(161.98979f, 75.56854f, 158.01021f, 75.56854f, 154.63f, 77.26f),
                    PathNode.LineTo(128.0f, 90.58f),
                    PathNode.LineTo(119.68f, 86.41f),
                    PathNode.CurveTo(126.67416f, 70.37353f, 142.50467f, 60.004387f, 160.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.43f, 181.23f),
                    PathNode.CurveTo(154.03f, 195.82f, 129.1f, 205.7f, 99.33f, 209.81f),
                    PathNode.CurveTo(80.02668f, 212.36095f, 60.492283f, 212.65962f, 41.12f, 210.7f),
                    PathNode.CurveTo(87.8f, 192.19f, 113.4f, 158.16f, 115.8f, 111.31f),
                    PathNode.LineTo(122.63f, 114.73f),
                    PathNode.CurveTo(126.01279f, 116.4105f, 129.98721f, 116.4105f, 133.37f, 114.73f),
                    PathNode.LineTo(160.0f, 101.41f),
                    PathNode.LineTo(186.63f, 114.73f),
                    PathNode.CurveTo(190.01279f, 116.4105f, 193.98721f, 116.4105f, 197.37f, 114.73f),
                    PathNode.LineTo(203.8f, 111.51f),
                    PathNode.CurveTo(202.24f, 141.07f, 191.38f, 164.5f, 171.43f, 181.23f),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
