package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorBoldIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 200.0f),
                    PathNode.CurveTo(252.0f, 206.62741f, 246.62741f, 212.0f, 240.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(65.37258f, 212.0f, 60.0f, 206.62741f, 60.0f, 200.0f),
                    PathNode.LineTo(60.0f, 84.0f),
                    PathNode.LineTo(32.0f, 84.0f),
                    PathNode.CurveTo(25.372583f, 84.0f, 20.0f, 78.62742f, 20.0f, 72.0f),
                    PathNode.CurveTo(20.0f, 65.37258f, 25.372583f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(60.0f, 32.0f),
                    PathNode.CurveTo(60.0f, 25.372583f, 65.37258f, 20.0f, 72.0f, 20.0f),
                    PathNode.CurveTo(78.62742f, 20.0f, 84.0f, 25.372583f, 84.0f, 32.0f),
                    PathNode.LineTo(84.0f, 188.0f),
                    PathNode.LineTo(240.0f, 188.0f),
                    PathNode.CurveTo(246.62741f, 188.0f, 252.0f, 193.37259f, 252.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(111.0f, 84.29f),
                    PathNode.CurveTo(151.85974f, 87.71041f, 184.27959f, 120.13026f, 187.7f, 160.99f),
                    PathNode.CurveTo(188.21971f, 167.20486f, 193.41344f, 171.9857f, 199.65f, 171.99f),
                    PathNode.CurveTo(199.98f, 171.99f, 200.31f, 171.99f, 200.65f, 171.99f),
                    PathNode.CurveTo(203.8369f, 171.73557f, 206.79051f, 170.21994f, 208.85562f, 167.77937f),
                    PathNode.CurveTo(210.92072f, 165.33879f, 211.92656f, 162.17505f, 211.65f, 158.99f),
                    PathNode.CurveTo(207.25246f, 106.44148f, 165.54985f, 64.75156f, 113.0f, 60.37f),
                    PathNode.CurveTo(106.39468f, 59.817715f, 100.592285f, 64.72468f, 100.04f, 71.33f),
                    PathNode.CurveTo(99.48772f, 77.935326f, 104.39468f, 83.73772f, 111.0f, 84.29f),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
