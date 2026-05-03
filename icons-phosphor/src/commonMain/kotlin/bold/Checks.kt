package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorBoldIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.41f, 88.56f),
                    PathNode.LineTo(62.81f, 176.56f),
                    PathNode.CurveTo(58.141445f, 181.1468f, 50.658558f, 181.1468f, 45.99f, 176.56f),
                    PathNode.LineTo(7.59f, 138.85f),
                    PathNode.CurveTo(2.859681f, 134.20529f, 2.790286f, 126.60532f, 7.435f, 121.875f),
                    PathNode.CurveTo(12.079715f, 117.14468f, 19.679682f, 117.07529f, 24.41f, 121.72f),
                    PathNode.LineTo(54.41f, 151.18f),
                    PathNode.LineTo(135.6f, 71.44f),
                    PathNode.CurveTo(140.32756f, 66.79529f, 147.92528f, 66.86244f, 152.57f, 71.59f),
                    PathNode.CurveTo(157.21472f, 76.31756f, 157.14755f, 83.91528f, 152.42f, 88.56f),
                    PathNode.Close,
                    PathNode.MoveTo(248.56f, 71.56f),
                    PathNode.CurveTo(246.32837f, 69.28056f, 243.281f, 67.98349f, 240.09114f, 67.955345f),
                    PathNode.CurveTo(236.90129f, 67.9272f, 233.8315f, 69.170296f, 231.56f, 71.41f),
                    PathNode.LineTo(150.4f, 151.18f),
                    PathNode.LineTo(142.52f, 143.44f),
                    PathNode.CurveTo(137.79245f, 138.7953f, 130.19472f, 138.86244f, 125.55f, 143.59f),
                    PathNode.CurveTo(120.90529f, 148.31755f, 120.97244f, 155.91528f, 125.7f, 160.56f),
                    PathNode.LineTo(141.99f, 176.56f),
                    PathNode.CurveTo(146.65855f, 181.1468f, 154.14145f, 181.1468f, 158.81f, 176.56f),
                    PathNode.LineTo(248.41f, 88.56f),
                    PathNode.CurveTo(250.68027f, 86.32954f, 251.9715f, 83.28857f, 251.99963f, 80.106064f),
                    PathNode.CurveTo(252.02776f, 76.92357f, 250.79048f, 73.860245f, 248.56f, 71.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _checks!!
    }

private var _checks: ImageVector? = null
