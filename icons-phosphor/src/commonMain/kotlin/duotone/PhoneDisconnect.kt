package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorDuotoneIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 157.0f),
                    PathNode.CurveTo(227.80258f, 159.78568f, 224.03288f, 160.7912f, 220.74f, 159.47f),
                    PathNode.LineTo(171.58f, 142.0f),
                    PathNode.CurveTo(169.09026f, 141.00345f, 167.26546f, 138.82571f, 166.72f, 136.2f),
                    PathNode.LineTo(160.51f, 106.46f),
                    PathNode.CurveTo(159.95197f, 103.727005f, 158.00075f, 101.487274f, 155.37f, 100.56f),
                    PathNode.CurveTo(137.5061f, 94.43722f, 118.1048f, 94.482994f, 100.27f, 100.69f),
                    PathNode.CurveTo(97.61917f, 101.639206f, 95.67045f, 103.92287f, 95.15f, 106.69f),
                    PathNode.LineTo(89.25f, 136.2f),
                    PathNode.CurveTo(88.70255f, 138.82794f, 86.8736f, 141.00616f, 84.38f, 142.0f),
                    PathNode.LineTo(35.29f, 159.42f),
                    PathNode.CurveTo(31.99963f, 160.76741f, 28.214811f, 159.7815f, 26.0f, 157.0f),
                    PathNode.CurveTo(11.4f, 138.17f, 12.74f, 113.17f, 30.0f, 95.88f),
                    PathNode.CurveTo(83.11f, 42.77f, 172.77f, 42.77f, 225.88f, 95.88f),
                    PathNode.CurveTo(243.23f, 113.12f, 244.57f, 138.12f, 230.0f, 157.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.59f, 90.13f),
                    PathNode.LineTo(231.59f, 90.13f),
                    PathNode.CurveTo(175.44f, 34.0f, 80.56f, 34.0f, 24.41f, 90.13f),
                    PathNode.CurveTo(4.41f, 110.13f, 2.49f, 139.62f, 19.72f, 161.84f),
                    PathNode.CurveTo(22.754818f, 165.73112f, 27.415335f, 168.00418f, 32.35f, 168.0f),
                    PathNode.CurveTo(34.31719f, 168.0011f, 36.26728f, 167.63481f, 38.1f, 166.92f),
                    PathNode.LineTo(87.1f, 149.55f),
                    PathNode.LineTo(87.39f, 149.44f),
                    PathNode.CurveTo(92.41453f, 147.4304f, 96.08278f, 143.01723f, 97.14f, 137.71f),
                    PathNode.LineTo(103.04f, 108.19f),
                    PathNode.CurveTo(119.12688f, 102.629f, 136.60866f, 102.590294f, 152.72f, 108.08f),
                    PathNode.LineTo(152.72f, 108.08f),
                    PathNode.LineTo(158.93f, 137.83f),
                    PathNode.CurveTo(160.02394f, 143.07765f, 163.67307f, 147.42883f, 168.65f, 149.42f),
                    PathNode.LineTo(168.94f, 149.53f),
                    PathNode.LineTo(217.94f, 166.92f),
                    PathNode.CurveTo(224.51242f, 169.46577f, 231.9766f, 167.41089f, 236.32f, 161.86f),
                    PathNode.CurveTo(253.51f, 139.62f, 251.58f, 110.13f, 231.59f, 90.13f),
                    PathNode.Close,
                    PathNode.MoveTo(223.67f, 152.0f),
                    PathNode.LineTo(223.37f, 151.88f),
                    PathNode.LineTo(174.55f, 134.55f),
                    PathNode.LineTo(168.34f, 104.81f),
                    PathNode.CurveTo(167.19383f, 99.33696f, 163.27357f, 94.85936f, 158.0f, 93.0f),
                    PathNode.CurveTo(138.4368f, 86.3021f, 117.19416f, 86.34786f, 97.66f, 93.13f),
                    PathNode.CurveTo(92.34393f, 95.02934f, 88.42219f, 99.58952f, 87.34f, 105.13f),
                    PathNode.LineTo(81.44f, 134.64f),
                    PathNode.LineTo(32.63f, 151.86f),
                    PathNode.CurveTo(32.53f, 151.86f, 32.46f, 151.99f, 32.36f, 152.03f),
                    PathNode.CurveTo(20.03f, 136.12f, 21.36f, 115.8f, 35.72f, 101.45f),
                    PathNode.CurveTo(60.72f, 76.45f, 94.37f, 63.92f, 128.0f, 63.92f),
                    PathNode.CurveTo(161.63f, 63.92f, 195.27f, 76.43f, 220.28f, 101.45f),
                    PathNode.CurveTo(234.61f, 115.8f, 236.0f, 136.12f, 223.67f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.99f, 200.0f),
                    PathNode.CurveTo(223.99f, 204.41827f, 220.40828f, 208.0f, 215.99f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 204.41827f, 32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 195.58173f, 35.581722f, 192.0f, 40.0f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(220.41827f, 192.0f, 224.0f, 195.58173f, 224.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
