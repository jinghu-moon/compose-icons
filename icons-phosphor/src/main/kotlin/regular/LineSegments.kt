package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorRegularIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.64f, 33.36f),
                    PathNode.CurveTo(232.63863f, 27.357256f, 224.4982f, 23.984833f, 216.01f, 23.984833f),
                    PathNode.CurveTo(207.5218f, 23.984833f, 199.38138f, 27.357256f, 193.38f, 33.36f),
                    PathNode.LineTo(193.38f, 33.36f),
                    PathNode.CurveTo(187.37726f, 39.361374f, 184.00484f, 47.50181f, 184.00484f, 55.99f),
                    PathNode.CurveTo(184.00484f, 64.478195f, 187.37726f, 72.61863f, 193.38f, 78.62f),
                    PathNode.CurveTo(193.67f, 78.91f, 193.98f, 79.19f, 194.28f, 79.47f),
                    PathNode.LineTo(167.65f, 128.93f),
                    PathNode.CurveTo(159.53104f, 126.95008f, 150.9603f, 128.20522f, 143.75f, 132.43f),
                    PathNode.LineTo(123.57f, 112.25f),
                    PathNode.CurveTo(131.78458f, 98.36594f, 128.37987f, 80.538216f, 115.62692f, 70.65849f),
                    PathNode.CurveTo(102.87398f, 60.77877f, 84.76103f, 61.93674f, 73.37f, 73.36f),
                    PathNode.LineTo(73.37f, 73.36f),
                    PathNode.CurveTo(67.367256f, 79.361374f, 63.994835f, 87.50181f, 63.994835f, 95.99f),
                    PathNode.CurveTo(63.994835f, 104.478195f, 67.367256f, 112.61863f, 73.37f, 118.62f),
                    PathNode.CurveTo(73.66f, 118.91f, 73.96f, 119.19f, 74.26f, 119.47f),
                    PathNode.LineTo(47.63f, 168.94f),
                    PathNode.CurveTo(36.758293f, 166.26418f, 25.278719f, 169.46495f, 17.36f, 177.38f),
                    PathNode.LineTo(17.36f, 177.38f),
                    PathNode.CurveTo(4.865322f, 189.87753f, 4.866864f, 210.13748f, 17.363443f, 222.63312f),
                    PathNode.CurveTo(29.860023f, 235.12874f, 50.119976f, 235.12874f, 62.616554f, 222.63312f),
                    PathNode.CurveTo(75.11314f, 210.13748f, 75.11468f, 189.87753f, 62.62f, 177.38f),
                    PathNode.CurveTo(62.33f, 177.09f, 62.02f, 176.81f, 61.72f, 176.53f),
                    PathNode.LineTo(88.35f, 127.07f),
                    PathNode.CurveTo(90.85392f, 127.683235f, 93.42208f, 127.995445f, 96.0f, 128.0f),
                    PathNode.CurveTo(101.71322f, 128.00699f, 107.324135f, 126.48427f, 112.25f, 123.59f),
                    PathNode.LineTo(132.43f, 143.77f),
                    PathNode.CurveTo(123.98879f, 158.09602f, 127.92619f, 176.49997f, 141.4901f, 186.11816f),
                    PathNode.CurveTo(155.054f, 195.73634f, 173.72424f, 193.36351f, 184.45102f, 180.65819f),
                    PathNode.CurveTo(195.1778f, 167.95287f, 194.3864f, 149.14908f, 182.63f, 137.39f),
                    PathNode.CurveTo(182.34f, 137.1f, 182.04f, 136.82f, 181.74f, 136.54f),
                    PathNode.LineTo(208.37f, 87.08f),
                    PathNode.CurveTo(210.8677f, 87.68894f, 213.42914f, 87.99779f, 216.0f, 88.0f),
                    PathNode.CurveTo(228.94f, 87.99805f, 240.60526f, 80.20305f, 245.55823f, 68.24848f),
                    PathNode.CurveTo(250.51122f, 56.293915f, 247.77696f, 42.532963f, 238.63f, 33.38f),
                    PathNode.Close,
                    PathNode.MoveTo(51.3f, 211.33f),
                    PathNode.CurveTo(45.048138f, 217.5791f, 34.9141f, 217.57686f, 28.665f, 211.325f),
                    PathNode.CurveTo(22.415897f, 205.07314f, 22.418137f, 194.9391f, 28.67f, 188.69f),
                    PathNode.LineTo(28.67f, 188.69f),
                    PathNode.CurveTo(34.921864f, 182.4409f, 45.055897f, 182.44313f, 51.305f, 188.695f),
                    PathNode.CurveTo(57.554104f, 194.94687f, 57.551865f, 205.0809f, 51.3f, 211.33f),
                    PathNode.Close,
                    PathNode.MoveTo(84.68f, 107.33f),
                    PathNode.CurveTo(81.67863f, 104.329315f, 79.99242f, 100.259094f, 79.99242f, 96.015f),
                    PathNode.CurveTo(79.99242f, 91.770905f, 81.67863f, 87.70068f, 84.68f, 84.7f),
                    PathNode.LineTo(84.68f, 84.7f),
                    PathNode.CurveTo(90.928764f, 78.45266f, 101.05874f, 78.45343f, 107.30656f, 84.70172f),
                    PathNode.CurveTo(113.55437f, 90.95001f, 113.55437f, 101.07999f, 107.30656f, 107.32828f),
                    PathNode.CurveTo(101.05874f, 113.57657f, 90.928764f, 113.57734f, 84.68f, 107.33f),
                    PathNode.Close,
                    PathNode.MoveTo(171.32f, 171.33f),
                    PathNode.CurveTo(165.07089f, 177.5791f, 154.9391f, 177.5791f, 148.69f, 171.33f),
                    PathNode.CurveTo(142.4409f, 165.0809f, 142.4409f, 154.9491f, 148.69f, 148.7f),
                    PathNode.LineTo(148.69f, 148.7f),
                    PathNode.CurveTo(154.9391f, 142.4509f, 165.07089f, 142.4509f, 171.32f, 148.7f),
                    PathNode.CurveTo(177.5691f, 154.9491f, 177.5691f, 165.0809f, 171.32f, 171.33f),
                    PathNode.Close,
                    PathNode.MoveTo(227.32f, 67.33f),
                    PathNode.CurveTo(221.0626f, 73.57634f, 210.92635f, 73.56738f, 204.68f, 67.31f),
                    PathNode.CurveTo(198.43365f, 61.052612f, 198.44261f, 50.91634f, 204.7f, 44.67f),
                    PathNode.LineTo(204.7f, 44.67f),
                    PathNode.CurveTo(210.95186f, 38.4209f, 221.08589f, 38.423138f, 227.335f, 44.675f),
                    PathNode.CurveTo(233.5841f, 50.926865f, 233.58186f, 61.060898f, 227.33f, 67.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
