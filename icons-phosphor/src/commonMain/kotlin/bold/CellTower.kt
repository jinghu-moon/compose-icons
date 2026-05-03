package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorBoldIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.67f, 86.51f),
                    PathNode.CurveTo(136.61313f, 82.51316f, 132.49504f, 80.001f, 128.0f, 80.001f),
                    PathNode.CurveTo(123.50496f, 80.001f, 119.386856f, 82.51316f, 117.33f, 86.51f),
                    PathNode.LineTo(45.33f, 226.51f),
                    PathNode.CurveTo(42.292435f, 232.40288f, 44.60712f, 239.64244f, 50.5f, 242.68f),
                    PathNode.CurveTo(56.39288f, 245.71754f, 63.632435f, 243.40288f, 66.67f, 237.51f),
                    PathNode.LineTo(77.67f, 216.02f),
                    PathNode.LineTo(178.28f, 216.02f),
                    PathNode.LineTo(189.33f, 237.51f),
                    PathNode.CurveTo(192.36757f, 243.40288f, 199.60712f, 245.71754f, 205.5f, 242.68f),
                    PathNode.CurveTo(211.39288f, 239.64244f, 213.70757f, 232.40288f, 210.67f, 226.51f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 118.24f),
                    PathNode.LineTo(145.36f, 152.0f),
                    PathNode.LineTo(110.64f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.07f, 192.0f),
                    PathNode.LineTo(98.29f, 176.0f),
                    PathNode.LineTo(157.71f, 176.0f),
                    PathNode.LineTo(165.93f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.51f, 68.73f),
                    PathNode.CurveTo(176.55513f, 72.57628f, 176.35522f, 77.22881f, 173.98772f, 80.8855f),
                    PathNode.CurveTo(171.62021f, 84.542175f, 167.45697f, 86.628654f, 163.11057f, 86.336754f),
                    PathNode.CurveTo(158.76416f, 86.04485f, 154.9173f, 83.42042f, 153.06f, 79.48f),
                    PathNode.CurveTo(148.27641f, 69.88454f, 138.43341f, 63.863235f, 127.712234f, 63.97392f),
                    PathNode.CurveTo(116.99107f, 64.084595f, 107.274475f, 70.30782f, 102.69f, 80.0f),
                    PathNode.CurveTo(99.84573f, 85.989525f, 92.684525f, 88.53927f, 86.695f, 85.695f),
                    PathNode.CurveTo(80.705475f, 82.85073f, 78.15573f, 75.68953f, 81.0f, 69.7f),
                    PathNode.CurveTo(89.667656f, 51.59968f, 107.93146f, 40.058514f, 128.0f, 40.0f),
                    PathNode.CurveTo(147.7101f, 39.935997f, 165.7445f, 51.076157f, 174.51f, 68.73f),
                    PathNode.Close,
                    PathNode.MoveTo(49.93f, 144.73f),
                    PathNode.CurveTo(25.893263f, 106.17593f, 33.599422f, 55.84849f, 68.07121f, 26.253271f),
                    PathNode.CurveTo(102.543f, -3.341951f, 153.457f, -3.341951f, 187.92879f, 26.253271f),
                    PathNode.CurveTo(222.40057f, 55.84849f, 230.10674f, 106.17593f, 206.07f, 144.73f),
                    PathNode.CurveTo(202.5547f, 150.35226f, 195.14726f, 152.06029f, 189.525f, 148.545f),
                    PathNode.CurveTo(183.90274f, 145.02971f, 182.1947f, 137.62225f, 185.71f, 132.0f),
                    PathNode.CurveTo(203.46992f, 103.502975f, 197.77046f, 66.30891f, 172.29228f, 44.43751f),
                    PathNode.CurveTo(146.8141f, 22.566113f, 109.1859f, 22.566113f, 83.70772f, 44.43751f),
                    PathNode.CurveTo(58.22954f, 66.30891f, 52.530075f, 103.502975f, 70.29f, 132.0f),
                    PathNode.CurveTo(73.65493f, 137.61333f, 71.9015f, 144.88766f, 66.3486f, 148.35141f),
                    PathNode.CurveTo(60.795704f, 151.81516f, 53.49147f, 150.19073f, 49.93f, 144.7f),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
